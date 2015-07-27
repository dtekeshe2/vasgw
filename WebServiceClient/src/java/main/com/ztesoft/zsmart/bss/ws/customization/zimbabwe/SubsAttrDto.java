/**
 * SubsAttrDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class SubsAttrDto  implements java.io.Serializable {
    private String attrCode;

    private String attrValue;

    public SubsAttrDto() {
    }

    public SubsAttrDto(
           String attrCode,
           String attrValue) {
           this.attrCode = attrCode;
           this.attrValue = attrValue;
    }


    /**
     * Gets the attrCode value for this SubsAttrDto.
     * 
     * @return attrCode
     */
    public String getAttrCode() {
        return attrCode;
    }


    /**
     * Sets the attrCode value for this SubsAttrDto.
     * 
     * @param attrCode
     */
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }


    /**
     * Gets the attrValue value for this SubsAttrDto.
     * 
     * @return attrValue
     */
    public String getAttrValue() {
        return attrValue;
    }


    /**
     * Sets the attrValue value for this SubsAttrDto.
     * 
     * @param attrValue
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubsAttrDto)) return false;
        SubsAttrDto other = (SubsAttrDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attrCode==null && other.getAttrCode()==null) || 
             (this.attrCode!=null &&
              this.attrCode.equals(other.getAttrCode()))) &&
            ((this.attrValue==null && other.getAttrValue()==null) || 
             (this.attrValue!=null &&
              this.attrValue.equals(other.getAttrValue())));
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
        if (getAttrCode() != null) {
            _hashCode += getAttrCode().hashCode();
        }
        if (getAttrValue() != null) {
            _hashCode += getAttrValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsAttrDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AttrCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AttrValue"));
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
