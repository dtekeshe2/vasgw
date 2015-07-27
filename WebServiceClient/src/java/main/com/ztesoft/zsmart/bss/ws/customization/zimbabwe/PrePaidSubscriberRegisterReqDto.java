/**
 * PrePaidSubscriberRegisterReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class PrePaidSubscriberRegisterReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String DOCType;

    private String DOCNumber;

    private String custName;

    private String address;

    public PrePaidSubscriberRegisterReqDto() {
    }

    public PrePaidSubscriberRegisterReqDto(
           String MSISDN,
           String DOCType,
           String DOCNumber,
           String custName,
           String address) {
           this.MSISDN = MSISDN;
           this.DOCType = DOCType;
           this.DOCNumber = DOCNumber;
           this.custName = custName;
           this.address = address;
    }


    /**
     * Gets the MSISDN value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the DOCType value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @return DOCType
     */
    public String getDOCType() {
        return DOCType;
    }


    /**
     * Sets the DOCType value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @param DOCType
     */
    public void setDOCType(String DOCType) {
        this.DOCType = DOCType;
    }


    /**
     * Gets the DOCNumber value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @return DOCNumber
     */
    public String getDOCNumber() {
        return DOCNumber;
    }


    /**
     * Sets the DOCNumber value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @param DOCNumber
     */
    public void setDOCNumber(String DOCNumber) {
        this.DOCNumber = DOCNumber;
    }


    /**
     * Gets the custName value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @return custName
     */
    public String getCustName() {
        return custName;
    }


    /**
     * Sets the custName value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @param custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }


    /**
     * Gets the address value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PrePaidSubscriberRegisterReqDto.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrePaidSubscriberRegisterReqDto)) return false;
        PrePaidSubscriberRegisterReqDto other = (PrePaidSubscriberRegisterReqDto) obj;
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
            ((this.DOCType==null && other.getDOCType()==null) || 
             (this.DOCType!=null &&
              this.DOCType.equals(other.getDOCType()))) &&
            ((this.DOCNumber==null && other.getDOCNumber()==null) || 
             (this.DOCNumber!=null &&
              this.DOCNumber.equals(other.getDOCNumber()))) &&
            ((this.custName==null && other.getCustName()==null) || 
             (this.custName!=null &&
              this.custName.equals(other.getCustName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getDOCType() != null) {
            _hashCode += getDOCType().hashCode();
        }
        if (getDOCNumber() != null) {
            _hashCode += getDOCNumber().hashCode();
        }
        if (getCustName() != null) {
            _hashCode += getCustName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrePaidSubscriberRegisterReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrePaidSubscriberRegisterReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DOCType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DOCNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Address"));
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
