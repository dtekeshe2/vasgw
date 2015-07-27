/**
 * QueryUserProfileRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class QueryUserProfileRetDto  implements java.io.Serializable {
    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.UserProfileDto userProfileDto;

    public QueryUserProfileRetDto() {
    }

    public QueryUserProfileRetDto(
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.UserProfileDto userProfileDto) {
           this.userProfileDto = userProfileDto;
    }


    /**
     * Gets the userProfileDto value for this QueryUserProfileRetDto.
     * 
     * @return userProfileDto
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.UserProfileDto getUserProfileDto() {
        return userProfileDto;
    }


    /**
     * Sets the userProfileDto value for this QueryUserProfileRetDto.
     * 
     * @param userProfileDto
     */
    public void setUserProfileDto(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.UserProfileDto userProfileDto) {
        this.userProfileDto = userProfileDto;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QueryUserProfileRetDto)) return false;
        QueryUserProfileRetDto other = (QueryUserProfileRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userProfileDto==null && other.getUserProfileDto()==null) || 
             (this.userProfileDto!=null &&
              this.userProfileDto.equals(other.getUserProfileDto())));
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
        if (getUserProfileDto() != null) {
            _hashCode += getUserProfileDto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUserProfileRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userProfileDto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserProfileDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserProfileDto"));
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
