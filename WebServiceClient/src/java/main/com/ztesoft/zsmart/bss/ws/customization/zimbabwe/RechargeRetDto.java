/**
 * RechargeRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class RechargeRetDto  implements java.io.Serializable {
    private String transactionSN;

    private String beforeOper;

    private String afterOper;

    private java.util.Date expireDate;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus[] bonusList;

    public RechargeRetDto() {
    }

    public RechargeRetDto(
           String transactionSN,
           String beforeOper,
           String afterOper,
           java.util.Date expireDate,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus[] bonusList) {
           this.transactionSN = transactionSN;
           this.beforeOper = beforeOper;
           this.afterOper = afterOper;
           this.expireDate = expireDate;
           this.bonusList = bonusList;
    }


    /**
     * Gets the transactionSN value for this RechargeRetDto.
     * 
     * @return transactionSN
     */
    public String getTransactionSN() {
        return transactionSN;
    }


    /**
     * Sets the transactionSN value for this RechargeRetDto.
     * 
     * @param transactionSN
     */
    public void setTransactionSN(String transactionSN) {
        this.transactionSN = transactionSN;
    }


    /**
     * Gets the beforeOper value for this RechargeRetDto.
     * 
     * @return beforeOper
     */
    public String getBeforeOper() {
        return beforeOper;
    }


    /**
     * Sets the beforeOper value for this RechargeRetDto.
     * 
     * @param beforeOper
     */
    public void setBeforeOper(String beforeOper) {
        this.beforeOper = beforeOper;
    }


    /**
     * Gets the afterOper value for this RechargeRetDto.
     * 
     * @return afterOper
     */
    public String getAfterOper() {
        return afterOper;
    }


    /**
     * Sets the afterOper value for this RechargeRetDto.
     * 
     * @param afterOper
     */
    public void setAfterOper(String afterOper) {
        this.afterOper = afterOper;
    }


    /**
     * Gets the expireDate value for this RechargeRetDto.
     * 
     * @return expireDate
     */
    public java.util.Date getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this RechargeRetDto.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Date expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the bonusList value for this RechargeRetDto.
     * 
     * @return bonusList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus[] getBonusList() {
        return bonusList;
    }


    /**
     * Sets the bonusList value for this RechargeRetDto.
     * 
     * @param bonusList
     */
    public void setBonusList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus[] bonusList) {
        this.bonusList = bonusList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechargeRetDto)) return false;
        RechargeRetDto other = (RechargeRetDto) obj;
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
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.bonusList==null && other.getBonusList()==null) || 
             (this.bonusList!=null &&
              java.util.Arrays.equals(this.bonusList, other.getBonusList())));
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
        if (getBonusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBonusList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBonusList(), i);
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
        new org.apache.axis.description.TypeDesc(RechargeRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeRetDto"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BonusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus"));
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
