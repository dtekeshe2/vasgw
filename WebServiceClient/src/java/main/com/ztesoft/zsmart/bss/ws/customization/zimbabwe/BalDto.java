/**
 * BalDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class BalDto  implements java.io.Serializable {
    private String balID;

    private String acctResID;

    private String acctResName;

    private Long balType;

    private String balance;

    private String consumeBal;

    private java.util.Date effDate;

    private java.util.Date expDate;

    private String updateDate;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balShareDtoList;

    public BalDto() {
    }

    public BalDto(
           String balID,
           String acctResID,
           String acctResName,
           Long balType,
           String balance,
           String consumeBal,
           java.util.Date effDate,
           java.util.Date expDate,
           String updateDate,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balShareDtoList) {
           this.balID = balID;
           this.acctResID = acctResID;
           this.acctResName = acctResName;
           this.balType = balType;
           this.balance = balance;
           this.consumeBal = consumeBal;
           this.effDate = effDate;
           this.expDate = expDate;
           this.updateDate = updateDate;
           this.balShareDtoList = balShareDtoList;
    }


    /**
     * Gets the balID value for this BalDto.
     * 
     * @return balID
     */
    public String getBalID() {
        return balID;
    }


    /**
     * Sets the balID value for this BalDto.
     * 
     * @param balID
     */
    public void setBalID(String balID) {
        this.balID = balID;
    }


    /**
     * Gets the acctResID value for this BalDto.
     * 
     * @return acctResID
     */
    public String getAcctResID() {
        return acctResID;
    }


    /**
     * Sets the acctResID value for this BalDto.
     * 
     * @param acctResID
     */
    public void setAcctResID(String acctResID) {
        this.acctResID = acctResID;
    }


    /**
     * Gets the acctResName value for this BalDto.
     * 
     * @return acctResName
     */
    public String getAcctResName() {
        return acctResName;
    }


    /**
     * Sets the acctResName value for this BalDto.
     * 
     * @param acctResName
     */
    public void setAcctResName(String acctResName) {
        this.acctResName = acctResName;
    }


    /**
     * Gets the balType value for this BalDto.
     * 
     * @return balType
     */
    public Long getBalType() {
        return balType;
    }


    /**
     * Sets the balType value for this BalDto.
     * 
     * @param balType
     */
    public void setBalType(Long balType) {
        this.balType = balType;
    }


    /**
     * Gets the balance value for this BalDto.
     * 
     * @return balance
     */
    public String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BalDto.
     * 
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }


    /**
     * Gets the consumeBal value for this BalDto.
     * 
     * @return consumeBal
     */
    public String getConsumeBal() {
        return consumeBal;
    }


    /**
     * Sets the consumeBal value for this BalDto.
     * 
     * @param consumeBal
     */
    public void setConsumeBal(String consumeBal) {
        this.consumeBal = consumeBal;
    }


    /**
     * Gets the effDate value for this BalDto.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this BalDto.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this BalDto.
     * 
     * @return expDate
     */
    public java.util.Date getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this BalDto.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the updateDate value for this BalDto.
     * 
     * @return updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this BalDto.
     * 
     * @param updateDate
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the balShareDtoList value for this BalDto.
     * 
     * @return balShareDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] getBalShareDtoList() {
        return balShareDtoList;
    }


    /**
     * Sets the balShareDtoList value for this BalDto.
     * 
     * @param balShareDtoList
     */
    public void setBalShareDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[] balShareDtoList) {
        this.balShareDtoList = balShareDtoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalDto)) return false;
        BalDto other = (BalDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balID==null && other.getBalID()==null) || 
             (this.balID!=null &&
              this.balID.equals(other.getBalID()))) &&
            ((this.acctResID==null && other.getAcctResID()==null) || 
             (this.acctResID!=null &&
              this.acctResID.equals(other.getAcctResID()))) &&
            ((this.acctResName==null && other.getAcctResName()==null) || 
             (this.acctResName!=null &&
              this.acctResName.equals(other.getAcctResName()))) &&
            ((this.balType==null && other.getBalType()==null) || 
             (this.balType!=null &&
              this.balType.equals(other.getBalType()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.consumeBal==null && other.getConsumeBal()==null) || 
             (this.consumeBal!=null &&
              this.consumeBal.equals(other.getConsumeBal()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.balShareDtoList==null && other.getBalShareDtoList()==null) || 
             (this.balShareDtoList!=null &&
              java.util.Arrays.equals(this.balShareDtoList, other.getBalShareDtoList())));
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
        if (getBalID() != null) {
            _hashCode += getBalID().hashCode();
        }
        if (getAcctResID() != null) {
            _hashCode += getAcctResID().hashCode();
        }
        if (getAcctResName() != null) {
            _hashCode += getAcctResName().hashCode();
        }
        if (getBalType() != null) {
            _hashCode += getBalType().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getConsumeBal() != null) {
            _hashCode += getConsumeBal().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getBalShareDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalShareDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalShareDtoList(), i);
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
        new org.apache.axis.description.TypeDesc(BalDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctResID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcctResID"));
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
        elemField.setFieldName("balType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumeBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ConsumeBal"));
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
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balShareDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalShareDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalShareDto"));
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
