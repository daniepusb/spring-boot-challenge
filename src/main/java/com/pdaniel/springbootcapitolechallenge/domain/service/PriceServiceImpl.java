package com.pdaniel.springbootcapitolechallenge.domain.service;

import com.pdaniel.springbootcapitolechallenge.domain.exceptions.DateException;
import com.pdaniel.springbootcapitolechallenge.domain.model.Price;
import com.pdaniel.springbootcapitolechallenge.infrastructure.repository.PriceRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import static com.pdaniel.springbootcapitolechallenge.utils.ConstantsUtils.FORMATT_INVALIDATE;
import static java.util.Optional.ofNullable;

@Service
public class PriceServiceImpl implements PriceService {

    private static final Logger log = LogManager.getLogger(PriceServiceImpl.class);

    private final PriceRepository priceRepository;

    @Autowired
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId) {
        log.info("Get Price for productID = {} brandID = {} ", productId, brandId);

        Timestamp timeDB = Optional
                .of(Timestamp.valueOf(applicationDate))
                .orElseThrow(()-> new DateException(FORMATT_INVALIDATE));

        return ofNullable(priceRepository
                .findPriceByProductIdByBrandIdAndByApplicationDateBetweenStartDateAndEndDate(productId, brandId,timeDB))
                .map(prices -> prices.get(0))
                .orElse(null);
    }
}
