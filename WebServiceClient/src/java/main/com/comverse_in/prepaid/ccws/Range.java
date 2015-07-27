/**
 * Range.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class Range  implements java.io.Serializable {
    private String rangeStart;

    private String rangeEnd;

    private Integer rangeSDP;

    private Integer rangeID;

    public Range() {
    }

    public Range(
           String rangeStart,
           String rangeEnd,
           Integer rangeSDP,
           Integer rangeID) {
           this.rangeStart = rangeStart;
           this.rangeEnd = rangeEnd;
           this.rangeSDP = rangeSDP;
           this.rangeID = rangeID;
    }


    /**
     * Gets the rangeStart value for this Range.
     * 
     * @return rangeStart
     */
    public String getRangeStart() {
        return rangeStart;
    }


    /**
     * Sets the rangeStart value for this Range.
     * 
     * @param rangeStart
     */
    public void setRangeStart(String rangeStart) {
        this.rangeStart = rangeStart;
    }


    /**
     * Gets the rangeEnd value for this Range.
     * 
     * @return rangeEnd
     */
    public String getRangeEnd() {
        return rangeEnd;
    }


    /**
     * Sets the rangeEnd value for this Range.
     * 
     * @param rangeEnd
     */
    public void setRangeEnd(String rangeEnd) {
        this.rangeEnd = rangeEnd;
    }


    /**
     * Gets the rangeSDP value for this Range.
     * 
     * @return rangeSDP
     */
    public Integer getRangeSDP() {
        return rangeSDP;
    }


    /**
     * Sets the rangeSDP value for this Range.
     * 
     * @param rangeSDP
     */
    public void setRangeSDP(Integer rangeSDP) {
        this.rangeSDP = rangeSDP;
    }


    /**
     * Gets the rangeID value for this Range.
     * 
     * @return rangeID
     */
    public Integer getRangeID() {
        return rangeID;
    }


    /**
     * Sets the rangeID value for this Range.
     * 
     * @param rangeID
     */
    public void setRangeID(Integer rangeID) {
        this.rangeID = rangeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Range)) return false;
        Range other = (Range) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rangeStart==null && other.getRangeStart()==null) || 
             (this.rangeStart!=null &&
              this.rangeStart.equals(other.getRangeStart()))) &&
            ((this.rangeEnd==null && other.getRangeEnd()==null) || 
             (this.rangeEnd!=null &&
              this.rangeEnd.equals(other.getRangeEnd()))) &&
            ((this.rangeSDP==null && other.getRangeSDP()==null) || 
             (this.rangeSDP!=null &&
              this.rangeSDP.equals(other.getRangeSDP()))) &&
            ((this.rangeID==null && other.getRangeID()==null) || 
             (this.rangeID!=null &&
              this.rangeID.equals(other.getRangeID())));
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
        if (getRangeStart() != null) {
            _hashCode += getRangeStart().hashCode();
        }
        if (getRangeEnd() != null) {
            _hashCode += getRangeEnd().hashCode();
        }
        if (getRangeSDP() != null) {
            _hashCode += getRangeSDP().hashCode();
        }
        if (getRangeID() != null) {
            _hashCode += getRangeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Range.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeSDP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RangeSDP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RangeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
