/**
 * DatePeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class DatePeriod implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DatePeriod(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Daily = "Daily";
    public static final String _Weekly = "Weekly";
    public static final String _Monthly = "Monthly";
    public static final String _Quarterly = "Quarterly";
    public static final String _Yearly = "Yearly";
    public static final DatePeriod Daily = new DatePeriod(_Daily);
    public static final DatePeriod Weekly = new DatePeriod(_Weekly);
    public static final DatePeriod Monthly = new DatePeriod(_Monthly);
    public static final DatePeriod Quarterly = new DatePeriod(_Quarterly);
    public static final DatePeriod Yearly = new DatePeriod(_Yearly);
    public String getValue() { return _value_;}
    public static DatePeriod fromValue(String value)
          throws IllegalArgumentException {
        DatePeriod enumeration = (DatePeriod)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DatePeriod fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DatePeriod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DatePeriod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
