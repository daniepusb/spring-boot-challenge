package com.pdaniel.springbootcapitolechallenge.prices.application.service;

import com.pdaniel.springbootcapitolechallenge.prices.application.ports.in.LoadPriceCommand;
import com.pdaniel.springbootcapitolechallenge.prices.application.ports.in.LoadPricePort;
import com.pdaniel.springbootcapitolechallenge.prices.application.ports.out.DataResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PriceService implements LoadPricePort {

    private static final Logger log = LogManager.getLogger(PriceService.class);

    @Override
    public DataResponse searchPrice(LoadPriceCommand command) {
        log.info("Searching Price");
        return new DataResponse(35455L,1L,
                Timestamp.valueOf("2020-06-14 00:00:00"),
                Timestamp.valueOf("2020-12-31 23:59:59"),
                1, 0,
                "EUR");
    }
}
