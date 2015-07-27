/**
 * LifeCycle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class LifeCycle  implements java.io.Serializable {
    private String state;

    private Boolean allowOriginatingFreeVoiceCalls;

    private Boolean allowOriginatingBillableCalls;

    private Boolean allowTerminatingCalls;

    private Boolean allowGPRS;

    private Boolean allowOSA;

    private Boolean allowAdminMenu;

    private Boolean allowRechargeServer;

    private Boolean allowCustomerCare;

    private Boolean allowInfoServer;

    public LifeCycle() {
    }

    public LifeCycle(
           String state,
           Boolean allowOriginatingFreeVoiceCalls,
           Boolean allowOriginatingBillableCalls,
           Boolean allowTerminatingCalls,
           Boolean allowGPRS,
           Boolean allowOSA,
           Boolean allowAdminMenu,
           Boolean allowRechargeServer,
           Boolean allowCustomerCare,
           Boolean allowInfoServer) {
           this.state = state;
           this.allowOriginatingFreeVoiceCalls = allowOriginatingFreeVoiceCalls;
           this.allowOriginatingBillableCalls = allowOriginatingBillableCalls;
           this.allowTerminatingCalls = allowTerminatingCalls;
           this.allowGPRS = allowGPRS;
           this.allowOSA = allowOSA;
           this.allowAdminMenu = allowAdminMenu;
           this.allowRechargeServer = allowRechargeServer;
           this.allowCustomerCare = allowCustomerCare;
           this.allowInfoServer = allowInfoServer;
    }


    /**
     * Gets the state value for this LifeCycle.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this LifeCycle.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the allowOriginatingFreeVoiceCalls value for this LifeCycle.
     * 
     * @return allowOriginatingFreeVoiceCalls
     */
    public Boolean getAllowOriginatingFreeVoiceCalls() {
        return allowOriginatingFreeVoiceCalls;
    }


    /**
     * Sets the allowOriginatingFreeVoiceCalls value for this LifeCycle.
     * 
     * @param allowOriginatingFreeVoiceCalls
     */
    public void setAllowOriginatingFreeVoiceCalls(Boolean allowOriginatingFreeVoiceCalls) {
        this.allowOriginatingFreeVoiceCalls = allowOriginatingFreeVoiceCalls;
    }


    /**
     * Gets the allowOriginatingBillableCalls value for this LifeCycle.
     * 
     * @return allowOriginatingBillableCalls
     */
    public Boolean getAllowOriginatingBillableCalls() {
        return allowOriginatingBillableCalls;
    }


    /**
     * Sets the allowOriginatingBillableCalls value for this LifeCycle.
     * 
     * @param allowOriginatingBillableCalls
     */
    public void setAllowOriginatingBillableCalls(Boolean allowOriginatingBillableCalls) {
        this.allowOriginatingBillableCalls = allowOriginatingBillableCalls;
    }


    /**
     * Gets the allowTerminatingCalls value for this LifeCycle.
     * 
     * @return allowTerminatingCalls
     */
    public Boolean getAllowTerminatingCalls() {
        return allowTerminatingCalls;
    }


    /**
     * Sets the allowTerminatingCalls value for this LifeCycle.
     * 
     * @param allowTerminatingCalls
     */
    public void setAllowTerminatingCalls(Boolean allowTerminatingCalls) {
        this.allowTerminatingCalls = allowTerminatingCalls;
    }


    /**
     * Gets the allowGPRS value for this LifeCycle.
     * 
     * @return allowGPRS
     */
    public Boolean getAllowGPRS() {
        return allowGPRS;
    }


    /**
     * Sets the allowGPRS value for this LifeCycle.
     * 
     * @param allowGPRS
     */
    public void setAllowGPRS(Boolean allowGPRS) {
        this.allowGPRS = allowGPRS;
    }


    /**
     * Gets the allowOSA value for this LifeCycle.
     * 
     * @return allowOSA
     */
    public Boolean getAllowOSA() {
        return allowOSA;
    }


    /**
     * Sets the allowOSA value for this LifeCycle.
     * 
     * @param allowOSA
     */
    public void setAllowOSA(Boolean allowOSA) {
        this.allowOSA = allowOSA;
    }


    /**
     * Gets the allowAdminMenu value for this LifeCycle.
     * 
     * @return allowAdminMenu
     */
    public Boolean getAllowAdminMenu() {
        return allowAdminMenu;
    }


    /**
     * Sets the allowAdminMenu value for this LifeCycle.
     * 
     * @param allowAdminMenu
     */
    public void setAllowAdminMenu(Boolean allowAdminMenu) {
        this.allowAdminMenu = allowAdminMenu;
    }


    /**
     * Gets the allowRechargeServer value for this LifeCycle.
     * 
     * @return allowRechargeServer
     */
    public Boolean getAllowRechargeServer() {
        return allowRechargeServer;
    }


    /**
     * Sets the allowRechargeServer value for this LifeCycle.
     * 
     * @param allowRechargeServer
     */
    public void setAllowRechargeServer(Boolean allowRechargeServer) {
        this.allowRechargeServer = allowRechargeServer;
    }


    /**
     * Gets the allowCustomerCare value for this LifeCycle.
     * 
     * @return allowCustomerCare
     */
    public Boolean getAllowCustomerCare() {
        return allowCustomerCare;
    }


    /**
     * Sets the allowCustomerCare value for this LifeCycle.
     * 
     * @param allowCustomerCare
     */
    public void setAllowCustomerCare(Boolean allowCustomerCare) {
        this.allowCustomerCare = allowCustomerCare;
    }


    /**
     * Gets the allowInfoServer value for this LifeCycle.
     * 
     * @return allowInfoServer
     */
    public Boolean getAllowInfoServer() {
        return allowInfoServer;
    }


    /**
     * Sets the allowInfoServer value for this LifeCycle.
     * 
     * @param allowInfoServer
     */
    public void setAllowInfoServer(Boolean allowInfoServer) {
        this.allowInfoServer = allowInfoServer;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LifeCycle)) return false;
        LifeCycle other = (LifeCycle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.allowOriginatingFreeVoiceCalls==null && other.getAllowOriginatingFreeVoiceCalls()==null) || 
             (this.allowOriginatingFreeVoiceCalls!=null &&
              this.allowOriginatingFreeVoiceCalls.equals(other.getAllowOriginatingFreeVoiceCalls()))) &&
            ((this.allowOriginatingBillableCalls==null && other.getAllowOriginatingBillableCalls()==null) || 
             (this.allowOriginatingBillableCalls!=null &&
              this.allowOriginatingBillableCalls.equals(other.getAllowOriginatingBillableCalls()))) &&
            ((this.allowTerminatingCalls==null && other.getAllowTerminatingCalls()==null) || 
             (this.allowTerminatingCalls!=null &&
              this.allowTerminatingCalls.equals(other.getAllowTerminatingCalls()))) &&
            ((this.allowGPRS==null && other.getAllowGPRS()==null) || 
             (this.allowGPRS!=null &&
              this.allowGPRS.equals(other.getAllowGPRS()))) &&
            ((this.allowOSA==null && other.getAllowOSA()==null) || 
             (this.allowOSA!=null &&
              this.allowOSA.equals(other.getAllowOSA()))) &&
            ((this.allowAdminMenu==null && other.getAllowAdminMenu()==null) || 
             (this.allowAdminMenu!=null &&
              this.allowAdminMenu.equals(other.getAllowAdminMenu()))) &&
            ((this.allowRechargeServer==null && other.getAllowRechargeServer()==null) || 
             (this.allowRechargeServer!=null &&
              this.allowRechargeServer.equals(other.getAllowRechargeServer()))) &&
            ((this.allowCustomerCare==null && other.getAllowCustomerCare()==null) || 
             (this.allowCustomerCare!=null &&
              this.allowCustomerCare.equals(other.getAllowCustomerCare()))) &&
            ((this.allowInfoServer==null && other.getAllowInfoServer()==null) || 
             (this.allowInfoServer!=null &&
              this.allowInfoServer.equals(other.getAllowInfoServer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAllowOriginatingFreeVoiceCalls() != null) {
            _hashCode += getAllowOriginatingFreeVoiceCalls().hashCode();
        }
        if (getAllowOriginatingBillableCalls() != null) {
            _hashCode += getAllowOriginatingBillableCalls().hashCode();
        }
        if (getAllowTerminatingCalls() != null) {
            _hashCode += getAllowTerminatingCalls().hashCode();
        }
        if (getAllowGPRS() != null) {
            _hashCode += getAllowGPRS().hashCode();
        }
        if (getAllowOSA() != null) {
            _hashCode += getAllowOSA().hashCode();
        }
        if (getAllowAdminMenu() != null) {
            _hashCode += getAllowAdminMenu().hashCode();
        }
        if (getAllowRechargeServer() != null) {
            _hashCode += getAllowRechargeServer().hashCode();
        }
        if (getAllowCustomerCare() != null) {
            _hashCode += getAllowCustomerCare().hashCode();
        }
        if (getAllowInfoServer() != null) {
            _hashCode += getAllowInfoServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LifeCycle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOriginatingFreeVoiceCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowOriginatingFreeVoiceCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOriginatingBillableCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowOriginatingBillableCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTerminatingCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowTerminatingCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowGPRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowGPRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOSA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowOSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdminMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowAdminMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRechargeServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowRechargeServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCustomerCare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowCustomerCare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowInfoServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowInfoServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
