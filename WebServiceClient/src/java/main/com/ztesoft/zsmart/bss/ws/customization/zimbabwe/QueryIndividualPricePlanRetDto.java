/**
 * QueryIndividualPricePlanRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class QueryIndividualPricePlanRetDto  implements java.io.Serializable {
    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan[] pricePlanDtoList;

    public QueryIndividualPricePlanRetDto() {
    }

    public QueryIndividualPricePlanRetDto(
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan[] pricePlanDtoList) {
           this.pricePlanDtoList = pricePlanDtoList;
    }


    /**
     * Gets the pricePlanDtoList value for this QueryIndividualPricePlanRetDto.
     * 
     * @return pricePlanDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan[] getPricePlanDtoList() {
        return pricePlanDtoList;
    }


    /**
     * Sets the pricePlanDtoList value for this QueryIndividualPricePlanRetDto.
     * 
     * @param pricePlanDtoList
     */
    public void setPricePlanDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan[] pricePlanDtoList) {
        this.pricePlanDtoList = pricePlanDtoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QueryIndividualPricePlanRetDto)) return false;
        QueryIndividualPricePlanRetDto other = (QueryIndividualPricePlanRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricePlanDtoList==null && other.getPricePlanDtoList()==null) || 
             (this.pricePlanDtoList!=null &&
              java.util.Arrays.equals(this.pricePlanDtoList, other.getPricePlanDtoList())));
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
        if (getPricePlanDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricePlanDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPricePlanDtoList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryIndividualPricePlanRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoQueryIndividualPricePlan"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto"));
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
