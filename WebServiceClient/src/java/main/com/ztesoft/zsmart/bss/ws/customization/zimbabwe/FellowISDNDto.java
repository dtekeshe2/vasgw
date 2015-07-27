/**
 * FellowISDNDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class FellowISDNDto  implements java.io.Serializable {
    private String fellowISDN;

    private String fellowType;

    private String fellowTypeName;

    private java.util.Date createdDate;

    public FellowISDNDto() {
    }

    public FellowISDNDto(
           String fellowISDN,
           String fellowType,
           String fellowTypeName,
           java.util.Date createdDate) {
           this.fellowISDN = fellowISDN;
           this.fellowType = fellowType;
           this.fellowTypeName = fellowTypeName;
           this.createdDate = createdDate;
    }


    /**
     * Gets the fellowISDN value for this FellowISDNDto.
     * 
     * @return fellowISDN
     */
    public String getFellowISDN() {
        return fellowISDN;
    }


    /**
     * Sets the fellowISDN value for this FellowISDNDto.
     * 
     * @param fellowISDN
     */
    public void setFellowISDN(String fellowISDN) {
        this.fellowISDN = fellowISDN;
    }


    /**
     * Gets the fellowType value for this FellowISDNDto.
     * 
     * @return fellowType
     */
    public String getFellowType() {
        return fellowType;
    }


    /**
     * Sets the fellowType value for this FellowISDNDto.
     * 
     * @param fellowType
     */
    public void setFellowType(String fellowType) {
        this.fellowType = fellowType;
    }


    /**
     * Gets the fellowTypeName value for this FellowISDNDto.
     * 
     * @return fellowTypeName
     */
    public String getFellowTypeName() {
        return fellowTypeName;
    }


    /**
     * Sets the fellowTypeName value for this FellowISDNDto.
     * 
     * @param fellowTypeName
     */
    public void setFellowTypeName(String fellowTypeName) {
        this.fellowTypeName = fellowTypeName;
    }


    /**
     * Gets the createdDate value for this FellowISDNDto.
     * 
     * @return createdDate
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this FellowISDNDto.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FellowISDNDto)) return false;
        FellowISDNDto other = (FellowISDNDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fellowISDN==null && other.getFellowISDN()==null) || 
             (this.fellowISDN!=null &&
              this.fellowISDN.equals(other.getFellowISDN()))) &&
            ((this.fellowType==null && other.getFellowType()==null) || 
             (this.fellowType!=null &&
              this.fellowType.equals(other.getFellowType()))) &&
            ((this.fellowTypeName==null && other.getFellowTypeName()==null) || 
             (this.fellowTypeName!=null &&
              this.fellowTypeName.equals(other.getFellowTypeName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate())));
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
        if (getFellowISDN() != null) {
            _hashCode += getFellowISDN().hashCode();
        }
        if (getFellowType() != null) {
            _hashCode += getFellowType().hashCode();
        }
        if (getFellowTypeName() != null) {
            _hashCode += getFellowTypeName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FellowISDNDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fellowISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fellowType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fellowTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
