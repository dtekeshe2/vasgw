/**
 * SubscriberPeriodicCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberPeriodicCharge  implements java.io.Serializable {
    private String periodicChargeID;

    private Integer remainingApplications;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private Boolean firstChargeApplied;

    private java.util.Calendar lastChargeDate;

    private Long applyDay;

    private String postActiveChargeApplied;

    public SubscriberPeriodicCharge() {
    }

    public SubscriberPeriodicCharge(
           String periodicChargeID,
           Integer remainingApplications,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           Boolean firstChargeApplied,
           java.util.Calendar lastChargeDate,
           Long applyDay,
           String postActiveChargeApplied) {
           this.periodicChargeID = periodicChargeID;
           this.remainingApplications = remainingApplications;
           this.startDate = startDate;
           this.endDate = endDate;
           this.firstChargeApplied = firstChargeApplied;
           this.lastChargeDate = lastChargeDate;
           this.applyDay = applyDay;
           this.postActiveChargeApplied = postActiveChargeApplied;
    }


    /**
     * Gets the periodicChargeID value for this SubscriberPeriodicCharge.
     * 
     * @return periodicChargeID
     */
    public String getPeriodicChargeID() {
        return periodicChargeID;
    }


    /**
     * Sets the periodicChargeID value for this SubscriberPeriodicCharge.
     * 
     * @param periodicChargeID
     */
    public void setPeriodicChargeID(String periodicChargeID) {
        this.periodicChargeID = periodicChargeID;
    }


    /**
     * Gets the remainingApplications value for this SubscriberPeriodicCharge.
     * 
     * @return remainingApplications
     */
    public Integer getRemainingApplications() {
        return remainingApplications;
    }


    /**
     * Sets the remainingApplications value for this SubscriberPeriodicCharge.
     * 
     * @param remainingApplications
     */
    public void setRemainingApplications(Integer remainingApplications) {
        this.remainingApplications = remainingApplications;
    }


    /**
     * Gets the startDate value for this SubscriberPeriodicCharge.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SubscriberPeriodicCharge.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SubscriberPeriodicCharge.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SubscriberPeriodicCharge.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the firstChargeApplied value for this SubscriberPeriodicCharge.
     * 
     * @return firstChargeApplied
     */
    public Boolean getFirstChargeApplied() {
        return firstChargeApplied;
    }


    /**
     * Sets the firstChargeApplied value for this SubscriberPeriodicCharge.
     * 
     * @param firstChargeApplied
     */
    public void setFirstChargeApplied(Boolean firstChargeApplied) {
        this.firstChargeApplied = firstChargeApplied;
    }


    /**
     * Gets the lastChargeDate value for this SubscriberPeriodicCharge.
     * 
     * @return lastChargeDate
     */
    public java.util.Calendar getLastChargeDate() {
        return lastChargeDate;
    }


    /**
     * Sets the lastChargeDate value for this SubscriberPeriodicCharge.
     * 
     * @param lastChargeDate
     */
    public void setLastChargeDate(java.util.Calendar lastChargeDate) {
        this.lastChargeDate = lastChargeDate;
    }


    /**
     * Gets the applyDay value for this SubscriberPeriodicCharge.
     * 
     * @return applyDay
     */
    public Long getApplyDay() {
        return applyDay;
    }


    /**
     * Sets the applyDay value for this SubscriberPeriodicCharge.
     * 
     * @param applyDay
     */
    public void setApplyDay(Long applyDay) {
        this.applyDay = applyDay;
    }


    /**
     * Gets the postActiveChargeApplied value for this SubscriberPeriodicCharge.
     * 
     * @return postActiveChargeApplied
     */
    public String getPostActiveChargeApplied() {
        return postActiveChargeApplied;
    }


    /**
     * Sets the postActiveChargeApplied value for this SubscriberPeriodicCharge.
     * 
     * @param postActiveChargeApplied
     */
    public void setPostActiveChargeApplied(String postActiveChargeApplied) {
        this.postActiveChargeApplied = postActiveChargeApplied;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberPeriodicCharge)) return false;
        SubscriberPeriodicCharge other = (SubscriberPeriodicCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.periodicChargeID==null && other.getPeriodicChargeID()==null) || 
             (this.periodicChargeID!=null &&
              this.periodicChargeID.equals(other.getPeriodicChargeID()))) &&
            ((this.remainingApplications==null && other.getRemainingApplications()==null) || 
             (this.remainingApplications!=null &&
              this.remainingApplications.equals(other.getRemainingApplications()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.firstChargeApplied==null && other.getFirstChargeApplied()==null) || 
             (this.firstChargeApplied!=null &&
              this.firstChargeApplied.equals(other.getFirstChargeApplied()))) &&
            ((this.lastChargeDate==null && other.getLastChargeDate()==null) || 
             (this.lastChargeDate!=null &&
              this.lastChargeDate.equals(other.getLastChargeDate()))) &&
            ((this.applyDay==null && other.getApplyDay()==null) || 
             (this.applyDay!=null &&
              this.applyDay.equals(other.getApplyDay()))) &&
            ((this.postActiveChargeApplied==null && other.getPostActiveChargeApplied()==null) || 
             (this.postActiveChargeApplied!=null &&
              this.postActiveChargeApplied.equals(other.getPostActiveChargeApplied())));
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
        if (getPeriodicChargeID() != null) {
            _hashCode += getPeriodicChargeID().hashCode();
        }
        if (getRemainingApplications() != null) {
            _hashCode += getRemainingApplications().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFirstChargeApplied() != null) {
            _hashCode += getFirstChargeApplied().hashCode();
        }
        if (getLastChargeDate() != null) {
            _hashCode += getLastChargeDate().hashCode();
        }
        if (getApplyDay() != null) {
            _hashCode += getApplyDay().hashCode();
        }
        if (getPostActiveChargeApplied() != null) {
            _hashCode += getPostActiveChargeApplied().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberPeriodicCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPeriodicCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicChargeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicChargeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingApplications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemainingApplications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstChargeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FirstChargeApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LastChargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ApplyDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActiveChargeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PostActiveChargeApplied"));
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
