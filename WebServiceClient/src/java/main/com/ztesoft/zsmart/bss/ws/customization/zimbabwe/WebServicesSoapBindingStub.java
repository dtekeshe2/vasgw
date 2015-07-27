/**
 * WebServicesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class WebServicesSoapBindingStub extends org.apache.axis.client.Stub implements com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[37];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBalanceAndUsageAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUserAcctByIndiPricePlanSubs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanSubsReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanSubsReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanSubsReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUserAcctByIndiPricePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubsUsage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySubsUsagePricePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPUKCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryCustomerPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddVAS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddVASReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddVASReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddVASReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveVAS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveVASReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveVASReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RemoveVASReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePricePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangePricePlanReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangePricePlanReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangePricePlanReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewConnectionReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewConnectionReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.NewConnectionReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Termination");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TerminationReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TerminationReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.TerminationReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SuspensionUnderReq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SuspensionUnderReqReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SuspensionUnderReqReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SuspensionUnderReqReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReactivationUnderReq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReactivationUnderReqReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReactivationUnderReqReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReactivationUnderReqReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeUserNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserNumberReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserNumberReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserNumberReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeUserBrand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserBrandReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserBrandReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserBrandReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReleaseRCBlacklist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReleaseRCBlacklistReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReleaseRCBlacklistReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReleaseRCBlacklistReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryUserProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModUserIndiPricePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModUserIndiPricePlanReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModUserIndiPricePlanReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModUserIndiPricePlanReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryIndividualPricePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAcctBal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAcmBal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Recharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BalTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscriberRegister");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubscriberRegisterReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubscriberRegisterReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubscriberRegisterReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrePaidSubscriberRegister");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrePaidSubscriberRegisterReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrePaidSubscriberRegisterReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PrePaidSubscriberRegisterReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CellPhoneNumberIdentify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeductFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeRetDto"));
        oper.setReturnClass(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModProdState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModProdStateReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModProdStateReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModProdStateReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeFreeNumberForHybrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeFreeNumberForHybridReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeFreeNumberForHybridReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeFreeNumberForHybridReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddMemberIntoCUG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddMemberIntoCUGReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CUGMemberReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveMemberFromCUG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveMemberFromCUGReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CUGMemberReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrepaidToHybrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrepaidToHybridReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PostpaidToHybrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PostpaidToHybridReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HybridToPrepaid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPrepaidReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPrepaidReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPrepaidReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HybridToPostpaid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPostpaidReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPostpaidReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPostpaidReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PaymentReverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PaymentReverseReqDto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PaymentReverseReqDto"), com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PaymentReverseReqDto.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

    }

    public WebServicesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WebServicesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WebServicesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanSubsReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanSubsReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddVASReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddVASReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfBalDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfBalShareDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalShareDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfBonus");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfCustAttrDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfFellowISDNDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfPricePlanChgDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfPricePlanDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfPricePlanDtoQueryIndividualPricePlan");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoQueryIndividualPricePlan");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfSubsAttrDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ArrayOfSupServiceDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDto");
            qName2 = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Bonus");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.Bonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentifyRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeFreeNumberForHybridReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeFreeNumberForHybridReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangePricePlanReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangePricePlanReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserBrandReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserBrandReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserNumberReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserNumberReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CUGMemberReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CustAttrDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CustAttrDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFeeRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "FellowISDNDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.FellowISDNDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPostpaidReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPostpaidReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPrepaidReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPrepaidReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModProdStateReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModProdStateReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModUserIndiPricePlanReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModUserIndiPricePlanReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewConnectionReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.NewConnectionReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PaymentReverseReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PaymentReverseReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrePaidSubscriberRegisterReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PrePaidSubscriberRegisterReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanChgDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanChgDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PricePlanDtoQueryIndividualPricePlan");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PricePlanDtoQueryIndividualPricePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBalRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBalRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmountRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPasswordRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlanRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCodeRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlanRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsageRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfileRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReactivationUnderReqReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReactivationUnderReqReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RechargeRetDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReleaseRCBlacklistReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReleaseRCBlacklistReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveVASReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RemoveVASReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubsAttrDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubsAttrDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubscriberRegisterReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubscriberRegisterReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SupServiceDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SupServiceDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SuspensionUnderReqReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SuspensionUnderReqReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "TerminationReqDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.TerminationReqDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "UserProfileDto");
            cachedSerQNames.add(qName);
            cls = com.ztesoft.zsmart.bss.ws.customization.zimbabwe.UserProfileDto.class;
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

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto queryBalanceAndUsageAmount(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountReqDto queryBalanceAndUsageAmountReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryBalanceAndUsageAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryBalanceAndUsageAmountReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addUserAcctByIndiPricePlanSubs(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanSubsReqDto addUserAcctByIndiPricePlanSubsReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlanSubs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addUserAcctByIndiPricePlanSubsReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addUserAcctByIndiPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanReqDto addUserAcctByIndiPricePlanReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddUserAcctByIndiPricePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addUserAcctByIndiPricePlanReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto querySubsUsage(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageReqDto querySubsUsageReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {querySubsUsageReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto querySubsUsagePricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanReqDto querySubsUsagePricePlanReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QuerySubsUsagePricePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {querySubsUsagePricePlanReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto queryPUKCode(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeReqDto queryPUKCodeReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryPUKCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryPUKCodeReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto queryCustomerPassword(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordReqDto queryCustomerPasswordReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryCustomerPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryCustomerPasswordReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addVAS(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddVASReqDto addVASReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddVAS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addVASReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeVAS(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RemoveVASReqDto removeVASReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveVAS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {removeVASReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changePricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangePricePlanReqDto changePricePlanReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangePricePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changePricePlanReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void newConnection(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.NewConnectionReqDto newConnectionReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "NewConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {newConnectionReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void termination(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.TerminationReqDto terminationReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Termination"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {terminationReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void suspensionUnderReq(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SuspensionUnderReqReqDto suspensionUnderReqReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SuspensionUnderReq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {suspensionUnderReqReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reactivationUnderReq(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReactivationUnderReqReqDto reactivationUnderReqReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReactivationUnderReq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {reactivationUnderReqReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changeUserNumber(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserNumberReqDto changeUserNumberReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changeUserNumberReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changeUserBrand(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserBrandReqDto changeUserBrandReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeUserBrand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changeUserBrandReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void releaseRCBlacklist(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReleaseRCBlacklistReqDto releaseRCBlacklistReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ReleaseRCBlacklist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {releaseRCBlacklistReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto queryUserProfile(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileReqDto queryUserProfileReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryUserProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryUserProfileReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void modUserIndiPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModUserIndiPricePlanReqDto modUserIndiPricePlanReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModUserIndiPricePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {modUserIndiPricePlanReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto queryIndividualPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanReqDto queryIndividualPricePlanReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryIndividualPricePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryIndividualPricePlanReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto queryAcctBal(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalReqDto queryAcctBalReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcctBal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryAcctBalReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto queryAcmBal(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalReqDto queryAcmBalReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "QueryAcmBal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryAcmBalReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto recharge(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeReqDto rechargeReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Recharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {rechargeReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto balTransfer(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferReqDto balTransferReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {balTransferReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void subscriberRegister(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubscriberRegisterReqDto subscriberRegisterReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "SubscriberRegister"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {subscriberRegisterReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void prePaidSubscriberRegister(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PrePaidSubscriberRegisterReqDto prePaidSubscriberRegisterReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrePaidSubscriberRegister"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {prePaidSubscriberRegisterReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto cellPhoneNumberIdentify(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyReqDto cellPhoneNumberIdentifyReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "CellPhoneNumberIdentify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {cellPhoneNumberIdentifyReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto deductFee(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeReqDto deductFeeReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "DeductFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deductFeeReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto) _resp;
            } catch (Exception _exception) {
                return (com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto) org.apache.axis.utils.JavaUtils.convert(_resp, com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void modProdState(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModProdStateReqDto modProdStateReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ModProdState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {modProdStateReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changeFreeNumberForHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeFreeNumberForHybridReqDto changeFreeNumberForHybridReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "ChangeFreeNumberForHybrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changeFreeNumberForHybridReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addMemberIntoCUG(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto addMemberIntoCUGReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "AddMemberIntoCUG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addMemberIntoCUGReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeMemberFromCUG(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto removeMemberFromCUGReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "RemoveMemberFromCUG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {removeMemberFromCUGReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void prepaidToHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto prepaidToHybridReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PrepaidToHybrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {prepaidToHybridReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void postpaidToHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto postpaidToHybridReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PostpaidToHybrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {postpaidToHybridReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void hybridToPrepaid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPrepaidReqDto hybridToPrepaidReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPrepaid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {hybridToPrepaidReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void hybridToPostpaid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPostpaidReqDto hybridToPostpaidReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "HybridToPostpaid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {hybridToPostpaidReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void paymentReverse(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PaymentReverseReqDto paymentReverseReqDto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "PaymentReverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {paymentReverseReqDto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
