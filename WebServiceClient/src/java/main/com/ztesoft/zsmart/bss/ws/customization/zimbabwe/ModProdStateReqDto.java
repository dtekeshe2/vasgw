/**
 * ModProdStateReqDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class ModProdStateReqDto  implements java.io.Serializable {
    private String MSISDN;

    private String subsEvent;

    private String oldState;

    private String newState;

    private String oldBlockReason;

    private String newBlockReason;

    public ModProdStateReqDto() {
    }

    public ModProdStateReqDto(
           String MSISDN,
           String subsEvent,
           String oldState,
           String newState,
           String oldBlockReason,
           String newBlockReason) {
           this.MSISDN = MSISDN;
           this.subsEvent = subsEvent;
           this.oldState = oldState;
           this.newState = newState;
           this.oldBlockReason = oldBlockReason;
           this.newBlockReason = newBlockReason;
    }


    /**
     * Gets the MSISDN value for this ModProdStateReqDto.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ModProdStateReqDto.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the subsEvent value for this ModProdStateReqDto.
     * 
     * @return subsEvent
     */
    public String getSubsEvent() {
        return subsEvent;
    }


    /**
     * Sets the subsEvent value for this ModProdStateReqDto.
     * 
     * @param subsEvent
     */
    public void setSubsEvent(String subsEvent) {
        this.subsEvent = subsEvent;
    }


    /**
     * Gets the oldState value for this ModProdStateReqDto.
     * 
     * @return oldState
     */
    public String getOldState() {
        return oldState;
    }


    /**
     * Sets the oldState value for this ModProdStateReqDto.
     * 
     * @param oldState
     */
    public void setOldState(String oldState) {
        this.oldState = oldState;
    }


    /**
     * Gets the newState value for this ModProdStateReqDto.
     * 
     * @return newState
     */
    public String getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this ModProdStateReqDto.
     * 
     * @param newState
     */
    public void setNewState(String newState) {
        this.newState = newState;
    }


    /**
     * Gets the oldBlockReason value for this ModProdStateReqDto.
     * 
     * @return oldBlockReason
     */
    public String getOldBlockReason() {
        return oldBlockReason;
    }


    /**
     * Sets the oldBlockReason value for this ModProdStateReqDto.
     * 
     * @param oldBlockReason
     */
    public void setOldBlockReason(String oldBlockReason) {
        this.oldBlockReason = oldBlockReason;
    }


    /**
     * Gets the newBlockReason value for this ModProdStateReqDto.
     * 
     * @return newBlockReason
     */
    public String getNewBlockReason() {
        return newBlockReason;
    }


    /**
     * Sets the newBlockReason value for this ModProdStateReqDto.
     * 
     * @param newBlockReason
     */
    public void setNewBlockReason(String newBlockReason) {
        this.newBlockReason = newBlockReason;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModProdStateReqDto)) return false;
        ModProdStateReqDto other = (ModProdStateReqDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.subsEvent==null && other.getSubsEvent()==null) || 
             (this.subsEvent!=null &&
              this.subsEvent.equals(other.getSubsEvent()))) &&
            ((this.oldState==null && other.getOldState()==null) || 
             (this.oldState!=null &&
              this.oldState.equals(other.getOldState()))) &&
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState()))) &&
            ((this.oldBlockReason==null && other.getOldBlockReason()==null) || 
             (this.oldBlockReason!=null &&
              this.oldBlockReason.equals(other.getOldBlockReason()))) &&
            ((this.newBlockReason==null && other.getNewBlockReason()==null) || 
             (this.newBlockReason!=null &&
              this.newBlockReason.equals(other.getNewBlockReason())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getSubsEvent() != null) {
            _hashCode += getSubsEvent().hashCode();
        }
        if (getOldState() != null) {
            _hashCode += getOldState().hashCode();
        }
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        if (getOldBlockReason() != null) {
            _hashCode += getOldBlockReason().hashCode();
        }
        if (getNewBlockReason() != null) {
            _hashCode += getNewBlockReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModProdStateReqDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModProdStateReqDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "OldState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBlockReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "OldBlockReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBlockReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewBlockReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
