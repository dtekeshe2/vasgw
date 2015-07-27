/**
 * NewConnectionReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class NewConnectionReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String brandIndex;

    private String serviceClass;

    private java.util.Date acntStopDate;

    private String certType;

    private String certNo;

    private String customerName;

    private String customerType;

    private String customerProvince;

    private String address;

    private String defLang;

    private String accountCode;

    private String IMSI;

    private String ICCID;

    private String userPwd;

    private Long billingCycleType;

    public NewConnectionReqDto() {
    }

    public NewConnectionReqDto(
           String MSISDN,
           String brandIndex,
           String serviceClass,
           java.util.Date acntStopDate,
           String certType,
           String certNo,
           String customerName,
           String customerType,
           String customerProvince,
           String address,
           String defLang,
           String accountCode,
           String IMSI,
           String ICCID,
           String userPwd,
           Long billingCycleType) {
           this.MSISDN = MSISDN;
           this.brandIndex = brandIndex;
           this.serviceClass = serviceClass;
           this.acntStopDate = acntStopDate;
           this.certType = certType;
           this.certNo = certNo;
           this.customerName = customerName;
           this.customerType = customerType;
           this.customerProvince = customerProvince;
           this.address = address;
           this.defLang = defLang;
           this.accountCode = accountCode;
           this.IMSI = IMSI;
           this.ICCID = ICCID;
           this.userPwd = userPwd;
           this.billingCycleType = billingCycleType;
    }


    /**
     * Gets the MSISDN value for this NewConnectionReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this NewConnectionReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the brandIndex value for this NewConnectionReqDto.
     * 
     * @return brandIndex
     */
    public String getBrandIndex() {
        return brandIndex;
    }


    /**
     * Sets the brandIndex value for this NewConnectionReqDto.
     * 
     * @param brandIndex
     */
    public void setBrandIndex(String brandIndex) {
        this.brandIndex = brandIndex;
    }


    /**
     * Gets the serviceClass value for this NewConnectionReqDto.
     * 
     * @return serviceClass
     */
    public String getServiceClass() {
        return serviceClass;
    }


    /**
     * Sets the serviceClass value for this NewConnectionReqDto.
     * 
     * @param serviceClass
     */
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }


    /**
     * Gets the acntStopDate value for this NewConnectionReqDto.
     * 
     * @return acntStopDate
     */
    public java.util.Date getAcntStopDate() {
        return acntStopDate;
    }


    /**
     * Sets the acntStopDate value for this NewConnectionReqDto.
     * 
     * @param acntStopDate
     */
    public void setAcntStopDate(java.util.Date acntStopDate) {
        this.acntStopDate = acntStopDate;
    }


    /**
     * Gets the certType value for this NewConnectionReqDto.
     * 
     * @return certType
     */
    public String getCertType() {
        return certType;
    }


    /**
     * Sets the certType value for this NewConnectionReqDto.
     * 
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }


    /**
     * Gets the certNo value for this NewConnectionReqDto.
     * 
     * @return certNo
     */
    public String getCertNo() {
        return certNo;
    }


    /**
     * Sets the certNo value for this NewConnectionReqDto.
     * 
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }


    /**
     * Gets the customerName value for this NewConnectionReqDto.
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this NewConnectionReqDto.
     * 
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerType value for this NewConnectionReqDto.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this NewConnectionReqDto.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the customerProvince value for this NewConnectionReqDto.
     * 
     * @return customerProvince
     */
    public String getCustomerProvince() {
        return customerProvince;
    }


    /**
     * Sets the customerProvince value for this NewConnectionReqDto.
     * 
     * @param customerProvince
     */
    public void setCustomerProvince(String customerProvince) {
        this.customerProvince = customerProvince;
    }


    /**
     * Gets the address value for this NewConnectionReqDto.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this NewConnectionReqDto.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the defLang value for this NewConnectionReqDto.
     * 
     * @return defLang
     */
    public String getDefLang() {
        return defLang;
    }


    /**
     * Sets the defLang value for this NewConnectionReqDto.
     * 
     * @param defLang
     */
    public void setDefLang(String defLang) {
        this.defLang = defLang;
    }


    /**
     * Gets the accountCode value for this NewConnectionReqDto.
     * 
     * @return accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this NewConnectionReqDto.
     * 
     * @param accountCode
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }


    /**
     * Gets the IMSI value for this NewConnectionReqDto.
     * 
     * @return IMSI
     */
    public String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this NewConnectionReqDto.
     * 
     * @param IMSI
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the ICCID value for this NewConnectionReqDto.
     * 
     * @return ICCID
     */
    public String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this NewConnectionReqDto.
     * 
     * @param ICCID
     */
    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the userPwd value for this NewConnectionReqDto.
     * 
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this NewConnectionReqDto.
     * 
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the billingCycleType value for this NewConnectionReqDto.
     * 
     * @return billingCycleType
     */
    public Long getBillingCycleType() {
        return billingCycleType;
    }


    /**
     * Sets the billingCycleType value for this NewConnectionReqDto.
     * 
     * @param billingCycleType
     */
    public void setBillingCycleType(Long billingCycleType) {
        this.billingCycleType = billingCycleType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NewConnectionReqDto)) return false;
        NewConnectionReqDto other = (NewConnectionReqDto) obj;
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
            ((this.brandIndex==null && other.getBrandIndex()==null) || 
             (this.brandIndex!=null &&
              this.brandIndex.equals(other.getBrandIndex()))) &&
            ((this.serviceClass==null && other.getServiceClass()==null) || 
             (this.serviceClass!=null &&
              this.serviceClass.equals(other.getServiceClass()))) &&
            ((this.acntStopDate==null && other.getAcntStopDate()==null) || 
             (this.acntStopDate!=null &&
              this.acntStopDate.equals(other.getAcntStopDate()))) &&
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
            ((this.customerProvince==null && other.getCustomerProvince()==null) || 
             (this.customerProvince!=null &&
              this.customerProvince.equals(other.getCustomerProvince()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.defLang==null && other.getDefLang()==null) || 
             (this.defLang!=null &&
              this.defLang.equals(other.getDefLang()))) &&
            ((this.accountCode==null && other.getAccountCode()==null) || 
             (this.accountCode!=null &&
              this.accountCode.equals(other.getAccountCode()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.userPwd==null && other.getUserPwd()==null) || 
             (this.userPwd!=null &&
              this.userPwd.equals(other.getUserPwd()))) &&
            ((this.billingCycleType==null && other.getBillingCycleType()==null) || 
             (this.billingCycleType!=null &&
              this.billingCycleType.equals(other.getBillingCycleType())));
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
        if (getBrandIndex() != null) {
            _hashCode += getBrandIndex().hashCode();
        }
        if (getServiceClass() != null) {
            _hashCode += getServiceClass().hashCode();
        }
        if (getAcntStopDate() != null) {
            _hashCode += getAcntStopDate().hashCode();
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
        if (getCustomerProvince() != null) {
            _hashCode += getCustomerProvince().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDefLang() != null) {
            _hashCode += getDefLang().hashCode();
        }
        if (getAccountCode() != null) {
            _hashCode += getAccountCode().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getUserPwd() != null) {
            _hashCode += getUserPwd().hashCode();
        }
        if (getBillingCycleType() != null) {
            _hashCode += getBillingCycleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewConnectionReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewConnectionReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
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
        elemField.setFieldName("serviceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ServiceClass"));
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
        elemField.setFieldName("certType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CertType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("customerProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustomerProvince"));
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
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AccountCode"));
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
        elemField.setFieldName("userPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BillingCycleType"));
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
