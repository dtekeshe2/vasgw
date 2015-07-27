package za.co.ebridge.mscinterface;

import za.co.ebridge.mscinterface.dao.SS7ConfigDAO;
import za.co.ebridge.mscinterface.model.SS7Config;

import org.apache.log4j.Logger;
import za.co.ebridge.mscinterface.ss7.MSCInterface;

public class Boot
{

    private static Logger log = Logger.getLogger(Boot.class);

    public static void main(String[] args)
            throws Exception
    {

        if ( args.length < 2 )
        {
            System.out.println("Usage java Boot <localGlobalTitle> <remoteGlobalTitle>");
            System.exit( 1 );
        }

        String localGlobalTitle = args[ 0 ];
        String remoteGlobalTitle = args [ 1 ];

        log.info("##############################################################");
        log.info("#     eBridge Mobile Switching Center Interface               ");
        log.info("#               ver 05.2014                                   ");
        log.info("#  " + localGlobalTitle + " -> " + remoteGlobalTitle           );
        log.info("################################################################");

        SS7Config localDpcConfig = new SS7ConfigDAO().findById( localGlobalTitle );
        SS7Config remoteDpcConfig = new SS7ConfigDAO().findById(remoteGlobalTitle );
        log.info("local  dpc : " + localDpcConfig );
        log.info("remote dpc : " + remoteDpcConfig );

        MSCInterface.start(localDpcConfig, remoteDpcConfig);
    }
}
