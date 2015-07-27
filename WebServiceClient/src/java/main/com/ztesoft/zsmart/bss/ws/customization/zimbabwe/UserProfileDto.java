/**
 * UserProfileDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class UserProfileDto  implements java.io.Serializable {
    private String MSISDN;

    private java.util.Date acntStopDate;

    private java.util.Date completedDate;

    private Long certType;

    private String certNo;

    private String customerName;

    private String customerType;

    private String address;

    private String defLang;

    private String brandIndex;

    private String brandName;

    private String serviceClass;

    private String postpaidFlag;

    private String IMSI;

    private String ICCID;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto[] supServiceDtoList;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto[] pricePlanDtoList;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto[] fellowISDNDtoList;

    private String state;

    private String stateSet;

    private String creditLimit;

    private Long billingCycleTypeIndex;

    private Long deposit;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto[] custAttrDtoList;

    private com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto[] subsAttrDtoList;

    private String balID;

    private java.util.Date activeStopDate;

    private java.util.Date suspendStopDate;

    private java.util.Date disableStopDate;

    private java.util.Date serviceStopDate;

    private Long refillErrorTimes;

    public UserProfileDto() {
    }

    public UserProfileDto(
           String MSISDN,
           java.util.Date acntStopDate,
           java.util.Date completedDate,
           Long certType,
           String certNo,
           String customerName,
           String customerType,
           String address,
           String defLang,
           String brandIndex,
           String brandName,
           String serviceClass,
           String postpaidFlag,
           String IMSI,
           String ICCID,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto[] supServiceDtoList,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto[] pricePlanDtoList,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto[] fellowISDNDtoList,
           String state,
           String stateSet,
           String creditLimit,
           Long billingCycleTypeIndex,
           Long deposit,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto[] custAttrDtoList,
           com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto[] subsAttrDtoList,
           String balID,
           java.util.Date activeStopDate,
           java.util.Date suspendStopDate,
           java.util.Date disableStopDate,
           java.util.Date serviceStopDate,
           Long refillErrorTimes) {
           this.MSISDN = MSISDN;
           this.acntStopDate = acntStopDate;
           this.completedDate = completedDate;
           this.certType = certType;
           this.certNo = certNo;
           this.customerName = customerName;
           this.customerType = customerType;
           this.address = address;
           this.defLang = defLang;
           this.brandIndex = brandIndex;
           this.brandName = brandName;
           this.serviceClass = serviceClass;
           this.postpaidFlag = postpaidFlag;
           this.IMSI = IMSI;
           this.ICCID = ICCID;
           this.supServiceDtoList = supServiceDtoList;
           this.pricePlanDtoList = pricePlanDtoList;
           this.fellowISDNDtoList = fellowISDNDtoList;
           this.state = state;
           this.stateSet = stateSet;
           this.creditLimit = creditLimit;
           this.billingCycleTypeIndex = billingCycleTypeIndex;
           this.deposit = deposit;
           this.custAttrDtoList = custAttrDtoList;
           this.subsAttrDtoList = subsAttrDtoList;
           this.balID = balID;
           this.activeStopDate = activeStopDate;
           this.suspendStopDate = suspendStopDate;
           this.disableStopDate = disableStopDate;
           this.serviceStopDate = serviceStopDate;
           this.refillErrorTimes = refillErrorTimes;
    }


    /**
     * Gets the MSISDN value for this UserProfileDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this UserProfileDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the acntStopDate value for this UserProfileDto.
     * 
     * @return acntStopDate
     */
    public java.util.Date getAcntStopDate() {
        return acntStopDate;
    }


    /**
     * Sets the acntStopDate value for this UserProfileDto.
     * 
     * @param acntStopDate
     */
    public void setAcntStopDate(java.util.Date acntStopDate) {
        this.acntStopDate = acntStopDate;
    }


    /**
     * Gets the completedDate value for this UserProfileDto.
     * 
     * @return completedDate
     */
    public java.util.Date getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this UserProfileDto.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Date completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the certType value for this UserProfileDto.
     * 
     * @return certType
     */
    public Long getCertType() {
        return certType;
    }


    /**
     * Sets the certType value for this UserProfileDto.
     * 
     * @param certType
     */
    public void setCertType(Long certType) {
        this.certType = certType;
    }


    /**
     * Gets the certNo value for this UserProfileDto.
     * 
     * @return certNo
     */
    public String getCertNo() {
        return certNo;
    }


    /**
     * Sets the certNo value for this UserProfileDto.
     * 
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }


    /**
     * Gets the customerName value for this UserProfileDto.
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this UserProfileDto.
     * 
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerType value for this UserProfileDto.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this UserProfileDto.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the address value for this UserProfileDto.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UserProfileDto.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the defLang value for this UserProfileDto.
     * 
     * @return defLang
     */
    public String getDefLang() {
        return defLang;
    }


    /**
     * Sets the defLang value for this UserProfileDto.
     * 
     * @param defLang
     */
    public void setDefLang(String defLang) {
        this.defLang = defLang;
    }


    /**
     * Gets the brandIndex value for this UserProfileDto.
     * 
     * @return brandIndex
     */
    public String getBrandIndex() {
        return brandIndex;
    }


    /**
     * Sets the brandIndex value for this UserProfileDto.
     * 
     * @param brandIndex
     */
    public void setBrandIndex(String brandIndex) {
        this.brandIndex = brandIndex;
    }


    /**
     * Gets the brandName value for this UserProfileDto.
     * 
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this UserProfileDto.
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the serviceClass value for this UserProfileDto.
     * 
     * @return serviceClass
     */
    public String getServiceClass() {
        return serviceClass;
    }


    /**
     * Sets the serviceClass value for this UserProfileDto.
     * 
     * @param serviceClass
     */
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }


    /**
     * Gets the postpaidFlag value for this UserProfileDto.
     * 
     * @return postpaidFlag
     */
    public String getPostpaidFlag() {
        return postpaidFlag;
    }


    /**
     * Sets the postpaidFlag value for this UserProfileDto.
     * 
     * @param postpaidFlag
     */
    public void setPostpaidFlag(String postpaidFlag) {
        this.postpaidFlag = postpaidFlag;
    }


    /**
     * Gets the IMSI value for this UserProfileDto.
     * 
     * @return IMSI
     */
    public String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this UserProfileDto.
     * 
     * @param IMSI
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the ICCID value for this UserProfileDto.
     * 
     * @return ICCID
     */
    public String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this UserProfileDto.
     * 
     * @param ICCID
     */
    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the supServiceDtoList value for this UserProfileDto.
     * 
     * @return supServiceDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto[] getSupServiceDtoList() {
        return supServiceDtoList;
    }


    /**
     * Sets the supServiceDtoList value for this UserProfileDto.
     * 
     * @param supServiceDtoList
     */
    public void setSupServiceDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto[] supServiceDtoList) {
        this.supServiceDtoList = supServiceDtoList;
    }


    /**
     * Gets the pricePlanDtoList value for this UserProfileDto.
     * 
     * @return pricePlanDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto[] getPricePlanDtoList() {
        return pricePlanDtoList;
    }


    /**
     * Sets the pricePlanDtoList value for this UserProfileDto.
     * 
     * @param pricePlanDtoList
     */
    public void setPricePlanDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto[] pricePlanDtoList) {
        this.pricePlanDtoList = pricePlanDtoList;
    }


    /**
     * Gets the fellowISDNDtoList value for this UserProfileDto.
     * 
     * @return fellowISDNDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto[] getFellowISDNDtoList() {
        return fellowISDNDtoList;
    }


    /**
     * Sets the fellowISDNDtoList value for this UserProfileDto.
     * 
     * @param fellowISDNDtoList
     */
    public void setFellowISDNDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto[] fellowISDNDtoList) {
        this.fellowISDNDtoList = fellowISDNDtoList;
    }


    /**
     * Gets the state value for this UserProfileDto.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserProfileDto.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the stateSet value for this UserProfileDto.
     * 
     * @return stateSet
     */
    public String getStateSet() {
        return stateSet;
    }


    /**
     * Sets the stateSet value for this UserProfileDto.
     * 
     * @param stateSet
     */
    public void setStateSet(String stateSet) {
        this.stateSet = stateSet;
    }


    /**
     * Gets the creditLimit value for this UserProfileDto.
     * 
     * @return creditLimit
     */
    public String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this UserProfileDto.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the billingCycleTypeIndex value for this UserProfileDto.
     * 
     * @return billingCycleTypeIndex
     */
    public Long getBillingCycleTypeIndex() {
        return billingCycleTypeIndex;
    }


    /**
     * Sets the billingCycleTypeIndex value for this UserProfileDto.
     * 
     * @param billingCycleTypeIndex
     */
    public void setBillingCycleTypeIndex(Long billingCycleTypeIndex) {
        this.billingCycleTypeIndex = billingCycleTypeIndex;
    }


    /**
     * Gets the deposit value for this UserProfileDto.
     * 
     * @return deposit
     */
    public Long getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this UserProfileDto.
     * 
     * @param deposit
     */
    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the custAttrDtoList value for this UserProfileDto.
     * 
     * @return custAttrDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto[] getCustAttrDtoList() {
        return custAttrDtoList;
    }


    /**
     * Sets the custAttrDtoList value for this UserProfileDto.
     * 
     * @param custAttrDtoList
     */
    public void setCustAttrDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto[] custAttrDtoList) {
        this.custAttrDtoList = custAttrDtoList;
    }


    /**
     * Gets the subsAttrDtoList value for this UserProfileDto.
     * 
     * @return subsAttrDtoList
     */
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto[] getSubsAttrDtoList() {
        return subsAttrDtoList;
    }


    /**
     * Sets the subsAttrDtoList value for this UserProfileDto.
     * 
     * @param subsAttrDtoList
     */
    public void setSubsAttrDtoList(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto[] subsAttrDtoList) {
        this.subsAttrDtoList = subsAttrDtoList;
    }


    /**
     * Gets the balID value for this UserProfileDto.
     * 
     * @return balID
     */
    public String getBalID() {
        return balID;
    }


    /**
     * Sets the balID value for this UserProfileDto.
     * 
     * @param balID
     */
    public void setBalID(String balID) {
        this.balID = balID;
    }


    /**
     * Gets the activeStopDate value for this UserProfileDto.
     * 
     * @return activeStopDate
     */
    public java.util.Date getActiveStopDate() {
        return activeStopDate;
    }


    /**
     * Sets the activeStopDate value for this UserProfileDto.
     * 
     * @param activeStopDate
     */
    public void setActiveStopDate(java.util.Date activeStopDate) {
        this.activeStopDate = activeStopDate;
    }


    /**
     * Gets the suspendStopDate value for this UserProfileDto.
     * 
     * @return suspendStopDate
     */
    public java.util.Date getSuspendStopDate() {
        return suspendStopDate;
    }


    /**
     * Sets the suspendStopDate value for this UserProfileDto.
     * 
     * @param suspendStopDate
     */
    public void setSuspendStopDate(java.util.Date suspendStopDate) {
        this.suspendStopDate = suspendStopDate;
    }


    /**
     * Gets the disableStopDate value for this UserProfileDto.
     * 
     * @return disableStopDate
     */
    public java.util.Date getDisableStopDate() {
        return disableStopDate;
    }


    /**
     * Sets the disableStopDate value for this UserProfileDto.
     * 
     * @param disableStopDate
     */
    public void setDisableStopDate(java.util.Date disableStopDate) {
        this.disableStopDate = disableStopDate;
    }


    /**
     * Gets the serviceStopDate value for this UserProfileDto.
     * 
     * @return serviceStopDate
     */
    public java.util.Date getServiceStopDate() {
        return serviceStopDate;
    }


    /**
     * Sets the serviceStopDate value for this UserProfileDto.
     * 
     * @param serviceStopDate
     */
    public void setServiceStopDate(java.util.Date serviceStopDate) {
        this.serviceStopDate = serviceStopDate;
    }


    /**
     * Gets the refillErrorTimes value for this UserProfileDto.
     * 
     * @return refillErrorTimes
     */
    public Long getRefillErrorTimes() {
        return refillErrorTimes;
    }


    /**
     * Sets the refillErrorTimes value for this UserProfileDto.
     * 
     * @param refillErrorTimes
     */
    public void setRefillErrorTimes(Long refillErrorTimes) {
        this.refillErrorTimes = refillErrorTimes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserProfileDto)) return false;
        UserProfileDto other = (UserProfileDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.acntStopDate==null && other.getAcntStopDate()==null) || 
             (this.acntStopDate!=null &&
              this.acntStopDate.equals(other.getAcntStopDate()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.certType==null && other.getCertType()==null) || 
             (this.certType!=null &&
              this.certType.equals(other.getCertType()))) &&
            ((this.certNo==null && other.getCertNo()==null) || 
             (this.certNo!=null &&
              this.certNo.equals(other.getCertNo()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.defLang==null && other.getDefLang()==null) || 
             (this.defLang!=null &&
              this.defLang.equals(other.getDefLang()))) &&
            ((this.brandIndex==null && other.getBrandIndex()==null) || 
             (this.brandIndex!=null &&
              this.brandIndex.equals(other.getBrandIndex()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.serviceClass==null && other.getServiceClass()==null) || 
             (this.serviceClass!=null &&
              this.serviceClass.equals(other.getServiceClass()))) &&
            ((this.postpaidFlag==null && other.getPostpaidFlag()==null) || 
             (this.postpaidFlag!=null &&
              this.postpaidFlag.equals(other.getPostpaidFlag()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.supServiceDtoList==null && other.getSupServiceDtoList()==null) || 
             (this.supServiceDtoList!=null &&
              java.util.Arrays.equals(this.supServiceDtoList, other.getSupServiceDtoList()))) &&
            ((this.pricePlanDtoList==null && other.getPricePlanDtoList()==null) || 
             (this.pricePlanDtoList!=null &&
              java.util.Arrays.equals(this.pricePlanDtoList, other.getPricePlanDtoList()))) &&
            ((this.fellowISDNDtoList==null && other.getFellowISDNDtoList()==null) || 
             (this.fellowISDNDtoList!=null &&
              java.util.Arrays.equals(this.fellowISDNDtoList, other.getFellowISDNDtoList()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateSet==null && other.getStateSet()==null) || 
             (this.stateSet!=null &&
              this.stateSet.equals(other.getStateSet()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.billingCycleTypeIndex==null && other.getBillingCycleTypeIndex()==null) || 
             (this.billingCycleTypeIndex!=null &&
              this.billingCycleTypeIndex.equals(other.getBillingCycleTypeIndex()))) &&
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.custAttrDtoList==null && other.getCustAttrDtoList()==null) || 
             (this.custAttrDtoList!=null &&
              java.util.Arrays.equals(this.custAttrDtoList, other.getCustAttrDtoList()))) &&
            ((this.subsAttrDtoList==null && other.getSubsAttrDtoList()==null) || 
             (this.subsAttrDtoList!=null &&
              java.util.Arrays.equals(this.subsAttrDtoList, other.getSubsAttrDtoList()))) &&
            ((this.balID==null && other.getBalID()==null) || 
             (this.balID!=null &&
              this.balID.equals(other.getBalID()))) &&
            ((this.activeStopDate==null && other.getActiveStopDate()==null) || 
             (this.activeStopDate!=null &&
              this.activeStopDate.equals(other.getActiveStopDate()))) &&
            ((this.suspendStopDate==null && other.getSuspendStopDate()==null) || 
             (this.suspendStopDate!=null &&
              this.suspendStopDate.equals(other.getSuspendStopDate()))) &&
            ((this.disableStopDate==null && other.getDisableStopDate()==null) || 
             (this.disableStopDate!=null &&
              this.disableStopDate.equals(other.getDisableStopDate()))) &&
            ((this.serviceStopDate==null && other.getServiceStopDate()==null) || 
             (this.serviceStopDate!=null &&
              this.serviceStopDate.equals(other.getServiceStopDate()))) &&
            ((this.refillErrorTimes==null && other.getRefillErrorTimes()==null) || 
             (this.refillErrorTimes!=null &&
              this.refillErrorTimes.equals(other.getRefillErrorTimes())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAcntStopDate() != null) {
            _hashCode += getAcntStopDate().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getCertType() != null) {
            _hashCode += getCertType().hashCode();
        }
        if (getCertNo() != null) {
            _hashCode += getCertNo().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDefLang() != null) {
            _hashCode += getDefLang().hashCode();
        }
        if (getBrandIndex() != null) {
            _hashCode += getBrandIndex().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getServiceClass() != null) {
            _hashCode += getServiceClass().hashCode();
        }
        if (getPostpaidFlag() != null) {
            _hashCode += getPostpaidFlag().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getSupServiceDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupServiceDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSupServiceDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricePlanDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricePlanDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPricePlanDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFellowISDNDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFellowISDNDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFellowISDNDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateSet() != null) {
            _hashCode += getStateSet().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getBillingCycleTypeIndex() != null) {
            _hashCode += getBillingCycleTypeIndex().hashCode();
        }
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getCustAttrDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustAttrDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustAttrDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsAttrDtoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsAttrDtoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubsAttrDtoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalID() != null) {
            _hashCode += getBalID().hashCode();
        }
        if (getActiveStopDate() != null) {
            _hashCode += getActiveStopDate().hashCode();
        }
        if (getSuspendStopDate() != null) {
            _hashCode += getSuspendStopDate().hashCode();
        }
        if (getDisableStopDate() != null) {
            _hashCode += getDisableStopDate().hashCode();
        }
        if (getServiceStopDate() != null) {
            _hashCode += getServiceStopDate().hashCode();
        }
        if (getRefillErrorTimes() != null) {
            _hashCode += getRefillErrorTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfileDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserProfileDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acntStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AcntStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CertType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CertNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defLang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DefLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BrandIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BrandName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ServiceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PostpaidFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supServiceDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fellowISDNDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "StateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCycleTypeIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BillingCycleTypeIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAttrDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsAttrDtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ActiveStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SuspendStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DisableStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ServiceStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refillErrorTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RefillErrorTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
