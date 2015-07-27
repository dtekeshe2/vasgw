/**
 * CircleMemberOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CircleMemberOperation  implements java.io.Serializable {
    private String circleName;

    private com.comverse_in.prepaid.ccws.CircleMember circleMember;

    private com.comverse_in.prepaid.ccws.CircleOperation circleOperation;

    public CircleMemberOperation() {
    }

    public CircleMemberOperation(
           String circleName,
           com.comverse_in.prepaid.ccws.CircleMember circleMember,
           com.comverse_in.prepaid.ccws.CircleOperation circleOperation) {
           this.circleName = circleName;
           this.circleMember = circleMember;
           this.circleOperation = circleOperation;
    }


    /**
     * Gets the circleName value for this CircleMemberOperation.
     * 
     * @return circleName
     */
    public String getCircleName() {
        return circleName;
    }


    /**
     * Sets the circleName value for this CircleMemberOperation.
     * 
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }


    /**
     * Gets the circleMember value for this CircleMemberOperation.
     * 
     * @return circleMember
     */
    public com.comverse_in.prepaid.ccws.CircleMember getCircleMember() {
        return circleMember;
    }


    /**
     * Sets the circleMember value for this CircleMemberOperation.
     * 
     * @param circleMember
     */
    public void setCircleMember(com.comverse_in.prepaid.ccws.CircleMember circleMember) {
        this.circleMember = circleMember;
    }


    /**
     * Gets the circleOperation value for this CircleMemberOperation.
     * 
     * @return circleOperation
     */
    public com.comverse_in.prepaid.ccws.CircleOperation getCircleOperation() {
        return circleOperation;
    }


    /**
     * Sets the circleOperation value for this CircleMemberOperation.
     * 
     * @param circleOperation
     */
    public void setCircleOperation(com.comverse_in.prepaid.ccws.CircleOperation circleOperation) {
        this.circleOperation = circleOperation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CircleMemberOperation)) return false;
        CircleMemberOperation other = (CircleMemberOperation) obj;
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
            ((this.circleMember==null && other.getCircleMember()==null) || 
             (this.circleMember!=null &&
              this.circleMember.equals(other.getCircleMember()))) &&
            ((this.circleOperation==null && other.getCircleOperation()==null) || 
             (this.circleOperation!=null &&
              this.circleOperation.equals(other.getCircleOperation())));
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
        if (getCircleMember() != null) {
            _hashCode += getCircleMember().hashCode();
        }
        if (getCircleOperation() != null) {
            _hashCode += getCircleOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CircleMemberOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMemberOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperation"));
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
