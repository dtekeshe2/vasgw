package com.ebridge.commons.dto;

import com.ebridgevas.commons.dto.JsonSerializable;

import java.util.List;

public class BalanceTransferRequestForm extends JsonSerializable
{
    private String eanCode;
    private String parentEanCode;
    private String sourceEndPoint;
    private String serviceEndPoint;
    private String eanDescription;
    private String eanShortDescription;

    private List<BalanceTransferRequestFormParameter> parameters;

    public String getEanCode()
    {
        return eanCode;
    }

    public void setEanCode(String eanCode)
    {
        this.eanCode = eanCode;
    }

    public String getParentEanCode()
    {
        return parentEanCode;
    }

    public void setParentEanCode(String parentEanCode)
    {
        this.parentEanCode = parentEanCode;
    }

    public String getSourceEndPoint()
    {
        return sourceEndPoint;
    }

    public void setSourceEndPoint(String sourceEndPoint)
    {
        this.sourceEndPoint = sourceEndPoint;
    }

    public String getServiceEndPoint()
    {
        return serviceEndPoint;
    }

    public void setServiceEndPoint(String serviceEndPoint)
    {
        this.serviceEndPoint = serviceEndPoint;
    }

    public String getEanDescription()
    {
        return eanDescription;
    }

    public void setEanDescription(String eanDescription)
    {
        this.eanDescription = eanDescription;
    }

    public String getEanShortDescription()
    {
        return eanShortDescription;
    }

    public void setEanShortDescription(String eanShortDescription)
    {
        this.eanShortDescription = eanShortDescription;
    }

    public List<BalanceTransferRequestFormParameter> getParameters()
    {
        return parameters;
    }

    public void setParameters(List<BalanceTransferRequestFormParameter> parameters)
    {
        this.parameters = parameters;
    }
}
