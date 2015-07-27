/**
 * GroupAccountModify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class GroupAccountModify  extends com.comverse_in.prepaid.ccws.GroupAccountBase  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit[] defaultMaxSpendinglimits;

    private String newGroupName;

    public GroupAccountModify() {
    }

    public GroupAccountModify(
           String adminName,
           String adminPassword,
           String groupName,
           com.comverse_in.prepaid.ccws.DatePeriod refurbishPeriod,
           Long refurbishDay,
           com.comverse_in.prepaid.ccws.GroupMemberType notificationHandling,
           String groupCUG,
           Boolean differentMemberCUG,
           String COSName,
           String SPName,
           Boolean differentMemberCOS,
           com.comverse_in.prepaid.ccws.GroupMemberType periodicChargeApply,
           String timeZone,
           String homeL1,
           String homeL2,
           String homeL3,
           String homeL4,
           String CFUNumber,
           String CFBNumber,
           String CFNANumber,
           String CFISNumber,
           com.comverse_in.prepaid.ccws.FundsType fundsAvailable,
           com.comverse_in.prepaid.ccws.PrecedenceOrderType precedenceOrder,
           com.comverse_in.prepaid.ccws.FinancialHandlingType financialHandling,
           Boolean accountToAccountTransferAllowed,
           Long balanceTransferMinimum,
           Long balanceTransferMaximum,
           java.math.BigDecimal balanceTransferResidualAmount,
           Boolean spendingLimitOverride,
           Boolean isReactivationFeeApplied,
           Boolean balanceToBalanceTransferAllowed,
           Long groupMaximumSize,
           com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit[] defaultMaxSpendinglimits,
           String newGroupName) {
        super(
            adminName,
            adminPassword,
            groupName,
            refurbishPeriod,
            refurbishDay,
            notificationHandling,
            groupCUG,
            differentMemberCUG,
            COSName,
            SPName,
            differentMemberCOS,
            periodicChargeApply,
            timeZone,
            homeL1,
            homeL2,
            homeL3,
            homeL4,
            CFUNumber,
            CFBNumber,
            CFNANumber,
            CFISNumber,
            fundsAvailable,
            precedenceOrder,
            financialHandling,
            accountToAccountTransferAllowed,
            balanceTransferMinimum,
            balanceTransferMaximum,
            balanceTransferResidualAmount,
            spendingLimitOverride,
            isReactivationFeeApplied,
            balanceToBalanceTransferAllowed,
            groupMaximumSize);
        this.defaultMaxSpendinglimits = defaultMaxSpendinglimits;
        this.newGroupName = newGroupName;
    }


    /**
     * Gets the defaultMaxSpendinglimits value for this GroupAccountModify.
     * 
     * @return defaultMaxSpendinglimits
     */
    public com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit[] getDefaultMaxSpendinglimits() {
        return defaultMaxSpendinglimits;
    }


    /**
     * Sets the defaultMaxSpendinglimits value for this GroupAccountModify.
     * 
     * @param defaultMaxSpendinglimits
     */
    public void setDefaultMaxSpendinglimits(com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit[] defaultMaxSpendinglimits) {
        this.defaultMaxSpendinglimits = defaultMaxSpendinglimits;
    }


    /**
     * Gets the newGroupName value for this GroupAccountModify.
     * 
     * @return newGroupName
     */
    public String getNewGroupName() {
        return newGroupName;
    }


    /**
     * Sets the newGroupName value for this GroupAccountModify.
     * 
     * @param newGroupName
     */
    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GroupAccountModify)) return false;
        GroupAccountModify other = (GroupAccountModify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultMaxSpendinglimits==null && other.getDefaultMaxSpendinglimits()==null) || 
             (this.defaultMaxSpendinglimits!=null &&
              java.util.Arrays.equals(this.defaultMaxSpendinglimits, other.getDefaultMaxSpendinglimits()))) &&
            ((this.newGroupName==null && other.getNewGroupName()==null) || 
             (this.newGroupName!=null &&
              this.newGroupName.equals(other.getNewGroupName())));
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
        if (getDefaultMaxSpendinglimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultMaxSpendinglimits());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDefaultMaxSpendinglimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewGroupName() != null) {
            _hashCode += getNewGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupAccountModify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountModify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMaxSpendinglimits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DefaultMaxSpendinglimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountSpendingLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountSpendingLimit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewGroupName"));
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
