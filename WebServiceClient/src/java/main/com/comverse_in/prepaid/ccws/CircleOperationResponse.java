/**
 * CircleOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CircleOperationResponse  implements java.io.Serializable {
    private Long returnCode;

    private com.comverse_in.prepaid.ccws.SubscriberBasic subscriber;

    private com.comverse_in.prepaid.ccws.CircleOperation circleOperation;

    private String circleName;

    public CircleOperationResponse() {
    }

    public CircleOperationResponse(
           Long returnCode,
           com.comverse_in.prepaid.ccws.SubscriberBasic subscriber,
           com.comverse_in.prepaid.ccws.CircleOperation circleOperation,
           String circleName) {
           this.returnCode = returnCode;
           this.subscriber = subscriber;
           this.circleOperation = circleOperation;
           this.circleName = circleName;
    }


    /**
     * Gets the returnCode value for this CircleOperationResponse.
     * 
     * @return returnCode
     */
    public Long getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this CircleOperationResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(Long returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the subscriber value for this CircleOperationResponse.
     * 
     * @return subscriber
     */
    public com.comverse_in.prepaid.ccws.SubscriberBasic getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CircleOperationResponse.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.comverse_in.prepaid.ccws.SubscriberBasic subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the circleOperation value for this CircleOperationResponse.
     * 
     * @return circleOperation
     */
    public com.comverse_in.prepaid.ccws.CircleOperation getCircleOperation() {
        return circleOperation;
    }


    /**
     * Sets the circleOperation value for this CircleOperationResponse.
     * 
     * @param circleOperation
     */
    public void setCircleOperation(com.comverse_in.prepaid.ccws.CircleOperation circleOperation) {
        this.circleOperation = circleOperation;
    }


    /**
     * Gets the circleName value for this CircleOperationResponse.
     * 
     * @return circleName
     */
    public String getCircleName() {
        return circleName;
    }


    /**
     * Sets the circleName value for this CircleOperationResponse.
     * 
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CircleOperationResponse)) return false;
        CircleOperationResponse other = (CircleOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.circleOperation==null && other.getCircleOperation()==null) || 
             (this.circleOperation!=null &&
              this.circleOperation.equals(other.getCircleOperation()))) &&
            ((this.circleName==null && other.getCircleName()==null) || 
             (this.circleName!=null &&
              this.circleName.equals(other.getCircleName())));
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
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getCircleOperation() != null) {
            _hashCode += getCircleOperation().hashCode();
        }
        if (getCircleName() != null) {
            _hashCode += getCircleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CircleOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBasic"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleName"));
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
