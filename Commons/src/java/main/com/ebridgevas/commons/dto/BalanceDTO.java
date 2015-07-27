package com.ebridgevas.commons.dto;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class BalanceDTO
{
    private String balanceName;
    private String balanceDescription;
    private BigDecimal balance;
    private String unitOfMeasure;
    private BigDecimal normalizationFactor;
    private String normalizedBalance;
    private DateTime expiryDate;

    public BalanceDTO()
    {
    }

    public BalanceDTO(
            String balanceName,
            String balanceDescription,
            String unitOfMeasure,
            BigDecimal normalizationFactor)
    {
        this.balanceName = balanceName;
        this.balanceDescription = balanceDescription;
        this.unitOfMeasure = unitOfMeasure;
        this.normalizationFactor = normalizationFactor;
    }

    public String getBalanceName()
    {
        return balanceName;
    }

    public void setBalanceName(String balanceName)
    {
        this.balanceName = balanceName;
    }

    public String getBalanceDescription()
    {
        return balanceDescription;
    }

    public void setBalanceDescription(String balanceDescription)
    {
        this.balanceDescription = balanceDescription;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void setBalance(BigDecimal balance)
    {
        this.balance = balance;
    }

    public String getUnitOfMeasure()
    {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure)
    {
        this.unitOfMeasure = unitOfMeasure;
    }

    public BigDecimal getNormalizationFactor()
    {
        return normalizationFactor;
    }

    public void setNormalizationFactor(BigDecimal normalizationFactor)
    {
        this.normalizationFactor = normalizationFactor;
    }

    public String getNormalizedBalance()
    {
        return normalizedBalance;
    }

    public void setNormalizedBalance(String normalizedBalance)
    {
        this.normalizedBalance = normalizedBalance;
    }

    public DateTime getExpiryDate()
    {
        return expiryDate;
    }

    public void setExpiryDate(DateTime expiryDate)
    {
        this.expiryDate = expiryDate;
    }
}
