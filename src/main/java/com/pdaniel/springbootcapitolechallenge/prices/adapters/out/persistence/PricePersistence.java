package com.pdaniel.springbootcapitolechallenge.prices.adapters.out.persistence;

import com.pdaniel.springbootcapitolechallenge.prices.application.ports.out.DataResponse;
import com.pdaniel.springbootcapitolechallenge.prices.application.ports.out.DataResponsePort;
import com.pdaniel.springbootcapitolechallenge.prices.domain.exceptions.PriceRepositoryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

public class PricePersistence implements DataResponsePort {

    private static final Logger log = LogManager.getLogger(PricePersistence.class);

    private final SpringPriceRepository priceRepository;

    @Autowired
    public PricePersistence(SpringPriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public PriceEntity findById(Long id) throws PriceRepositoryException {
        return priceRepository
                .findById(id)
                .orElseThrow( PriceRepositoryException::new );
    }

    @Override
    public DataResponse searchPrice(Long productId, Long brandId, Timestamp applicationDate) {
        log.info("Search for Price with date {} productId {} and brandId {}",applicationDate,productId,brandId);

        return new DataResponse(
                priceRepository
                    .findPricesByProductIdAndBrandId(productId, brandId));
    }
}
