package com.pdaniel.springbootcapitolechallenge.domain.service;

import com.pdaniel.springbootcapitolechallenge.domain.model.Price;

import java.time.LocalDateTime;

public interface PriceService {
    Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId );
}
