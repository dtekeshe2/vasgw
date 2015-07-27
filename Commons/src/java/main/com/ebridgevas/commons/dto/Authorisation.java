package com.ebridgevas.commons.dto;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Authorisation
    extends JsonSerializable
{
    private Long uuid;
    private String productCode;
    private String productDescription;
    private String processingCode;
    private String fromAccountNumber;
    private String fromAccountType;
    private String toAccountNumber;
    private String toAccountType;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private BigDecimal transactionFee;
    private DateTime expiryDate;
    private BigDecimal quantity;
    private String resultCode;
    private String narrative1;
    private BigDecimal balance1;
    private String narrative2;
    private BigDecimal balance2;
    private DateTime dateTime1;
    private DateTime dateTime2;
    private Date transactionDate;
    private Set<BalanceDTO> balances;

    public Authorisation(Long uuid)
    {
        this.uuid = uuid;
    }

    public Authorisation(
            Long uuid,
            String productCode,
            String productDescription,
            String processingCode,
            String fromAccountNumber,
            String fromAccountType,
            String toAccountNumber,
            String toAccountType,
            BigDecimal debitAmount,
            BigDecimal creditAmount,
            BigDecimal transactionFee,
            DateTime expiryDate,
            BigDecimal quantity)
    {
        this.uuid = uuid;
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.processingCode = processingCode;
        this.fromAccountNumber = fromAccountNumber;
        this.fromAccountType = fromAccountType;
        this.toAccountNumber = toAccountNumber;
        this.toAccountType = toAccountType;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
        this.transactionFee = transactionFee;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public Long getUuid()
    {
        return uuid;
    }

    public void setUuid(Long uuid)
    {
        this.uuid = uuid;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getProductDescription()
    {
        return productDescription;
    }

    public void setProductDescription(String productDescription)
    {
        this.productDescription = productDescription;
    }

    public String getProcessingCode()
    {
        return processingCode;
    }

    public void setProcessingCode(String processingCode)
    {
        this.processingCode = processingCode;
    }

    public String getFromAccountNumber()
    {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber)
    {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getFromAccountType()
    {
        return fromAccountType;
    }

    public void setFromAccountType(String fromAccountType)
    {
        this.fromAccountType = fromAccountType;
    }

    public String getToAccountNumber()
    {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber)
    {
        this.toAccountNumber = toAccountNumber;
    }

    public String getToAccountType()
    {
        return toAccountType;
    }

    public void setToAccountType(String toAccountType)
    {
        this.toAccountType = toAccountType;
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

    public BigDecimal getTransactionFee()
    {
        return transactionFee;
    }

    public void setTransactionFee(BigDecimal transactionFee)
    {
        this.transactionFee = transactionFee;
    }

    public DateTime getExpiryDate()
    {
        return expiryDate;
    }

    public void setExpiryDate(DateTime expiryDate)
    {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity)
    {
        this.quantity = quantity;
    }

    public String getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }

    public String getNarrative1()
    {
        return narrative1;
    }

    public void setNarrative1(String narrative1)
    {
        this.narrative1 = narrative1;
    }

    public BigDecimal getBalance1()
    {
        return balance1;
    }

    public void setBalance1(BigDecimal balance1)
    {
        this.balance1 = balance1;
    }

    public String getNarrative2()
    {
        return narrative2;
    }

    public void setNarrative2(String narrative2)
    {
        this.narrative2 = narrative2;
    }

    public BigDecimal getBalance2()
    {
        return balance2;
    }

    public void setBalance2(BigDecimal balance2)
    {
        this.balance2 = balance2;
    }

    public DateTime getDateTime1()
    {
        return dateTime1;
    }

    public void setDateTime1(DateTime dateTime1)
    {
        this.dateTime1 = dateTime1;
    }

    public DateTime getDateTime2()
    {
        return dateTime2;
    }

    public void setDateTime2(DateTime dateTime2)
    {
        this.dateTime2 = dateTime2;
    }

    public Date getTransactionDate()
    {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate)
    {
        this.transactionDate = transactionDate;
    }

    public Set<BalanceDTO> getBalances()
    {
        return balances;
    }

    public void setBalances(Set<BalanceDTO> balances)
    {
        this.balances = balances;
    }

    public Boolean isIntraAccount() {
        return this.fromAccountNumber.equals(this.toAccountNumber);
    }
}
