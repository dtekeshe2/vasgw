/**
 * NonVersionCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class NonVersionCache  implements java.io.Serializable {
    private String[] chargeCode;

    private com.comverse_in.prepaid.ccws.Identity[] globalIdentities;

    private com.comverse_in.prepaid.ccws.ServiceParameter[] serviceParameters;

    private com.comverse_in.prepaid.ccws.Range[] rangeMap;

    private com.comverse_in.prepaid.ccws.ServiceParameter[] PPSParameters;

    private com.comverse_in.prepaid.ccws.CurrencyConversion[] currencyConversion;

    public NonVersionCache() {
    }

    public NonVersionCache(
           String[] chargeCode,
           com.comverse_in.prepaid.ccws.Identity[] globalIdentities,
           com.comverse_in.prepaid.ccws.ServiceParameter[] serviceParameters,
           com.comverse_in.prepaid.ccws.Range[] rangeMap,
           com.comverse_in.prepaid.ccws.ServiceParameter[] PPSParameters,
           com.comverse_in.prepaid.ccws.CurrencyConversion[] currencyConversion) {
           this.chargeCode = chargeCode;
           this.globalIdentities = globalIdentities;
           this.serviceParameters = serviceParameters;
           this.rangeMap = rangeMap;
           this.PPSParameters = PPSParameters;
           this.currencyConversion = currencyConversion;
    }


    /**
     * Gets the chargeCode value for this NonVersionCache.
     * 
     * @return chargeCode
     */
    public String[] getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this NonVersionCache.
     * 
     * @param chargeCode
     */
    public void setChargeCode(String[] chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the globalIdentities value for this NonVersionCache.
     * 
     * @return globalIdentities
     */
    public com.comverse_in.prepaid.ccws.Identity[] getGlobalIdentities() {
        return globalIdentities;
    }


    /**
     * Sets the globalIdentities value for this NonVersionCache.
     * 
     * @param globalIdentities
     */
    public void setGlobalIdentities(com.comverse_in.prepaid.ccws.Identity[] globalIdentities) {
        this.globalIdentities = globalIdentities;
    }


    /**
     * Gets the serviceParameters value for this NonVersionCache.
     * 
     * @return serviceParameters
     */
    public com.comverse_in.prepaid.ccws.ServiceParameter[] getServiceParameters() {
        return serviceParameters;
    }


    /**
     * Sets the serviceParameters value for this NonVersionCache.
     * 
     * @param serviceParameters
     */
    public void setServiceParameters(com.comverse_in.prepaid.ccws.ServiceParameter[] serviceParameters) {
        this.serviceParameters = serviceParameters;
    }


    /**
     * Gets the rangeMap value for this NonVersionCache.
     * 
     * @return rangeMap
     */
    public com.comverse_in.prepaid.ccws.Range[] getRangeMap() {
        return rangeMap;
    }


    /**
     * Sets the rangeMap value for this NonVersionCache.
     * 
     * @param rangeMap
     */
    public void setRangeMap(com.comverse_in.prepaid.ccws.Range[] rangeMap) {
        this.rangeMap = rangeMap;
    }


    /**
     * Gets the PPSParameters value for this NonVersionCache.
     * 
     * @return PPSParameters
     */
    public com.comverse_in.prepaid.ccws.ServiceParameter[] getPPSParameters() {
        return PPSParameters;
    }


    /**
     * Sets the PPSParameters value for this NonVersionCache.
     * 
     * @param PPSParameters
     */
    public void setPPSParameters(com.comverse_in.prepaid.ccws.ServiceParameter[] PPSParameters) {
        this.PPSParameters = PPSParameters;
    }


    /**
     * Gets the currencyConversion value for this NonVersionCache.
     * 
     * @return currencyConversion
     */
    public com.comverse_in.prepaid.ccws.CurrencyConversion[] getCurrencyConversion() {
        return currencyConversion;
    }


    /**
     * Sets the currencyConversion value for this NonVersionCache.
     * 
     * @param currencyConversion
     */
    public void setCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversion[] currencyConversion) {
        this.currencyConversion = currencyConversion;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NonVersionCache)) return false;
        NonVersionCache other = (NonVersionCache) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              java.util.Arrays.equals(this.chargeCode, other.getChargeCode()))) &&
            ((this.globalIdentities==null && other.getGlobalIdentities()==null) || 
             (this.globalIdentities!=null &&
              java.util.Arrays.equals(this.globalIdentities, other.getGlobalIdentities()))) &&
            ((this.serviceParameters==null && other.getServiceParameters()==null) || 
             (this.serviceParameters!=null &&
              java.util.Arrays.equals(this.serviceParameters, other.getServiceParameters()))) &&
            ((this.rangeMap==null && other.getRangeMap()==null) || 
             (this.rangeMap!=null &&
              java.util.Arrays.equals(this.rangeMap, other.getRangeMap()))) &&
            ((this.PPSParameters==null && other.getPPSParameters()==null) || 
             (this.PPSParameters!=null &&
              java.util.Arrays.equals(this.PPSParameters, other.getPPSParameters()))) &&
            ((this.currencyConversion==null && other.getCurrencyConversion()==null) || 
             (this.currencyConversion!=null &&
              java.util.Arrays.equals(this.currencyConversion, other.getCurrencyConversion())));
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
        if (getChargeCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeCode());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChargeCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalIdentities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalIdentities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGlobalIdentities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeMap());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRangeMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPPSParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPPSParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPPSParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyConversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyConversion());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCurrencyConversion(), i);
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
        new org.apache.axis.description.TypeDesc(NonVersionCache.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVersionCache"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalIdentities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GlobalIdentities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RangeMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPSParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PPSParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion"));
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
