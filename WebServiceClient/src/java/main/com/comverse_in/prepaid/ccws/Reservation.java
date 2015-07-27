/**
 * Reservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class Reservation  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.ReservationAmount[] reservationAmounts;

    private String subscriberID;

    private String SLUName;

    private String processName;

    private String CRN;

    private Integer reservationID;

    private String applicationName;

    private String subTypeName;

    private java.util.Calendar reservationEndTime;

    private Integer consUsage;

    private String masterSubID;

    private Integer masterIdentityId;

    private java.util.Calendar activityStartTime;

    private String calledNumber;

    private String serviceType;

    private String assumeConsumption;

    private java.math.BigDecimal AC1;

    private java.math.BigDecimal AC2;

    private java.math.BigDecimal AC3;

    private java.math.BigDecimal AC4;

    private java.math.BigDecimal AC5;

    private String discountPlanName;

    private Integer versionID;

    private String COSName;

    private com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType;

    private String isoCode;

    public Reservation() {
    }

    public Reservation(
           com.comverse_in.prepaid.ccws.ReservationAmount[] reservationAmounts,
           String subscriberID,
           String SLUName,
           String processName,
           String CRN,
           Integer reservationID,
           String applicationName,
           String subTypeName,
           java.util.Calendar reservationEndTime,
           Integer consUsage,
           String masterSubID,
           Integer masterIdentityId,
           java.util.Calendar activityStartTime,
           String calledNumber,
           String serviceType,
           String assumeConsumption,
           java.math.BigDecimal AC1,
           java.math.BigDecimal AC2,
           java.math.BigDecimal AC3,
           java.math.BigDecimal AC4,
           java.math.BigDecimal AC5,
           String discountPlanName,
           Integer versionID,
           String COSName,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String isoCode) {
           this.reservationAmounts = reservationAmounts;
           this.subscriberID = subscriberID;
           this.SLUName = SLUName;
           this.processName = processName;
           this.CRN = CRN;
           this.reservationID = reservationID;
           this.applicationName = applicationName;
           this.subTypeName = subTypeName;
           this.reservationEndTime = reservationEndTime;
           this.consUsage = consUsage;
           this.masterSubID = masterSubID;
           this.masterIdentityId = masterIdentityId;
           this.activityStartTime = activityStartTime;
           this.calledNumber = calledNumber;
           this.serviceType = serviceType;
           this.assumeConsumption = assumeConsumption;
           this.AC1 = AC1;
           this.AC2 = AC2;
           this.AC3 = AC3;
           this.AC4 = AC4;
           this.AC5 = AC5;
           this.discountPlanName = discountPlanName;
           this.versionID = versionID;
           this.COSName = COSName;
           this.fundUsageType = fundUsageType;
           this.isoCode = isoCode;
    }


    /**
     * Gets the reservationAmounts value for this Reservation.
     * 
     * @return reservationAmounts
     */
    public com.comverse_in.prepaid.ccws.ReservationAmount[] getReservationAmounts() {
        return reservationAmounts;
    }


    /**
     * Sets the reservationAmounts value for this Reservation.
     * 
     * @param reservationAmounts
     */
    public void setReservationAmounts(com.comverse_in.prepaid.ccws.ReservationAmount[] reservationAmounts) {
        this.reservationAmounts = reservationAmounts;
    }


    /**
     * Gets the subscriberID value for this Reservation.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this Reservation.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the SLUName value for this Reservation.
     * 
     * @return SLUName
     */
    public String getSLUName() {
        return SLUName;
    }


    /**
     * Sets the SLUName value for this Reservation.
     * 
     * @param SLUName
     */
    public void setSLUName(String SLUName) {
        this.SLUName = SLUName;
    }


    /**
     * Gets the processName value for this Reservation.
     * 
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this Reservation.
     * 
     * @param processName
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }


    /**
     * Gets the CRN value for this Reservation.
     * 
     * @return CRN
     */
    public String getCRN() {
        return CRN;
    }


    /**
     * Sets the CRN value for this Reservation.
     * 
     * @param CRN
     */
    public void setCRN(String CRN) {
        this.CRN = CRN;
    }


    /**
     * Gets the reservationID value for this Reservation.
     * 
     * @return reservationID
     */
    public Integer getReservationID() {
        return reservationID;
    }


    /**
     * Sets the reservationID value for this Reservation.
     * 
     * @param reservationID
     */
    public void setReservationID(Integer reservationID) {
        this.reservationID = reservationID;
    }


    /**
     * Gets the applicationName value for this Reservation.
     * 
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this Reservation.
     * 
     * @param applicationName
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the subTypeName value for this Reservation.
     * 
     * @return subTypeName
     */
    public String getSubTypeName() {
        return subTypeName;
    }


    /**
     * Sets the subTypeName value for this Reservation.
     * 
     * @param subTypeName
     */
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }


    /**
     * Gets the reservationEndTime value for this Reservation.
     * 
     * @return reservationEndTime
     */
    public java.util.Calendar getReservationEndTime() {
        return reservationEndTime;
    }


    /**
     * Sets the reservationEndTime value for this Reservation.
     * 
     * @param reservationEndTime
     */
    public void setReservationEndTime(java.util.Calendar reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }


    /**
     * Gets the consUsage value for this Reservation.
     * 
     * @return consUsage
     */
    public Integer getConsUsage() {
        return consUsage;
    }


    /**
     * Sets the consUsage value for this Reservation.
     * 
     * @param consUsage
     */
    public void setConsUsage(Integer consUsage) {
        this.consUsage = consUsage;
    }


    /**
     * Gets the masterSubID value for this Reservation.
     * 
     * @return masterSubID
     */
    public String getMasterSubID() {
        return masterSubID;
    }


    /**
     * Sets the masterSubID value for this Reservation.
     * 
     * @param masterSubID
     */
    public void setMasterSubID(String masterSubID) {
        this.masterSubID = masterSubID;
    }


    /**
     * Gets the masterIdentityId value for this Reservation.
     * 
     * @return masterIdentityId
     */
    public Integer getMasterIdentityId() {
        return masterIdentityId;
    }


    /**
     * Sets the masterIdentityId value for this Reservation.
     * 
     * @param masterIdentityId
     */
    public void setMasterIdentityId(Integer masterIdentityId) {
        this.masterIdentityId = masterIdentityId;
    }


    /**
     * Gets the activityStartTime value for this Reservation.
     * 
     * @return activityStartTime
     */
    public java.util.Calendar getActivityStartTime() {
        return activityStartTime;
    }


    /**
     * Sets the activityStartTime value for this Reservation.
     * 
     * @param activityStartTime
     */
    public void setActivityStartTime(java.util.Calendar activityStartTime) {
        this.activityStartTime = activityStartTime;
    }


    /**
     * Gets the calledNumber value for this Reservation.
     * 
     * @return calledNumber
     */
    public String getCalledNumber() {
        return calledNumber;
    }


    /**
     * Sets the calledNumber value for this Reservation.
     * 
     * @param calledNumber
     */
    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }


    /**
     * Gets the serviceType value for this Reservation.
     * 
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this Reservation.
     * 
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the assumeConsumption value for this Reservation.
     * 
     * @return assumeConsumption
     */
    public String getAssumeConsumption() {
        return assumeConsumption;
    }


    /**
     * Sets the assumeConsumption value for this Reservation.
     * 
     * @param assumeConsumption
     */
    public void setAssumeConsumption(String assumeConsumption) {
        this.assumeConsumption = assumeConsumption;
    }


    /**
     * Gets the AC1 value for this Reservation.
     * 
     * @return AC1
     */
    public java.math.BigDecimal getAC1() {
        return AC1;
    }


    /**
     * Sets the AC1 value for this Reservation.
     * 
     * @param AC1
     */
    public void setAC1(java.math.BigDecimal AC1) {
        this.AC1 = AC1;
    }


    /**
     * Gets the AC2 value for this Reservation.
     * 
     * @return AC2
     */
    public java.math.BigDecimal getAC2() {
        return AC2;
    }


    /**
     * Sets the AC2 value for this Reservation.
     * 
     * @param AC2
     */
    public void setAC2(java.math.BigDecimal AC2) {
        this.AC2 = AC2;
    }


    /**
     * Gets the AC3 value for this Reservation.
     * 
     * @return AC3
     */
    public java.math.BigDecimal getAC3() {
        return AC3;
    }


    /**
     * Sets the AC3 value for this Reservation.
     * 
     * @param AC3
     */
    public void setAC3(java.math.BigDecimal AC3) {
        this.AC3 = AC3;
    }


    /**
     * Gets the AC4 value for this Reservation.
     * 
     * @return AC4
     */
    public java.math.BigDecimal getAC4() {
        return AC4;
    }


    /**
     * Sets the AC4 value for this Reservation.
     * 
     * @param AC4
     */
    public void setAC4(java.math.BigDecimal AC4) {
        this.AC4 = AC4;
    }


    /**
     * Gets the AC5 value for this Reservation.
     * 
     * @return AC5
     */
    public java.math.BigDecimal getAC5() {
        return AC5;
    }


    /**
     * Sets the AC5 value for this Reservation.
     * 
     * @param AC5
     */
    public void setAC5(java.math.BigDecimal AC5) {
        this.AC5 = AC5;
    }


    /**
     * Gets the discountPlanName value for this Reservation.
     * 
     * @return discountPlanName
     */
    public String getDiscountPlanName() {
        return discountPlanName;
    }


    /**
     * Sets the discountPlanName value for this Reservation.
     * 
     * @param discountPlanName
     */
    public void setDiscountPlanName(String discountPlanName) {
        this.discountPlanName = discountPlanName;
    }


    /**
     * Gets the versionID value for this Reservation.
     * 
     * @return versionID
     */
    public Integer getVersionID() {
        return versionID;
    }


    /**
     * Sets the versionID value for this Reservation.
     * 
     * @param versionID
     */
    public void setVersionID(Integer versionID) {
        this.versionID = versionID;
    }


    /**
     * Gets the COSName value for this Reservation.
     * 
     * @return COSName
     */
    public String getCOSName() {
        return COSName;
    }


    /**
     * Sets the COSName value for this Reservation.
     * 
     * @param COSName
     */
    public void setCOSName(String COSName) {
        this.COSName = COSName;
    }


    /**
     * Gets the fundUsageType value for this Reservation.
     * 
     * @return fundUsageType
     */
    public com.comverse_in.prepaid.ccws.FundsUsageType getFundUsageType() {
        return fundUsageType;
    }


    /**
     * Sets the fundUsageType value for this Reservation.
     * 
     * @param fundUsageType
     */
    public void setFundUsageType(com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType) {
        this.fundUsageType = fundUsageType;
    }


    /**
     * Gets the isoCode value for this Reservation.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this Reservation.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Reservation)) return false;
        Reservation other = (Reservation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reservationAmounts==null && other.getReservationAmounts()==null) || 
             (this.reservationAmounts!=null &&
              java.util.Arrays.equals(this.reservationAmounts, other.getReservationAmounts()))) &&
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.SLUName==null && other.getSLUName()==null) || 
             (this.SLUName!=null &&
              this.SLUName.equals(other.getSLUName()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.CRN==null && other.getCRN()==null) || 
             (this.CRN!=null &&
              this.CRN.equals(other.getCRN()))) &&
            ((this.reservationID==null && other.getReservationID()==null) || 
             (this.reservationID!=null &&
              this.reservationID.equals(other.getReservationID()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.subTypeName==null && other.getSubTypeName()==null) || 
             (this.subTypeName!=null &&
              this.subTypeName.equals(other.getSubTypeName()))) &&
            ((this.reservationEndTime==null && other.getReservationEndTime()==null) || 
             (this.reservationEndTime!=null &&
              this.reservationEndTime.equals(other.getReservationEndTime()))) &&
            ((this.consUsage==null && other.getConsUsage()==null) || 
             (this.consUsage!=null &&
              this.consUsage.equals(other.getConsUsage()))) &&
            ((this.masterSubID==null && other.getMasterSubID()==null) || 
             (this.masterSubID!=null &&
              this.masterSubID.equals(other.getMasterSubID()))) &&
            ((this.masterIdentityId==null && other.getMasterIdentityId()==null) || 
             (this.masterIdentityId!=null &&
              this.masterIdentityId.equals(other.getMasterIdentityId()))) &&
            ((this.activityStartTime==null && other.getActivityStartTime()==null) || 
             (this.activityStartTime!=null &&
              this.activityStartTime.equals(other.getActivityStartTime()))) &&
            ((this.calledNumber==null && other.getCalledNumber()==null) || 
             (this.calledNumber!=null &&
              this.calledNumber.equals(other.getCalledNumber()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.assumeConsumption==null && other.getAssumeConsumption()==null) || 
             (this.assumeConsumption!=null &&
              this.assumeConsumption.equals(other.getAssumeConsumption()))) &&
            ((this.AC1==null && other.getAC1()==null) || 
             (this.AC1!=null &&
              this.AC1.equals(other.getAC1()))) &&
            ((this.AC2==null && other.getAC2()==null) || 
             (this.AC2!=null &&
              this.AC2.equals(other.getAC2()))) &&
            ((this.AC3==null && other.getAC3()==null) || 
             (this.AC3!=null &&
              this.AC3.equals(other.getAC3()))) &&
            ((this.AC4==null && other.getAC4()==null) || 
             (this.AC4!=null &&
              this.AC4.equals(other.getAC4()))) &&
            ((this.AC5==null && other.getAC5()==null) || 
             (this.AC5!=null &&
              this.AC5.equals(other.getAC5()))) &&
            ((this.discountPlanName==null && other.getDiscountPlanName()==null) || 
             (this.discountPlanName!=null &&
              this.discountPlanName.equals(other.getDiscountPlanName()))) &&
            ((this.versionID==null && other.getVersionID()==null) || 
             (this.versionID!=null &&
              this.versionID.equals(other.getVersionID()))) &&
            ((this.COSName==null && other.getCOSName()==null) || 
             (this.COSName!=null &&
              this.COSName.equals(other.getCOSName()))) &&
            ((this.fundUsageType==null && other.getFundUsageType()==null) || 
             (this.fundUsageType!=null &&
              this.fundUsageType.equals(other.getFundUsageType()))) &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode())));
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
        if (getReservationAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservationAmounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getReservationAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getSLUName() != null) {
            _hashCode += getSLUName().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getCRN() != null) {
            _hashCode += getCRN().hashCode();
        }
        if (getReservationID() != null) {
            _hashCode += getReservationID().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getSubTypeName() != null) {
            _hashCode += getSubTypeName().hashCode();
        }
        if (getReservationEndTime() != null) {
            _hashCode += getReservationEndTime().hashCode();
        }
        if (getConsUsage() != null) {
            _hashCode += getConsUsage().hashCode();
        }
        if (getMasterSubID() != null) {
            _hashCode += getMasterSubID().hashCode();
        }
        if (getMasterIdentityId() != null) {
            _hashCode += getMasterIdentityId().hashCode();
        }
        if (getActivityStartTime() != null) {
            _hashCode += getActivityStartTime().hashCode();
        }
        if (getCalledNumber() != null) {
            _hashCode += getCalledNumber().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getAssumeConsumption() != null) {
            _hashCode += getAssumeConsumption().hashCode();
        }
        if (getAC1() != null) {
            _hashCode += getAC1().hashCode();
        }
        if (getAC2() != null) {
            _hashCode += getAC2().hashCode();
        }
        if (getAC3() != null) {
            _hashCode += getAC3().hashCode();
        }
        if (getAC4() != null) {
            _hashCode += getAC4().hashCode();
        }
        if (getAC5() != null) {
            _hashCode += getAC5().hashCode();
        }
        if (getDiscountPlanName() != null) {
            _hashCode += getDiscountPlanName().hashCode();
        }
        if (getVersionID() != null) {
            _hashCode += getVersionID().hashCode();
        }
        if (getCOSName() != null) {
            _hashCode += getCOSName().hashCode();
        }
        if (getFundUsageType() != null) {
            _hashCode += getFundUsageType().hashCode();
        }
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLUName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SLUName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ProcessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ApplicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ConsUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MasterSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterIdentityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MasterIdentityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CalledNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assumeConsumption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssumeConsumption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VersionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COSName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsUsageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsoCode"));
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
