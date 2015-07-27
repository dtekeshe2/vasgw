package com.ebridgevas.ss7interface;

/**
 * Created by david on 4/18/14.
 */
public class Utils {

    public static void sleep( Long duration) {
        try { Thread.sleep( duration ); } catch(Exception e){};
    }
}
