/**
 * CreatePeriodicChargeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CreatePeriodicChargeRequest  implements java.io.Serializable {
    private String subscriberId;

    private String identity;

    private String chargeId;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private Integer numberOfApplications;

    private Integer applyDay;

    public CreatePeriodicChargeRequest() {
    }

    public CreatePeriodicChargeRequest(
           String subscriberId,
           String identity,
           String chargeId,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           Integer numberOfApplications,
           Integer applyDay) {
           this.subscriberId = subscriberId;
           this.identity = identity;
           this.chargeId = chargeId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.numberOfApplications = numberOfApplications;
           this.applyDay = applyDay;
    }


    /**
     * Gets the subscriberId value for this CreatePeriodicChargeRequest.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this CreatePeriodicChargeRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the identity value for this CreatePeriodicChargeRequest.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this CreatePeriodicChargeRequest.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the chargeId value for this CreatePeriodicChargeRequest.
     * 
     * @return chargeId
     */
    public String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this CreatePeriodicChargeRequest.
     * 
     * @param chargeId
     */
    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the startDate value for this CreatePeriodicChargeRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreatePeriodicChargeRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this CreatePeriodicChargeRequest.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CreatePeriodicChargeRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the numberOfApplications value for this CreatePeriodicChargeRequest.
     * 
     * @return numberOfApplications
     */
    public Integer getNumberOfApplications() {
        return numberOfApplications;
    }


    /**
     * Sets the numberOfApplications value for this CreatePeriodicChargeRequest.
     * 
     * @param numberOfApplications
     */
    public void setNumberOfApplications(Integer numberOfApplications) {
        this.numberOfApplications = numberOfApplications;
    }


    /**
     * Gets the applyDay value for this CreatePeriodicChargeRequest.
     * 
     * @return applyDay
     */
    public Integer getApplyDay() {
        return applyDay;
    }


    /**
     * Sets the applyDay value for this CreatePeriodicChargeRequest.
     * 
     * @param applyDay
     */
    public void setApplyDay(Integer applyDay) {
        this.applyDay = applyDay;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreatePeriodicChargeRequest)) return false;
        CreatePeriodicChargeRequest other = (CreatePeriodicChargeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.numberOfApplications==null && other.getNumberOfApplications()==null) || 
             (this.numberOfApplications!=null &&
              this.numberOfApplications.equals(other.getNumberOfApplications()))) &&
            ((this.applyDay==null && other.getApplyDay()==null) || 
             (this.applyDay!=null &&
              this.applyDay.equals(other.getApplyDay())));
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
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getNumberOfApplications() != null) {
            _hashCode += getNumberOfApplications().hashCode();
        }
        if (getApplyDay() != null) {
            _hashCode += getApplyDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePeriodicChargeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePeriodicChargeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("numberOfApplications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NumberOfApplications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ApplyDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
