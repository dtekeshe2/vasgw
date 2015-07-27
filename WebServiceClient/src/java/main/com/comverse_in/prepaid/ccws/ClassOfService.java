/**
 * ClassOfService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ClassOfService  implements java.io.Serializable {
    private String cosName;

    private Integer cosFriendsANDFamily;

    private String[] bonusPlanName;

    private String[] discountPlanName;

    private com.comverse_in.prepaid.ccws.CosAccumulator[] accumulators;

    private com.comverse_in.prepaid.ccws.CosBalanceOrder[] cosBalanceOrder;

    private com.comverse_in.prepaid.ccws.PeriodicCharge[] cosPeriodicCharges;

    private String subscriberFinalStateName;

    private String currencyUnit;

    private String description;

    private Integer expirationType;

    private Boolean rechargeAllowed;

    private Boolean serviceFeeActive;

    private String serviceType;

    private com.comverse_in.prepaid.ccws.PreCallThreshold[] preCallThreshold;

    private com.comverse_in.prepaid.ccws.COSFriend[] cosFriends;

    private Double rechargeLimit;

    private Boolean multipleVouchers;

    private com.comverse_in.prepaid.ccws.LifeCycle[] lifeCycles;

    private String serviceProvider;

    public ClassOfService() {
    }

    public ClassOfService(
           String cosName,
           Integer cosFriendsANDFamily,
           String[] bonusPlanName,
           String[] discountPlanName,
           com.comverse_in.prepaid.ccws.CosAccumulator[] accumulators,
           com.comverse_in.prepaid.ccws.CosBalanceOrder[] cosBalanceOrder,
           com.comverse_in.prepaid.ccws.PeriodicCharge[] cosPeriodicCharges,
           String subscriberFinalStateName,
           String currencyUnit,
           String description,
           Integer expirationType,
           Boolean rechargeAllowed,
           Boolean serviceFeeActive,
           String serviceType,
           com.comverse_in.prepaid.ccws.PreCallThreshold[] preCallThreshold,
           com.comverse_in.prepaid.ccws.COSFriend[] cosFriends,
           Double rechargeLimit,
           Boolean multipleVouchers,
           com.comverse_in.prepaid.ccws.LifeCycle[] lifeCycles,
           String serviceProvider) {
           this.cosName = cosName;
           this.cosFriendsANDFamily = cosFriendsANDFamily;
           this.bonusPlanName = bonusPlanName;
           this.discountPlanName = discountPlanName;
           this.accumulators = accumulators;
           this.cosBalanceOrder = cosBalanceOrder;
           this.cosPeriodicCharges = cosPeriodicCharges;
           this.subscriberFinalStateName = subscriberFinalStateName;
           this.currencyUnit = currencyUnit;
           this.description = description;
           this.expirationType = expirationType;
           this.rechargeAllowed = rechargeAllowed;
           this.serviceFeeActive = serviceFeeActive;
           this.serviceType = serviceType;
           this.preCallThreshold = preCallThreshold;
           this.cosFriends = cosFriends;
           this.rechargeLimit = rechargeLimit;
           this.multipleVouchers = multipleVouchers;
           this.lifeCycles = lifeCycles;
           this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the cosName value for this ClassOfService.
     * 
     * @return cosName
     */
    public String getCosName() {
        return cosName;
    }


    /**
     * Sets the cosName value for this ClassOfService.
     * 
     * @param cosName
     */
    public void setCosName(String cosName) {
        this.cosName = cosName;
    }


    /**
     * Gets the cosFriendsANDFamily value for this ClassOfService.
     * 
     * @return cosFriendsANDFamily
     */
    public Integer getCosFriendsANDFamily() {
        return cosFriendsANDFamily;
    }


    /**
     * Sets the cosFriendsANDFamily value for this ClassOfService.
     * 
     * @param cosFriendsANDFamily
     */
    public void setCosFriendsANDFamily(Integer cosFriendsANDFamily) {
        this.cosFriendsANDFamily = cosFriendsANDFamily;
    }


    /**
     * Gets the bonusPlanName value for this ClassOfService.
     * 
     * @return bonusPlanName
     */
    public String[] getBonusPlanName() {
        return bonusPlanName;
    }


    /**
     * Sets the bonusPlanName value for this ClassOfService.
     * 
     * @param bonusPlanName
     */
    public void setBonusPlanName(String[] bonusPlanName) {
        this.bonusPlanName = bonusPlanName;
    }


    /**
     * Gets the discountPlanName value for this ClassOfService.
     * 
     * @return discountPlanName
     */
    public String[] getDiscountPlanName() {
        return discountPlanName;
    }


    /**
     * Sets the discountPlanName value for this ClassOfService.
     * 
     * @param discountPlanName
     */
    public void setDiscountPlanName(String[] discountPlanName) {
        this.discountPlanName = discountPlanName;
    }


    /**
     * Gets the accumulators value for this ClassOfService.
     * 
     * @return accumulators
     */
    public com.comverse_in.prepaid.ccws.CosAccumulator[] getAccumulators() {
        return accumulators;
    }


    /**
     * Sets the accumulators value for this ClassOfService.
     * 
     * @param accumulators
     */
    public void setAccumulators(com.comverse_in.prepaid.ccws.CosAccumulator[] accumulators) {
        this.accumulators = accumulators;
    }


    /**
     * Gets the cosBalanceOrder value for this ClassOfService.
     * 
     * @return cosBalanceOrder
     */
    public com.comverse_in.prepaid.ccws.CosBalanceOrder[] getCosBalanceOrder() {
        return cosBalanceOrder;
    }


    /**
     * Sets the cosBalanceOrder value for this ClassOfService.
     * 
     * @param cosBalanceOrder
     */
    public void setCosBalanceOrder(com.comverse_in.prepaid.ccws.CosBalanceOrder[] cosBalanceOrder) {
        this.cosBalanceOrder = cosBalanceOrder;
    }


    /**
     * Gets the cosPeriodicCharges value for this ClassOfService.
     * 
     * @return cosPeriodicCharges
     */
    public com.comverse_in.prepaid.ccws.PeriodicCharge[] getCosPeriodicCharges() {
        return cosPeriodicCharges;
    }


    /**
     * Sets the cosPeriodicCharges value for this ClassOfService.
     * 
     * @param cosPeriodicCharges
     */
    public void setCosPeriodicCharges(com.comverse_in.prepaid.ccws.PeriodicCharge[] cosPeriodicCharges) {
        this.cosPeriodicCharges = cosPeriodicCharges;
    }


    /**
     * Gets the subscriberFinalStateName value for this ClassOfService.
     * 
     * @return subscriberFinalStateName
     */
    public String getSubscriberFinalStateName() {
        return subscriberFinalStateName;
    }


    /**
     * Sets the subscriberFinalStateName value for this ClassOfService.
     * 
     * @param subscriberFinalStateName
     */
    public void setSubscriberFinalStateName(String subscriberFinalStateName) {
        this.subscriberFinalStateName = subscriberFinalStateName;
    }


    /**
     * Gets the currencyUnit value for this ClassOfService.
     * 
     * @return currencyUnit
     */
    public String getCurrencyUnit() {
        return currencyUnit;
    }


    /**
     * Sets the currencyUnit value for this ClassOfService.
     * 
     * @param currencyUnit
     */
    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }


    /**
     * Gets the description value for this ClassOfService.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ClassOfService.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the expirationType value for this ClassOfService.
     * 
     * @return expirationType
     */
    public Integer getExpirationType() {
        return expirationType;
    }


    /**
     * Sets the expirationType value for this ClassOfService.
     * 
     * @param expirationType
     */
    public void setExpirationType(Integer expirationType) {
        this.expirationType = expirationType;
    }


    /**
     * Gets the rechargeAllowed value for this ClassOfService.
     * 
     * @return rechargeAllowed
     */
    public Boolean getRechargeAllowed() {
        return rechargeAllowed;
    }


    /**
     * Sets the rechargeAllowed value for this ClassOfService.
     * 
     * @param rechargeAllowed
     */
    public void setRechargeAllowed(Boolean rechargeAllowed) {
        this.rechargeAllowed = rechargeAllowed;
    }


    /**
     * Gets the serviceFeeActive value for this ClassOfService.
     * 
     * @return serviceFeeActive
     */
    public Boolean getServiceFeeActive() {
        return serviceFeeActive;
    }


    /**
     * Sets the serviceFeeActive value for this ClassOfService.
     * 
     * @param serviceFeeActive
     */
    public void setServiceFeeActive(Boolean serviceFeeActive) {
        this.serviceFeeActive = serviceFeeActive;
    }


    /**
     * Gets the serviceType value for this ClassOfService.
     * 
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ClassOfService.
     * 
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the preCallThreshold value for this ClassOfService.
     * 
     * @return preCallThreshold
     */
    public com.comverse_in.prepaid.ccws.PreCallThreshold[] getPreCallThreshold() {
        return preCallThreshold;
    }


    /**
     * Sets the preCallThreshold value for this ClassOfService.
     * 
     * @param preCallThreshold
     */
    public void setPreCallThreshold(com.comverse_in.prepaid.ccws.PreCallThreshold[] preCallThreshold) {
        this.preCallThreshold = preCallThreshold;
    }


    /**
     * Gets the cosFriends value for this ClassOfService.
     * 
     * @return cosFriends
     */
    public com.comverse_in.prepaid.ccws.COSFriend[] getCosFriends() {
        return cosFriends;
    }


    /**
     * Sets the cosFriends value for this ClassOfService.
     * 
     * @param cosFriends
     */
    public void setCosFriends(com.comverse_in.prepaid.ccws.COSFriend[] cosFriends) {
        this.cosFriends = cosFriends;
    }


    /**
     * Gets the rechargeLimit value for this ClassOfService.
     * 
     * @return rechargeLimit
     */
    public Double getRechargeLimit() {
        return rechargeLimit;
    }


    /**
     * Sets the rechargeLimit value for this ClassOfService.
     * 
     * @param rechargeLimit
     */
    public void setRechargeLimit(Double rechargeLimit) {
        this.rechargeLimit = rechargeLimit;
    }


    /**
     * Gets the multipleVouchers value for this ClassOfService.
     * 
     * @return multipleVouchers
     */
    public Boolean getMultipleVouchers() {
        return multipleVouchers;
    }


    /**
     * Sets the multipleVouchers value for this ClassOfService.
     * 
     * @param multipleVouchers
     */
    public void setMultipleVouchers(Boolean multipleVouchers) {
        this.multipleVouchers = multipleVouchers;
    }


    /**
     * Gets the lifeCycles value for this ClassOfService.
     * 
     * @return lifeCycles
     */
    public com.comverse_in.prepaid.ccws.LifeCycle[] getLifeCycles() {
        return lifeCycles;
    }


    /**
     * Sets the lifeCycles value for this ClassOfService.
     * 
     * @param lifeCycles
     */
    public void setLifeCycles(com.comverse_in.prepaid.ccws.LifeCycle[] lifeCycles) {
        this.lifeCycles = lifeCycles;
    }


    /**
     * Gets the serviceProvider value for this ClassOfService.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this ClassOfService.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ClassOfService)) return false;
        ClassOfService other = (ClassOfService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cosName==null && other.getCosName()==null) || 
             (this.cosName!=null &&
              this.cosName.equals(other.getCosName()))) &&
            ((this.cosFriendsANDFamily==null && other.getCosFriendsANDFamily()==null) || 
             (this.cosFriendsANDFamily!=null &&
              this.cosFriendsANDFamily.equals(other.getCosFriendsANDFamily()))) &&
            ((this.bonusPlanName==null && other.getBonusPlanName()==null) || 
             (this.bonusPlanName!=null &&
              java.util.Arrays.equals(this.bonusPlanName, other.getBonusPlanName()))) &&
            ((this.discountPlanName==null && other.getDiscountPlanName()==null) || 
             (this.discountPlanName!=null &&
              java.util.Arrays.equals(this.discountPlanName, other.getDiscountPlanName()))) &&
            ((this.accumulators==null && other.getAccumulators()==null) || 
             (this.accumulators!=null &&
              java.util.Arrays.equals(this.accumulators, other.getAccumulators()))) &&
            ((this.cosBalanceOrder==null && other.getCosBalanceOrder()==null) || 
             (this.cosBalanceOrder!=null &&
              java.util.Arrays.equals(this.cosBalanceOrder, other.getCosBalanceOrder()))) &&
            ((this.cosPeriodicCharges==null && other.getCosPeriodicCharges()==null) || 
             (this.cosPeriodicCharges!=null &&
              java.util.Arrays.equals(this.cosPeriodicCharges, other.getCosPeriodicCharges()))) &&
            ((this.subscriberFinalStateName==null && other.getSubscriberFinalStateName()==null) || 
             (this.subscriberFinalStateName!=null &&
              this.subscriberFinalStateName.equals(other.getSubscriberFinalStateName()))) &&
            ((this.currencyUnit==null && other.getCurrencyUnit()==null) || 
             (this.currencyUnit!=null &&
              this.currencyUnit.equals(other.getCurrencyUnit()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expirationType==null && other.getExpirationType()==null) || 
             (this.expirationType!=null &&
              this.expirationType.equals(other.getExpirationType()))) &&
            ((this.rechargeAllowed==null && other.getRechargeAllowed()==null) || 
             (this.rechargeAllowed!=null &&
              this.rechargeAllowed.equals(other.getRechargeAllowed()))) &&
            ((this.serviceFeeActive==null && other.getServiceFeeActive()==null) || 
             (this.serviceFeeActive!=null &&
              this.serviceFeeActive.equals(other.getServiceFeeActive()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.preCallThreshold==null && other.getPreCallThreshold()==null) || 
             (this.preCallThreshold!=null &&
              java.util.Arrays.equals(this.preCallThreshold, other.getPreCallThreshold()))) &&
            ((this.cosFriends==null && other.getCosFriends()==null) || 
             (this.cosFriends!=null &&
              java.util.Arrays.equals(this.cosFriends, other.getCosFriends()))) &&
            ((this.rechargeLimit==null && other.getRechargeLimit()==null) || 
             (this.rechargeLimit!=null &&
              this.rechargeLimit.equals(other.getRechargeLimit()))) &&
            ((this.multipleVouchers==null && other.getMultipleVouchers()==null) || 
             (this.multipleVouchers!=null &&
              this.multipleVouchers.equals(other.getMultipleVouchers()))) &&
            ((this.lifeCycles==null && other.getLifeCycles()==null) || 
             (this.lifeCycles!=null &&
              java.util.Arrays.equals(this.lifeCycles, other.getLifeCycles()))) &&
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
        if (getCosName() != null) {
            _hashCode += getCosName().hashCode();
        }
        if (getCosFriendsANDFamily() != null) {
            _hashCode += getCosFriendsANDFamily().hashCode();
        }
        if (getBonusPlanName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBonusPlanName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBonusPlanName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPlanName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPlanName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDiscountPlanName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccumulators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccumulators());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccumulators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCosBalanceOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCosBalanceOrder());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCosBalanceOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCosPeriodicCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCosPeriodicCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCosPeriodicCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberFinalStateName() != null) {
            _hashCode += getSubscriberFinalStateName().hashCode();
        }
        if (getCurrencyUnit() != null) {
            _hashCode += getCurrencyUnit().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpirationType() != null) {
            _hashCode += getExpirationType().hashCode();
        }
        if (getRechargeAllowed() != null) {
            _hashCode += getRechargeAllowed().hashCode();
        }
        if (getServiceFeeActive() != null) {
            _hashCode += getServiceFeeActive().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPreCallThreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreCallThreshold());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPreCallThreshold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCosFriends() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCosFriends());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCosFriends(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRechargeLimit() != null) {
            _hashCode += getRechargeLimit().hashCode();
        }
        if (getMultipleVouchers() != null) {
            _hashCode += getMultipleVouchers().hashCode();
        }
        if (getLifeCycles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLifeCycles());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLifeCycles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassOfService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "cosName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosFriendsANDFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "cosFriendsANDFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "bonusPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "discountPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosBalanceOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "cosBalanceOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosPeriodicCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "cosPeriodicCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberFinalStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberFinalStateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "expirationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeeActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "serviceFeeActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preCallThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "preCallThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosFriends");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "cosFriends"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleVouchers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "multipleVouchers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle"));
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
