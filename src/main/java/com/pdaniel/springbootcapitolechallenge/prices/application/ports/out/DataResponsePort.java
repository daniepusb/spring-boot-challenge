package com.pdaniel.springbootcapitolechallenge.prices.application.ports.out;

import java.sql.Timestamp;

public interface DataResponsePort {
    DataResponse searchPrice(Long productId, Long brandId, Timestamp applicationDate);
}