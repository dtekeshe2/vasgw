/**
 * PricePlanDtoQueryIndividualPricePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class PricePlanDtoQueryIndividualPricePlan  implements java.io.Serializable {
    private String pricePlanIndex;

    private String pricePlanName;

    private java.util.Date createdDate;

    private java.util.Date effDate;

    private java.util.Date expDate;

    private String priority;

    public PricePlanDtoQueryIndividualPricePlan() {
    }

    public PricePlanDtoQueryIndividualPricePlan(
           String pricePlanIndex,
           String pricePlanName,
           java.util.Date createdDate,
           java.util.Date effDate,
           java.util.Date expDate,
           String priority) {
           this.pricePlanIndex = pricePlanIndex;
           this.pricePlanName = pricePlanName;
           this.createdDate = createdDate;
           this.effDate = effDate;
           this.expDate = expDate;
           this.priority = priority;
    }


    /**
     * Gets the pricePlanIndex value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return pricePlanIndex
     */
    public String getPricePlanIndex() {
        return pricePlanIndex;
    }


    /**
     * Sets the pricePlanIndex value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param pricePlanIndex
     */
    public void setPricePlanIndex(String pricePlanIndex) {
        this.pricePlanIndex = pricePlanIndex;
    }


    /**
     * Gets the pricePlanName value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return pricePlanName
     */
    public String getPricePlanName() {
        return pricePlanName;
    }


    /**
     * Sets the pricePlanName value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param pricePlanName
     */
    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }


    /**
     * Gets the createdDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return createdDate
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the effDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return expDate
     */
    public java.util.Date getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the priority value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @return priority
     */
    public String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PricePlanDtoQueryIndividualPricePlan.
     * 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PricePlanDtoQueryIndividualPricePlan)) return false;
        PricePlanDtoQueryIndividualPricePlan other = (PricePlanDtoQueryIndividualPricePlan) obj;
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
            ((this.pricePlanName==null && other.getPricePlanName()==null) || 
             (this.pricePlanName!=null &&
              this.pricePlanName.equals(other.getPricePlanName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getPricePlanName() != null) {
            _hashCode += getPricePlanName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricePlanDtoQueryIndividualPricePlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoQueryIndividualPricePlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Priority"));
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
