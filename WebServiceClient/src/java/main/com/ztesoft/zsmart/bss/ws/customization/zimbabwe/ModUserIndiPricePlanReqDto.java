/**
 * ModUserIndiPricePlanReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class ModUserIndiPricePlanReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String userPwd;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto[] pricePlanChgDtoList;

    public ModUserIndiPricePlanReqDto() {
    }

    public ModUserIndiPricePlanReqDto(
           String MSISDN,
           String userPwd,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto[] pricePlanChgDtoList) {
           this.MSISDN = MSISDN;
           this.userPwd = userPwd;
           this.pricePlanChgDtoList = pricePlanChgDtoList;
    }


    /**
     * Gets the MSISDN value for this ModUserIndiPricePlanReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ModUserIndiPricePlanReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the userPwd value for this ModUserIndiPricePlanReqDto.
     * 
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this ModUserIndiPricePlanReqDto.
     * 
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the pricePlanChgDtoList value for this ModUserIndiPricePlanReqDto.
     * 
     * @return pricePlanChgDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto[] getPricePlanChgDtoList() {
        return pricePlanChgDtoList;
    }


    /**
     * Sets the pricePlanChgDtoList value for this ModUserIndiPricePlanReqDto.
     * 
     * @param pricePlanChgDtoList
     */
    public void setPricePlanChgDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto[] pricePlanChgDtoList) {
        this.pricePlanChgDtoList = pricePlanChgDtoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModUserIndiPricePlanReqDto)) return false;
        ModUserIndiPricePlanReqDto other = (ModUserIndiPricePlanReqDto) obj;
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
            ((this.pricePlanChgDtoList==null && other.getPricePlanChgDtoList()==null) || 
             (this.pricePlanChgDtoList!=null &&
              java.util.Arrays.equals(this.pricePlanChgDtoList, other.getPricePlanChgDtoList())));
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
        if (getPricePlanChgDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricePlanChgDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPricePlanChgDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModUserIndiPricePlanReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModUserIndiPricePlanReqDto"));
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
        elemField.setFieldName("pricePlanChgDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto"));
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
