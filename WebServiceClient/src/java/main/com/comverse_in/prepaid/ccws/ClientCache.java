/**
 * ClientCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ClientCache  implements java.io.Serializable {
    private Long versionId;

    private com.comverse_in.prepaid.ccws.BalanceDefinition[] balances;

    private com.comverse_in.prepaid.ccws.Accumulator[] accumulators;

    private com.comverse_in.prepaid.ccws.BonusPlan[] bonusPlans;

    private com.comverse_in.prepaid.ccws.DiscountPlan[] discountPlans;

    private com.comverse_in.prepaid.ccws.PeriodicCharge[] globalPeriodicCharges;

    private com.comverse_in.prepaid.ccws.ActivityDefinition[] activityDefinitions;

    private com.comverse_in.prepaid.ccws.UnitType[] unitTypes;

    private com.comverse_in.prepaid.ccws.SP_NAME_ID[] spNameId;

    private com.comverse_in.prepaid.ccws.Lang_NAME_ID[] langNameID;

    private com.comverse_in.prepaid.ccws.ClassOfService[] classesOfService;

    private String[] accessNumber;

    private String[] applicationName;

    private String[] barredNumber;

    private String[] emergencyNumber;

    private String[] languageName;

    private String[] timezoneName;

    private String[] subscriberStateName;

    private String[] rechargeCardStateName;

    private String[] serviceProviderName;

    private com.comverse_in.prepaid.ccws.CurrencyUnit[] currencyUnitName;

    private String[] callingCircleGroups;

    private String[] barredNumberSets;

    public ClientCache() {
    }

    public ClientCache(
           Long versionId,
           com.comverse_in.prepaid.ccws.BalanceDefinition[] balances,
           com.comverse_in.prepaid.ccws.Accumulator[] accumulators,
           com.comverse_in.prepaid.ccws.BonusPlan[] bonusPlans,
           com.comverse_in.prepaid.ccws.DiscountPlan[] discountPlans,
           com.comverse_in.prepaid.ccws.PeriodicCharge[] globalPeriodicCharges,
           com.comverse_in.prepaid.ccws.ActivityDefinition[] activityDefinitions,
           com.comverse_in.prepaid.ccws.UnitType[] unitTypes,
           com.comverse_in.prepaid.ccws.SP_NAME_ID[] spNameId,
           com.comverse_in.prepaid.ccws.Lang_NAME_ID[] langNameID,
           com.comverse_in.prepaid.ccws.ClassOfService[] classesOfService,
           String[] accessNumber,
           String[] applicationName,
           String[] barredNumber,
           String[] emergencyNumber,
           String[] languageName,
           String[] timezoneName,
           String[] subscriberStateName,
           String[] rechargeCardStateName,
           String[] serviceProviderName,
           com.comverse_in.prepaid.ccws.CurrencyUnit[] currencyUnitName,
           String[] callingCircleGroups,
           String[] barredNumberSets) {
           this.versionId = versionId;
           this.balances = balances;
           this.accumulators = accumulators;
           this.bonusPlans = bonusPlans;
           this.discountPlans = discountPlans;
           this.globalPeriodicCharges = globalPeriodicCharges;
           this.activityDefinitions = activityDefinitions;
           this.unitTypes = unitTypes;
           this.spNameId = spNameId;
           this.langNameID = langNameID;
           this.classesOfService = classesOfService;
           this.accessNumber = accessNumber;
           this.applicationName = applicationName;
           this.barredNumber = barredNumber;
           this.emergencyNumber = emergencyNumber;
           this.languageName = languageName;
           this.timezoneName = timezoneName;
           this.subscriberStateName = subscriberStateName;
           this.rechargeCardStateName = rechargeCardStateName;
           this.serviceProviderName = serviceProviderName;
           this.currencyUnitName = currencyUnitName;
           this.callingCircleGroups = callingCircleGroups;
           this.barredNumberSets = barredNumberSets;
    }


    /**
     * Gets the versionId value for this ClientCache.
     * 
     * @return versionId
     */
    public Long getVersionId() {
        return versionId;
    }


    /**
     * Sets the versionId value for this ClientCache.
     * 
     * @param versionId
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }


    /**
     * Gets the balances value for this ClientCache.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceDefinition[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this ClientCache.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceDefinition[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the accumulators value for this ClientCache.
     * 
     * @return accumulators
     */
    public com.comverse_in.prepaid.ccws.Accumulator[] getAccumulators() {
        return accumulators;
    }


    /**
     * Sets the accumulators value for this ClientCache.
     * 
     * @param accumulators
     */
    public void setAccumulators(com.comverse_in.prepaid.ccws.Accumulator[] accumulators) {
        this.accumulators = accumulators;
    }


    /**
     * Gets the bonusPlans value for this ClientCache.
     * 
     * @return bonusPlans
     */
    public com.comverse_in.prepaid.ccws.BonusPlan[] getBonusPlans() {
        return bonusPlans;
    }


    /**
     * Sets the bonusPlans value for this ClientCache.
     * 
     * @param bonusPlans
     */
    public void setBonusPlans(com.comverse_in.prepaid.ccws.BonusPlan[] bonusPlans) {
        this.bonusPlans = bonusPlans;
    }


    /**
     * Gets the discountPlans value for this ClientCache.
     * 
     * @return discountPlans
     */
    public com.comverse_in.prepaid.ccws.DiscountPlan[] getDiscountPlans() {
        return discountPlans;
    }


    /**
     * Sets the discountPlans value for this ClientCache.
     * 
     * @param discountPlans
     */
    public void setDiscountPlans(com.comverse_in.prepaid.ccws.DiscountPlan[] discountPlans) {
        this.discountPlans = discountPlans;
    }


    /**
     * Gets the globalPeriodicCharges value for this ClientCache.
     * 
     * @return globalPeriodicCharges
     */
    public com.comverse_in.prepaid.ccws.PeriodicCharge[] getGlobalPeriodicCharges() {
        return globalPeriodicCharges;
    }


    /**
     * Sets the globalPeriodicCharges value for this ClientCache.
     * 
     * @param globalPeriodicCharges
     */
    public void setGlobalPeriodicCharges(com.comverse_in.prepaid.ccws.PeriodicCharge[] globalPeriodicCharges) {
        this.globalPeriodicCharges = globalPeriodicCharges;
    }


    /**
     * Gets the activityDefinitions value for this ClientCache.
     * 
     * @return activityDefinitions
     */
    public com.comverse_in.prepaid.ccws.ActivityDefinition[] getActivityDefinitions() {
        return activityDefinitions;
    }


    /**
     * Sets the activityDefinitions value for this ClientCache.
     * 
     * @param activityDefinitions
     */
    public void setActivityDefinitions(com.comverse_in.prepaid.ccws.ActivityDefinition[] activityDefinitions) {
        this.activityDefinitions = activityDefinitions;
    }


    /**
     * Gets the unitTypes value for this ClientCache.
     * 
     * @return unitTypes
     */
    public com.comverse_in.prepaid.ccws.UnitType[] getUnitTypes() {
        return unitTypes;
    }


    /**
     * Sets the unitTypes value for this ClientCache.
     * 
     * @param unitTypes
     */
    public void setUnitTypes(com.comverse_in.prepaid.ccws.UnitType[] unitTypes) {
        this.unitTypes = unitTypes;
    }


    /**
     * Gets the spNameId value for this ClientCache.
     * 
     * @return spNameId
     */
    public com.comverse_in.prepaid.ccws.SP_NAME_ID[] getSpNameId() {
        return spNameId;
    }


    /**
     * Sets the spNameId value for this ClientCache.
     * 
     * @param spNameId
     */
    public void setSpNameId(com.comverse_in.prepaid.ccws.SP_NAME_ID[] spNameId) {
        this.spNameId = spNameId;
    }


    /**
     * Gets the langNameID value for this ClientCache.
     * 
     * @return langNameID
     */
    public com.comverse_in.prepaid.ccws.Lang_NAME_ID[] getLangNameID() {
        return langNameID;
    }


    /**
     * Sets the langNameID value for this ClientCache.
     * 
     * @param langNameID
     */
    public void setLangNameID(com.comverse_in.prepaid.ccws.Lang_NAME_ID[] langNameID) {
        this.langNameID = langNameID;
    }


    /**
     * Gets the classesOfService value for this ClientCache.
     * 
     * @return classesOfService
     */
    public com.comverse_in.prepaid.ccws.ClassOfService[] getClassesOfService() {
        return classesOfService;
    }


    /**
     * Sets the classesOfService value for this ClientCache.
     * 
     * @param classesOfService
     */
    public void setClassesOfService(com.comverse_in.prepaid.ccws.ClassOfService[] classesOfService) {
        this.classesOfService = classesOfService;
    }


    /**
     * Gets the accessNumber value for this ClientCache.
     * 
     * @return accessNumber
     */
    public String[] getAccessNumber() {
        return accessNumber;
    }


    /**
     * Sets the accessNumber value for this ClientCache.
     * 
     * @param accessNumber
     */
    public void setAccessNumber(String[] accessNumber) {
        this.accessNumber = accessNumber;
    }


    /**
     * Gets the applicationName value for this ClientCache.
     * 
     * @return applicationName
     */
    public String[] getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this ClientCache.
     * 
     * @param applicationName
     */
    public void setApplicationName(String[] applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the barredNumber value for this ClientCache.
     * 
     * @return barredNumber
     */
    public String[] getBarredNumber() {
        return barredNumber;
    }


    /**
     * Sets the barredNumber value for this ClientCache.
     * 
     * @param barredNumber
     */
    public void setBarredNumber(String[] barredNumber) {
        this.barredNumber = barredNumber;
    }


    /**
     * Gets the emergencyNumber value for this ClientCache.
     * 
     * @return emergencyNumber
     */
    public String[] getEmergencyNumber() {
        return emergencyNumber;
    }


    /**
     * Sets the emergencyNumber value for this ClientCache.
     * 
     * @param emergencyNumber
     */
    public void setEmergencyNumber(String[] emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }


    /**
     * Gets the languageName value for this ClientCache.
     * 
     * @return languageName
     */
    public String[] getLanguageName() {
        return languageName;
    }


    /**
     * Sets the languageName value for this ClientCache.
     * 
     * @param languageName
     */
    public void setLanguageName(String[] languageName) {
        this.languageName = languageName;
    }


    /**
     * Gets the timezoneName value for this ClientCache.
     * 
     * @return timezoneName
     */
    public String[] getTimezoneName() {
        return timezoneName;
    }


    /**
     * Sets the timezoneName value for this ClientCache.
     * 
     * @param timezoneName
     */
    public void setTimezoneName(String[] timezoneName) {
        this.timezoneName = timezoneName;
    }


    /**
     * Gets the subscriberStateName value for this ClientCache.
     * 
     * @return subscriberStateName
     */
    public String[] getSubscriberStateName() {
        return subscriberStateName;
    }


    /**
     * Sets the subscriberStateName value for this ClientCache.
     * 
     * @param subscriberStateName
     */
    public void setSubscriberStateName(String[] subscriberStateName) {
        this.subscriberStateName = subscriberStateName;
    }


    /**
     * Gets the rechargeCardStateName value for this ClientCache.
     * 
     * @return rechargeCardStateName
     */
    public String[] getRechargeCardStateName() {
        return rechargeCardStateName;
    }


    /**
     * Sets the rechargeCardStateName value for this ClientCache.
     * 
     * @param rechargeCardStateName
     */
    public void setRechargeCardStateName(String[] rechargeCardStateName) {
        this.rechargeCardStateName = rechargeCardStateName;
    }


    /**
     * Gets the serviceProviderName value for this ClientCache.
     * 
     * @return serviceProviderName
     */
    public String[] getServiceProviderName() {
        return serviceProviderName;
    }


    /**
     * Sets the serviceProviderName value for this ClientCache.
     * 
     * @param serviceProviderName
     */
    public void setServiceProviderName(String[] serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }


    /**
     * Gets the currencyUnitName value for this ClientCache.
     * 
     * @return currencyUnitName
     */
    public com.comverse_in.prepaid.ccws.CurrencyUnit[] getCurrencyUnitName() {
        return currencyUnitName;
    }


    /**
     * Sets the currencyUnitName value for this ClientCache.
     * 
     * @param currencyUnitName
     */
    public void setCurrencyUnitName(com.comverse_in.prepaid.ccws.CurrencyUnit[] currencyUnitName) {
        this.currencyUnitName = currencyUnitName;
    }


    /**
     * Gets the callingCircleGroups value for this ClientCache.
     * 
     * @return callingCircleGroups
     */
    public String[] getCallingCircleGroups() {
        return callingCircleGroups;
    }


    /**
     * Sets the callingCircleGroups value for this ClientCache.
     * 
     * @param callingCircleGroups
     */
    public void setCallingCircleGroups(String[] callingCircleGroups) {
        this.callingCircleGroups = callingCircleGroups;
    }


    /**
     * Gets the barredNumberSets value for this ClientCache.
     * 
     * @return barredNumberSets
     */
    public String[] getBarredNumberSets() {
        return barredNumberSets;
    }


    /**
     * Sets the barredNumberSets value for this ClientCache.
     * 
     * @param barredNumberSets
     */
    public void setBarredNumberSets(String[] barredNumberSets) {
        this.barredNumberSets = barredNumberSets;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ClientCache)) return false;
        ClientCache other = (ClientCache) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versionId==null && other.getVersionId()==null) || 
             (this.versionId!=null &&
              this.versionId.equals(other.getVersionId()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.accumulators==null && other.getAccumulators()==null) || 
             (this.accumulators!=null &&
              java.util.Arrays.equals(this.accumulators, other.getAccumulators()))) &&
            ((this.bonusPlans==null && other.getBonusPlans()==null) || 
             (this.bonusPlans!=null &&
              java.util.Arrays.equals(this.bonusPlans, other.getBonusPlans()))) &&
            ((this.discountPlans==null && other.getDiscountPlans()==null) || 
             (this.discountPlans!=null &&
              java.util.Arrays.equals(this.discountPlans, other.getDiscountPlans()))) &&
            ((this.globalPeriodicCharges==null && other.getGlobalPeriodicCharges()==null) || 
             (this.globalPeriodicCharges!=null &&
              java.util.Arrays.equals(this.globalPeriodicCharges, other.getGlobalPeriodicCharges()))) &&
            ((this.activityDefinitions==null && other.getActivityDefinitions()==null) || 
             (this.activityDefinitions!=null &&
              java.util.Arrays.equals(this.activityDefinitions, other.getActivityDefinitions()))) &&
            ((this.unitTypes==null && other.getUnitTypes()==null) || 
             (this.unitTypes!=null &&
              java.util.Arrays.equals(this.unitTypes, other.getUnitTypes()))) &&
            ((this.spNameId==null && other.getSpNameId()==null) || 
             (this.spNameId!=null &&
              java.util.Arrays.equals(this.spNameId, other.getSpNameId()))) &&
            ((this.langNameID==null && other.getLangNameID()==null) || 
             (this.langNameID!=null &&
              java.util.Arrays.equals(this.langNameID, other.getLangNameID()))) &&
            ((this.classesOfService==null && other.getClassesOfService()==null) || 
             (this.classesOfService!=null &&
              java.util.Arrays.equals(this.classesOfService, other.getClassesOfService()))) &&
            ((this.accessNumber==null && other.getAccessNumber()==null) || 
             (this.accessNumber!=null &&
              java.util.Arrays.equals(this.accessNumber, other.getAccessNumber()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              java.util.Arrays.equals(this.applicationName, other.getApplicationName()))) &&
            ((this.barredNumber==null && other.getBarredNumber()==null) || 
             (this.barredNumber!=null &&
              java.util.Arrays.equals(this.barredNumber, other.getBarredNumber()))) &&
            ((this.emergencyNumber==null && other.getEmergencyNumber()==null) || 
             (this.emergencyNumber!=null &&
              java.util.Arrays.equals(this.emergencyNumber, other.getEmergencyNumber()))) &&
            ((this.languageName==null && other.getLanguageName()==null) || 
             (this.languageName!=null &&
              java.util.Arrays.equals(this.languageName, other.getLanguageName()))) &&
            ((this.timezoneName==null && other.getTimezoneName()==null) || 
             (this.timezoneName!=null &&
              java.util.Arrays.equals(this.timezoneName, other.getTimezoneName()))) &&
            ((this.subscriberStateName==null && other.getSubscriberStateName()==null) || 
             (this.subscriberStateName!=null &&
              java.util.Arrays.equals(this.subscriberStateName, other.getSubscriberStateName()))) &&
            ((this.rechargeCardStateName==null && other.getRechargeCardStateName()==null) || 
             (this.rechargeCardStateName!=null &&
              java.util.Arrays.equals(this.rechargeCardStateName, other.getRechargeCardStateName()))) &&
            ((this.serviceProviderName==null && other.getServiceProviderName()==null) || 
             (this.serviceProviderName!=null &&
              java.util.Arrays.equals(this.serviceProviderName, other.getServiceProviderName()))) &&
            ((this.currencyUnitName==null && other.getCurrencyUnitName()==null) || 
             (this.currencyUnitName!=null &&
              java.util.Arrays.equals(this.currencyUnitName, other.getCurrencyUnitName()))) &&
            ((this.callingCircleGroups==null && other.getCallingCircleGroups()==null) || 
             (this.callingCircleGroups!=null &&
              java.util.Arrays.equals(this.callingCircleGroups, other.getCallingCircleGroups()))) &&
            ((this.barredNumberSets==null && other.getBarredNumberSets()==null) || 
             (this.barredNumberSets!=null &&
              java.util.Arrays.equals(this.barredNumberSets, other.getBarredNumberSets())));
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
        if (getVersionId() != null) {
            _hashCode += getVersionId().hashCode();
        }
        if (getBalances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalances());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalances(), i);
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
        if (getBonusPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBonusPlans());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBonusPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPlans());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDiscountPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalPeriodicCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalPeriodicCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGlobalPeriodicCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivityDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityDefinitions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getActivityDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUnitTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpNameId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpNameId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpNameId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLangNameID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLangNameID());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLangNameID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassesOfService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassesOfService());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getClassesOfService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessNumber());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccessNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getApplicationName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarredNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarredNumber());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBarredNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmergencyNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmergencyNumber());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEmergencyNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguageName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLanguageName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimezoneName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimezoneName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTimezoneName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberStateName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberStateName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubscriberStateName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRechargeCardStateName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeCardStateName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechargeCardStateName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceProviderName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceProviderName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceProviderName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyUnitName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyUnitName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCurrencyUnitName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallingCircleGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallingCircleGroups());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCallingCircleGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarredNumberSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarredNumberSets());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBarredNumberSets(), i);
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
        new org.apache.axis.description.TypeDesc(ClientCache.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClientCache"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "versionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "bonusPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "discountPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalPeriodicCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "globalPeriodicCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "activityDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "unitTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spNameId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SpNameId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("langNameID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LangNameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Lang_NAME_ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Lang_NAME_ID"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classesOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "classesOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "applicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barredNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "barredNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "emergencyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "languageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "timezoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberStateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeCardStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeCardStateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProviderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "serviceProviderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCircleGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "callingCircleGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barredNumberSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "barredNumberSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
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
