package com.ebridgevas.ussd.menu;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.ebridge.webservice.client.ServiceSoapFactory;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.model.TreeNode;
import com.ebridgevas.ussd.menu.model.NodeData;
import com.ebridgevas.ussd.menu.model.UserSession;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesService;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesServiceLocator;

import javax.xml.rpc.ServiceException;
import java.util.HashMap;
import java.util.Map;

import static com.ebridge.webservice.client.pool.WebServiceConnectionPool.*;

import static com.ebridgevas.ussd.menu.model.util.USSDMenuUtils.parse;
import static com.ebridgevas.ussd.menu.model.USSDMenuModel.*;
import static com.ebridgevas.ussd.menu.model.USSDMenuModel.ROOT_NODE;

public class USSDServer
{
    private static final Map<Long, UserSession> USER_SESSIONS;

    static
    {
        USER_SESSIONS = new HashMap<>();

        if (getPrepaidServiceSoap() == null)
        {

            String securityProviderFilename = "/prod/ebridge/wsdd/client_deploy.wsdd";
            String endPointUrl = "http://172.17.1.19:8080/ocswebservices/services/zimbabweocsWebServices?wsdl";
            String userId = "zsmart2";
            String passwordCallBackClassName = "com.ebridge.webservice.client.ws.PasswordCallback";

//        String testEndPointUrl = "http://172.17.1.28:8080/ocswebservices/services/zimbabweocsWebServices?wsdl";

            ServiceSoap serviceSoap = ServiceSoapFactory.getService(endPointUrl,
                    userId,
                    passwordCallBackClassName,

                    securityProviderFilename);
            setPrepaidServiceSoap(serviceSoap);
        }

        // Postpaid
        if (getPostpaidServiceSoap() == null)
        {
            try
            {
                System.out.println("Postpaid web service init...");
                WebServicesService locator = new WebServicesServiceLocator();
                WebServices postpaidService = locator.getWebServices();
                setPostpaidServiceSoap(postpaidService);

                System.out.println("Postpaid web service initialized.");
            }
            catch (ServiceException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static Authorisation process(String mobileNumber, Long uuid, String ussdString)
    {
        String[] payload = parse(ussdString);

        Authorisation authorisation;
        UserSession userSession = USER_SESSIONS.get(uuid);
        if (userSession == null)
        {
            if (mobileNumber == null)
            {
                authorisation = new Authorisation(uuid);
                authorisation.setResultCode("096");
                authorisation.setNarrative1("Session terminated. Please short code dial again.");
                return authorisation;
            }
            else
            {
                authorisation = new Authorisation(uuid);
                authorisation.setFromAccountNumber( mobileNumber );
                authorisation.setToAccountNumber( mobileNumber );

                TreeNode<NodeData> shortCodeNode = findNode(ROOT_NODE, payload[0]);
                if (shortCodeNode == null)
                {
                    authorisation.setResultCode("096");
                    authorisation.setNarrative1("Short code " + payload[0] + " does not exist.");
                    return authorisation;
                }
                userSession = new UserSession(uuid, authorisation, shortCodeNode);
                USER_SESSIONS.put(authorisation.getUuid(), userSession);

                authorisation.setNarrative1(menu(payload[0]));
                authorisation.setResultCode("000");

                return authorisation;
            }
        }
        else
        {
            authorisation = userSession.getAuthorisation();
        }
//
//        if (! hasParameters(payload))
//        {
//            // Return service menu for this short code
//            authorisation.setNarrative1(menu(payload[0]));
//            authorisation.setResultCode("000");
//            return authorisation;
//        }

        TreeNode node = userSession.getTreeNode();

        if ( node == null)
        {
            authorisation = new Authorisation(uuid);
            authorisation.setResultCode("096");
            authorisation.setNarrative1("No active session. Please short code dial again.");
            return authorisation;
        }

//        if (node == null)
//        {
//            authorisation.setNarrative1("Invalid selection.\n" + ((NodeData) ROOT_NODE.data).getSubHeaderText());
//            authorisation.setResultCode("096");
//            return authorisation;
//        }

        // Process selected node
        TreeNode selectedNode = findNode(node, payload[0]);

        if (selectedNode == null)
        {
            authorisation.setNarrative1("Invalid selection.\n" + ((NodeData) node.data).getSubHeaderText());
            authorisation.setResultCode("096");
            return authorisation;
        }

        if (selectedNode.hasChildren())
        {
            // Node has children. Prompt user for selection.
            authorisation.setNarrative1(menu(selectedNode));
            authorisation.setResultCode("000");
            // update user session current TreeNode
            userSession.setTreeNode(selectedNode);
            return authorisation;
        }
        else
        {
            // Node has no children. Execute node processor
            return execute(selectedNode, authorisation );
        }
    }

    public static void main(String[] args)
    {
        String code = null;
        String m = "errorCode = [S-WS-02017] errorDesc = [The accumulation is not exist.]";
        if ((m != null) && (m.trim().toLowerCase().startsWith("errorcode")))
        {
            code = m.split("=")[1];

            m = m.split("=")[2].trim().substring(1);
            m = m.substring(0, m.length() - 1);


        }
        System.out.println( code );
//        Long uuid = new Random().nextLong();
//        String mobileNumber = args[0];
//        System.out.println("Dialing");
//        Authorisation authorization = process(mobileNumber, uuid, "*901#");
//        System.out.println("First response : " + authorization );
//        authorization = process(null, uuid, "1");
//        System.out.println("Second response : " + authorization );
    }
}
