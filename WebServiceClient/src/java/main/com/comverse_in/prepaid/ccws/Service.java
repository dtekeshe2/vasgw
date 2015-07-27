/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public interface Service extends javax.xml.rpc.Service {
    public String getServiceSoapAddress();

    public com.comverse_in.prepaid.ccws.ServiceSoap getServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.comverse_in.prepaid.ccws.ServiceSoap getServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
