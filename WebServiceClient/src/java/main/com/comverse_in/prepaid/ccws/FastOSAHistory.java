/**
 * FastOSAHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class FastOSAHistory  extends com.comverse_in.prepaid.ccws.OSAHistory  implements java.io.Serializable {
    private Double newBalance1;

    private Double newBalance2;

    private Double newBalance3;

    private Double newBalance4;

    private Double newBalance5;

    private Double newBalance6;

    private Double newBalance7;

    private Double newBalance8;

    private Double newBalance9;

    private Double newBalance10;

    private Double changeAmount1;

    private Double changeAmount2;

    private Double changeAmount3;

    private Double changeAmount4;

    private Double changeAmount5;

    private Double changeAmount6;

    private Double changeAmount7;

    private Double changeAmount8;

    private Double changeAmount9;

    private Double changeAmount10;

    public FastOSAHistory() {
    }

    public FastOSAHistory(
           String SPName,
           String subscriberID,
           String chargecode,
           java.util.Calendar startCallDateTime,
           java.util.Calendar endCallDateTime,
           String activityType,
           Long usageAmount,
           String description,
           String reason,
           String applicationName,
           String subTypeName,
           String SLUID,
           String unitTypeName,
           String merchantName,
           String sessionDescription,
           Long correlationID,
           Long correlationType,
           Long accountID,
           String applicationDescription,
           String OSAItem,
           String OSASubType,
           String QOS,
           String serviceCatalog1,
           String serviceCatalog2,
           String serviceCatalog3,
           String serviceCatalog4,
           String paramConfirmID,
           String paramContract,
           String locationA,
           Long locationAType,
           String locationB,
           Long locationBType,
           String IMSI,
           String infoParameter,
           String currency,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           java.util.Calendar ORPDate,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String groupID,
           String isoCode,
           String previousISOCode,
           Double conversionRate,
           Double newBalance1,
           Double newBalance2,
           Double newBalance3,
           Double newBalance4,
           Double newBalance5,
           Double newBalance6,
           Double newBalance7,
           Double newBalance8,
           Double newBalance9,
           Double newBalance10,
           Double changeAmount1,
           Double changeAmount2,
           Double changeAmount3,
           Double changeAmount4,
           Double changeAmount5,
           Double changeAmount6,
           Double changeAmount7,
           Double changeAmount8,
           Double changeAmount9,
           Double changeAmount10) {
        super(
            SPName,
            subscriberID,
            chargecode,
            startCallDateTime,
            endCallDateTime,
            activityType,
            usageAmount,
            description,
            reason,
            applicationName,
            subTypeName,
            SLUID,
            unitTypeName,
            merchantName,
            sessionDescription,
            correlationID,
            correlationType,
            accountID,
            applicationDescription,
            OSAItem,
            OSASubType,
            QOS,
            serviceCatalog1,
            serviceCatalog2,
            serviceCatalog3,
            serviceCatalog4,
            paramConfirmID,
            paramContract,
            locationA,
            locationAType,
            locationB,
            locationBType,
            IMSI,
            infoParameter,
            currency,
            balances,
            identity,
            accountType,
            ORPDate,
            fundUsageType,
            groupID,
            isoCode,
            previousISOCode,
            conversionRate);
        this.newBalance1 = newBalance1;
        this.newBalance2 = newBalance2;
        this.newBalance3 = newBalance3;
        this.newBalance4 = newBalance4;
        this.newBalance5 = newBalance5;
        this.newBalance6 = newBalance6;
        this.newBalance7 = newBalance7;
        this.newBalance8 = newBalance8;
        this.newBalance9 = newBalance9;
        this.newBalance10 = newBalance10;
        this.changeAmount1 = changeAmount1;
        this.changeAmount2 = changeAmount2;
        this.changeAmount3 = changeAmount3;
        this.changeAmount4 = changeAmount4;
        this.changeAmount5 = changeAmount5;
        this.changeAmount6 = changeAmount6;
        this.changeAmount7 = changeAmount7;
        this.changeAmount8 = changeAmount8;
        this.changeAmount9 = changeAmount9;
        this.changeAmount10 = changeAmount10;
    }


    /**
     * Gets the newBalance1 value for this FastOSAHistory.
     * 
     * @return newBalance1
     */
    public Double getNewBalance1() {
        return newBalance1;
    }


    /**
     * Sets the newBalance1 value for this FastOSAHistory.
     * 
     * @param newBalance1
     */
    public void setNewBalance1(Double newBalance1) {
        this.newBalance1 = newBalance1;
    }


    /**
     * Gets the newBalance2 value for this FastOSAHistory.
     * 
     * @return newBalance2
     */
    public Double getNewBalance2() {
        return newBalance2;
    }


    /**
     * Sets the newBalance2 value for this FastOSAHistory.
     * 
     * @param newBalance2
     */
    public void setNewBalance2(Double newBalance2) {
        this.newBalance2 = newBalance2;
    }


    /**
     * Gets the newBalance3 value for this FastOSAHistory.
     * 
     * @return newBalance3
     */
    public Double getNewBalance3() {
        return newBalance3;
    }


    /**
     * Sets the newBalance3 value for this FastOSAHistory.
     * 
     * @param newBalance3
     */
    public void setNewBalance3(Double newBalance3) {
        this.newBalance3 = newBalance3;
    }


    /**
     * Gets the newBalance4 value for this FastOSAHistory.
     * 
     * @return newBalance4
     */
    public Double getNewBalance4() {
        return newBalance4;
    }


    /**
     * Sets the newBalance4 value for this FastOSAHistory.
     * 
     * @param newBalance4
     */
    public void setNewBalance4(Double newBalance4) {
        this.newBalance4 = newBalance4;
    }


    /**
     * Gets the newBalance5 value for this FastOSAHistory.
     * 
     * @return newBalance5
     */
    public Double getNewBalance5() {
        return newBalance5;
    }


    /**
     * Sets the newBalance5 value for this FastOSAHistory.
     * 
     * @param newBalance5
     */
    public void setNewBalance5(Double newBalance5) {
        this.newBalance5 = newBalance5;
    }


    /**
     * Gets the newBalance6 value for this FastOSAHistory.
     * 
     * @return newBalance6
     */
    public Double getNewBalance6() {
        return newBalance6;
    }


    /**
     * Sets the newBalance6 value for this FastOSAHistory.
     * 
     * @param newBalance6
     */
    public void setNewBalance6(Double newBalance6) {
        this.newBalance6 = newBalance6;
    }


    /**
     * Gets the newBalance7 value for this FastOSAHistory.
     * 
     * @return newBalance7
     */
    public Double getNewBalance7() {
        return newBalance7;
    }


    /**
     * Sets the newBalance7 value for this FastOSAHistory.
     * 
     * @param newBalance7
     */
    public void setNewBalance7(Double newBalance7) {
        this.newBalance7 = newBalance7;
    }


    /**
     * Gets the newBalance8 value for this FastOSAHistory.
     * 
     * @return newBalance8
     */
    public Double getNewBalance8() {
        return newBalance8;
    }


    /**
     * Sets the newBalance8 value for this FastOSAHistory.
     * 
     * @param newBalance8
     */
    public void setNewBalance8(Double newBalance8) {
        this.newBalance8 = newBalance8;
    }


    /**
     * Gets the newBalance9 value for this FastOSAHistory.
     * 
     * @return newBalance9
     */
    public Double getNewBalance9() {
        return newBalance9;
    }


    /**
     * Sets the newBalance9 value for this FastOSAHistory.
     * 
     * @param newBalance9
     */
    public void setNewBalance9(Double newBalance9) {
        this.newBalance9 = newBalance9;
    }


    /**
     * Gets the newBalance10 value for this FastOSAHistory.
     * 
     * @return newBalance10
     */
    public Double getNewBalance10() {
        return newBalance10;
    }


    /**
     * Sets the newBalance10 value for this FastOSAHistory.
     * 
     * @param newBalance10
     */
    public void setNewBalance10(Double newBalance10) {
        this.newBalance10 = newBalance10;
    }


    /**
     * Gets the changeAmount1 value for this FastOSAHistory.
     * 
     * @return changeAmount1
     */
    public Double getChangeAmount1() {
        return changeAmount1;
    }


    /**
     * Sets the changeAmount1 value for this FastOSAHistory.
     * 
     * @param changeAmount1
     */
    public void setChangeAmount1(Double changeAmount1) {
        this.changeAmount1 = changeAmount1;
    }


    /**
     * Gets the changeAmount2 value for this FastOSAHistory.
     * 
     * @return changeAmount2
     */
    public Double getChangeAmount2() {
        return changeAmount2;
    }


    /**
     * Sets the changeAmount2 value for this FastOSAHistory.
     * 
     * @param changeAmount2
     */
    public void setChangeAmount2(Double changeAmount2) {
        this.changeAmount2 = changeAmount2;
    }


    /**
     * Gets the changeAmount3 value for this FastOSAHistory.
     * 
     * @return changeAmount3
     */
    public Double getChangeAmount3() {
        return changeAmount3;
    }


    /**
     * Sets the changeAmount3 value for this FastOSAHistory.
     * 
     * @param changeAmount3
     */
    public void setChangeAmount3(Double changeAmount3) {
        this.changeAmount3 = changeAmount3;
    }


    /**
     * Gets the changeAmount4 value for this FastOSAHistory.
     * 
     * @return changeAmount4
     */
    public Double getChangeAmount4() {
        return changeAmount4;
    }


    /**
     * Sets the changeAmount4 value for this FastOSAHistory.
     * 
     * @param changeAmount4
     */
    public void setChangeAmount4(Double changeAmount4) {
        this.changeAmount4 = changeAmount4;
    }


    /**
     * Gets the changeAmount5 value for this FastOSAHistory.
     * 
     * @return changeAmount5
     */
    public Double getChangeAmount5() {
        return changeAmount5;
    }


    /**
     * Sets the changeAmount5 value for this FastOSAHistory.
     * 
     * @param changeAmount5
     */
    public void setChangeAmount5(Double changeAmount5) {
        this.changeAmount5 = changeAmount5;
    }


    /**
     * Gets the changeAmount6 value for this FastOSAHistory.
     * 
     * @return changeAmount6
     */
    public Double getChangeAmount6() {
        return changeAmount6;
    }


    /**
     * Sets the changeAmount6 value for this FastOSAHistory.
     * 
     * @param changeAmount6
     */
    public void setChangeAmount6(Double changeAmount6) {
        this.changeAmount6 = changeAmount6;
    }


    /**
     * Gets the changeAmount7 value for this FastOSAHistory.
     * 
     * @return changeAmount7
     */
    public Double getChangeAmount7() {
        return changeAmount7;
    }


    /**
     * Sets the changeAmount7 value for this FastOSAHistory.
     * 
     * @param changeAmount7
     */
    public void setChangeAmount7(Double changeAmount7) {
        this.changeAmount7 = changeAmount7;
    }


    /**
     * Gets the changeAmount8 value for this FastOSAHistory.
     * 
     * @return changeAmount8
     */
    public Double getChangeAmount8() {
        return changeAmount8;
    }


    /**
     * Sets the changeAmount8 value for this FastOSAHistory.
     * 
     * @param changeAmount8
     */
    public void setChangeAmount8(Double changeAmount8) {
        this.changeAmount8 = changeAmount8;
    }


    /**
     * Gets the changeAmount9 value for this FastOSAHistory.
     * 
     * @return changeAmount9
     */
    public Double getChangeAmount9() {
        return changeAmount9;
    }


    /**
     * Sets the changeAmount9 value for this FastOSAHistory.
     * 
     * @param changeAmount9
     */
    public void setChangeAmount9(Double changeAmount9) {
        this.changeAmount9 = changeAmount9;
    }


    /**
     * Gets the changeAmount10 value for this FastOSAHistory.
     * 
     * @return changeAmount10
     */
    public Double getChangeAmount10() {
        return changeAmount10;
    }


    /**
     * Sets the changeAmount10 value for this FastOSAHistory.
     * 
     * @param changeAmount10
     */
    public void setChangeAmount10(Double changeAmount10) {
        this.changeAmount10 = changeAmount10;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FastOSAHistory)) return false;
        FastOSAHistory other = (FastOSAHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newBalance1==null && other.getNewBalance1()==null) || 
             (this.newBalance1!=null &&
              this.newBalance1.equals(other.getNewBalance1()))) &&
            ((this.newBalance2==null && other.getNewBalance2()==null) || 
             (this.newBalance2!=null &&
              this.newBalance2.equals(other.getNewBalance2()))) &&
            ((this.newBalance3==null && other.getNewBalance3()==null) || 
             (this.newBalance3!=null &&
              this.newBalance3.equals(other.getNewBalance3()))) &&
            ((this.newBalance4==null && other.getNewBalance4()==null) || 
             (this.newBalance4!=null &&
              this.newBalance4.equals(other.getNewBalance4()))) &&
            ((this.newBalance5==null && other.getNewBalance5()==null) || 
             (this.newBalance5!=null &&
              this.newBalance5.equals(other.getNewBalance5()))) &&
            ((this.newBalance6==null && other.getNewBalance6()==null) || 
             (this.newBalance6!=null &&
              this.newBalance6.equals(other.getNewBalance6()))) &&
            ((this.newBalance7==null && other.getNewBalance7()==null) || 
             (this.newBalance7!=null &&
              this.newBalance7.equals(other.getNewBalance7()))) &&
            ((this.newBalance8==null && other.getNewBalance8()==null) || 
             (this.newBalance8!=null &&
              this.newBalance8.equals(other.getNewBalance8()))) &&
            ((this.newBalance9==null && other.getNewBalance9()==null) || 
             (this.newBalance9!=null &&
              this.newBalance9.equals(other.getNewBalance9()))) &&
            ((this.newBalance10==null && other.getNewBalance10()==null) || 
             (this.newBalance10!=null &&
              this.newBalance10.equals(other.getNewBalance10()))) &&
            ((this.changeAmount1==null && other.getChangeAmount1()==null) || 
             (this.changeAmount1!=null &&
              this.changeAmount1.equals(other.getChangeAmount1()))) &&
            ((this.changeAmount2==null && other.getChangeAmount2()==null) || 
             (this.changeAmount2!=null &&
              this.changeAmount2.equals(other.getChangeAmount2()))) &&
            ((this.changeAmount3==null && other.getChangeAmount3()==null) || 
             (this.changeAmount3!=null &&
              this.changeAmount3.equals(other.getChangeAmount3()))) &&
            ((this.changeAmount4==null && other.getChangeAmount4()==null) || 
             (this.changeAmount4!=null &&
              this.changeAmount4.equals(other.getChangeAmount4()))) &&
            ((this.changeAmount5==null && other.getChangeAmount5()==null) || 
             (this.changeAmount5!=null &&
              this.changeAmount5.equals(other.getChangeAmount5()))) &&
            ((this.changeAmount6==null && other.getChangeAmount6()==null) || 
             (this.changeAmount6!=null &&
              this.changeAmount6.equals(other.getChangeAmount6()))) &&
            ((this.changeAmount7==null && other.getChangeAmount7()==null) || 
             (this.changeAmount7!=null &&
              this.changeAmount7.equals(other.getChangeAmount7()))) &&
            ((this.changeAmount8==null && other.getChangeAmount8()==null) || 
             (this.changeAmount8!=null &&
              this.changeAmount8.equals(other.getChangeAmount8()))) &&
            ((this.changeAmount9==null && other.getChangeAmount9()==null) || 
             (this.changeAmount9!=null &&
              this.changeAmount9.equals(other.getChangeAmount9()))) &&
            ((this.changeAmount10==null && other.getChangeAmount10()==null) || 
             (this.changeAmount10!=null &&
              this.changeAmount10.equals(other.getChangeAmount10())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNewBalance1() != null) {
            _hashCode += getNewBalance1().hashCode();
        }
        if (getNewBalance2() != null) {
            _hashCode += getNewBalance2().hashCode();
        }
        if (getNewBalance3() != null) {
            _hashCode += getNewBalance3().hashCode();
        }
        if (getNewBalance4() != null) {
            _hashCode += getNewBalance4().hashCode();
        }
        if (getNewBalance5() != null) {
            _hashCode += getNewBalance5().hashCode();
        }
        if (getNewBalance6() != null) {
            _hashCode += getNewBalance6().hashCode();
        }
        if (getNewBalance7() != null) {
            _hashCode += getNewBalance7().hashCode();
        }
        if (getNewBalance8() != null) {
            _hashCode += getNewBalance8().hashCode();
        }
        if (getNewBalance9() != null) {
            _hashCode += getNewBalance9().hashCode();
        }
        if (getNewBalance10() != null) {
            _hashCode += getNewBalance10().hashCode();
        }
        if (getChangeAmount1() != null) {
            _hashCode += getChangeAmount1().hashCode();
        }
        if (getChangeAmount2() != null) {
            _hashCode += getChangeAmount2().hashCode();
        }
        if (getChangeAmount3() != null) {
            _hashCode += getChangeAmount3().hashCode();
        }
        if (getChangeAmount4() != null) {
            _hashCode += getChangeAmount4().hashCode();
        }
        if (getChangeAmount5() != null) {
            _hashCode += getChangeAmount5().hashCode();
        }
        if (getChangeAmount6() != null) {
            _hashCode += getChangeAmount6().hashCode();
        }
        if (getChangeAmount7() != null) {
            _hashCode += getChangeAmount7().hashCode();
        }
        if (getChangeAmount8() != null) {
            _hashCode += getChangeAmount8().hashCode();
        }
        if (getChangeAmount9() != null) {
            _hashCode += getChangeAmount9().hashCode();
        }
        if (getChangeAmount10() != null) {
            _hashCode += getChangeAmount10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FastOSAHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastOSAHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewBalance10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAmount10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAmount10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
