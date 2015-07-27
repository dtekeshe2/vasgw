/**
 * PricePlanChgDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class PricePlanChgDto  implements java.io.Serializable {
    private String pricePlanIndex;

    private Long action;

    private Long effType;

    private java.util.Date effDate;

    private java.util.Date expDate;

    public PricePlanChgDto() {
    }

    public PricePlanChgDto(
           String pricePlanIndex,
           Long action,
           Long effType,
           java.util.Date effDate,
           java.util.Date expDate) {
           this.pricePlanIndex = pricePlanIndex;
           this.action = action;
           this.effType = effType;
           this.effDate = effDate;
           this.expDate = expDate;
    }


    /**
     * Gets the pricePlanIndex value for this PricePlanChgDto.
     * 
     * @return pricePlanIndex
     */
    public String getPricePlanIndex() {
        return pricePlanIndex;
    }


    /**
     * Sets the pricePlanIndex value for this PricePlanChgDto.
     * 
     * @param pricePlanIndex
     */
    public void setPricePlanIndex(String pricePlanIndex) {
        this.pricePlanIndex = pricePlanIndex;
    }


    /**
     * Gets the action value for this PricePlanChgDto.
     * 
     * @return action
     */
    public Long getAction() {
        return action;
    }


    /**
     * Sets the action value for this PricePlanChgDto.
     * 
     * @param action
     */
    public void setAction(Long action) {
        this.action = action;
    }


    /**
     * Gets the effType value for this PricePlanChgDto.
     * 
     * @return effType
     */
    public Long getEffType() {
        return effType;
    }


    /**
     * Sets the effType value for this PricePlanChgDto.
     * 
     * @param effType
     */
    public void setEffType(Long effType) {
        this.effType = effType;
    }


    /**
     * Gets the effDate value for this PricePlanChgDto.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this PricePlanChgDto.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this PricePlanChgDto.
     * 
     * @return expDate
     */
    public java.util.Date getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this PricePlanChgDto.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PricePlanChgDto)) return false;
        PricePlanChgDto other = (PricePlanChgDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricePlanIndex==null && other.getPricePlanIndex()==null) || 
             (this.pricePlanIndex!=null &&
              this.pricePlanIndex.equals(other.getPricePlanIndex()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.effType==null && other.getEffType()==null) || 
             (this.effType!=null &&
              this.effType.equals(other.getEffType()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate())));
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
        if (getPricePlanIndex() != null) {
            _hashCode += getPricePlanIndex().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getEffType() != null) {
            _hashCode += getEffType().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricePlanChgDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "EffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
