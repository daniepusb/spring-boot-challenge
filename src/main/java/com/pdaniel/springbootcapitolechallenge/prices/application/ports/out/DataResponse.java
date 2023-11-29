package com.pdaniel.springbootcapitolechallenge.prices.application.ports.out;

import com.pdaniel.springbootcapitolechallenge.prices.adapters.out.persistence.PriceEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class DataResponse {
    private String message;
    private Long productId;
    private Long brandId;
    private Timestamp startDate;
    private Timestamp endDate;
    private Integer priceList;
    private Integer priority;
    private BigDecimal priceAmount;
    private String currency;

    public DataResponse(){}

    public DataResponse(PriceEntity priceEntity){}

    public DataResponse(
        Long productId,
        Long brandId,
        Timestamp startDate,
        Timestamp endDate,
        Integer priceList,
        Integer priority,
        String currency
    ) {
        this.productId =  productId;
        this.brandId =  brandId;
        this.startDate =  startDate;
        this.endDate =  endDate;
        this.priceList =  priceList;
        this.priority =  priority;
        this.currency =  currency;
    }

    public String getMessage() {
        return message;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}