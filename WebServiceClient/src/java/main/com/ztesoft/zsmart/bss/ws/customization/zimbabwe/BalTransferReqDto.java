/**
 * BalTransferReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class BalTransferReqDto  implements java.io.Serializable {
    private String SAccnt;

    private String acctResCode;

    private String amount;

    private String DAccnt;

    private String comments;

    public BalTransferReqDto() {
    }

    public BalTransferReqDto(
           String SAccnt,
           String acctResCode,
           String amount,
           String DAccnt,
           String comments) {
           this.SAccnt = SAccnt;
           this.acctResCode = acctResCode;
           this.amount = amount;
           this.DAccnt = DAccnt;
           this.comments = comments;
    }


    /**
     * Gets the SAccnt value for this BalTransferReqDto.
     * 
     * @return SAccnt
     */
    public String getSAccnt() {
        return SAccnt;
    }


    /**
     * Sets the SAccnt value for this BalTransferReqDto.
     * 
     * @param SAccnt
     */
    public void setSAccnt(String SAccnt) {
        this.SAccnt = SAccnt;
    }


    /**
     * Gets the acctResCode value for this BalTransferReqDto.
     * 
     * @return acctResCode
     */
    public String getAcctResCode() {
        return acctResCode;
    }


    /**
     * Sets the acctResCode value for this BalTransferReqDto.
     * 
     * @param acctResCode
     */
    public void setAcctResCode(String acctResCode) {
        this.acctResCode = acctResCode;
    }


    /**
     * Gets the amount value for this BalTransferReqDto.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BalTransferReqDto.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the DAccnt value for this BalTransferReqDto.
     * 
     * @return DAccnt
     */
    public String getDAccnt() {
        return DAccnt;
    }


    /**
     * Sets the DAccnt value for this BalTransferReqDto.
     * 
     * @param DAccnt
     */
    public void setDAccnt(String DAccnt) {
        this.DAccnt = DAccnt;
    }


    /**
     * Gets the comments value for this BalTransferReqDto.
     * 
     * @return comments
     */
    public String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this BalTransferReqDto.
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalTransferReqDto)) return false;
        BalTransferReqDto other = (BalTransferReqDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SAccnt==null && other.getSAccnt()==null) || 
             (this.SAccnt!=null &&
              this.SAccnt.equals(other.getSAccnt()))) &&
            ((this.acctResCode==null && other.getAcctResCode()==null) || 
             (this.acctResCode!=null &&
              this.acctResCode.equals(other.getAcctResCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.DAccnt==null && other.getDAccnt()==null) || 
             (this.DAccnt!=null &&
              this.DAccnt.equals(other.getDAccnt()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getSAccnt() != null) {
            _hashCode += getSAccnt().hashCode();
        }
        if (getAcctResCode() != null) {
            _hashCode += getAcctResCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDAccnt() != null) {
            _hashCode += getDAccnt().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalTransferReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAccnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SAccnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctResCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctResCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DAccnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DAccnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Comments"));
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
