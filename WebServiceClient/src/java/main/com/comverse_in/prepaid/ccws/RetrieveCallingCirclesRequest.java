/**
 * RetrieveCallingCirclesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class RetrieveCallingCirclesRequest  implements java.io.Serializable {
    private String pattern;

    private String startFromCircle;

    private Integer chunkSize;

    public RetrieveCallingCirclesRequest() {
    }

    public RetrieveCallingCirclesRequest(
           String pattern,
           String startFromCircle,
           Integer chunkSize) {
           this.pattern = pattern;
           this.startFromCircle = startFromCircle;
           this.chunkSize = chunkSize;
    }


    /**
     * Gets the pattern value for this RetrieveCallingCirclesRequest.
     * 
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this RetrieveCallingCirclesRequest.
     * 
     * @param pattern
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the startFromCircle value for this RetrieveCallingCirclesRequest.
     * 
     * @return startFromCircle
     */
    public String getStartFromCircle() {
        return startFromCircle;
    }


    /**
     * Sets the startFromCircle value for this RetrieveCallingCirclesRequest.
     * 
     * @param startFromCircle
     */
    public void setStartFromCircle(String startFromCircle) {
        this.startFromCircle = startFromCircle;
    }


    /**
     * Gets the chunkSize value for this RetrieveCallingCirclesRequest.
     * 
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }


    /**
     * Sets the chunkSize value for this RetrieveCallingCirclesRequest.
     * 
     * @param chunkSize
     */
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RetrieveCallingCirclesRequest)) return false;
        RetrieveCallingCirclesRequest other = (RetrieveCallingCirclesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            ((this.startFromCircle==null && other.getStartFromCircle()==null) || 
             (this.startFromCircle!=null &&
              this.startFromCircle.equals(other.getStartFromCircle()))) &&
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
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        if (getStartFromCircle() != null) {
            _hashCode += getStartFromCircle().hashCode();
        }
        if (getChunkSize() != null) {
            _hashCode += getChunkSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveCallingCirclesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startFromCircle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startFromCircle"));
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
