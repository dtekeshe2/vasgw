/**
 * Accumulator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class Accumulator  implements java.io.Serializable {
    private String accumulatorName;

    private Long resetPoint;

    private Long period;

    private Long count_type;

    private Long accumulator_type;

    private String unitTypeName;

    public Accumulator() {
    }

    public Accumulator(
           String accumulatorName,
           Long resetPoint,
           Long period,
           Long count_type,
           Long accumulator_type,
           String unitTypeName) {
           this.accumulatorName = accumulatorName;
           this.resetPoint = resetPoint;
           this.period = period;
           this.count_type = count_type;
           this.accumulator_type = accumulator_type;
           this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the accumulatorName value for this Accumulator.
     * 
     * @return accumulatorName
     */
    public String getAccumulatorName() {
        return accumulatorName;
    }


    /**
     * Sets the accumulatorName value for this Accumulator.
     * 
     * @param accumulatorName
     */
    public void setAccumulatorName(String accumulatorName) {
        this.accumulatorName = accumulatorName;
    }


    /**
     * Gets the resetPoint value for this Accumulator.
     * 
     * @return resetPoint
     */
    public Long getResetPoint() {
        return resetPoint;
    }


    /**
     * Sets the resetPoint value for this Accumulator.
     * 
     * @param resetPoint
     */
    public void setResetPoint(Long resetPoint) {
        this.resetPoint = resetPoint;
    }


    /**
     * Gets the period value for this Accumulator.
     * 
     * @return period
     */
    public Long getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this Accumulator.
     * 
     * @param period
     */
    public void setPeriod(Long period) {
        this.period = period;
    }


    /**
     * Gets the count_type value for this Accumulator.
     * 
     * @return count_type
     */
    public Long getCount_type() {
        return count_type;
    }


    /**
     * Sets the count_type value for this Accumulator.
     * 
     * @param count_type
     */
    public void setCount_type(Long count_type) {
        this.count_type = count_type;
    }


    /**
     * Gets the accumulator_type value for this Accumulator.
     * 
     * @return accumulator_type
     */
    public Long getAccumulator_type() {
        return accumulator_type;
    }


    /**
     * Sets the accumulator_type value for this Accumulator.
     * 
     * @param accumulator_type
     */
    public void setAccumulator_type(Long accumulator_type) {
        this.accumulator_type = accumulator_type;
    }


    /**
     * Gets the unitTypeName value for this Accumulator.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this Accumulator.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Accumulator)) return false;
        Accumulator other = (Accumulator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accumulatorName==null && other.getAccumulatorName()==null) || 
             (this.accumulatorName!=null &&
              this.accumulatorName.equals(other.getAccumulatorName()))) &&
            ((this.resetPoint==null && other.getResetPoint()==null) || 
             (this.resetPoint!=null &&
              this.resetPoint.equals(other.getResetPoint()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.count_type==null && other.getCount_type()==null) || 
             (this.count_type!=null &&
              this.count_type.equals(other.getCount_type()))) &&
            ((this.accumulator_type==null && other.getAccumulator_type()==null) || 
             (this.accumulator_type!=null &&
              this.accumulator_type.equals(other.getAccumulator_type()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName())));
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
        if (getAccumulatorName() != null) {
            _hashCode += getAccumulatorName().hashCode();
        }
        if (getResetPoint() != null) {
            _hashCode += getResetPoint().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getCount_type() != null) {
            _hashCode += getCount_type().hashCode();
        }
        if (getAccumulator_type() != null) {
            _hashCode += getAccumulator_type().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Accumulator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "resetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "count_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulator_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulator_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "unitTypeName"));
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
