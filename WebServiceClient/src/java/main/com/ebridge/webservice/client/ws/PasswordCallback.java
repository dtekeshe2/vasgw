package com.ebridge.webservice.client.ws;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import com.comverse_in.prepaid.ccws.*;

public class PasswordCallback
        implements CallbackHandler
{

    public void handle(Callback[] callbacks)
            throws
            IOException,
            UnsupportedCallbackException
    {
        for (int i = 0; i < callbacks.length; i++)
        {
            if (callbacks[i] instanceof WSPasswordCallback)
            {
                WSPasswordCallback pc =
                        (WSPasswordCallback) callbacks[i];

                if ("zsmart2".equals(pc.getIdentifer()))
                {
                    System.out.println("######## Setting password to airtime11");

                    pc.setPassword("zsmart2");
                }

                if ("airtimetrnsf".equals(pc.getIdentifer()))
                {
                    System.out.println("######## Setting password to airtime11");

                    pc.setPassword("airtime11");
                }
            }
            else
            {
                throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
            }
        }
    }
}
