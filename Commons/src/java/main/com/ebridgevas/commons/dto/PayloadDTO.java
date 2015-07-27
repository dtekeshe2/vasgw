package com.ebridgevas.commons.dto;

import java.math.BigDecimal;

public class PayloadDTO
        extends JsonSerializable
{
    private String eanCode;
    private String parentEanCode;
    private String serviceEndPoint;
    private String eanDescription;
    private String eanShortDescription;
    private BigDecimal itemPrice;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private BigDecimal validUntil;
    private String validUntilUnit;

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

    public BigDecimal getItemPrice()
    {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity)
    {
        this.quantity = quantity;
    }

    public BigDecimal getRate()
    {
        return rate;
    }

    public void setRate(BigDecimal rate)
    {
        this.rate = rate;
    }

    public BigDecimal getDebitAmount()
    {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount)
    {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount()
    {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount)
    {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getValidUntil()
    {
        return validUntil;
    }

    public void setValidUntil(BigDecimal validUntil)
    {
        this.validUntil = validUntil;
    }

    public String getValidUntilUnit()
    {
        return validUntilUnit;
    }

    public void setValidUntilUnit(String validUntilUnit)
    {
        this.validUntilUnit = validUntilUnit;
    }
}
