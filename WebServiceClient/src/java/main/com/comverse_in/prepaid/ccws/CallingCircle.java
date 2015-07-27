/**
 * CallingCircle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CallingCircle  implements java.io.Serializable {
    private String circleName;

    private String callingCircleGroup;

    private String serviceProvider;

    private String maximumSize;

    private String barredNumberList;

    public CallingCircle() {
    }

    public CallingCircle(
           String circleName,
           String callingCircleGroup,
           String serviceProvider,
           String maximumSize,
           String barredNumberList) {
           this.circleName = circleName;
           this.callingCircleGroup = callingCircleGroup;
           this.serviceProvider = serviceProvider;
           this.maximumSize = maximumSize;
           this.barredNumberList = barredNumberList;
    }


    /**
     * Gets the circleName value for this CallingCircle.
     * 
     * @return circleName
     */
    public String getCircleName() {
        return circleName;
    }


    /**
     * Sets the circleName value for this CallingCircle.
     * 
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }


    /**
     * Gets the callingCircleGroup value for this CallingCircle.
     * 
     * @return callingCircleGroup
     */
    public String getCallingCircleGroup() {
        return callingCircleGroup;
    }


    /**
     * Sets the callingCircleGroup value for this CallingCircle.
     * 
     * @param callingCircleGroup
     */
    public void setCallingCircleGroup(String callingCircleGroup) {
        this.callingCircleGroup = callingCircleGroup;
    }


    /**
     * Gets the serviceProvider value for this CallingCircle.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this CallingCircle.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the maximumSize value for this CallingCircle.
     * 
     * @return maximumSize
     */
    public String getMaximumSize() {
        return maximumSize;
    }


    /**
     * Sets the maximumSize value for this CallingCircle.
     * 
     * @param maximumSize
     */
    public void setMaximumSize(String maximumSize) {
        this.maximumSize = maximumSize;
    }


    /**
     * Gets the barredNumberList value for this CallingCircle.
     * 
     * @return barredNumberList
     */
    public String getBarredNumberList() {
        return barredNumberList;
    }


    /**
     * Sets the barredNumberList value for this CallingCircle.
     * 
     * @param barredNumberList
     */
    public void setBarredNumberList(String barredNumberList) {
        this.barredNumberList = barredNumberList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CallingCircle)) return false;
        CallingCircle other = (CallingCircle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.circleName==null && other.getCircleName()==null) || 
             (this.circleName!=null &&
              this.circleName.equals(other.getCircleName()))) &&
            ((this.callingCircleGroup==null && other.getCallingCircleGroup()==null) || 
             (this.callingCircleGroup!=null &&
              this.callingCircleGroup.equals(other.getCallingCircleGroup()))) &&
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider()))) &&
            ((this.maximumSize==null && other.getMaximumSize()==null) || 
             (this.maximumSize!=null &&
              this.maximumSize.equals(other.getMaximumSize()))) &&
            ((this.barredNumberList==null && other.getBarredNumberList()==null) || 
             (this.barredNumberList!=null &&
              this.barredNumberList.equals(other.getBarredNumberList())));
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
        if (getCircleName() != null) {
            _hashCode += getCircleName().hashCode();
        }
        if (getCallingCircleGroup() != null) {
            _hashCode += getCallingCircleGroup().hashCode();
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        if (getMaximumSize() != null) {
            _hashCode += getMaximumSize().hashCode();
        }
        if (getBarredNumberList() != null) {
            _hashCode += getBarredNumberList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallingCircle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCircleGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "callingCircleGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "serviceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "maximumSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barredNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "barredNumberList"));
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
