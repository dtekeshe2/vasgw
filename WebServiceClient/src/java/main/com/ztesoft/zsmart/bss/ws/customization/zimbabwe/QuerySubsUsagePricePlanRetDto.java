/**
 * QuerySubsUsagePricePlanRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class QuerySubsUsagePricePlanRetDto  implements java.io.Serializable {
    private String usageAmount;

    public QuerySubsUsagePricePlanRetDto() {
    }

    public QuerySubsUsagePricePlanRetDto(
           String usageAmount) {
           this.usageAmount = usageAmount;
    }


    /**
     * Gets the usageAmount value for this QuerySubsUsagePricePlanRetDto.
     * 
     * @return usageAmount
     */
    public String getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this QuerySubsUsagePricePlanRetDto.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(String usageAmount) {
        this.usageAmount = usageAmount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QuerySubsUsagePricePlanRetDto)) return false;
        QuerySubsUsagePricePlanRetDto other = (QuerySubsUsagePricePlanRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageAmount==null && other.getUsageAmount()==null) || 
             (this.usageAmount!=null &&
              this.usageAmount.equals(other.getUsageAmount())));
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
        if (getUsageAmount() != null) {
            _hashCode += getUsageAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySubsUsagePricePlanRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UsageAmount"));
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
