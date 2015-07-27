/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements com.comverse_in.prepaid.ccws.ServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[83];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVersionId");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetVersionIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCache");
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClientCache"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.ClientCache.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetCacheResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNonVersionCache");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reloadData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVersionCache"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.NonVersionCache.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetNonVersionCacheResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocations");
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfString"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetLocationsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangePasswordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRoles");
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfString"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetRolesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveVoucherByBatchSerial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "batchNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "serialNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.VoucherEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveVoucherByBatchSerialResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveVoucherBySecretCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.VoucherEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveVoucherBySecretCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "batchNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "endSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "batchNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "newStateName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "endSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UseVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "useDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UseVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "voucher"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"), com.comverse_in.prepaid.ccws.VoucherEntity.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifySubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberModify"), com.comverse_in.prepaid.ccws.SubscriberModify.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifySubscriberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberCreate"), com.comverse_in.prepaid.ccws.SubscriberCreate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateSubscriberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserConfig");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetUserConfigResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetUserConfig");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "config"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeAccountBySubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfDeltaBalance"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.DeltaBalance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountBySubscriberResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeAccount4250");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NonVoucherRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), Double.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechDays"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechComm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreditAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subCreditBalances"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBalanceCreditAccount"), com.comverse_in.prepaid.ccws.BalanceCreditAccount[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceCreditAccount"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balanceChangeCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balanceChangeComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendSMSNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "notificationMSG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "notificationInterFaceName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SendSMSNotificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteSubscriberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reservationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "sluName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "processName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "crn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CancelReservationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriberIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.Identity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberIdentitiesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveSubscriberWithIdentityNoHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "informationToRetrieve"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberWithIdentityNoHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveSubscriberWithIdentityWithHistoryForMultipleIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "informationToRetrieve"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsAllIdentity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberWithIdentityWithHistoryForMultipleIdentitiesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FastSubscriberRetrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "informationToRetrieve"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsAllIdentity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberFastWithIdentityWithHistoryForMultipleIdentitiesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubscriberID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "oldSubscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "newSubscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetChargeCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reloadData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfString"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetChargeCodesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGlobalIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reloadData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.Identity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGlobalIdentitiesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reloadData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfServiceParameter"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.ServiceParameter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetServiceParametersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRangeMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "reloadData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfRange"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.Range[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetRangeMapResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PostpaidCreditLimitReset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "billCycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "billPeriod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "tableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CatalogSync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "versionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubStatusAllIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identityStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentityStatus"), com.comverse_in.prepaid.ccws.IdentityStatus[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityStatus"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateGroupAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupAccountCreate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountCreate"), com.comverse_in.prepaid.ccws.GroupAccountCreate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyGroupAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupAccountModify"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountModify"), com.comverse_in.prepaid.ccws.GroupAccountModify.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteGroupAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.GroupAccountRetrieve.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupCountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeAccountByGroupName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfDeltaBalance"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.DeltaBalance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountByGroupNameResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupOwner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBasic"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SubscriberBasic.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupOwnerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddMemberToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identityName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "enableDefaults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeAllowed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveMemberFromGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllGroupMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfSubscriberRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SubscriberRetrieve[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetAllGroupMembersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrievePostpaidBilledBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BilledBalance"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.BilledBalance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrievePostpaidBilledBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeBilledAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secretCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechargeComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PostpaidDeltaBalance"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PostpaidDeltaBalance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeBilledAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccessNumbers");
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfAccessNumberInfo"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.AccessNumberInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetAccessNumbersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumberInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateNP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "originalNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "routedNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveNP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "originalNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NPEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.NPEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveNPResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteNP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "originalNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReserveVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "INSwitchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secreteCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.VoucherEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReserveVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnReserveVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secreteCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.VoucherEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnReserveVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsumeVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "INSwitchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secreteCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.VoucherEntity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ConsumeVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExternalNonVoucherRecharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), Double.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechDays"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rechComm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "INSwitchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyConversionRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ExternalNonVoucherRechargeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCurrencyConversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyConversion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionCreate"), com.comverse_in.prepaid.ccws.CurrencyConversionCreate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AddCurrencyConversionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyCurrencyConversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyConversion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionModify"), com.comverse_in.prepaid.ccws.CurrencyConversionModify.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyCurrencyConversionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveCurrencyConversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyConversion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionDelete"), com.comverse_in.prepaid.ccws.CurrencyConversionDelete.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCurrencyConversionRetrieve"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCurrencyConversionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRetrieve"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCurrencyConversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyConversion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionDelete"), com.comverse_in.prepaid.ccws.CurrencyConversionDelete.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCurrencyConversionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreditAccumulator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "credits"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCreditAccumulator"), com.comverse_in.prepaid.ccws.CreditAccumulator[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NonVoucherRechargeGeneric");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeRequest"), com.comverse_in.prepaid.ccws.NonVoucherRechargeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeGenericResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCOS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOSRequest"), com.comverse_in.prepaid.ccws.ChangeCOSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOSResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.ChangeCOSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOSResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateHomeLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateHomeLocationRequest"), com.comverse_in.prepaid.ccws.CreateHomeLocationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeLocationResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.HomeLocationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateHomeLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteHomeLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteHomeLocationRequest"), com.comverse_in.prepaid.ccws.DeleteHomeLocationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeLocationResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.HomeLocationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteHomeLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePhonebookNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePhonebookNumberRequest"), com.comverse_in.prepaid.ccws.CreatePhonebookNumberRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PhonebookNumberResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PhonebookNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePhonebookNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePhonebookNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePhonebookNumberRequest"), com.comverse_in.prepaid.ccws.DeletePhonebookNumberRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PhonebookNumberResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PhonebookNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePhonebookNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePeriodicCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePeriodicChargeRequest"), com.comverse_in.prepaid.ccws.CreatePeriodicChargeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicChargeResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PeriodicChargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePeriodicChargeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePeriodicCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePeriodicChargeRequest"), com.comverse_in.prepaid.ccws.DeletePeriodicChargeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicChargeResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PeriodicChargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePeriodicChargeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCallingCircle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleRequest"), com.comverse_in.prepaid.ccws.ChangeCallingCircleRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCallingCircle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircleRequest"), com.comverse_in.prepaid.ccws.DeleteCallingCircleRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircleResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveCallingCircles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesRequest"), com.comverse_in.prepaid.ccws.RetrieveCallingCirclesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.CallingCircle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circles"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyCallingCircleMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCircleMemberOperation"), com.comverse_in.prepaid.ccws.CircleMemberOperation[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMemberOperation"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCircleOperationResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.CircleOperationResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyCallingCircleMembersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveCircleMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCircleMembersRequest"), com.comverse_in.prepaid.ccws.RetrieveCircleMembersRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCirclesMembersResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.CircleMember[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCircleMembersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "members"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAccumulatorValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueRequest"), com.comverse_in.prepaid.ccws.SetAccumulatorValueRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveAccumulatorValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValueRequest"), com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValueResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValueResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AssignBonusPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanRequest"), com.comverse_in.prepaid.ccws.AssignBonusPlanRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.AssignBonusPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveBonusPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlanRequest"), com.comverse_in.prepaid.ccws.RemoveBonusPlanRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlanResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlanResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriberDataForAllIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentityRequest"), com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentityResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentitiesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSubscriberDataForAllIdentities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentityRequest"), com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentityResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentitiesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuditEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "auditEvent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AuditEvent"), com.comverse_in.prepaid.ccws.AuditEvent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PromisedPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentRequest"), com.comverse_in.prepaid.ccws.PromisedPaymentRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.PromisedPaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeAccountWithPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountPIRequest"), com.comverse_in.prepaid.ccws.RechargeAccountPIRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountPIResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.RechargeAccountPIResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountWithPIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("P2PBalanceTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalTransferRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferRequest"), com.comverse_in.prepaid.ccws.P2PBalanceTransferRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferResponse"));
        oper.setReturnClass(com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

    }

    public ServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumberInfo");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.AccessNumberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Accumulator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ActivityDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfAccessNumberInfo");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.AccessNumberInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumberInfo");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumberInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfAccumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Accumulator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfActivityDefinition");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ActivityDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBalanceCreditAccount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceCreditAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceCreditAccount");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceCreditAccount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBalanceDefinition");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBalanceEntity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntity");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBalanceEntityBase");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceEntityBase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntityBase");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfBonusPlan");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BonusPlan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCallHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CallHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCircleMemberOperation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMemberOperation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMemberOperation");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMemberOperation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCircleMembership");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMembership[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCircleOperationResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleOperationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperationResponse");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfClassOfService");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ClassOfService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCosAccumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CosAccumulator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCosBalanceOrder");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CosBalanceOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCOSFriend");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.COSFriend[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCreditAccumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CreditAccumulator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCurrencyConversion");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCurrencyConversionRetrieve");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRetrieve");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRetrieve");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfCurrencyUnit");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyUnit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfDeltaBalance");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeltaBalance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfDiscountPlan");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DiscountPlan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfGroupAccountSpendingLimit");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountSpendingLimit");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountSpendingLimit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Identity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentityHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.IdentityHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfIdentityStatus");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.IdentityStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityStatus");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfInvoiceAmount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.InvoiceAmount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmount");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfLang_NAME_ID");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Lang_NAME_ID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Lang_NAME_ID");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Lang_NAME_ID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfLifeCycle");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.LifeCycle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfMonetaryTransactionRecord");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.MonetaryTransactionRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionRecord");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionsRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfOSAHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.OSAHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfPeriodicCharge");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PeriodicCharge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfPreCallThreshold");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PreCallThreshold[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfRange");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Range[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfRechargeHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RechargeHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfReservation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Reservation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservation");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservations");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfReservationAmount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ReservationAmount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfServiceParameter");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ServiceParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfSP_NAME_ID");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SP_NAME_ID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfSubscriberPeriodicCharge");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPeriodicCharge");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfSubscriberRetrieve");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberRetrieve[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ArrayOfUnitType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.UnitType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitType");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.AssignBonusPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.AssignBonusPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AuditEvent");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.AuditEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceCreditAccount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceCreditAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntityBase");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BalanceEntityBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BilledBalance");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BilledBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.BonusPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CallHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircle");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CallingCircle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircleOperation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CallingCircleOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ChangeCallingCircleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircleResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOSRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ChangeCOSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOSResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ChangeCOSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMember");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMemberOperation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMemberOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMembership.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleOperationResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleOperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClassOfService");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ClassOfService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ClientCache");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ClientCache.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CosAccumulator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CosBalanceOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.COSFriend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateHomeLocationRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CreateHomeLocationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePeriodicChargeRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CreatePeriodicChargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePhonebookNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CreatePhonebookNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CreditAccumulator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGMembers");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CUGMembers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionCreate");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversionCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionDelete");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversionDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionModify");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversionModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRetrieve");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyUnit");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CurrencyUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DatePeriod");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DatePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircleRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeleteCallingCircleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircleResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteHomeLocationRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeleteHomeLocationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePeriodicChargeRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeletePeriodicChargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePhonebookNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeletePhonebookNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeltaBalance");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DeltaBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlan");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.DiscountPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastCallHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FastCallHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastMonetaryTransactionRecord");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FastMonetaryTransactionRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastOSAHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FastOSAHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastPSTransaction");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FastPSTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FastRechargeHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FastRechargeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FinancialHandlingType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FinancialHandlingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FundsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsUsageType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.FundsUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentityRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentityResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountBase");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountCreate");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountModify");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountRetrieve");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountRetrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountSpendingLimit");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupAccountSpendingLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupMemberType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.GroupMemberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeLocationResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.HomeLocationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Identity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.IdentityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentitySpecficData");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.IdentitySpecficData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityStatus");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.IdentityStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvoiceAmount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.InvoiceAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Lang_NAME_ID");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Lang_NAME_ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LifeCycle");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.LifeCycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionRecord");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.MonetaryTransactionRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVersionCache");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.NonVersionCache.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.NonVoucherRechargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NPEntity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.NPEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.OSAHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.P2PBalanceTransferRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PeriodicCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicChargeResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PeriodicChargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PhonebookNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PhonebookNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PostpaidDeltaBalance");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PostpaidDeltaBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PreCallThreshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PrecedenceOrderType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PrecedenceOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PromisedPaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PromisedPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PSTransaction");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.PSTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Range");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Range.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountPIRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RechargeAccountPIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountPIResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RechargeAccountPIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RechargeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RemoveBonusPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reservation");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.Reservation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ReservationAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValueRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValueResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RetrieveCallingCirclesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCirclesResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CallingCircle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircle");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circles");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCircleMembersRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.RetrieveCircleMembersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCirclesMembersResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.CircleMember[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMember");
            qName2 = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "members");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceParameter");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.ServiceParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SetAccumulatorValueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SP_NAME_ID");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SP_NAME_ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberAccountType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBase");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBasic");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberCreate");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberEntity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberHome");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberHome.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberInfo");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberMainBase");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberMainBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberModify");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPB");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberPB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPeriodicCharge");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPPS");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberPPS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberRetrieve");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.SubscriberRetrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitType");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.UnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentityRequest");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentityResponse");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherEntity");
            cachedSerQNames.add(qName);
            cls = com.comverse_in.prepaid.ccws.VoucherEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public Integer getVersionId() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetVersionId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetVersionId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Integer) _resp;
            } catch (Exception _exception) {
                return (Integer) org.apache.axis.utils.JavaUtils.convert(_resp, Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.ClientCache getCache() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetCache");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.ClientCache) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.ClientCache) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.ClientCache.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.NonVersionCache getNonVersionCache(Boolean reloadData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetNonVersionCache");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetNonVersionCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reloadData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.NonVersionCache) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.NonVersionCache) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.NonVersionCache.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String[] getLocations() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String[]) _resp;
            } catch (Exception _exception) {
                return (String[]) org.apache.axis.utils.JavaUtils.convert(_resp, String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean changePassword(String newPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ChangePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {newPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String[] getRoles() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetRoles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String[]) _resp;
            } catch (Exception _exception) {
                return (String[]) org.apache.axis.utils.JavaUtils.convert(_resp, String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.VoucherEntity retrieveVoucherByBatchSerial(Long batchNumber, Long serialNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveVoucherByBatchSerial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveVoucherByBatchSerial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchNumber, serialNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.VoucherEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.VoucherEntity retrieveVoucherBySecretCode(String secretCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveVoucherBySecretCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveVoucherBySecretCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {secretCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.VoucherEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Integer deleteVoucher(java.math.BigDecimal batchNumber, java.math.BigDecimal startSerial, java.math.BigDecimal endSerial) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchNumber, startSerial, endSerial});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Integer) _resp;
            } catch (Exception _exception) {
                return (Integer) org.apache.axis.utils.JavaUtils.convert(_resp, Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Integer modifyVoucher(java.math.BigDecimal batchNumber, String newStateName, java.math.BigDecimal startSerial, java.math.BigDecimal endSerial) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ModifyVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchNumber, newStateName, startSerial, endSerial});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Integer) _resp;
            } catch (Exception _exception) {
                return (Integer) org.apache.axis.utils.JavaUtils.convert(_resp, Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Integer useVoucher(String secretCode, java.util.Calendar useDate, String subscriberId, String identity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/UseVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UseVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {secretCode, useDate, subscriberId, identity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Integer) _resp;
            } catch (Exception _exception) {
                return (Integer) org.apache.axis.utils.JavaUtils.convert(_resp, Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean createVoucher(com.comverse_in.prepaid.ccws.VoucherEntity voucher) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreateVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {voucher});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean modifySubscriber(com.comverse_in.prepaid.ccws.SubscriberModify subscriber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ModifySubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifySubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean createSubscriber(com.comverse_in.prepaid.ccws.SubscriberCreate subscriber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String getUserConfig() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetUserConfig");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetUserConfig"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setUserConfig(String config) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/SetUserConfig");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetUserConfig"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {config});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.DeltaBalance[] rechargeAccountBySubscriber(String subscriberId, String identity, String secretCode, String rechargeComment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RechargeAccountBySubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountBySubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, secretCode, rechargeComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.DeltaBalance[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.DeltaBalance[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.DeltaBalance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean rechargeAccount4250(String subscriberId, String secretCode, String rechargeComment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RechargeAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, secretCode, rechargeComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean nonVoucherRecharge(String subscriberId, String identity, Double rechValue, Integer rechDays, String rechComm) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/NonVoucherRecharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, rechValue, rechDays, rechComm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean creditAccount(String subscriberID, String identity, com.comverse_in.prepaid.ccws.BalanceCreditAccount[] subCreditBalances, String balanceChangeCode, String balanceChangeComment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreditAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identity, subCreditBalances, balanceChangeCode, balanceChangeComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean sendSMSNotification(String subscriberId, String identity, String notificationMSG, String notificationInterFaceName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/SendSMSNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SendSMSNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, notificationMSG, notificationInterFaceName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean deleteSubscriber(String subscriberId, String identity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean cancelReservation(String subscriberId, String identity, Long reservationId, String sluName, String processName, String crn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CancelReservation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CancelReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, reservationId, sluName, processName, crn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.Identity[] getSubscriberIdentities(String subscriberID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetSubscriberIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.Identity[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.Identity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.Identity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SubscriberRetrieve retrieveSubscriberWithIdentityNoHistory(String subscriberID, String identity, Integer informationToRetrieve) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveSubscriberWithIdentityNoHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberWithIdentityNoHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identity, informationToRetrieve});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SubscriberRetrieve retrieveSubscriberWithIdentityWithHistoryForMultipleIdentities(String subscriberID, String identity, Integer informationToRetrieve, java.util.Calendar startDate, java.util.Calendar endDate, Boolean isAllIdentity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveSubscriberWithIdentityWithHistoryForMultipleIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberWithIdentityWithHistoryForMultipleIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identity, informationToRetrieve, startDate, endDate, isAllIdentity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SubscriberRetrieve fastSubscriberRetrieve(String subscriberID, String identity, Integer informationToRetrieve, java.util.Calendar startDate, java.util.Calendar endDate, Boolean isAllIdentity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveSubscriberFastWithIdentityWithHistoryForMultipleIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveSubscriberFastWithIdentityWithHistoryForMultipleIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identity, informationToRetrieve, startDate, endDate, isAllIdentity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SubscriberRetrieve.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changeSubscriberID(String oldSubscriberID, String newSubscriberID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ChangeSubscriberID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeSubscriberID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {oldSubscriberID, newSubscriberID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String[] getChargeCodes(Boolean reloadData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetChargeCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetChargeCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reloadData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String[]) _resp;
            } catch (Exception _exception) {
                return (String[]) org.apache.axis.utils.JavaUtils.convert(_resp, String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.Identity[] getGlobalIdentities(Boolean reloadData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetGlobalIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGlobalIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reloadData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.Identity[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.Identity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.Identity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.ServiceParameter[] getServiceParameters(Boolean reloadData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetServiceParameters");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetServiceParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reloadData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.ServiceParameter[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.ServiceParameter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.ServiceParameter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.Range[] getRangeMap(Boolean reloadData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetRangeMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetRangeMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reloadData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.Range[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.Range[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.Range[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void postpaidCreditLimitReset(Integer billCycle, java.util.Calendar billPeriod, String tableName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/PostpaidCreditLimitReset");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PostpaidCreditLimitReset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {billCycle, billPeriod, tableName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void catalogSync(Integer versionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CatalogSync");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CatalogSync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {versionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changeSubStatusAllIdentities(String subscriberID, com.comverse_in.prepaid.ccws.IdentityStatus[] identityStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ChangeSubStatusAllIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeSubStatusAllIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identityStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createGroupAccount(com.comverse_in.prepaid.ccws.GroupAccountCreate groupAccountCreate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreateGroupAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateGroupAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupAccountCreate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void modifyGroupAccount(com.comverse_in.prepaid.ccws.GroupAccountModify groupAccountModify) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ModifyGroupAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyGroupAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupAccountModify});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteGroupAccount(String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteGroupAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteGroupAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.GroupAccountRetrieve getGroupAccount(String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetGroupAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.GroupAccountRetrieve) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.GroupAccountRetrieve) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.GroupAccountRetrieve.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Long getGroupCount(String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetGroupCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Long) _resp;
            } catch (Exception _exception) {
                return (Long) org.apache.axis.utils.JavaUtils.convert(_resp, Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.DeltaBalance[] rechargeAccountByGroupName(String groupName, String secretCode, String rechargeComment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RechargeAccountByGroupName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountByGroupName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName, secretCode, rechargeComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.DeltaBalance[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.DeltaBalance[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.DeltaBalance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SubscriberBasic getGroupOwner(String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetGroupOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetGroupOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SubscriberBasic) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SubscriberBasic) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SubscriberBasic.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addMemberToGroup(String groupName, String subscriberID, String identityName, Boolean enableDefaults, Boolean rechargeAllowed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/AddMemberToGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AddMemberToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName, subscriberID, identityName, enableDefaults, rechargeAllowed});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeMemberFromGroup(String subscriberID, String identity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RemoveMemberFromGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveMemberFromGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberID, identity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SubscriberRetrieve[] getAllGroupMembers(String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetAllGroupMembers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetAllGroupMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SubscriberRetrieve[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SubscriberRetrieve[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.BilledBalance retrievePostpaidBilledBalance(String subscriberId, String identity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrievePostpaidBilledBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrievePostpaidBilledBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.BilledBalance) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.BilledBalance) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.BilledBalance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PostpaidDeltaBalance rechargeBilledAccount(String subscriberId, String identity, String secretCode, String rechargeComment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RechargeBilledAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeBilledAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, secretCode, rechargeComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PostpaidDeltaBalance) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PostpaidDeltaBalance) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PostpaidDeltaBalance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.AccessNumberInfo[] getAccessNumbers() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetAccessNumbers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetAccessNumbers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.AccessNumberInfo[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.AccessNumberInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.AccessNumberInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateNP(String originalNumber, String routedNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/UpdateNP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateNP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {originalNumber, routedNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.NPEntity retrieveNP(String originalNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveNP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveNP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {originalNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.NPEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.NPEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.NPEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteNP(String originalNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteNP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteNP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {originalNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.VoucherEntity reserveVoucher(String subscriberId, String identity, Integer INSwitchID, String secreteCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ReserveVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReserveVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, INSwitchID, secreteCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.VoucherEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.VoucherEntity unReserveVoucher(String secreteCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/UnReserveVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnReserveVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {secreteCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.VoucherEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.VoucherEntity consumeVoucher(String subscriberId, String identity, Integer INSwitchID, String secreteCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ConsumeVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ConsumeVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, INSwitchID, secreteCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.VoucherEntity) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.VoucherEntity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean externalNonVoucherRecharge(String subscriberId, String identity, Double rechValue, Integer rechDays, String rechComm, Integer INSwitchID, java.math.BigDecimal currencyConversionRate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ExternalNonVoucherRecharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ExternalNonVoucherRecharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, rechValue, rechDays, rechComm, INSwitchID, currencyConversionRate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean addCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionCreate currencyConversion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/AddCurrencyConversion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AddCurrencyConversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currencyConversion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean modifyCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionModify currencyConversion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ModifyCurrencyConversion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyCurrencyConversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currencyConversion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[] retrieveCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionDelete currencyConversion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveCurrencyConversion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCurrencyConversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currencyConversion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Boolean deleteCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionDelete currencyConversion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteCurrencyConversion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCurrencyConversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currencyConversion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Boolean) _resp;
            } catch (Exception _exception) {
                return (Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void creditAccumulator(String subscriberId, String identity, com.comverse_in.prepaid.ccws.CreditAccumulator[] credits) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreditAccumulator");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberId, identity, credits});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse nonVoucherRechargeGeneric(com.comverse_in.prepaid.ccws.NonVoucherRechargeRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/NonVoucherRechargeGeneric");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NonVoucherRechargeGeneric"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.ChangeCOSResponse changeCOS(com.comverse_in.prepaid.ccws.ChangeCOSRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ChangeCOS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCOS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.ChangeCOSResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.ChangeCOSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.ChangeCOSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.HomeLocationResponse createHomeLocation(com.comverse_in.prepaid.ccws.CreateHomeLocationRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreateHomeLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreateHomeLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.HomeLocationResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.HomeLocationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.HomeLocationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.HomeLocationResponse deleteHomeLocation(com.comverse_in.prepaid.ccws.DeleteHomeLocationRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteHomeLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteHomeLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.HomeLocationResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.HomeLocationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.HomeLocationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PhonebookNumberResponse createPhonebookNumber(com.comverse_in.prepaid.ccws.CreatePhonebookNumberRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreatePhonebookNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePhonebookNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PhonebookNumberResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PhonebookNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PhonebookNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PhonebookNumberResponse deletePhonebookNumber(com.comverse_in.prepaid.ccws.DeletePhonebookNumberRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeletePhonebookNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePhonebookNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PhonebookNumberResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PhonebookNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PhonebookNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PeriodicChargeResponse createPeriodicCharge(com.comverse_in.prepaid.ccws.CreatePeriodicChargeRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/CreatePeriodicCharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreatePeriodicCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PeriodicChargeResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PeriodicChargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PeriodicChargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PeriodicChargeResponse deletePeriodicCharge(com.comverse_in.prepaid.ccws.DeletePeriodicChargeRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeletePeriodicCharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeletePeriodicCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PeriodicChargeResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PeriodicChargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PeriodicChargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse changeCallingCircle(com.comverse_in.prepaid.ccws.ChangeCallingCircleRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ChangeCallingCircle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeCallingCircle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse deleteCallingCircle(com.comverse_in.prepaid.ccws.DeleteCallingCircleRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/DeleteCallingCircle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteCallingCircle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.CallingCircle[] retrieveCallingCircles(com.comverse_in.prepaid.ccws.RetrieveCallingCirclesRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveCallingCircles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCallingCircles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.CallingCircle[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.CallingCircle[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.CallingCircle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.CircleOperationResponse[] modifyCallingCircleMembers(com.comverse_in.prepaid.ccws.CircleMemberOperation[] request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/ModifyCallingCircleMembers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModifyCallingCircleMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.CircleOperationResponse[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.CircleOperationResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.CircleOperationResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.CircleMember[] retrieveCircleMembers(com.comverse_in.prepaid.ccws.RetrieveCircleMembersRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveCircleMembers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveCircleMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.CircleMember[]) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.CircleMember[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.CircleMember[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse setAccumulatorValue(com.comverse_in.prepaid.ccws.SetAccumulatorValueRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/SetAccumulatorValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse retrieveAccumulatorValue(com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RetrieveAccumulatorValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RetrieveAccumulatorValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.AssignBonusPlanResponse assignBonusPlan(com.comverse_in.prepaid.ccws.AssignBonusPlanRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/AssignBonusPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.AssignBonusPlanResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.AssignBonusPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.AssignBonusPlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse removeBonusPlan(com.comverse_in.prepaid.ccws.RemoveBonusPlanRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RemoveBonusPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RemoveBonusPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse getSubscriberDataForAllIdentities(com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/GetSubscriberDataForAllIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse updateSubscriberDataForAllIdentities(com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/UpdateSubscriberDataForAllIdentities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void auditEvent(com.comverse_in.prepaid.ccws.AuditEvent auditEvent) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/AuditEvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AuditEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {auditEvent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.PromisedPaymentResponse promisedPayment(com.comverse_in.prepaid.ccws.PromisedPaymentRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/PromisedPayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.PromisedPaymentResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.PromisedPaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.PromisedPaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.RechargeAccountPIResponse rechargeAccountWithPI(com.comverse_in.prepaid.ccws.RechargeAccountPIRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/RechargeAccountWithPI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountWithPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.RechargeAccountPIResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.RechargeAccountPIResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.RechargeAccountPIResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse p2PBalanceTransfer(com.comverse_in.prepaid.ccws.P2PBalanceTransferRequest p2PBalTransferRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://comverse-in.com/prepaid/ccws/P2PBalanceTransfer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {p2PBalTransferRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse) _resp;
            } catch (Exception _exception) {
                return (com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
