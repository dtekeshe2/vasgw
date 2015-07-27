package za.co.ebridge.m3ua.api;

import java.util.List;

import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.sctp.api.Association;

public interface AspFactory
{

    String getName();

    Association getAssociation();

    List<Asp> getAspList();

    boolean getStatus();

    Functionality getFunctionality();

    IPSPType getIpspType();

    ASPIdentifier getAspId();

    boolean isHeartBeatEnabled();
}
