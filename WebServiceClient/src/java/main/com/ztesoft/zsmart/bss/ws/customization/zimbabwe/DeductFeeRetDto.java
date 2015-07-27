/**
 * DeductFeeRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class DeductFeeRetDto  implements java.io.Serializable {
    private String transactionSN;

    private String beforeOper;

    private String afterOper;

    private java.util.Date expireDate;

    public DeductFeeRetDto() {
    }

    public DeductFeeRetDto(
           String transactionSN,
           String beforeOper,
           String afterOper,
           java.util.Date expireDate) {
           this.transactionSN = transactionSN;
           this.beforeOper = beforeOper;
           this.afterOper = afterOper;
           this.expireDate = expireDate;
    }


    /**
     * Gets the transactionSN value for this DeductFeeRetDto.
     * 
     * @return transactionSN
     */
    public String getTransactionSN() {
        return transactionSN;
    }


    /**
     * Sets the transactionSN value for this DeductFeeRetDto.
     * 
     * @param transactionSN
     */
    public void setTransactionSN(String transactionSN) {
        this.transactionSN = transactionSN;
    }


    /**
     * Gets the beforeOper value for this DeductFeeRetDto.
     * 
     * @return beforeOper
     */
    public String getBeforeOper() {
        return beforeOper;
    }


    /**
     * Sets the beforeOper value for this DeductFeeRetDto.
     * 
     * @param beforeOper
     */
    public void setBeforeOper(String beforeOper) {
        this.beforeOper = beforeOper;
    }


    /**
     * Gets the afterOper value for this DeductFeeRetDto.
     * 
     * @return afterOper
     */
    public String getAfterOper() {
        return afterOper;
    }


    /**
     * Sets the afterOper value for this DeductFeeRetDto.
     * 
     * @param afterOper
     */
    public void setAfterOper(String afterOper) {
        this.afterOper = afterOper;
    }


    /**
     * Gets the expireDate value for this DeductFeeRetDto.
     * 
     * @return expireDate
     */
    public java.util.Date getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this DeductFeeRetDto.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Date expireDate) {
        this.expireDate = expireDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeductFeeRetDto)) return false;
        DeductFeeRetDto other = (DeductFeeRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionSN==null && other.getTransactionSN()==null) || 
             (this.transactionSN!=null &&
              this.transactionSN.equals(other.getTransactionSN()))) &&
            ((this.beforeOper==null && other.getBeforeOper()==null) || 
             (this.beforeOper!=null &&
              this.beforeOper.equals(other.getBeforeOper()))) &&
            ((this.afterOper==null && other.getAfterOper()==null) || 
             (this.afterOper!=null &&
              this.afterOper.equals(other.getAfterOper()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getTransactionSN() != null) {
            _hashCode += getTransactionSN().hashCode();
        }
        if (getBeforeOper() != null) {
            _hashCode += getBeforeOper().hashCode();
        }
        if (getAfterOper() != null) {
            _hashCode += getAfterOper().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeductFeeRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TransactionSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BeforeOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AfterOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ExpireDate"));
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
