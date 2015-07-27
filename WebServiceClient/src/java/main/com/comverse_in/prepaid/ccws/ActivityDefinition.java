/**
 * ActivityDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ActivityDefinition  implements java.io.Serializable {
    private String applicationName;

    private String subtypeName;

    private String unitTypeName;

    public ActivityDefinition() {
    }

    public ActivityDefinition(
           String applicationName,
           String subtypeName,
           String unitTypeName) {
           this.applicationName = applicationName;
           this.subtypeName = subtypeName;
           this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the applicationName value for this ActivityDefinition.
     * 
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this ActivityDefinition.
     * 
     * @param applicationName
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the subtypeName value for this ActivityDefinition.
     * 
     * @return subtypeName
     */
    public String getSubtypeName() {
        return subtypeName;
    }


    /**
     * Sets the subtypeName value for this ActivityDefinition.
     * 
     * @param subtypeName
     */
    public void setSubtypeName(String subtypeName) {
        this.subtypeName = subtypeName;
    }


    /**
     * Gets the unitTypeName value for this ActivityDefinition.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this ActivityDefinition.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ActivityDefinition)) return false;
        ActivityDefinition other = (ActivityDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.subtypeName==null && other.getSubtypeName()==null) || 
             (this.subtypeName!=null &&
              this.subtypeName.equals(other.getSubtypeName()))) &&
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
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getSubtypeName() != null) {
            _hashCode += getSubtypeName().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "applicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subtypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
