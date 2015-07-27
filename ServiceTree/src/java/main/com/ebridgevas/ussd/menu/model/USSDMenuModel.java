package com.ebridgevas.ussd.menu.model;

import static com.ebridgevas.ussd.menu.model.util.USSDMenuFormatter.format;
import static com.ebridgevas.ussd.menu.model.util.USSDMenuUtils.dateFromNow;

import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.PayloadDTO;
import com.ebridgevas.commons.model.TreeNode;
import com.ebridgevas.commons.processors.Processor;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class USSDMenuModel
{
    /*
        ('60296110001', '901', '60296110000', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110001, parent_ean_code:60296110000, service_end_point:27721418290, ean_description:Telecel,                     ean_short_description: value added services}'),

   ('60296110022', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110022, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Balances,                    ean_short_description: for prepaid accounts}'),
    ('60296110011', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110011, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Data Bundle Purchase,        ean_short_description: for yours or friend}'),
    ('60296110012', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ProductForm',  '{ean_code:60296110012, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Airtime Transfer,            ean_short_description: to your friends}'),
    ('60296110013', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ProductForm',  '{ean_code:60296110013, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Voucher Recharge,            ean_short_description: your phone or friends}'),

     */

    public static final TreeNode ROOT_NODE;
    private static final Map<String, Processor> NODE_PROCESSORS;

    static
    {
        NODE_PROCESSORS = new HashMap<>();

        NodeData data = new NodeData("0", "eBridge Services", "", "", "", "");
        ROOT_NODE = new TreeNode(data);

        data = new NodeData("901", "Welcome to Telecel DATA bundles", "Please select either 1 or 2", "", "", "");
        TreeNode node = ROOT_NODE.addChild(data);
              /*
        1. Balance enquiry
        2. Buy my DATA  bundle
            */
        data = new NodeData("1", "", "", "Balance enquiry", "com.ebridge.billinginterface.processors.BalanceEnquiryProcessor", "");
        node.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("2", "", "Select bundle 1 to 8", "Buy my DATA  bundle", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "" );
        TreeNode bundleNode = node.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("1", "", "", "50c for 4.8MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "{eanCode:60296110014,parentEanCode:60296110011,serviceEndPoint:27721418290,eanDescription:10MB Data Bundle,eanShortDescription:4.8 MB Data Bundle,itemPrice:0.50,quantity:4.80,rate:0.108,debitAmount:0.50,creditAmount:0.576,validUntil:30.00,validUntilUnit:day}");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("2", "", "",  "$1  for 9.5MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("3",  "", "", "$3  for 76MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("4",  "", "", "$5  for 142.5MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("5",  "", "", "$10 for 304MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("6",  "", "", "$20 for 800MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "{eanCode:60296110014,parentEanCode:60296110011,serviceEndPoint:27721418290,eanDescription:10MB Data Bundle,eanShortDescription:4.8 MB Data Bundle,itemPrice:0.50,quantity:4.80,rate:0.108,debitAmount:20.00,creditAmount:0.576,validUntil:30.00,validUntilUnit:day}");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("7",  "", "", "$45 for 2000MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());

        data = new NodeData("8", "", "",  "$75 for 4000MB", "com.ebridge.billinginterface.processors.DataBundlePurchaseProcessor", "");
        bundleNode.addChild(data);
        addInstance(data.getNodeProcessorName());
    }

    private static void addInstance(String className )
    {
        try
        {
            if (NODE_PROCESSORS.get(className) == null)
                NODE_PROCESSORS.put(className, (Processor)Class.forName(className).newInstance());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String menu(String nodeId)
    {
        return format(findNode( nodeId ));
    }

    public static String menu(TreeNode node)
    {
        return format(node);
    }

    public static TreeNode findNode(String nodeId)
    {
         return ROOT_NODE.findChildById(new NodeData(nodeId));
    }

    public static TreeNode findNode(TreeNode node, String nodeId)
    {
        return node.findChildById(new NodeData(nodeId));
    }

    /*
        ('60296110014', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',
         '{ean_code:60296110014, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:10MB Data Bundle,
          ean_short_description: 4.8 MB Data Bundle,      item_price: 0.50, quantity: 4.80, rate: 0.108, debit_amount: 0.50, credit_amount: 0.576, valid_until:30 days'),

     */

    public static Authorisation execute(TreeNode node, Authorisation authorization)
    {

        try
        {
            NodeData data = (NodeData) node.data;
            PayloadDTO payload = data.getPayload();

            authorization.setDebitAmount(
                    payload.getDebitAmount() != null ? payload.getDebitAmount() : BigDecimal.ZERO);

            authorization.setCreditAmount(
                    payload.getCreditAmount() != null ? payload.getCreditAmount() : BigDecimal.ZERO);

            authorization.setQuantity(
                    payload.getQuantity() != null ? payload.getQuantity() : BigDecimal.ZERO);

            authorization.setExpiryDate(
                    payload.getValidUntil() != null ? dateFromNow(payload.getValidUntil(), "day") : new DateTime());

            NODE_PROCESSORS.get(data.getNodeProcessorName()).process(authorization);
            return authorization;
        }
        catch (Exception e)
        {
            //TODO process this exception
            authorization.setResultCode("096");
            authorization.setNarrative1("Processing failed : " + e.getMessage());
            return authorization;
        }
    }
}
