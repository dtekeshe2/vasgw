package com.ebridge.commons.dto;

import com.ebridgevas.commons.dto.JsonSerializable;

import java.math.BigDecimal;

public class BalanceTransferRequestFormParameter extends JsonSerializable
{
    private Integer index;
    private String name;
    private String label;
    private String type;
    private BigDecimal min;
    private BigDecimal max;

    public Integer getIndex()
    {
        return index;
    }

    public void setIndex(Integer index)
    {
        this.index = index;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public BigDecimal getMin()
    {
        return min;
    }

    public void setMin(BigDecimal min)
    {
        this.min = min;
    }

    public BigDecimal getMax()
    {
        return max;
    }

    public void setMax(BigDecimal max)
    {
        this.max = max;
    }
}

