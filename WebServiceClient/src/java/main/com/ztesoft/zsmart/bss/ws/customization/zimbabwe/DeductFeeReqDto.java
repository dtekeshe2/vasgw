/**
 * DeductFeeReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class DeductFeeReqDto  implements java.io.Serializable {
    private String transactionSN;

    private String MSISDN;

    private String amount;

    private String acctResCode;

    private String acctItemTypeCode;

    public DeductFeeReqDto() {
    }

    public DeductFeeReqDto(
           String transactionSN,
           String MSISDN,
           String amount,
           String acctResCode,
           String acctItemTypeCode) {
           this.transactionSN = transactionSN;
           this.MSISDN = MSISDN;
           this.amount = amount;
           this.acctResCode = acctResCode;
           this.acctItemTypeCode = acctItemTypeCode;
    }


    /**
     * Gets the transactionSN value for this DeductFeeReqDto.
     * 
     * @return transactionSN
     */
    public String getTransactionSN() {
        return transactionSN;
    }


    /**
     * Sets the transactionSN value for this DeductFeeReqDto.
     * 
     * @param transactionSN
     */
    public void setTransactionSN(String transactionSN) {
        this.transactionSN = transactionSN;
    }


    /**
     * Gets the MSISDN value for this DeductFeeReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this DeductFeeReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the amount value for this DeductFeeReqDto.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DeductFeeReqDto.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the acctResCode value for this DeductFeeReqDto.
     * 
     * @return acctResCode
     */
    public String getAcctResCode() {
        return acctResCode;
    }


    /**
     * Sets the acctResCode value for this DeductFeeReqDto.
     * 
     * @param acctResCode
     */
    public void setAcctResCode(String acctResCode) {
        this.acctResCode = acctResCode;
    }


    /**
     * Gets the acctItemTypeCode value for this DeductFeeReqDto.
     * 
     * @return acctItemTypeCode
     */
    public String getAcctItemTypeCode() {
        return acctItemTypeCode;
    }


    /**
     * Sets the acctItemTypeCode value for this DeductFeeReqDto.
     * 
     * @param acctItemTypeCode
     */
    public void setAcctItemTypeCode(String acctItemTypeCode) {
        this.acctItemTypeCode = acctItemTypeCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeductFeeReqDto)) return false;
        DeductFeeReqDto other = (DeductFeeReqDto) obj;
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
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.acctResCode==null && other.getAcctResCode()==null) || 
             (this.acctResCode!=null &&
              this.acctResCode.equals(other.getAcctResCode()))) &&
            ((this.acctItemTypeCode==null && other.getAcctItemTypeCode()==null) || 
             (this.acctItemTypeCode!=null &&
              this.acctItemTypeCode.equals(other.getAcctItemTypeCode())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAcctResCode() != null) {
            _hashCode += getAcctResCode().hashCode();
        }
        if (getAcctItemTypeCode() != null) {
            _hashCode += getAcctItemTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeductFeeReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TransactionSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
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
        elemField.setFieldName("acctResCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctResCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctItemTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctItemTypeCode"));
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
