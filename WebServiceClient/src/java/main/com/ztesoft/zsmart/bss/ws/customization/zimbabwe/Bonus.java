/**
 * Bonus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class Bonus  implements java.io.Serializable {
    private String acctResCode;

    private String acctResName;

    private String bonusValue;

    private java.util.Date effDate;

    private java.util.Date expDate;

    private Long days;

    public Bonus() {
    }

    public Bonus(
           String acctResCode,
           String acctResName,
           String bonusValue,
           java.util.Date effDate,
           java.util.Date expDate,
           Long days) {
           this.acctResCode = acctResCode;
           this.acctResName = acctResName;
           this.bonusValue = bonusValue;
           this.effDate = effDate;
           this.expDate = expDate;
           this.days = days;
    }


    /**
     * Gets the acctResCode value for this Bonus.
     * 
     * @return acctResCode
     */
    public String getAcctResCode() {
        return acctResCode;
    }


    /**
     * Sets the acctResCode value for this Bonus.
     * 
     * @param acctResCode
     */
    public void setAcctResCode(String acctResCode) {
        this.acctResCode = acctResCode;
    }


    /**
     * Gets the acctResName value for this Bonus.
     * 
     * @return acctResName
     */
    public String getAcctResName() {
        return acctResName;
    }


    /**
     * Sets the acctResName value for this Bonus.
     * 
     * @param acctResName
     */
    public void setAcctResName(String acctResName) {
        this.acctResName = acctResName;
    }


    /**
     * Gets the bonusValue value for this Bonus.
     * 
     * @return bonusValue
     */
    public String getBonusValue() {
        return bonusValue;
    }


    /**
     * Sets the bonusValue value for this Bonus.
     * 
     * @param bonusValue
     */
    public void setBonusValue(String bonusValue) {
        this.bonusValue = bonusValue;
    }


    /**
     * Gets the effDate value for this Bonus.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this Bonus.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this Bonus.
     * 
     * @return expDate
     */
    public java.util.Date getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this Bonus.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the days value for this Bonus.
     * 
     * @return days
     */
    public Long getDays() {
        return days;
    }


    /**
     * Sets the days value for this Bonus.
     * 
     * @param days
     */
    public void setDays(Long days) {
        this.days = days;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Bonus)) return false;
        Bonus other = (Bonus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctResCode==null && other.getAcctResCode()==null) || 
             (this.acctResCode!=null &&
              this.acctResCode.equals(other.getAcctResCode()))) &&
            ((this.acctResName==null && other.getAcctResName()==null) || 
             (this.acctResName!=null &&
              this.acctResName.equals(other.getAcctResName()))) &&
            ((this.bonusValue==null && other.getBonusValue()==null) || 
             (this.bonusValue!=null &&
              this.bonusValue.equals(other.getBonusValue()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays())));
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
        if (getAcctResCode() != null) {
            _hashCode += getAcctResCode().hashCode();
        }
        if (getAcctResName() != null) {
            _hashCode += getAcctResName().hashCode();
        }
        if (getBonusValue() != null) {
            _hashCode += getBonusValue().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bonus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctResCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctResCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctResName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctResName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BonusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "EffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
