package com.pdaniel.springbootcapitolechallenge.domain.service;

import com.pdaniel.springbootcapitolechallenge.domain.dto.PriceDTO;

import java.time.LocalDateTime;

public interface PriceService {
    PriceDTO getPrice(Long productId, Long brandId, LocalDateTime applicationDate);
}
