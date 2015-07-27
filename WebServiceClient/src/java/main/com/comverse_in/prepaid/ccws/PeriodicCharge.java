/**
 * PeriodicCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class PeriodicCharge  implements java.io.Serializable {
    private String chargeId;

    private String description;

    private String period;

    private Long applyDay;

    private String currencyName;

    private String spName;

    private java.math.BigDecimal tax1;

    private java.math.BigDecimal tax2;

    private java.math.BigDecimal tax3;

    private Boolean proratedStart;

    private Boolean proratedEnd;

    private Boolean mandatory;

    private java.math.BigDecimal charge_balance1;

    private java.math.BigDecimal charge_balance2;

    private java.math.BigDecimal charge_balance3;

    private java.math.BigDecimal charge_balance4;

    private java.math.BigDecimal charge_balance5;

    private java.math.BigDecimal charge_balance6;

    private java.math.BigDecimal charge_balance7;

    private java.math.BigDecimal charge_balance8;

    private java.math.BigDecimal charge_balance9;

    private java.math.BigDecimal charge_balance10;

    private String charge_code;

    private String HLR_code;

    private String currencyISO;

    public PeriodicCharge() {
    }

    public PeriodicCharge(
           String chargeId,
           String description,
           String period,
           Long applyDay,
           String currencyName,
           String spName,
           java.math.BigDecimal tax1,
           java.math.BigDecimal tax2,
           java.math.BigDecimal tax3,
           Boolean proratedStart,
           Boolean proratedEnd,
           Boolean mandatory,
           java.math.BigDecimal charge_balance1,
           java.math.BigDecimal charge_balance2,
           java.math.BigDecimal charge_balance3,
           java.math.BigDecimal charge_balance4,
           java.math.BigDecimal charge_balance5,
           java.math.BigDecimal charge_balance6,
           java.math.BigDecimal charge_balance7,
           java.math.BigDecimal charge_balance8,
           java.math.BigDecimal charge_balance9,
           java.math.BigDecimal charge_balance10,
           String charge_code,
           String HLR_code,
           String currencyISO) {
           this.chargeId = chargeId;
           this.description = description;
           this.period = period;
           this.applyDay = applyDay;
           this.currencyName = currencyName;
           this.spName = spName;
           this.tax1 = tax1;
           this.tax2 = tax2;
           this.tax3 = tax3;
           this.proratedStart = proratedStart;
           this.proratedEnd = proratedEnd;
           this.mandatory = mandatory;
           this.charge_balance1 = charge_balance1;
           this.charge_balance2 = charge_balance2;
           this.charge_balance3 = charge_balance3;
           this.charge_balance4 = charge_balance4;
           this.charge_balance5 = charge_balance5;
           this.charge_balance6 = charge_balance6;
           this.charge_balance7 = charge_balance7;
           this.charge_balance8 = charge_balance8;
           this.charge_balance9 = charge_balance9;
           this.charge_balance10 = charge_balance10;
           this.charge_code = charge_code;
           this.HLR_code = HLR_code;
           this.currencyISO = currencyISO;
    }


    /**
     * Gets the chargeId value for this PeriodicCharge.
     * 
     * @return chargeId
     */
    public String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this PeriodicCharge.
     * 
     * @param chargeId
     */
    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the description value for this PeriodicCharge.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PeriodicCharge.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the period value for this PeriodicCharge.
     * 
     * @return period
     */
    public String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PeriodicCharge.
     * 
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }


    /**
     * Gets the applyDay value for this PeriodicCharge.
     * 
     * @return applyDay
     */
    public Long getApplyDay() {
        return applyDay;
    }


    /**
     * Sets the applyDay value for this PeriodicCharge.
     * 
     * @param applyDay
     */
    public void setApplyDay(Long applyDay) {
        this.applyDay = applyDay;
    }


    /**
     * Gets the currencyName value for this PeriodicCharge.
     * 
     * @return currencyName
     */
    public String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this PeriodicCharge.
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the spName value for this PeriodicCharge.
     * 
     * @return spName
     */
    public String getSpName() {
        return spName;
    }


    /**
     * Sets the spName value for this PeriodicCharge.
     * 
     * @param spName
     */
    public void setSpName(String spName) {
        this.spName = spName;
    }


    /**
     * Gets the tax1 value for this PeriodicCharge.
     * 
     * @return tax1
     */
    public java.math.BigDecimal getTax1() {
        return tax1;
    }


    /**
     * Sets the tax1 value for this PeriodicCharge.
     * 
     * @param tax1
     */
    public void setTax1(java.math.BigDecimal tax1) {
        this.tax1 = tax1;
    }


    /**
     * Gets the tax2 value for this PeriodicCharge.
     * 
     * @return tax2
     */
    public java.math.BigDecimal getTax2() {
        return tax2;
    }


    /**
     * Sets the tax2 value for this PeriodicCharge.
     * 
     * @param tax2
     */
    public void setTax2(java.math.BigDecimal tax2) {
        this.tax2 = tax2;
    }


    /**
     * Gets the tax3 value for this PeriodicCharge.
     * 
     * @return tax3
     */
    public java.math.BigDecimal getTax3() {
        return tax3;
    }


    /**
     * Sets the tax3 value for this PeriodicCharge.
     * 
     * @param tax3
     */
    public void setTax3(java.math.BigDecimal tax3) {
        this.tax3 = tax3;
    }


    /**
     * Gets the proratedStart value for this PeriodicCharge.
     * 
     * @return proratedStart
     */
    public Boolean getProratedStart() {
        return proratedStart;
    }


    /**
     * Sets the proratedStart value for this PeriodicCharge.
     * 
     * @param proratedStart
     */
    public void setProratedStart(Boolean proratedStart) {
        this.proratedStart = proratedStart;
    }


    /**
     * Gets the proratedEnd value for this PeriodicCharge.
     * 
     * @return proratedEnd
     */
    public Boolean getProratedEnd() {
        return proratedEnd;
    }


    /**
     * Sets the proratedEnd value for this PeriodicCharge.
     * 
     * @param proratedEnd
     */
    public void setProratedEnd(Boolean proratedEnd) {
        this.proratedEnd = proratedEnd;
    }


    /**
     * Gets the mandatory value for this PeriodicCharge.
     * 
     * @return mandatory
     */
    public Boolean getMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this PeriodicCharge.
     * 
     * @param mandatory
     */
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the charge_balance1 value for this PeriodicCharge.
     * 
     * @return charge_balance1
     */
    public java.math.BigDecimal getCharge_balance1() {
        return charge_balance1;
    }


    /**
     * Sets the charge_balance1 value for this PeriodicCharge.
     * 
     * @param charge_balance1
     */
    public void setCharge_balance1(java.math.BigDecimal charge_balance1) {
        this.charge_balance1 = charge_balance1;
    }


    /**
     * Gets the charge_balance2 value for this PeriodicCharge.
     * 
     * @return charge_balance2
     */
    public java.math.BigDecimal getCharge_balance2() {
        return charge_balance2;
    }


    /**
     * Sets the charge_balance2 value for this PeriodicCharge.
     * 
     * @param charge_balance2
     */
    public void setCharge_balance2(java.math.BigDecimal charge_balance2) {
        this.charge_balance2 = charge_balance2;
    }


    /**
     * Gets the charge_balance3 value for this PeriodicCharge.
     * 
     * @return charge_balance3
     */
    public java.math.BigDecimal getCharge_balance3() {
        return charge_balance3;
    }


    /**
     * Sets the charge_balance3 value for this PeriodicCharge.
     * 
     * @param charge_balance3
     */
    public void setCharge_balance3(java.math.BigDecimal charge_balance3) {
        this.charge_balance3 = charge_balance3;
    }


    /**
     * Gets the charge_balance4 value for this PeriodicCharge.
     * 
     * @return charge_balance4
     */
    public java.math.BigDecimal getCharge_balance4() {
        return charge_balance4;
    }


    /**
     * Sets the charge_balance4 value for this PeriodicCharge.
     * 
     * @param charge_balance4
     */
    public void setCharge_balance4(java.math.BigDecimal charge_balance4) {
        this.charge_balance4 = charge_balance4;
    }


    /**
     * Gets the charge_balance5 value for this PeriodicCharge.
     * 
     * @return charge_balance5
     */
    public java.math.BigDecimal getCharge_balance5() {
        return charge_balance5;
    }


    /**
     * Sets the charge_balance5 value for this PeriodicCharge.
     * 
     * @param charge_balance5
     */
    public void setCharge_balance5(java.math.BigDecimal charge_balance5) {
        this.charge_balance5 = charge_balance5;
    }


    /**
     * Gets the charge_balance6 value for this PeriodicCharge.
     * 
     * @return charge_balance6
     */
    public java.math.BigDecimal getCharge_balance6() {
        return charge_balance6;
    }


    /**
     * Sets the charge_balance6 value for this PeriodicCharge.
     * 
     * @param charge_balance6
     */
    public void setCharge_balance6(java.math.BigDecimal charge_balance6) {
        this.charge_balance6 = charge_balance6;
    }


    /**
     * Gets the charge_balance7 value for this PeriodicCharge.
     * 
     * @return charge_balance7
     */
    public java.math.BigDecimal getCharge_balance7() {
        return charge_balance7;
    }


    /**
     * Sets the charge_balance7 value for this PeriodicCharge.
     * 
     * @param charge_balance7
     */
    public void setCharge_balance7(java.math.BigDecimal charge_balance7) {
        this.charge_balance7 = charge_balance7;
    }


    /**
     * Gets the charge_balance8 value for this PeriodicCharge.
     * 
     * @return charge_balance8
     */
    public java.math.BigDecimal getCharge_balance8() {
        return charge_balance8;
    }


    /**
     * Sets the charge_balance8 value for this PeriodicCharge.
     * 
     * @param charge_balance8
     */
    public void setCharge_balance8(java.math.BigDecimal charge_balance8) {
        this.charge_balance8 = charge_balance8;
    }


    /**
     * Gets the charge_balance9 value for this PeriodicCharge.
     * 
     * @return charge_balance9
     */
    public java.math.BigDecimal getCharge_balance9() {
        return charge_balance9;
    }


    /**
     * Sets the charge_balance9 value for this PeriodicCharge.
     * 
     * @param charge_balance9
     */
    public void setCharge_balance9(java.math.BigDecimal charge_balance9) {
        this.charge_balance9 = charge_balance9;
    }


    /**
     * Gets the charge_balance10 value for this PeriodicCharge.
     * 
     * @return charge_balance10
     */
    public java.math.BigDecimal getCharge_balance10() {
        return charge_balance10;
    }


    /**
     * Sets the charge_balance10 value for this PeriodicCharge.
     * 
     * @param charge_balance10
     */
    public void setCharge_balance10(java.math.BigDecimal charge_balance10) {
        this.charge_balance10 = charge_balance10;
    }


    /**
     * Gets the charge_code value for this PeriodicCharge.
     * 
     * @return charge_code
     */
    public String getCharge_code() {
        return charge_code;
    }


    /**
     * Sets the charge_code value for this PeriodicCharge.
     * 
     * @param charge_code
     */
    public void setCharge_code(String charge_code) {
        this.charge_code = charge_code;
    }


    /**
     * Gets the HLR_code value for this PeriodicCharge.
     * 
     * @return HLR_code
     */
    public String getHLR_code() {
        return HLR_code;
    }


    /**
     * Sets the HLR_code value for this PeriodicCharge.
     * 
     * @param HLR_code
     */
    public void setHLR_code(String HLR_code) {
        this.HLR_code = HLR_code;
    }


    /**
     * Gets the currencyISO value for this PeriodicCharge.
     * 
     * @return currencyISO
     */
    public String getCurrencyISO() {
        return currencyISO;
    }


    /**
     * Sets the currencyISO value for this PeriodicCharge.
     * 
     * @param currencyISO
     */
    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PeriodicCharge)) return false;
        PeriodicCharge other = (PeriodicCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.applyDay==null && other.getApplyDay()==null) || 
             (this.applyDay!=null &&
              this.applyDay.equals(other.getApplyDay()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.spName==null && other.getSpName()==null) || 
             (this.spName!=null &&
              this.spName.equals(other.getSpName()))) &&
            ((this.tax1==null && other.getTax1()==null) || 
             (this.tax1!=null &&
              this.tax1.equals(other.getTax1()))) &&
            ((this.tax2==null && other.getTax2()==null) || 
             (this.tax2!=null &&
              this.tax2.equals(other.getTax2()))) &&
            ((this.tax3==null && other.getTax3()==null) || 
             (this.tax3!=null &&
              this.tax3.equals(other.getTax3()))) &&
            ((this.proratedStart==null && other.getProratedStart()==null) || 
             (this.proratedStart!=null &&
              this.proratedStart.equals(other.getProratedStart()))) &&
            ((this.proratedEnd==null && other.getProratedEnd()==null) || 
             (this.proratedEnd!=null &&
              this.proratedEnd.equals(other.getProratedEnd()))) &&
            ((this.mandatory==null && other.getMandatory()==null) || 
             (this.mandatory!=null &&
              this.mandatory.equals(other.getMandatory()))) &&
            ((this.charge_balance1==null && other.getCharge_balance1()==null) || 
             (this.charge_balance1!=null &&
              this.charge_balance1.equals(other.getCharge_balance1()))) &&
            ((this.charge_balance2==null && other.getCharge_balance2()==null) || 
             (this.charge_balance2!=null &&
              this.charge_balance2.equals(other.getCharge_balance2()))) &&
            ((this.charge_balance3==null && other.getCharge_balance3()==null) || 
             (this.charge_balance3!=null &&
              this.charge_balance3.equals(other.getCharge_balance3()))) &&
            ((this.charge_balance4==null && other.getCharge_balance4()==null) || 
             (this.charge_balance4!=null &&
              this.charge_balance4.equals(other.getCharge_balance4()))) &&
            ((this.charge_balance5==null && other.getCharge_balance5()==null) || 
             (this.charge_balance5!=null &&
              this.charge_balance5.equals(other.getCharge_balance5()))) &&
            ((this.charge_balance6==null && other.getCharge_balance6()==null) || 
             (this.charge_balance6!=null &&
              this.charge_balance6.equals(other.getCharge_balance6()))) &&
            ((this.charge_balance7==null && other.getCharge_balance7()==null) || 
             (this.charge_balance7!=null &&
              this.charge_balance7.equals(other.getCharge_balance7()))) &&
            ((this.charge_balance8==null && other.getCharge_balance8()==null) || 
             (this.charge_balance8!=null &&
              this.charge_balance8.equals(other.getCharge_balance8()))) &&
            ((this.charge_balance9==null && other.getCharge_balance9()==null) || 
             (this.charge_balance9!=null &&
              this.charge_balance9.equals(other.getCharge_balance9()))) &&
            ((this.charge_balance10==null && other.getCharge_balance10()==null) || 
             (this.charge_balance10!=null &&
              this.charge_balance10.equals(other.getCharge_balance10()))) &&
            ((this.charge_code==null && other.getCharge_code()==null) || 
             (this.charge_code!=null &&
              this.charge_code.equals(other.getCharge_code()))) &&
            ((this.HLR_code==null && other.getHLR_code()==null) || 
             (this.HLR_code!=null &&
              this.HLR_code.equals(other.getHLR_code()))) &&
            ((this.currencyISO==null && other.getCurrencyISO()==null) || 
             (this.currencyISO!=null &&
              this.currencyISO.equals(other.getCurrencyISO())));
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
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getApplyDay() != null) {
            _hashCode += getApplyDay().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getSpName() != null) {
            _hashCode += getSpName().hashCode();
        }
        if (getTax1() != null) {
            _hashCode += getTax1().hashCode();
        }
        if (getTax2() != null) {
            _hashCode += getTax2().hashCode();
        }
        if (getTax3() != null) {
            _hashCode += getTax3().hashCode();
        }
        if (getProratedStart() != null) {
            _hashCode += getProratedStart().hashCode();
        }
        if (getProratedEnd() != null) {
            _hashCode += getProratedEnd().hashCode();
        }
        if (getMandatory() != null) {
            _hashCode += getMandatory().hashCode();
        }
        if (getCharge_balance1() != null) {
            _hashCode += getCharge_balance1().hashCode();
        }
        if (getCharge_balance2() != null) {
            _hashCode += getCharge_balance2().hashCode();
        }
        if (getCharge_balance3() != null) {
            _hashCode += getCharge_balance3().hashCode();
        }
        if (getCharge_balance4() != null) {
            _hashCode += getCharge_balance4().hashCode();
        }
        if (getCharge_balance5() != null) {
            _hashCode += getCharge_balance5().hashCode();
        }
        if (getCharge_balance6() != null) {
            _hashCode += getCharge_balance6().hashCode();
        }
        if (getCharge_balance7() != null) {
            _hashCode += getCharge_balance7().hashCode();
        }
        if (getCharge_balance8() != null) {
            _hashCode += getCharge_balance8().hashCode();
        }
        if (getCharge_balance9() != null) {
            _hashCode += getCharge_balance9().hashCode();
        }
        if (getCharge_balance10() != null) {
            _hashCode += getCharge_balance10().hashCode();
        }
        if (getCharge_code() != null) {
            _hashCode += getCharge_code().hashCode();
        }
        if (getHLR_code() != null) {
            _hashCode += getHLR_code().hashCode();
        }
        if (getCurrencyISO() != null) {
            _hashCode += getCurrencyISO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeriodicCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "chargeId"));
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "applyDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "spName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "tax1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "tax2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "tax3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proratedStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "proratedStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proratedEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "proratedEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "mandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_balance10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_balance10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "charge_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HLR_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HLR_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
