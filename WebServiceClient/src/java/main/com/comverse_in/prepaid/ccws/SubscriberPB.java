/**
 * SubscriberPB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberPB  implements java.io.Serializable {
    private String destNumber1;

    private String destNumber2;

    private String destNumber3;

    private String destNumber4;

    private String destNumber5;

    private String destNumber6;

    private String destNumber7;

    private String destNumber8;

    private String destNumber9;

    private String destNumber10;

    public SubscriberPB() {
    }

    public SubscriberPB(
           String destNumber1,
           String destNumber2,
           String destNumber3,
           String destNumber4,
           String destNumber5,
           String destNumber6,
           String destNumber7,
           String destNumber8,
           String destNumber9,
           String destNumber10) {
           this.destNumber1 = destNumber1;
           this.destNumber2 = destNumber2;
           this.destNumber3 = destNumber3;
           this.destNumber4 = destNumber4;
           this.destNumber5 = destNumber5;
           this.destNumber6 = destNumber6;
           this.destNumber7 = destNumber7;
           this.destNumber8 = destNumber8;
           this.destNumber9 = destNumber9;
           this.destNumber10 = destNumber10;
    }


    /**
     * Gets the destNumber1 value for this SubscriberPB.
     * 
     * @return destNumber1
     */
    public String getDestNumber1() {
        return destNumber1;
    }


    /**
     * Sets the destNumber1 value for this SubscriberPB.
     * 
     * @param destNumber1
     */
    public void setDestNumber1(String destNumber1) {
        this.destNumber1 = destNumber1;
    }


    /**
     * Gets the destNumber2 value for this SubscriberPB.
     * 
     * @return destNumber2
     */
    public String getDestNumber2() {
        return destNumber2;
    }


    /**
     * Sets the destNumber2 value for this SubscriberPB.
     * 
     * @param destNumber2
     */
    public void setDestNumber2(String destNumber2) {
        this.destNumber2 = destNumber2;
    }


    /**
     * Gets the destNumber3 value for this SubscriberPB.
     * 
     * @return destNumber3
     */
    public String getDestNumber3() {
        return destNumber3;
    }


    /**
     * Sets the destNumber3 value for this SubscriberPB.
     * 
     * @param destNumber3
     */
    public void setDestNumber3(String destNumber3) {
        this.destNumber3 = destNumber3;
    }


    /**
     * Gets the destNumber4 value for this SubscriberPB.
     * 
     * @return destNumber4
     */
    public String getDestNumber4() {
        return destNumber4;
    }


    /**
     * Sets the destNumber4 value for this SubscriberPB.
     * 
     * @param destNumber4
     */
    public void setDestNumber4(String destNumber4) {
        this.destNumber4 = destNumber4;
    }


    /**
     * Gets the destNumber5 value for this SubscriberPB.
     * 
     * @return destNumber5
     */
    public String getDestNumber5() {
        return destNumber5;
    }


    /**
     * Sets the destNumber5 value for this SubscriberPB.
     * 
     * @param destNumber5
     */
    public void setDestNumber5(String destNumber5) {
        this.destNumber5 = destNumber5;
    }


    /**
     * Gets the destNumber6 value for this SubscriberPB.
     * 
     * @return destNumber6
     */
    public String getDestNumber6() {
        return destNumber6;
    }


    /**
     * Sets the destNumber6 value for this SubscriberPB.
     * 
     * @param destNumber6
     */
    public void setDestNumber6(String destNumber6) {
        this.destNumber6 = destNumber6;
    }


    /**
     * Gets the destNumber7 value for this SubscriberPB.
     * 
     * @return destNumber7
     */
    public String getDestNumber7() {
        return destNumber7;
    }


    /**
     * Sets the destNumber7 value for this SubscriberPB.
     * 
     * @param destNumber7
     */
    public void setDestNumber7(String destNumber7) {
        this.destNumber7 = destNumber7;
    }


    /**
     * Gets the destNumber8 value for this SubscriberPB.
     * 
     * @return destNumber8
     */
    public String getDestNumber8() {
        return destNumber8;
    }


    /**
     * Sets the destNumber8 value for this SubscriberPB.
     * 
     * @param destNumber8
     */
    public void setDestNumber8(String destNumber8) {
        this.destNumber8 = destNumber8;
    }


    /**
     * Gets the destNumber9 value for this SubscriberPB.
     * 
     * @return destNumber9
     */
    public String getDestNumber9() {
        return destNumber9;
    }


    /**
     * Sets the destNumber9 value for this SubscriberPB.
     * 
     * @param destNumber9
     */
    public void setDestNumber9(String destNumber9) {
        this.destNumber9 = destNumber9;
    }


    /**
     * Gets the destNumber10 value for this SubscriberPB.
     * 
     * @return destNumber10
     */
    public String getDestNumber10() {
        return destNumber10;
    }


    /**
     * Sets the destNumber10 value for this SubscriberPB.
     * 
     * @param destNumber10
     */
    public void setDestNumber10(String destNumber10) {
        this.destNumber10 = destNumber10;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberPB)) return false;
        SubscriberPB other = (SubscriberPB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destNumber1==null && other.getDestNumber1()==null) || 
             (this.destNumber1!=null &&
              this.destNumber1.equals(other.getDestNumber1()))) &&
            ((this.destNumber2==null && other.getDestNumber2()==null) || 
             (this.destNumber2!=null &&
              this.destNumber2.equals(other.getDestNumber2()))) &&
            ((this.destNumber3==null && other.getDestNumber3()==null) || 
             (this.destNumber3!=null &&
              this.destNumber3.equals(other.getDestNumber3()))) &&
            ((this.destNumber4==null && other.getDestNumber4()==null) || 
             (this.destNumber4!=null &&
              this.destNumber4.equals(other.getDestNumber4()))) &&
            ((this.destNumber5==null && other.getDestNumber5()==null) || 
             (this.destNumber5!=null &&
              this.destNumber5.equals(other.getDestNumber5()))) &&
            ((this.destNumber6==null && other.getDestNumber6()==null) || 
             (this.destNumber6!=null &&
              this.destNumber6.equals(other.getDestNumber6()))) &&
            ((this.destNumber7==null && other.getDestNumber7()==null) || 
             (this.destNumber7!=null &&
              this.destNumber7.equals(other.getDestNumber7()))) &&
            ((this.destNumber8==null && other.getDestNumber8()==null) || 
             (this.destNumber8!=null &&
              this.destNumber8.equals(other.getDestNumber8()))) &&
            ((this.destNumber9==null && other.getDestNumber9()==null) || 
             (this.destNumber9!=null &&
              this.destNumber9.equals(other.getDestNumber9()))) &&
            ((this.destNumber10==null && other.getDestNumber10()==null) || 
             (this.destNumber10!=null &&
              this.destNumber10.equals(other.getDestNumber10())));
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
        if (getDestNumber1() != null) {
            _hashCode += getDestNumber1().hashCode();
        }
        if (getDestNumber2() != null) {
            _hashCode += getDestNumber2().hashCode();
        }
        if (getDestNumber3() != null) {
            _hashCode += getDestNumber3().hashCode();
        }
        if (getDestNumber4() != null) {
            _hashCode += getDestNumber4().hashCode();
        }
        if (getDestNumber5() != null) {
            _hashCode += getDestNumber5().hashCode();
        }
        if (getDestNumber6() != null) {
            _hashCode += getDestNumber6().hashCode();
        }
        if (getDestNumber7() != null) {
            _hashCode += getDestNumber7().hashCode();
        }
        if (getDestNumber8() != null) {
            _hashCode += getDestNumber8().hashCode();
        }
        if (getDestNumber9() != null) {
            _hashCode += getDestNumber9().hashCode();
        }
        if (getDestNumber10() != null) {
            _hashCode += getDestNumber10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberPB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destNumber10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestNumber10"));
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
