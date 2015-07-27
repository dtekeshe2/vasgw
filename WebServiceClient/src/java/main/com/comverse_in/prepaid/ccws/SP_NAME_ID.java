/**
 * SP_NAME_ID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SP_NAME_ID  implements java.io.Serializable {
    private Long mID;

    private String mName;

    public SP_NAME_ID() {
    }

    public SP_NAME_ID(
           Long mID,
           String mName) {
           this.mID = mID;
           this.mName = mName;
    }


    /**
     * Gets the mID value for this SP_NAME_ID.
     * 
     * @return mID
     */
    public Long getMID() {
        return mID;
    }


    /**
     * Sets the mID value for this SP_NAME_ID.
     * 
     * @param mID
     */
    public void setMID(Long mID) {
        this.mID = mID;
    }


    /**
     * Gets the mName value for this SP_NAME_ID.
     * 
     * @return mName
     */
    public String getMName() {
        return mName;
    }


    /**
     * Sets the mName value for this SP_NAME_ID.
     * 
     * @param mName
     */
    public void setMName(String mName) {
        this.mName = mName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SP_NAME_ID)) return false;
        SP_NAME_ID other = (SP_NAME_ID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mID==null && other.getMID()==null) || 
             (this.mID!=null &&
              this.mID.equals(other.getMID()))) &&
            ((this.mName==null && other.getMName()==null) || 
             (this.mName!=null &&
              this.mName.equals(other.getMName())));
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
        if (getMID() != null) {
            _hashCode += getMID().hashCode();
        }
        if (getMName() != null) {
            _hashCode += getMName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SP_NAME_ID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "mID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "mName"));
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
