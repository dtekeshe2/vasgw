/**
 * SubscriberRetrieve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberRetrieve  extends com.comverse_in.prepaid.ccws.SubscriberBase  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.SubscriberEntity subscriberData;

    private com.comverse_in.prepaid.ccws.CallHistory[] callHistories;

    private com.comverse_in.prepaid.ccws.MonetaryTransactionRecord[] monetaryTransactionsRecords;

    private com.comverse_in.prepaid.ccws.PSTransaction[] paymentServerTransaction;

    private com.comverse_in.prepaid.ccws.RechargeHistory[] rechargeHistories;

    private com.comverse_in.prepaid.ccws.OSAHistory[] OSAHistories;

    private com.comverse_in.prepaid.ccws.CUGMembers CUGMembers;

    private com.comverse_in.prepaid.ccws.Reservation[] reservations;

    private com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges;

    private com.comverse_in.prepaid.ccws.IdentityHistory[] identityHistories;

    private com.comverse_in.prepaid.ccws.CircleMembership[] circles;

    public SubscriberRetrieve() {
    }

    public SubscriberRetrieve(
           String subscriberID,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome,
           com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo,
           com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook,
           com.comverse_in.prepaid.ccws.SubscriberEntity subscriberData,
           com.comverse_in.prepaid.ccws.CallHistory[] callHistories,
           com.comverse_in.prepaid.ccws.MonetaryTransactionRecord[] monetaryTransactionsRecords,
           com.comverse_in.prepaid.ccws.PSTransaction[] paymentServerTransaction,
           com.comverse_in.prepaid.ccws.RechargeHistory[] rechargeHistories,
           com.comverse_in.prepaid.ccws.OSAHistory[] OSAHistories,
           com.comverse_in.prepaid.ccws.CUGMembers CUGMembers,
           com.comverse_in.prepaid.ccws.Reservation[] reservations,
           com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges,
           com.comverse_in.prepaid.ccws.IdentityHistory[] identityHistories,
           com.comverse_in.prepaid.ccws.CircleMembership[] circles) {
        super(
            subscriberID,
            identity,
            subscriberHome,
            subscriberInfo,
            subscriberPhoneBook);
        this.subscriberData = subscriberData;
        this.callHistories = callHistories;
        this.monetaryTransactionsRecords = monetaryTransactionsRecords;
        this.paymentServerTransaction = paymentServerTransaction;
        this.rechargeHistories = rechargeHistories;
        this.OSAHistories = OSAHistories;
        this.CUGMembers = CUGMembers;
        this.reservations = reservations;
        this.periodicCharges = periodicCharges;
        this.identityHistories = identityHistories;
        this.circles = circles;
    }


    /**
     * Gets the subscriberData value for this SubscriberRetrieve.
     * 
     * @return subscriberData
     */
    public com.comverse_in.prepaid.ccws.SubscriberEntity getSubscriberData() {
        return subscriberData;
    }


    /**
     * Sets the subscriberData value for this SubscriberRetrieve.
     * 
     * @param subscriberData
     */
    public void setSubscriberData(com.comverse_in.prepaid.ccws.SubscriberEntity subscriberData) {
        this.subscriberData = subscriberData;
    }


    /**
     * Gets the callHistories value for this SubscriberRetrieve.
     * 
     * @return callHistories
     */
    public com.comverse_in.prepaid.ccws.CallHistory[] getCallHistories() {
        return callHistories;
    }


    /**
     * Sets the callHistories value for this SubscriberRetrieve.
     * 
     * @param callHistories
     */
    public void setCallHistories(com.comverse_in.prepaid.ccws.CallHistory[] callHistories) {
        this.callHistories = callHistories;
    }


    /**
     * Gets the monetaryTransactionsRecords value for this SubscriberRetrieve.
     * 
     * @return monetaryTransactionsRecords
     */
    public com.comverse_in.prepaid.ccws.MonetaryTransactionRecord[] getMonetaryTransactionsRecords() {
        return monetaryTransactionsRecords;
    }


    /**
     * Sets the monetaryTransactionsRecords value for this SubscriberRetrieve.
     * 
     * @param monetaryTransactionsRecords
     */
    public void setMonetaryTransactionsRecords(com.comverse_in.prepaid.ccws.MonetaryTransactionRecord[] monetaryTransactionsRecords) {
        this.monetaryTransactionsRecords = monetaryTransactionsRecords;
    }


    /**
     * Gets the paymentServerTransaction value for this SubscriberRetrieve.
     * 
     * @return paymentServerTransaction
     */
    public com.comverse_in.prepaid.ccws.PSTransaction[] getPaymentServerTransaction() {
        return paymentServerTransaction;
    }


    /**
     * Sets the paymentServerTransaction value for this SubscriberRetrieve.
     * 
     * @param paymentServerTransaction
     */
    public void setPaymentServerTransaction(com.comverse_in.prepaid.ccws.PSTransaction[] paymentServerTransaction) {
        this.paymentServerTransaction = paymentServerTransaction;
    }

    public com.comverse_in.prepaid.ccws.PSTransaction getPaymentServerTransaction(int i) {
        return this.paymentServerTransaction[i];
    }

    public void setPaymentServerTransaction(int i, com.comverse_in.prepaid.ccws.PSTransaction _value) {
        this.paymentServerTransaction[i] = _value;
    }


    /**
     * Gets the rechargeHistories value for this SubscriberRetrieve.
     * 
     * @return rechargeHistories
     */
    public com.comverse_in.prepaid.ccws.RechargeHistory[] getRechargeHistories() {
        return rechargeHistories;
    }


    /**
     * Sets the rechargeHistories value for this SubscriberRetrieve.
     * 
     * @param rechargeHistories
     */
    public void setRechargeHistories(com.comverse_in.prepaid.ccws.RechargeHistory[] rechargeHistories) {
        this.rechargeHistories = rechargeHistories;
    }


    /**
     * Gets the OSAHistories value for this SubscriberRetrieve.
     * 
     * @return OSAHistories
     */
    public com.comverse_in.prepaid.ccws.OSAHistory[] getOSAHistories() {
        return OSAHistories;
    }


    /**
     * Sets the OSAHistories value for this SubscriberRetrieve.
     * 
     * @param OSAHistories
     */
    public void setOSAHistories(com.comverse_in.prepaid.ccws.OSAHistory[] OSAHistories) {
        this.OSAHistories = OSAHistories;
    }


    /**
     * Gets the CUGMembers value for this SubscriberRetrieve.
     * 
     * @return CUGMembers
     */
    public com.comverse_in.prepaid.ccws.CUGMembers getCUGMembers() {
        return CUGMembers;
    }


    /**
     * Sets the CUGMembers value for this SubscriberRetrieve.
     * 
     * @param CUGMembers
     */
    public void setCUGMembers(com.comverse_in.prepaid.ccws.CUGMembers CUGMembers) {
        this.CUGMembers = CUGMembers;
    }


    /**
     * Gets the reservations value for this SubscriberRetrieve.
     * 
     * @return reservations
     */
    public com.comverse_in.prepaid.ccws.Reservation[] getReservations() {
        return reservations;
    }


    /**
     * Sets the reservations value for this SubscriberRetrieve.
     * 
     * @param reservations
     */
    public void setReservations(com.comverse_in.prepaid.ccws.Reservation[] reservations) {
        this.reservations = reservations;
    }


    /**
     * Gets the periodicCharges value for this SubscriberRetrieve.
     * 
     * @return periodicCharges
     */
    public com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] getPeriodicCharges() {
        return periodicCharges;
    }


    /**
     * Sets the periodicCharges value for this SubscriberRetrieve.
     * 
     * @param periodicCharges
     */
    public void setPeriodicCharges(com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges) {
        this.periodicCharges = periodicCharges;
    }


    /**
     * Gets the identityHistories value for this SubscriberRetrieve.
     * 
     * @return identityHistories
     */
    public com.comverse_in.prepaid.ccws.IdentityHistory[] getIdentityHistories() {
        return identityHistories;
    }


    /**
     * Sets the identityHistories value for this SubscriberRetrieve.
     * 
     * @param identityHistories
     */
    public void setIdentityHistories(com.comverse_in.prepaid.ccws.IdentityHistory[] identityHistories) {
        this.identityHistories = identityHistories;
    }


    /**
     * Gets the circles value for this SubscriberRetrieve.
     * 
     * @return circles
     */
    public com.comverse_in.prepaid.ccws.CircleMembership[] getCircles() {
        return circles;
    }


    /**
     * Sets the circles value for this SubscriberRetrieve.
     * 
     * @param circles
     */
    public void setCircles(com.comverse_in.prepaid.ccws.CircleMembership[] circles) {
        this.circles = circles;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberRetrieve)) return false;
        SubscriberRetrieve other = (SubscriberRetrieve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberData==null && other.getSubscriberData()==null) || 
             (this.subscriberData!=null &&
              this.subscriberData.equals(other.getSubscriberData()))) &&
            ((this.callHistories==null && other.getCallHistories()==null) || 
             (this.callHistories!=null &&
              java.util.Arrays.equals(this.callHistories, other.getCallHistories()))) &&
            ((this.monetaryTransactionsRecords==null && other.getMonetaryTransactionsRecords()==null) || 
             (this.monetaryTransactionsRecords!=null &&
              java.util.Arrays.equals(this.monetaryTransactionsRecords, other.getMonetaryTransactionsRecords()))) &&
            ((this.paymentServerTransaction==null && other.getPaymentServerTransaction()==null) || 
             (this.paymentServerTransaction!=null &&
              java.util.Arrays.equals(this.paymentServerTransaction, other.getPaymentServerTransaction()))) &&
            ((this.rechargeHistories==null && other.getRechargeHistories()==null) || 
             (this.rechargeHistories!=null &&
              java.util.Arrays.equals(this.rechargeHistories, other.getRechargeHistories()))) &&
            ((this.OSAHistories==null && other.getOSAHistories()==null) || 
             (this.OSAHistories!=null &&
              java.util.Arrays.equals(this.OSAHistories, other.getOSAHistories()))) &&
            ((this.CUGMembers==null && other.getCUGMembers()==null) || 
             (this.CUGMembers!=null &&
              this.CUGMembers.equals(other.getCUGMembers()))) &&
            ((this.reservations==null && other.getReservations()==null) || 
             (this.reservations!=null &&
              java.util.Arrays.equals(this.reservations, other.getReservations()))) &&
            ((this.periodicCharges==null && other.getPeriodicCharges()==null) || 
             (this.periodicCharges!=null &&
              java.util.Arrays.equals(this.periodicCharges, other.getPeriodicCharges()))) &&
            ((this.identityHistories==null && other.getIdentityHistories()==null) || 
             (this.identityHistories!=null &&
              java.util.Arrays.equals(this.identityHistories, other.getIdentityHistories()))) &&
            ((this.circles==null && other.getCircles()==null) || 
             (this.circles!=null &&
              java.util.Arrays.equals(this.circles, other.getCircles())));
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
        if (getSubscriberData() != null) {
            _hashCode += getSubscriberData().hashCode();
        }
        if (getCallHistories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallHistories());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCallHistories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonetaryTransactionsRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonetaryTransactionsRecords());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMonetaryTransactionsRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentServerTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentServerTransaction());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPaymentServerTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRechargeHistories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeHistories());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechargeHistories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOSAHistories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOSAHistories());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOSAHistories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCUGMembers() != null) {
            _hashCode += getCUGMembers().hashCode();
        }
        if (getReservations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getReservations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodicCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodicCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPeriodicCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentityHistories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentityHistories());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIdentityHistories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCircles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCircles());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCircles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberRetrieve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monetaryTransactionsRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionsRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionsRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServerTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PaymentServerTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PSTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSAHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGMembers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservations"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPeriodicCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Circles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership"));
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
