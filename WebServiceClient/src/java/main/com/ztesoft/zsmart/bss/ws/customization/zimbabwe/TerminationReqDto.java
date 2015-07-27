/**
 * TerminationReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class TerminationReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String userPwd;

    private String logFileName;

    private String deleteVoiceMail;

    public TerminationReqDto() {
    }

    public TerminationReqDto(
           String MSISDN,
           String userPwd,
           String logFileName,
           String deleteVoiceMail) {
           this.MSISDN = MSISDN;
           this.userPwd = userPwd;
           this.logFileName = logFileName;
           this.deleteVoiceMail = deleteVoiceMail;
    }


    /**
     * Gets the MSISDN value for this TerminationReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this TerminationReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the userPwd value for this TerminationReqDto.
     * 
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this TerminationReqDto.
     * 
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the logFileName value for this TerminationReqDto.
     * 
     * @return logFileName
     */
    public String getLogFileName() {
        return logFileName;
    }


    /**
     * Sets the logFileName value for this TerminationReqDto.
     * 
     * @param logFileName
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }


    /**
     * Gets the deleteVoiceMail value for this TerminationReqDto.
     * 
     * @return deleteVoiceMail
     */
    public String getDeleteVoiceMail() {
        return deleteVoiceMail;
    }


    /**
     * Sets the deleteVoiceMail value for this TerminationReqDto.
     * 
     * @param deleteVoiceMail
     */
    public void setDeleteVoiceMail(String deleteVoiceMail) {
        this.deleteVoiceMail = deleteVoiceMail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TerminationReqDto)) return false;
        TerminationReqDto other = (TerminationReqDto) obj;
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
            ((this.logFileName==null && other.getLogFileName()==null) || 
             (this.logFileName!=null &&
              this.logFileName.equals(other.getLogFileName()))) &&
            ((this.deleteVoiceMail==null && other.getDeleteVoiceMail()==null) || 
             (this.deleteVoiceMail!=null &&
              this.deleteVoiceMail.equals(other.getDeleteVoiceMail())));
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
        if (getLogFileName() != null) {
            _hashCode += getLogFileName().hashCode();
        }
        if (getDeleteVoiceMail() != null) {
            _hashCode += getDeleteVoiceMail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TerminationReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TerminationReqDto"));
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
        elemField.setFieldName("logFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "LogFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteVoiceMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeleteVoiceMail"));
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
