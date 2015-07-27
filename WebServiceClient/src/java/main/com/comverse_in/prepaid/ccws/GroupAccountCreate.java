/**
 * GroupAccountCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class GroupAccountCreate  extends com.comverse_in.prepaid.ccws.GroupAccountBase  implements java.io.Serializable {
    private String groupID;

    private String ownerID;

    private String ownerIdentityName;

    public GroupAccountCreate() {
    }

    public GroupAccountCreate(
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
           String groupID,
           String ownerID,
           String ownerIdentityName) {
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
        this.groupID = groupID;
        this.ownerID = ownerID;
        this.ownerIdentityName = ownerIdentityName;
    }


    /**
     * Gets the groupID value for this GroupAccountCreate.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this GroupAccountCreate.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the ownerID value for this GroupAccountCreate.
     * 
     * @return ownerID
     */
    public String getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this GroupAccountCreate.
     * 
     * @param ownerID
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }


    /**
     * Gets the ownerIdentityName value for this GroupAccountCreate.
     * 
     * @return ownerIdentityName
     */
    public String getOwnerIdentityName() {
        return ownerIdentityName;
    }


    /**
     * Sets the ownerIdentityName value for this GroupAccountCreate.
     * 
     * @param ownerIdentityName
     */
    public void setOwnerIdentityName(String ownerIdentityName) {
        this.ownerIdentityName = ownerIdentityName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GroupAccountCreate)) return false;
        GroupAccountCreate other = (GroupAccountCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.ownerID==null && other.getOwnerID()==null) || 
             (this.ownerID!=null &&
              this.ownerID.equals(other.getOwnerID()))) &&
            ((this.ownerIdentityName==null && other.getOwnerIdentityName()==null) || 
             (this.ownerIdentityName!=null &&
              this.ownerIdentityName.equals(other.getOwnerIdentityName())));
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
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getOwnerID() != null) {
            _hashCode += getOwnerID().hashCode();
        }
        if (getOwnerIdentityName() != null) {
            _hashCode += getOwnerIdentityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupAccountCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerIdentityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OwnerIdentityName"));
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
