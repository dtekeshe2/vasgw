/**
 * ChangeFreeNumberForHybridReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class ChangeFreeNumberForHybridReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String userPwd;

    private String action;

    private String oldFreeNumber;

    private String newFreeNumber;

    public ChangeFreeNumberForHybridReqDto() {
    }

    public ChangeFreeNumberForHybridReqDto(
           String MSISDN,
           String userPwd,
           String action,
           String oldFreeNumber,
           String newFreeNumber) {
           this.MSISDN = MSISDN;
           this.userPwd = userPwd;
           this.action = action;
           this.oldFreeNumber = oldFreeNumber;
           this.newFreeNumber = newFreeNumber;
    }


    /**
     * Gets the MSISDN value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the userPwd value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the action value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * Gets the oldFreeNumber value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @return oldFreeNumber
     */
    public String getOldFreeNumber() {
        return oldFreeNumber;
    }


    /**
     * Sets the oldFreeNumber value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @param oldFreeNumber
     */
    public void setOldFreeNumber(String oldFreeNumber) {
        this.oldFreeNumber = oldFreeNumber;
    }


    /**
     * Gets the newFreeNumber value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @return newFreeNumber
     */
    public String getNewFreeNumber() {
        return newFreeNumber;
    }


    /**
     * Sets the newFreeNumber value for this ChangeFreeNumberForHybridReqDto.
     * 
     * @param newFreeNumber
     */
    public void setNewFreeNumber(String newFreeNumber) {
        this.newFreeNumber = newFreeNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeFreeNumberForHybridReqDto)) return false;
        ChangeFreeNumberForHybridReqDto other = (ChangeFreeNumberForHybridReqDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.userPwd==null && other.getUserPwd()==null) || 
             (this.userPwd!=null &&
              this.userPwd.equals(other.getUserPwd()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.oldFreeNumber==null && other.getOldFreeNumber()==null) || 
             (this.oldFreeNumber!=null &&
              this.oldFreeNumber.equals(other.getOldFreeNumber()))) &&
            ((this.newFreeNumber==null && other.getNewFreeNumber()==null) || 
             (this.newFreeNumber!=null &&
              this.newFreeNumber.equals(other.getNewFreeNumber())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getUserPwd() != null) {
            _hashCode += getUserPwd().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getOldFreeNumber() != null) {
            _hashCode += getOldFreeNumber().hashCode();
        }
        if (getNewFreeNumber() != null) {
            _hashCode += getNewFreeNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeFreeNumberForHybridReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeFreeNumberForHybridReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldFreeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "OldFreeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newFreeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewFreeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
