/**
 * HybridReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class HybridReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String userPwd;

    private String brandCode;

    private String bundleCode;

    public HybridReqDto() {
    }

    public HybridReqDto(
           String MSISDN,
           String userPwd,
           String brandCode,
           String bundleCode) {
           this.MSISDN = MSISDN;
           this.userPwd = userPwd;
           this.brandCode = brandCode;
           this.bundleCode = bundleCode;
    }


    /**
     * Gets the MSISDN value for this HybridReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this HybridReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the userPwd value for this HybridReqDto.
     * 
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this HybridReqDto.
     * 
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the brandCode value for this HybridReqDto.
     * 
     * @return brandCode
     */
    public String getBrandCode() {
        return brandCode;
    }


    /**
     * Sets the brandCode value for this HybridReqDto.
     * 
     * @param brandCode
     */
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }


    /**
     * Gets the bundleCode value for this HybridReqDto.
     * 
     * @return bundleCode
     */
    public String getBundleCode() {
        return bundleCode;
    }


    /**
     * Sets the bundleCode value for this HybridReqDto.
     * 
     * @param bundleCode
     */
    public void setBundleCode(String bundleCode) {
        this.bundleCode = bundleCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HybridReqDto)) return false;
        HybridReqDto other = (HybridReqDto) obj;
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
            ((this.brandCode==null && other.getBrandCode()==null) || 
             (this.brandCode!=null &&
              this.brandCode.equals(other.getBrandCode()))) &&
            ((this.bundleCode==null && other.getBundleCode()==null) || 
             (this.bundleCode!=null &&
              this.bundleCode.equals(other.getBundleCode())));
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
        if (getBrandCode() != null) {
            _hashCode += getBrandCode().hashCode();
        }
        if (getBundleCode() != null) {
            _hashCode += getBundleCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HybridReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridReqDto"));
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
        elemField.setFieldName("brandCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BrandCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BundleCode"));
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
