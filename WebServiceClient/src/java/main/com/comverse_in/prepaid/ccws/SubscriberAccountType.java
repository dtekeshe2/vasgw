/**
 * SubscriberAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberAccountType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SubscriberAccountType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _GroupOwner = "GroupOwner";
    public static final String _MemberSL = "MemberSL";
    public static final String _Individual = "Individual";
    public static final String _MemeberBL = "MemeberBL";
    public static final String _MemberBoth = "MemberBoth";
    public static final SubscriberAccountType GroupOwner = new SubscriberAccountType(_GroupOwner);
    public static final SubscriberAccountType MemberSL = new SubscriberAccountType(_MemberSL);
    public static final SubscriberAccountType Individual = new SubscriberAccountType(_Individual);
    public static final SubscriberAccountType MemeberBL = new SubscriberAccountType(_MemeberBL);
    public static final SubscriberAccountType MemberBoth = new SubscriberAccountType(_MemberBoth);
    public String getValue() { return _value_;}
    public static SubscriberAccountType fromValue(String value)
          throws IllegalArgumentException {
        SubscriberAccountType enumeration = (SubscriberAccountType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SubscriberAccountType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberAccountType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberAccountType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
