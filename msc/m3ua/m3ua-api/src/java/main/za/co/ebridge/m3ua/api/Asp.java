package za.co.ebridge.m3ua.api;

import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;

public interface Asp
{
    String getName();
    boolean isStarted();
    boolean isConnected();
    boolean isUp();
    As getAs();
    AspFactory getAspFactory();
    ASPIdentifier getASPIdentifier();
    State getState();
}
