/**
 * QueryAcctBalRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class QueryAcctBalRetDto  implements java.io.Serializable {
    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balDtoList;

    public QueryAcctBalRetDto() {
    }

    public QueryAcctBalRetDto(
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balDtoList) {
           this.balDtoList = balDtoList;
    }


    /**
     * Gets the balDtoList value for this QueryAcctBalRetDto.
     * 
     * @return balDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] getBalDtoList() {
        return balDtoList;
    }


    /**
     * Sets the balDtoList value for this QueryAcctBalRetDto.
     * 
     * @param balDtoList
     */
    public void setBalDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balDtoList) {
        this.balDtoList = balDtoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QueryAcctBalRetDto)) return false;
        QueryAcctBalRetDto other = (QueryAcctBalRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balDtoList==null && other.getBalDtoList()==null) || 
             (this.balDtoList!=null &&
              java.util.Arrays.equals(this.balDtoList, other.getBalDtoList())));
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
        if (getBalDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalDtoList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAcctBalRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto"));
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
