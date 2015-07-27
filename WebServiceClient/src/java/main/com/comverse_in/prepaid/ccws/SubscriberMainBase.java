/**
 * SubscriberMainBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberMainBase  implements java.io.Serializable {
    private String notificationLanguage;

    private String roamingCreditLimitAsString;

    private String currentState;

    private String COSName;

    private String PIN;

    private Boolean PINChangeNeeded;

    private String languageName;

    private String timeZone;

    private String IMSI;

    private String numberFreeAnCallsString;

    private String CFUNumber;

    private String CFBNumber;

    private String CFNANumber;

    private String CFISNumber;

    private String inFocusIdentity;

    private String ESN;

    private String HLR_ID;

    private String otherSysID;

    private String accountNumber;

    private String billCycleDay;

    private String notificationLevel;

    public SubscriberMainBase() {
    }

    public SubscriberMainBase(
           String notificationLanguage,
           String roamingCreditLimitAsString,
           String currentState,
           String COSName,
           String PIN,
           Boolean PINChangeNeeded,
           String languageName,
           String timeZone,
           String IMSI,
           String numberFreeAnCallsString,
           String CFUNumber,
           String CFBNumber,
           String CFNANumber,
           String CFISNumber,
           String inFocusIdentity,
           String ESN,
           String HLR_ID,
           String otherSysID,
           String accountNumber,
           String billCycleDay,
           String notificationLevel) {
           this.notificationLanguage = notificationLanguage;
           this.roamingCreditLimitAsString = roamingCreditLimitAsString;
           this.currentState = currentState;
           this.COSName = COSName;
           this.PIN = PIN;
           this.PINChangeNeeded = PINChangeNeeded;
           this.languageName = languageName;
           this.timeZone = timeZone;
           this.IMSI = IMSI;
           this.numberFreeAnCallsString = numberFreeAnCallsString;
           this.CFUNumber = CFUNumber;
           this.CFBNumber = CFBNumber;
           this.CFNANumber = CFNANumber;
           this.CFISNumber = CFISNumber;
           this.inFocusIdentity = inFocusIdentity;
           this.ESN = ESN;
           this.HLR_ID = HLR_ID;
           this.otherSysID = otherSysID;
           this.accountNumber = accountNumber;
           this.billCycleDay = billCycleDay;
           this.notificationLevel = notificationLevel;
    }


    /**
     * Gets the notificationLanguage value for this SubscriberMainBase.
     * 
     * @return notificationLanguage
     */
    public String getNotificationLanguage() {
        return notificationLanguage;
    }


    /**
     * Sets the notificationLanguage value for this SubscriberMainBase.
     * 
     * @param notificationLanguage
     */
    public void setNotificationLanguage(String notificationLanguage) {
        this.notificationLanguage = notificationLanguage;
    }


    /**
     * Gets the roamingCreditLimitAsString value for this SubscriberMainBase.
     * 
     * @return roamingCreditLimitAsString
     */
    public String getRoamingCreditLimitAsString() {
        return roamingCreditLimitAsString;
    }


    /**
     * Sets the roamingCreditLimitAsString value for this SubscriberMainBase.
     * 
     * @param roamingCreditLimitAsString
     */
    public void setRoamingCreditLimitAsString(String roamingCreditLimitAsString) {
        this.roamingCreditLimitAsString = roamingCreditLimitAsString;
    }


    /**
     * Gets the currentState value for this SubscriberMainBase.
     * 
     * @return currentState
     */
    public String getCurrentState() {
        return currentState;
    }


    /**
     * Sets the currentState value for this SubscriberMainBase.
     * 
     * @param currentState
     */
    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }


    /**
     * Gets the COSName value for this SubscriberMainBase.
     * 
     * @return COSName
     */
    public String getCOSName() {
        return COSName;
    }


    /**
     * Sets the COSName value for this SubscriberMainBase.
     * 
     * @param COSName
     */
    public void setCOSName(String COSName) {
        this.COSName = COSName;
    }


    /**
     * Gets the PIN value for this SubscriberMainBase.
     * 
     * @return PIN
     */
    public String getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this SubscriberMainBase.
     * 
     * @param PIN
     */
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }


    /**
     * Gets the PINChangeNeeded value for this SubscriberMainBase.
     * 
     * @return PINChangeNeeded
     */
    public Boolean getPINChangeNeeded() {
        return PINChangeNeeded;
    }


    /**
     * Sets the PINChangeNeeded value for this SubscriberMainBase.
     * 
     * @param PINChangeNeeded
     */
    public void setPINChangeNeeded(Boolean PINChangeNeeded) {
        this.PINChangeNeeded = PINChangeNeeded;
    }


    /**
     * Gets the languageName value for this SubscriberMainBase.
     * 
     * @return languageName
     */
    public String getLanguageName() {
        return languageName;
    }


    /**
     * Sets the languageName value for this SubscriberMainBase.
     * 
     * @param languageName
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }


    /**
     * Gets the timeZone value for this SubscriberMainBase.
     * 
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this SubscriberMainBase.
     * 
     * @param timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the IMSI value for this SubscriberMainBase.
     * 
     * @return IMSI
     */
    public String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this SubscriberMainBase.
     * 
     * @param IMSI
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the numberFreeAnCallsString value for this SubscriberMainBase.
     * 
     * @return numberFreeAnCallsString
     */
    public String getNumberFreeAnCallsString() {
        return numberFreeAnCallsString;
    }


    /**
     * Sets the numberFreeAnCallsString value for this SubscriberMainBase.
     * 
     * @param numberFreeAnCallsString
     */
    public void setNumberFreeAnCallsString(String numberFreeAnCallsString) {
        this.numberFreeAnCallsString = numberFreeAnCallsString;
    }


    /**
     * Gets the CFUNumber value for this SubscriberMainBase.
     * 
     * @return CFUNumber
     */
    public String getCFUNumber() {
        return CFUNumber;
    }


    /**
     * Sets the CFUNumber value for this SubscriberMainBase.
     * 
     * @param CFUNumber
     */
    public void setCFUNumber(String CFUNumber) {
        this.CFUNumber = CFUNumber;
    }


    /**
     * Gets the CFBNumber value for this SubscriberMainBase.
     * 
     * @return CFBNumber
     */
    public String getCFBNumber() {
        return CFBNumber;
    }


    /**
     * Sets the CFBNumber value for this SubscriberMainBase.
     * 
     * @param CFBNumber
     */
    public void setCFBNumber(String CFBNumber) {
        this.CFBNumber = CFBNumber;
    }


    /**
     * Gets the CFNANumber value for this SubscriberMainBase.
     * 
     * @return CFNANumber
     */
    public String getCFNANumber() {
        return CFNANumber;
    }


    /**
     * Sets the CFNANumber value for this SubscriberMainBase.
     * 
     * @param CFNANumber
     */
    public void setCFNANumber(String CFNANumber) {
        this.CFNANumber = CFNANumber;
    }


    /**
     * Gets the CFISNumber value for this SubscriberMainBase.
     * 
     * @return CFISNumber
     */
    public String getCFISNumber() {
        return CFISNumber;
    }


    /**
     * Sets the CFISNumber value for this SubscriberMainBase.
     * 
     * @param CFISNumber
     */
    public void setCFISNumber(String CFISNumber) {
        this.CFISNumber = CFISNumber;
    }


    /**
     * Gets the inFocusIdentity value for this SubscriberMainBase.
     * 
     * @return inFocusIdentity
     */
    public String getInFocusIdentity() {
        return inFocusIdentity;
    }


    /**
     * Sets the inFocusIdentity value for this SubscriberMainBase.
     * 
     * @param inFocusIdentity
     */
    public void setInFocusIdentity(String inFocusIdentity) {
        this.inFocusIdentity = inFocusIdentity;
    }


    /**
     * Gets the ESN value for this SubscriberMainBase.
     * 
     * @return ESN
     */
    public String getESN() {
        return ESN;
    }


    /**
     * Sets the ESN value for this SubscriberMainBase.
     * 
     * @param ESN
     */
    public void setESN(String ESN) {
        this.ESN = ESN;
    }


    /**
     * Gets the HLR_ID value for this SubscriberMainBase.
     * 
     * @return HLR_ID
     */
    public String getHLR_ID() {
        return HLR_ID;
    }


    /**
     * Sets the HLR_ID value for this SubscriberMainBase.
     * 
     * @param HLR_ID
     */
    public void setHLR_ID(String HLR_ID) {
        this.HLR_ID = HLR_ID;
    }


    /**
     * Gets the otherSysID value for this SubscriberMainBase.
     * 
     * @return otherSysID
     */
    public String getOtherSysID() {
        return otherSysID;
    }


    /**
     * Sets the otherSysID value for this SubscriberMainBase.
     * 
     * @param otherSysID
     */
    public void setOtherSysID(String otherSysID) {
        this.otherSysID = otherSysID;
    }


    /**
     * Gets the accountNumber value for this SubscriberMainBase.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this SubscriberMainBase.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the billCycleDay value for this SubscriberMainBase.
     * 
     * @return billCycleDay
     */
    public String getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this SubscriberMainBase.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(String billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the notificationLevel value for this SubscriberMainBase.
     * 
     * @return notificationLevel
     */
    public String getNotificationLevel() {
        return notificationLevel;
    }


    /**
     * Sets the notificationLevel value for this SubscriberMainBase.
     * 
     * @param notificationLevel
     */
    public void setNotificationLevel(String notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMainBase)) return false;
        SubscriberMainBase other = (SubscriberMainBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationLanguage==null && other.getNotificationLanguage()==null) || 
             (this.notificationLanguage!=null &&
              this.notificationLanguage.equals(other.getNotificationLanguage()))) &&
            ((this.roamingCreditLimitAsString==null && other.getRoamingCreditLimitAsString()==null) || 
             (this.roamingCreditLimitAsString!=null &&
              this.roamingCreditLimitAsString.equals(other.getRoamingCreditLimitAsString()))) &&
            ((this.currentState==null && other.getCurrentState()==null) || 
             (this.currentState!=null &&
              this.currentState.equals(other.getCurrentState()))) &&
            ((this.COSName==null && other.getCOSName()==null) || 
             (this.COSName!=null &&
              this.COSName.equals(other.getCOSName()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN()))) &&
            ((this.PINChangeNeeded==null && other.getPINChangeNeeded()==null) || 
             (this.PINChangeNeeded!=null &&
              this.PINChangeNeeded.equals(other.getPINChangeNeeded()))) &&
            ((this.languageName==null && other.getLanguageName()==null) || 
             (this.languageName!=null &&
              this.languageName.equals(other.getLanguageName()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.numberFreeAnCallsString==null && other.getNumberFreeAnCallsString()==null) || 
             (this.numberFreeAnCallsString!=null &&
              this.numberFreeAnCallsString.equals(other.getNumberFreeAnCallsString()))) &&
            ((this.CFUNumber==null && other.getCFUNumber()==null) || 
             (this.CFUNumber!=null &&
              this.CFUNumber.equals(other.getCFUNumber()))) &&
            ((this.CFBNumber==null && other.getCFBNumber()==null) || 
             (this.CFBNumber!=null &&
              this.CFBNumber.equals(other.getCFBNumber()))) &&
            ((this.CFNANumber==null && other.getCFNANumber()==null) || 
             (this.CFNANumber!=null &&
              this.CFNANumber.equals(other.getCFNANumber()))) &&
            ((this.CFISNumber==null && other.getCFISNumber()==null) || 
             (this.CFISNumber!=null &&
              this.CFISNumber.equals(other.getCFISNumber()))) &&
            ((this.inFocusIdentity==null && other.getInFocusIdentity()==null) || 
             (this.inFocusIdentity!=null &&
              this.inFocusIdentity.equals(other.getInFocusIdentity()))) &&
            ((this.ESN==null && other.getESN()==null) || 
             (this.ESN!=null &&
              this.ESN.equals(other.getESN()))) &&
            ((this.HLR_ID==null && other.getHLR_ID()==null) || 
             (this.HLR_ID!=null &&
              this.HLR_ID.equals(other.getHLR_ID()))) &&
            ((this.otherSysID==null && other.getOtherSysID()==null) || 
             (this.otherSysID!=null &&
              this.otherSysID.equals(other.getOtherSysID()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.notificationLevel==null && other.getNotificationLevel()==null) || 
             (this.notificationLevel!=null &&
              this.notificationLevel.equals(other.getNotificationLevel())));
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
        if (getNotificationLanguage() != null) {
            _hashCode += getNotificationLanguage().hashCode();
        }
        if (getRoamingCreditLimitAsString() != null) {
            _hashCode += getRoamingCreditLimitAsString().hashCode();
        }
        if (getCurrentState() != null) {
            _hashCode += getCurrentState().hashCode();
        }
        if (getCOSName() != null) {
            _hashCode += getCOSName().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        if (getPINChangeNeeded() != null) {
            _hashCode += getPINChangeNeeded().hashCode();
        }
        if (getLanguageName() != null) {
            _hashCode += getLanguageName().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getNumberFreeAnCallsString() != null) {
            _hashCode += getNumberFreeAnCallsString().hashCode();
        }
        if (getCFUNumber() != null) {
            _hashCode += getCFUNumber().hashCode();
        }
        if (getCFBNumber() != null) {
            _hashCode += getCFBNumber().hashCode();
        }
        if (getCFNANumber() != null) {
            _hashCode += getCFNANumber().hashCode();
        }
        if (getCFISNumber() != null) {
            _hashCode += getCFISNumber().hashCode();
        }
        if (getInFocusIdentity() != null) {
            _hashCode += getInFocusIdentity().hashCode();
        }
        if (getESN() != null) {
            _hashCode += getESN().hashCode();
        }
        if (getHLR_ID() != null) {
            _hashCode += getHLR_ID().hashCode();
        }
        if (getOtherSysID() != null) {
            _hashCode += getOtherSysID().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getNotificationLevel() != null) {
            _hashCode += getNotificationLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberMainBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberMainBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NotificationLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingCreditLimitAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RoamingCreditLimitAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("PIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINChangeNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PINChangeNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LanguageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFreeAnCallsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NumberFreeAnCallsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFUNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFUNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFNANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFNANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFISNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFISNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inFocusIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InFocusIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ESN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HLR_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HLR_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSysID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OtherSysID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BillCycleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NotificationLevel"));
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
