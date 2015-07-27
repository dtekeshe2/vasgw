/**
 * SubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberInfo  implements java.io.Serializable {
    private String firstName;

    private String middleInitial;

    private String lastName;

    private String address1;

    private String address2;

    private String address3;

    private String address4;

    private String ZIP;

    public SubscriberInfo() {
    }

    public SubscriberInfo(
           String firstName,
           String middleInitial,
           String lastName,
           String address1,
           String address2,
           String address3,
           String address4,
           String ZIP) {
           this.firstName = firstName;
           this.middleInitial = middleInitial;
           this.lastName = lastName;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.address4 = address4;
           this.ZIP = ZIP;
    }


    /**
     * Gets the firstName value for this SubscriberInfo.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SubscriberInfo.
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleInitial value for this SubscriberInfo.
     * 
     * @return middleInitial
     */
    public String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this SubscriberInfo.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the lastName value for this SubscriberInfo.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SubscriberInfo.
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the address1 value for this SubscriberInfo.
     * 
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this SubscriberInfo.
     * 
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this SubscriberInfo.
     * 
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this SubscriberInfo.
     * 
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this SubscriberInfo.
     * 
     * @return address3
     */
    public String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this SubscriberInfo.
     * 
     * @param address3
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the address4 value for this SubscriberInfo.
     * 
     * @return address4
     */
    public String getAddress4() {
        return address4;
    }


    /**
     * Sets the address4 value for this SubscriberInfo.
     * 
     * @param address4
     */
    public void setAddress4(String address4) {
        this.address4 = address4;
    }


    /**
     * Gets the ZIP value for this SubscriberInfo.
     * 
     * @return ZIP
     */
    public String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this SubscriberInfo.
     * 
     * @param ZIP
     */
    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberInfo)) return false;
        SubscriberInfo other = (SubscriberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.address4==null && other.getAddress4()==null) || 
             (this.address4!=null &&
              this.address4.equals(other.getAddress4()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getAddress4() != null) {
            _hashCode += getAddress4().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MiddleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Address4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ZIP"));
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
