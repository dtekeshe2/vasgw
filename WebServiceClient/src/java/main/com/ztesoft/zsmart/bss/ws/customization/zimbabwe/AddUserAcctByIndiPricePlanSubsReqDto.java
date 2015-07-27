/**
 * AddUserAcctByIndiPricePlanSubsReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class AddUserAcctByIndiPricePlanSubsReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String pricePlanID;

    private String bundleType;

    private java.util.Date effDate;

    private java.util.Date expDate;

    public AddUserAcctByIndiPricePlanSubsReqDto() {
    }

    public AddUserAcctByIndiPricePlanSubsReqDto(
           String MSISDN,
           String pricePlanID,
           String bundleType,
           java.util.Date effDate,
           java.util.Date expDate) {
           this.MSISDN = MSISDN;
           this.pricePlanID = pricePlanID;
           this.bundleType = bundleType;
           this.effDate = effDate;
           this.expDate = expDate;
    }


    /**
     * Gets the MSISDN value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the pricePlanID value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @return pricePlanID
     */
    public String getPricePlanID() {
        return pricePlanID;
    }


    /**
     * Sets the pricePlanID value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @param pricePlanID
     */
    public void setPricePlanID(String pricePlanID) {
        this.pricePlanID = pricePlanID;
    }


    /**
     * Gets the bundleType value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @return bundleType
     */
    public String getBundleType() {
        return bundleType;
    }


    /**
     * Sets the bundleType value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @param bundleType
     */
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }


    /**
     * Gets the effDate value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @return effDate
     */
    public java.util.Date getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @param effDate
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @return expDate
     */
    public java.util.Date getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this AddUserAcctByIndiPricePlanSubsReqDto.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddUserAcctByIndiPricePlanSubsReqDto)) return false;
        AddUserAcctByIndiPricePlanSubsReqDto other = (AddUserAcctByIndiPricePlanSubsReqDto) obj;
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
            ((this.pricePlanID==null && other.getPricePlanID()==null) || 
             (this.pricePlanID!=null &&
              this.pricePlanID.equals(other.getPricePlanID()))) &&
            ((this.bundleType==null && other.getBundleType()==null) || 
             (this.bundleType!=null &&
              this.bundleType.equals(other.getBundleType()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate())));
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
        if (getPricePlanID() != null) {
            _hashCode += getPricePlanID().hashCode();
        }
        if (getBundleType() != null) {
            _hashCode += getBundleType().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddUserAcctByIndiPricePlanSubsReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanSubsReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BundleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "EffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
