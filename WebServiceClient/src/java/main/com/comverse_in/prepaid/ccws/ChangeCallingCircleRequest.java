/**
 * ChangeCallingCircleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ChangeCallingCircleRequest  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.CallingCircle callingCircle;

    private com.comverse_in.prepaid.ccws.CallingCircleOperation callingCircleOperation;

    public ChangeCallingCircleRequest() {
    }

    public ChangeCallingCircleRequest(
           com.comverse_in.prepaid.ccws.CallingCircle callingCircle,
           com.comverse_in.prepaid.ccws.CallingCircleOperation callingCircleOperation) {
           this.callingCircle = callingCircle;
           this.callingCircleOperation = callingCircleOperation;
    }


    /**
     * Gets the callingCircle value for this ChangeCallingCircleRequest.
     * 
     * @return callingCircle
     */
    public com.comverse_in.prepaid.ccws.CallingCircle getCallingCircle() {
        return callingCircle;
    }


    /**
     * Sets the callingCircle value for this ChangeCallingCircleRequest.
     * 
     * @param callingCircle
     */
    public void setCallingCircle(com.comverse_in.prepaid.ccws.CallingCircle callingCircle) {
        this.callingCircle = callingCircle;
    }


    /**
     * Gets the callingCircleOperation value for this ChangeCallingCircleRequest.
     * 
     * @return callingCircleOperation
     */
    public com.comverse_in.prepaid.ccws.CallingCircleOperation getCallingCircleOperation() {
        return callingCircleOperation;
    }


    /**
     * Sets the callingCircleOperation value for this ChangeCallingCircleRequest.
     * 
     * @param callingCircleOperation
     */
    public void setCallingCircleOperation(com.comverse_in.prepaid.ccws.CallingCircleOperation callingCircleOperation) {
        this.callingCircleOperation = callingCircleOperation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeCallingCircleRequest)) return false;
        ChangeCallingCircleRequest other = (ChangeCallingCircleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callingCircle==null && other.getCallingCircle()==null) || 
             (this.callingCircle!=null &&
              this.callingCircle.equals(other.getCallingCircle()))) &&
            ((this.callingCircleOperation==null && other.getCallingCircleOperation()==null) || 
             (this.callingCircleOperation!=null &&
              this.callingCircleOperation.equals(other.getCallingCircleOperation())));
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
        if (getCallingCircle() != null) {
            _hashCode += getCallingCircle().hashCode();
        }
        if (getCallingCircleOperation() != null) {
            _hashCode += getCallingCircleOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCallingCircleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCircle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "callingCircle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCircleOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "callingCircleOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircleOperation"));
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
