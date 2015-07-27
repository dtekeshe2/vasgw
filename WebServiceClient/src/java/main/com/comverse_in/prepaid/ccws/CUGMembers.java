/**
 * CUGMembers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CUGMembers  implements java.io.Serializable {
    private String codeProp;

    private String CUGNameProp;

    private Integer VPNAccessProp;

    private String shortDialProp;

    private String superCUGCodeProp;

    private String superCUGNameProp;

    public CUGMembers() {
    }

    public CUGMembers(
           String codeProp,
           String CUGNameProp,
           Integer VPNAccessProp,
           String shortDialProp,
           String superCUGCodeProp,
           String superCUGNameProp) {
           this.codeProp = codeProp;
           this.CUGNameProp = CUGNameProp;
           this.VPNAccessProp = VPNAccessProp;
           this.shortDialProp = shortDialProp;
           this.superCUGCodeProp = superCUGCodeProp;
           this.superCUGNameProp = superCUGNameProp;
    }


    /**
     * Gets the codeProp value for this CUGMembers.
     * 
     * @return codeProp
     */
    public String getCodeProp() {
        return codeProp;
    }


    /**
     * Sets the codeProp value for this CUGMembers.
     * 
     * @param codeProp
     */
    public void setCodeProp(String codeProp) {
        this.codeProp = codeProp;
    }


    /**
     * Gets the CUGNameProp value for this CUGMembers.
     * 
     * @return CUGNameProp
     */
    public String getCUGNameProp() {
        return CUGNameProp;
    }


    /**
     * Sets the CUGNameProp value for this CUGMembers.
     * 
     * @param CUGNameProp
     */
    public void setCUGNameProp(String CUGNameProp) {
        this.CUGNameProp = CUGNameProp;
    }


    /**
     * Gets the VPNAccessProp value for this CUGMembers.
     * 
     * @return VPNAccessProp
     */
    public Integer getVPNAccessProp() {
        return VPNAccessProp;
    }


    /**
     * Sets the VPNAccessProp value for this CUGMembers.
     * 
     * @param VPNAccessProp
     */
    public void setVPNAccessProp(Integer VPNAccessProp) {
        this.VPNAccessProp = VPNAccessProp;
    }


    /**
     * Gets the shortDialProp value for this CUGMembers.
     * 
     * @return shortDialProp
     */
    public String getShortDialProp() {
        return shortDialProp;
    }


    /**
     * Sets the shortDialProp value for this CUGMembers.
     * 
     * @param shortDialProp
     */
    public void setShortDialProp(String shortDialProp) {
        this.shortDialProp = shortDialProp;
    }


    /**
     * Gets the superCUGCodeProp value for this CUGMembers.
     * 
     * @return superCUGCodeProp
     */
    public String getSuperCUGCodeProp() {
        return superCUGCodeProp;
    }


    /**
     * Sets the superCUGCodeProp value for this CUGMembers.
     * 
     * @param superCUGCodeProp
     */
    public void setSuperCUGCodeProp(String superCUGCodeProp) {
        this.superCUGCodeProp = superCUGCodeProp;
    }


    /**
     * Gets the superCUGNameProp value for this CUGMembers.
     * 
     * @return superCUGNameProp
     */
    public String getSuperCUGNameProp() {
        return superCUGNameProp;
    }


    /**
     * Sets the superCUGNameProp value for this CUGMembers.
     * 
     * @param superCUGNameProp
     */
    public void setSuperCUGNameProp(String superCUGNameProp) {
        this.superCUGNameProp = superCUGNameProp;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CUGMembers)) return false;
        CUGMembers other = (CUGMembers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeProp==null && other.getCodeProp()==null) || 
             (this.codeProp!=null &&
              this.codeProp.equals(other.getCodeProp()))) &&
            ((this.CUGNameProp==null && other.getCUGNameProp()==null) || 
             (this.CUGNameProp!=null &&
              this.CUGNameProp.equals(other.getCUGNameProp()))) &&
            ((this.VPNAccessProp==null && other.getVPNAccessProp()==null) || 
             (this.VPNAccessProp!=null &&
              this.VPNAccessProp.equals(other.getVPNAccessProp()))) &&
            ((this.shortDialProp==null && other.getShortDialProp()==null) || 
             (this.shortDialProp!=null &&
              this.shortDialProp.equals(other.getShortDialProp()))) &&
            ((this.superCUGCodeProp==null && other.getSuperCUGCodeProp()==null) || 
             (this.superCUGCodeProp!=null &&
              this.superCUGCodeProp.equals(other.getSuperCUGCodeProp()))) &&
            ((this.superCUGNameProp==null && other.getSuperCUGNameProp()==null) || 
             (this.superCUGNameProp!=null &&
              this.superCUGNameProp.equals(other.getSuperCUGNameProp())));
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
        if (getCodeProp() != null) {
            _hashCode += getCodeProp().hashCode();
        }
        if (getCUGNameProp() != null) {
            _hashCode += getCUGNameProp().hashCode();
        }
        if (getVPNAccessProp() != null) {
            _hashCode += getVPNAccessProp().hashCode();
        }
        if (getShortDialProp() != null) {
            _hashCode += getShortDialProp().hashCode();
        }
        if (getSuperCUGCodeProp() != null) {
            _hashCode += getSuperCUGCodeProp().hashCode();
        }
        if (getSuperCUGNameProp() != null) {
            _hashCode += getSuperCUGNameProp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUGMembers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGMembers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CodeProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGNameProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGNameProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPNAccessProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VPNAccessProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDialProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ShortDialProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superCUGCodeProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SuperCUGCodeProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superCUGNameProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SuperCUGNameProp"));
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
