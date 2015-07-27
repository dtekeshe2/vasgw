/**
 * PostpaidDeltaBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class PostpaidDeltaBalance  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.DeltaBalance[] deltaBalances;

    private com.comverse_in.prepaid.ccws.InvoiceAmount[] invoiceAmounts;

    private Double depositAmount;

    private Double totalAmt;

    public PostpaidDeltaBalance() {
    }

    public PostpaidDeltaBalance(
           com.comverse_in.prepaid.ccws.DeltaBalance[] deltaBalances,
           com.comverse_in.prepaid.ccws.InvoiceAmount[] invoiceAmounts,
           Double depositAmount,
           Double totalAmt) {
           this.deltaBalances = deltaBalances;
           this.invoiceAmounts = invoiceAmounts;
           this.depositAmount = depositAmount;
           this.totalAmt = totalAmt;
    }


    /**
     * Gets the deltaBalances value for this PostpaidDeltaBalance.
     * 
     * @return deltaBalances
     */
    public com.comverse_in.prepaid.ccws.DeltaBalance[] getDeltaBalances() {
        return deltaBalances;
    }


    /**
     * Sets the deltaBalances value for this PostpaidDeltaBalance.
     * 
     * @param deltaBalances
     */
    public void setDeltaBalances(com.comverse_in.prepaid.ccws.DeltaBalance[] deltaBalances) {
        this.deltaBalances = deltaBalances;
    }


    /**
     * Gets the invoiceAmounts value for this PostpaidDeltaBalance.
     * 
     * @return invoiceAmounts
     */
    public com.comverse_in.prepaid.ccws.InvoiceAmount[] getInvoiceAmounts() {
        return invoiceAmounts;
    }


    /**
     * Sets the invoiceAmounts value for this PostpaidDeltaBalance.
     * 
     * @param invoiceAmounts
     */
    public void setInvoiceAmounts(com.comverse_in.prepaid.ccws.InvoiceAmount[] invoiceAmounts) {
        this.invoiceAmounts = invoiceAmounts;
    }


    /**
     * Gets the depositAmount value for this PostpaidDeltaBalance.
     * 
     * @return depositAmount
     */
    public Double getDepositAmount() {
        return depositAmount;
    }


    /**
     * Sets the depositAmount value for this PostpaidDeltaBalance.
     * 
     * @param depositAmount
     */
    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }


    /**
     * Gets the totalAmt value for this PostpaidDeltaBalance.
     * 
     * @return totalAmt
     */
    public Double getTotalAmt() {
        return totalAmt;
    }


    /**
     * Sets the totalAmt value for this PostpaidDeltaBalance.
     * 
     * @param totalAmt
     */
    public void setTotalAmt(Double totalAmt) {
        this.totalAmt = totalAmt;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PostpaidDeltaBalance)) return false;
        PostpaidDeltaBalance other = (PostpaidDeltaBalance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deltaBalances==null && other.getDeltaBalances()==null) || 
             (this.deltaBalances!=null &&
              java.util.Arrays.equals(this.deltaBalances, other.getDeltaBalances()))) &&
            ((this.invoiceAmounts==null && other.getInvoiceAmounts()==null) || 
             (this.invoiceAmounts!=null &&
              java.util.Arrays.equals(this.invoiceAmounts, other.getInvoiceAmounts()))) &&
            ((this.depositAmount==null && other.getDepositAmount()==null) || 
             (this.depositAmount!=null &&
              this.depositAmount.equals(other.getDepositAmount()))) &&
            ((this.totalAmt==null && other.getTotalAmt()==null) || 
             (this.totalAmt!=null &&
              this.totalAmt.equals(other.getTotalAmt())));
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
        if (getDeltaBalances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeltaBalances());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeltaBalances(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceAmounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInvoiceAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositAmount() != null) {
            _hashCode += getDepositAmount().hashCode();
        }
        if (getTotalAmt() != null) {
            _hashCode += getTotalAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostpaidDeltaBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PostpaidDeltaBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaBalances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DepositAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
