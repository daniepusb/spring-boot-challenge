package com.pdaniel.springbootcapitolechallenge.prices.application.ports.in;

import java.sql.Timestamp;

public class LoadPriceCommand {
    private Long            productId;
    private Long            brandId;
    private Timestamp       applicationDate;

    public LoadPriceCommand(Timestamp applicationDate, Long productId, Long brandId) {
        this.applicationDate    = applicationDate;
        this.productId          = productId;
        this.brandId            = brandId;
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

    public Timestamp getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Timestamp applicationDate) {
        this.applicationDate = applicationDate;
    }
}
