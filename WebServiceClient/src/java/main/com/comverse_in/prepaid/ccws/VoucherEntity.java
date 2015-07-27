/**
 * VoucherEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class VoucherEntity  implements java.io.Serializable {
    private java.math.BigDecimal cardId;

    private java.math.BigDecimal batchNumber;

    private java.math.BigDecimal serialNumber;

    private String codeNumber;

    private String state;

    private java.util.Calendar expirationDate;

    private String subscriberId;

    private java.util.Calendar useDate;

    private String distributor;

    private String orderNumber;

    private String serviceProvider;

    private String currencyUnit;

    private java.math.BigDecimal faceValue;

    private java.math.BigDecimal expirationOffset;

    private java.math.BigDecimal acctExpirationOffset;

    private java.math.BigDecimal changeCosF;

    private java.math.BigDecimal changeCos;

    private java.math.BigDecimal changePhonebook;

    private java.util.Calendar shipDate;

    private String ucardSp;

    private String ucardCos;

    public VoucherEntity() {
    }

    public VoucherEntity(
           java.math.BigDecimal cardId,
           java.math.BigDecimal batchNumber,
           java.math.BigDecimal serialNumber,
           String codeNumber,
           String state,
           java.util.Calendar expirationDate,
           String subscriberId,
           java.util.Calendar useDate,
           String distributor,
           String orderNumber,
           String serviceProvider,
           String currencyUnit,
           java.math.BigDecimal faceValue,
           java.math.BigDecimal expirationOffset,
           java.math.BigDecimal acctExpirationOffset,
           java.math.BigDecimal changeCosF,
           java.math.BigDecimal changeCos,
           java.math.BigDecimal changePhonebook,
           java.util.Calendar shipDate,
           String ucardSp,
           String ucardCos) {
           this.cardId = cardId;
           this.batchNumber = batchNumber;
           this.serialNumber = serialNumber;
           this.codeNumber = codeNumber;
           this.state = state;
           this.expirationDate = expirationDate;
           this.subscriberId = subscriberId;
           this.useDate = useDate;
           this.distributor = distributor;
           this.orderNumber = orderNumber;
           this.serviceProvider = serviceProvider;
           this.currencyUnit = currencyUnit;
           this.faceValue = faceValue;
           this.expirationOffset = expirationOffset;
           this.acctExpirationOffset = acctExpirationOffset;
           this.changeCosF = changeCosF;
           this.changeCos = changeCos;
           this.changePhonebook = changePhonebook;
           this.shipDate = shipDate;
           this.ucardSp = ucardSp;
           this.ucardCos = ucardCos;
    }


    /**
     * Gets the cardId value for this VoucherEntity.
     * 
     * @return cardId
     */
    public java.math.BigDecimal getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this VoucherEntity.
     * 
     * @param cardId
     */
    public void setCardId(java.math.BigDecimal cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the batchNumber value for this VoucherEntity.
     * 
     * @return batchNumber
     */
    public java.math.BigDecimal getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this VoucherEntity.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(java.math.BigDecimal batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the serialNumber value for this VoucherEntity.
     * 
     * @return serialNumber
     */
    public java.math.BigDecimal getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this VoucherEntity.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.math.BigDecimal serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the codeNumber value for this VoucherEntity.
     * 
     * @return codeNumber
     */
    public String getCodeNumber() {
        return codeNumber;
    }


    /**
     * Sets the codeNumber value for this VoucherEntity.
     * 
     * @param codeNumber
     */
    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }


    /**
     * Gets the state value for this VoucherEntity.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this VoucherEntity.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the expirationDate value for this VoucherEntity.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this VoucherEntity.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the subscriberId value for this VoucherEntity.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this VoucherEntity.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the useDate value for this VoucherEntity.
     * 
     * @return useDate
     */
    public java.util.Calendar getUseDate() {
        return useDate;
    }


    /**
     * Sets the useDate value for this VoucherEntity.
     * 
     * @param useDate
     */
    public void setUseDate(java.util.Calendar useDate) {
        this.useDate = useDate;
    }


    /**
     * Gets the distributor value for this VoucherEntity.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this VoucherEntity.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the orderNumber value for this VoucherEntity.
     * 
     * @return orderNumber
     */
    public String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this VoucherEntity.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the serviceProvider value for this VoucherEntity.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this VoucherEntity.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the currencyUnit value for this VoucherEntity.
     * 
     * @return currencyUnit
     */
    public String getCurrencyUnit() {
        return currencyUnit;
    }


    /**
     * Sets the currencyUnit value for this VoucherEntity.
     * 
     * @param currencyUnit
     */
    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }


    /**
     * Gets the faceValue value for this VoucherEntity.
     * 
     * @return faceValue
     */
    public java.math.BigDecimal getFaceValue() {
        return faceValue;
    }


    /**
     * Sets the faceValue value for this VoucherEntity.
     * 
     * @param faceValue
     */
    public void setFaceValue(java.math.BigDecimal faceValue) {
        this.faceValue = faceValue;
    }


    /**
     * Gets the expirationOffset value for this VoucherEntity.
     * 
     * @return expirationOffset
     */
    public java.math.BigDecimal getExpirationOffset() {
        return expirationOffset;
    }


    /**
     * Sets the expirationOffset value for this VoucherEntity.
     * 
     * @param expirationOffset
     */
    public void setExpirationOffset(java.math.BigDecimal expirationOffset) {
        this.expirationOffset = expirationOffset;
    }


    /**
     * Gets the acctExpirationOffset value for this VoucherEntity.
     * 
     * @return acctExpirationOffset
     */
    public java.math.BigDecimal getAcctExpirationOffset() {
        return acctExpirationOffset;
    }


    /**
     * Sets the acctExpirationOffset value for this VoucherEntity.
     * 
     * @param acctExpirationOffset
     */
    public void setAcctExpirationOffset(java.math.BigDecimal acctExpirationOffset) {
        this.acctExpirationOffset = acctExpirationOffset;
    }


    /**
     * Gets the changeCosF value for this VoucherEntity.
     * 
     * @return changeCosF
     */
    public java.math.BigDecimal getChangeCosF() {
        return changeCosF;
    }


    /**
     * Sets the changeCosF value for this VoucherEntity.
     * 
     * @param changeCosF
     */
    public void setChangeCosF(java.math.BigDecimal changeCosF) {
        this.changeCosF = changeCosF;
    }


    /**
     * Gets the changeCos value for this VoucherEntity.
     * 
     * @return changeCos
     */
    public java.math.BigDecimal getChangeCos() {
        return changeCos;
    }


    /**
     * Sets the changeCos value for this VoucherEntity.
     * 
     * @param changeCos
     */
    public void setChangeCos(java.math.BigDecimal changeCos) {
        this.changeCos = changeCos;
    }


    /**
     * Gets the changePhonebook value for this VoucherEntity.
     * 
     * @return changePhonebook
     */
    public java.math.BigDecimal getChangePhonebook() {
        return changePhonebook;
    }


    /**
     * Sets the changePhonebook value for this VoucherEntity.
     * 
     * @param changePhonebook
     */
    public void setChangePhonebook(java.math.BigDecimal changePhonebook) {
        this.changePhonebook = changePhonebook;
    }


    /**
     * Gets the shipDate value for this VoucherEntity.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this VoucherEntity.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the ucardSp value for this VoucherEntity.
     * 
     * @return ucardSp
     */
    public String getUcardSp() {
        return ucardSp;
    }


    /**
     * Sets the ucardSp value for this VoucherEntity.
     * 
     * @param ucardSp
     */
    public void setUcardSp(String ucardSp) {
        this.ucardSp = ucardSp;
    }


    /**
     * Gets the ucardCos value for this VoucherEntity.
     * 
     * @return ucardCos
     */
    public String getUcardCos() {
        return ucardCos;
    }


    /**
     * Sets the ucardCos value for this VoucherEntity.
     * 
     * @param ucardCos
     */
    public void setUcardCos(String ucardCos) {
        this.ucardCos = ucardCos;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VoucherEntity)) return false;
        VoucherEntity other = (VoucherEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardId==null && other.getCardId()==null) || 
             (this.cardId!=null &&
              this.cardId.equals(other.getCardId()))) &&
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.codeNumber==null && other.getCodeNumber()==null) || 
             (this.codeNumber!=null &&
              this.codeNumber.equals(other.getCodeNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.useDate==null && other.getUseDate()==null) || 
             (this.useDate!=null &&
              this.useDate.equals(other.getUseDate()))) &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider()))) &&
            ((this.currencyUnit==null && other.getCurrencyUnit()==null) || 
             (this.currencyUnit!=null &&
              this.currencyUnit.equals(other.getCurrencyUnit()))) &&
            ((this.faceValue==null && other.getFaceValue()==null) || 
             (this.faceValue!=null &&
              this.faceValue.equals(other.getFaceValue()))) &&
            ((this.expirationOffset==null && other.getExpirationOffset()==null) || 
             (this.expirationOffset!=null &&
              this.expirationOffset.equals(other.getExpirationOffset()))) &&
            ((this.acctExpirationOffset==null && other.getAcctExpirationOffset()==null) || 
             (this.acctExpirationOffset!=null &&
              this.acctExpirationOffset.equals(other.getAcctExpirationOffset()))) &&
            ((this.changeCosF==null && other.getChangeCosF()==null) || 
             (this.changeCosF!=null &&
              this.changeCosF.equals(other.getChangeCosF()))) &&
            ((this.changeCos==null && other.getChangeCos()==null) || 
             (this.changeCos!=null &&
              this.changeCos.equals(other.getChangeCos()))) &&
            ((this.changePhonebook==null && other.getChangePhonebook()==null) || 
             (this.changePhonebook!=null &&
              this.changePhonebook.equals(other.getChangePhonebook()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.ucardSp==null && other.getUcardSp()==null) || 
             (this.ucardSp!=null &&
              this.ucardSp.equals(other.getUcardSp()))) &&
            ((this.ucardCos==null && other.getUcardCos()==null) || 
             (this.ucardCos!=null &&
              this.ucardCos.equals(other.getUcardCos())));
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
        if (getCardId() != null) {
            _hashCode += getCardId().hashCode();
        }
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getCodeNumber() != null) {
            _hashCode += getCodeNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getUseDate() != null) {
            _hashCode += getUseDate().hashCode();
        }
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        if (getCurrencyUnit() != null) {
            _hashCode += getCurrencyUnit().hashCode();
        }
        if (getFaceValue() != null) {
            _hashCode += getFaceValue().hashCode();
        }
        if (getExpirationOffset() != null) {
            _hashCode += getExpirationOffset().hashCode();
        }
        if (getAcctExpirationOffset() != null) {
            _hashCode += getAcctExpirationOffset().hashCode();
        }
        if (getChangeCosF() != null) {
            _hashCode += getChangeCosF().hashCode();
        }
        if (getChangeCos() != null) {
            _hashCode += getChangeCos().hashCode();
        }
        if (getChangePhonebook() != null) {
            _hashCode += getChangePhonebook().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getUcardSp() != null) {
            _hashCode += getUcardSp().hashCode();
        }
        if (getUcardCos() != null) {
            _hashCode += getUcardCos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BatchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CodeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ExpirationOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctExpirationOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AcctExpirationOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeCosF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCosF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeCos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePhonebook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangePhonebook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ucardSp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UcardSp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ucardCos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UcardCos"));
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
