/**
 * WebServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class WebServicesServiceLocator extends org.apache.axis.client.Service implements com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesService {

    public WebServicesServiceLocator() {
    }


    public WebServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServicesServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServices
    private String WebServices_address = "http://10.10.6.9:8080/ocswebservices/services/zimbabweWebServices";

    public String getWebServicesAddress() {
        return WebServices_address;
    }

    // The WSDD service name defaults to the port name.
    private String WebServicesWSDDServiceName = "WebServices";

    public String getWebServicesWSDDServiceName() {
        return WebServicesWSDDServiceName;
    }

    public void setWebServicesWSDDServiceName(String name) {
        WebServicesWSDDServiceName = name;
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices getWebServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServices(endpoint);
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices getWebServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesSoapBindingStub _stub = new com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServicesEndpointAddress(String address) {
        WebServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesSoapBindingStub _stub = new com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServicesSoapBindingStub(new java.net.URL(WebServices_address), this);
                _stub.setPortName(getWebServicesWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("WebServices".equals(inputPortName)) {
            return getWebServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "WebServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "WebServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServices".equals(portName)) {
            setWebServicesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
