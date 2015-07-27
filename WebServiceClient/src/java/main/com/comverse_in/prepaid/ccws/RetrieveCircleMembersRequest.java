/**
 * RetrieveCircleMembersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class RetrieveCircleMembersRequest  implements java.io.Serializable {
    private String circle;

    private String startFromSubscriber;

    private Integer chunkSize;

    public RetrieveCircleMembersRequest() {
    }

    public RetrieveCircleMembersRequest(
           String circle,
           String startFromSubscriber,
           Integer chunkSize) {
           this.circle = circle;
           this.startFromSubscriber = startFromSubscriber;
           this.chunkSize = chunkSize;
    }


    /**
     * Gets the circle value for this RetrieveCircleMembersRequest.
     * 
     * @return circle
     */
    public String getCircle() {
        return circle;
    }


    /**
     * Sets the circle value for this RetrieveCircleMembersRequest.
     * 
     * @param circle
     */
    public void setCircle(String circle) {
        this.circle = circle;
    }


    /**
     * Gets the startFromSubscriber value for this RetrieveCircleMembersRequest.
     * 
     * @return startFromSubscriber
     */
    public String getStartFromSubscriber() {
        return startFromSubscriber;
    }


    /**
     * Sets the startFromSubscriber value for this RetrieveCircleMembersRequest.
     * 
     * @param startFromSubscriber
     */
    public void setStartFromSubscriber(String startFromSubscriber) {
        this.startFromSubscriber = startFromSubscriber;
    }


    /**
     * Gets the chunkSize value for this RetrieveCircleMembersRequest.
     * 
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }


    /**
     * Sets the chunkSize value for this RetrieveCircleMembersRequest.
     * 
     * @param chunkSize
     */
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RetrieveCircleMembersRequest)) return false;
        RetrieveCircleMembersRequest other = (RetrieveCircleMembersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.circle==null && other.getCircle()==null) || 
             (this.circle!=null &&
              this.circle.equals(other.getCircle()))) &&
            ((this.startFromSubscriber==null && other.getStartFromSubscriber()==null) || 
             (this.startFromSubscriber!=null &&
              this.startFromSubscriber.equals(other.getStartFromSubscriber()))) &&
            ((this.chunkSize==null && other.getChunkSize()==null) || 
             (this.chunkSize!=null &&
              this.chunkSize.equals(other.getChunkSize())));
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
        if (getCircle() != null) {
            _hashCode += getCircle().hashCode();
        }
        if (getStartFromSubscriber() != null) {
            _hashCode += getStartFromSubscriber().hashCode();
        }
        if (getChunkSize() != null) {
            _hashCode += getChunkSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveCircleMembersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCircleMembersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startFromSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startFromSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chunkSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "chunkSize"));
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
