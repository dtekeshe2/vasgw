/**
 * DiscountPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class DiscountPlan  implements java.io.Serializable {
    private String discountPlanName;

    private String accumulatorName;

    private Double threshold;

    private Double discount;

    private String currencyISO;

    private String serviceProvider;

    public DiscountPlan() {
    }

    public DiscountPlan(
           String discountPlanName,
           String accumulatorName,
           Double threshold,
           Double discount,
           String currencyISO,
           String serviceProvider) {
           this.discountPlanName = discountPlanName;
           this.accumulatorName = accumulatorName;
           this.threshold = threshold;
           this.discount = discount;
           this.currencyISO = currencyISO;
           this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the discountPlanName value for this DiscountPlan.
     * 
     * @return discountPlanName
     */
    public String getDiscountPlanName() {
        return discountPlanName;
    }


    /**
     * Sets the discountPlanName value for this DiscountPlan.
     * 
     * @param discountPlanName
     */
    public void setDiscountPlanName(String discountPlanName) {
        this.discountPlanName = discountPlanName;
    }


    /**
     * Gets the accumulatorName value for this DiscountPlan.
     * 
     * @return accumulatorName
     */
    public String getAccumulatorName() {
        return accumulatorName;
    }


    /**
     * Sets the accumulatorName value for this DiscountPlan.
     * 
     * @param accumulatorName
     */
    public void setAccumulatorName(String accumulatorName) {
        this.accumulatorName = accumulatorName;
    }


    /**
     * Gets the threshold value for this DiscountPlan.
     * 
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this DiscountPlan.
     * 
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the discount value for this DiscountPlan.
     * 
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this DiscountPlan.
     * 
     * @param discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the currencyISO value for this DiscountPlan.
     * 
     * @return currencyISO
     */
    public String getCurrencyISO() {
        return currencyISO;
    }


    /**
     * Sets the currencyISO value for this DiscountPlan.
     * 
     * @param currencyISO
     */
    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }


    /**
     * Gets the serviceProvider value for this DiscountPlan.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this DiscountPlan.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DiscountPlan)) return false;
        DiscountPlan other = (DiscountPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discountPlanName==null && other.getDiscountPlanName()==null) || 
             (this.discountPlanName!=null &&
              this.discountPlanName.equals(other.getDiscountPlanName()))) &&
            ((this.accumulatorName==null && other.getAccumulatorName()==null) || 
             (this.accumulatorName!=null &&
              this.accumulatorName.equals(other.getAccumulatorName()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.currencyISO==null && other.getCurrencyISO()==null) || 
             (this.currencyISO!=null &&
              this.currencyISO.equals(other.getCurrencyISO()))) &&
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider())));
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
        if (getDiscountPlanName() != null) {
            _hashCode += getDiscountPlanName().hashCode();
        }
        if (getAccumulatorName() != null) {
            _hashCode += getAccumulatorName().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getCurrencyISO() != null) {
            _hashCode += getCurrencyISO().hashCode();
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscountPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "discountPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
