/**
 * RechargeReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class RechargeReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String transactionSN;

    private String acctResCode;

    private Long amount;

    private Long days;

    private Long rptFlag;

    private String type;

    private String PPSCardPin;

    private String cardType;

    public RechargeReqDto() {
    }

    public RechargeReqDto(
           String MSISDN,
           String transactionSN,
           String acctResCode,
           Long amount,
           Long days,
           Long rptFlag,
           String type,
           String PPSCardPin,
           String cardType) {
           this.MSISDN = MSISDN;
           this.transactionSN = transactionSN;
           this.acctResCode = acctResCode;
           this.amount = amount;
           this.days = days;
           this.rptFlag = rptFlag;
           this.type = type;
           this.PPSCardPin = PPSCardPin;
           this.cardType = cardType;
    }


    /**
     * Gets the MSISDN value for this RechargeReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this RechargeReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the transactionSN value for this RechargeReqDto.
     * 
     * @return transactionSN
     */
    public String getTransactionSN() {
        return transactionSN;
    }


    /**
     * Sets the transactionSN value for this RechargeReqDto.
     * 
     * @param transactionSN
     */
    public void setTransactionSN(String transactionSN) {
        this.transactionSN = transactionSN;
    }


    /**
     * Gets the acctResCode value for this RechargeReqDto.
     * 
     * @return acctResCode
     */
    public String getAcctResCode() {
        return acctResCode;
    }


    /**
     * Sets the acctResCode value for this RechargeReqDto.
     * 
     * @param acctResCode
     */
    public void setAcctResCode(String acctResCode) {
        this.acctResCode = acctResCode;
    }


    /**
     * Gets the amount value for this RechargeReqDto.
     * 
     * @return amount
     */
    public Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RechargeReqDto.
     * 
     * @param amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the days value for this RechargeReqDto.
     * 
     * @return days
     */
    public Long getDays() {
        return days;
    }


    /**
     * Sets the days value for this RechargeReqDto.
     * 
     * @param days
     */
    public void setDays(Long days) {
        this.days = days;
    }


    /**
     * Gets the rptFlag value for this RechargeReqDto.
     * 
     * @return rptFlag
     */
    public Long getRptFlag() {
        return rptFlag;
    }


    /**
     * Sets the rptFlag value for this RechargeReqDto.
     * 
     * @param rptFlag
     */
    public void setRptFlag(Long rptFlag) {
        this.rptFlag = rptFlag;
    }


    /**
     * Gets the type value for this RechargeReqDto.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this RechargeReqDto.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the PPSCardPin value for this RechargeReqDto.
     * 
     * @return PPSCardPin
     */
    public String getPPSCardPin() {
        return PPSCardPin;
    }


    /**
     * Sets the PPSCardPin value for this RechargeReqDto.
     * 
     * @param PPSCardPin
     */
    public void setPPSCardPin(String PPSCardPin) {
        this.PPSCardPin = PPSCardPin;
    }


    /**
     * Gets the cardType value for this RechargeReqDto.
     * 
     * @return cardType
     */
    public String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this RechargeReqDto.
     * 
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechargeReqDto)) return false;
        RechargeReqDto other = (RechargeReqDto) obj;
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
            ((this.transactionSN==null && other.getTransactionSN()==null) || 
             (this.transactionSN!=null &&
              this.transactionSN.equals(other.getTransactionSN()))) &&
            ((this.acctResCode==null && other.getAcctResCode()==null) || 
             (this.acctResCode!=null &&
              this.acctResCode.equals(other.getAcctResCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.rptFlag==null && other.getRptFlag()==null) || 
             (this.rptFlag!=null &&
              this.rptFlag.equals(other.getRptFlag()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.PPSCardPin==null && other.getPPSCardPin()==null) || 
             (this.PPSCardPin!=null &&
              this.PPSCardPin.equals(other.getPPSCardPin()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType())));
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
        if (getTransactionSN() != null) {
            _hashCode += getTransactionSN().hashCode();
        }
        if (getAcctResCode() != null) {
            _hashCode += getAcctResCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getRptFlag() != null) {
            _hashCode += getRptFlag().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPPSCardPin() != null) {
            _hashCode += getPPSCardPin().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TransactionSN"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPSCardPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PPSCardPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CardType"));
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
