/**
 * SubscriberBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public abstract class SubscriberBase  extends com.comverse_in.prepaid.ccws.SubscriberBasic  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome;

    private com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo;

    private com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook;

    public SubscriberBase() {
    }

    public SubscriberBase(
           String subscriberID,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome,
           com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo,
           com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook) {
        super(
            subscriberID,
            identity);
        this.subscriberHome = subscriberHome;
        this.subscriberInfo = subscriberInfo;
        this.subscriberPhoneBook = subscriberPhoneBook;
    }


    /**
     * Gets the subscriberHome value for this SubscriberBase.
     * 
     * @return subscriberHome
     */
    public com.comverse_in.prepaid.ccws.SubscriberHome getSubscriberHome() {
        return subscriberHome;
    }


    /**
     * Sets the subscriberHome value for this SubscriberBase.
     * 
     * @param subscriberHome
     */
    public void setSubscriberHome(com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome) {
        this.subscriberHome = subscriberHome;
    }


    /**
     * Gets the subscriberInfo value for this SubscriberBase.
     * 
     * @return subscriberInfo
     */
    public com.comverse_in.prepaid.ccws.SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }


    /**
     * Sets the subscriberInfo value for this SubscriberBase.
     * 
     * @param subscriberInfo
     */
    public void setSubscriberInfo(com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }


    /**
     * Gets the subscriberPhoneBook value for this SubscriberBase.
     * 
     * @return subscriberPhoneBook
     */
    public com.comverse_in.prepaid.ccws.SubscriberPB getSubscriberPhoneBook() {
        return subscriberPhoneBook;
    }


    /**
     * Sets the subscriberPhoneBook value for this SubscriberBase.
     * 
     * @param subscriberPhoneBook
     */
    public void setSubscriberPhoneBook(com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook) {
        this.subscriberPhoneBook = subscriberPhoneBook;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberBase)) return false;
        SubscriberBase other = (SubscriberBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberHome==null && other.getSubscriberHome()==null) || 
             (this.subscriberHome!=null &&
              this.subscriberHome.equals(other.getSubscriberHome()))) &&
            ((this.subscriberInfo==null && other.getSubscriberInfo()==null) || 
             (this.subscriberInfo!=null &&
              this.subscriberInfo.equals(other.getSubscriberInfo()))) &&
            ((this.subscriberPhoneBook==null && other.getSubscriberPhoneBook()==null) || 
             (this.subscriberPhoneBook!=null &&
              this.subscriberPhoneBook.equals(other.getSubscriberPhoneBook())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSubscriberHome() != null) {
            _hashCode += getSubscriberHome().hashCode();
        }
        if (getSubscriberInfo() != null) {
            _hashCode += getSubscriberInfo().hashCode();
        }
        if (getSubscriberPhoneBook() != null) {
            _hashCode += getSubscriberPhoneBook().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberHome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberHome"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberPhoneBook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPhoneBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPB"));
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
