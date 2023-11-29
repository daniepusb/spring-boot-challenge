package com.pdaniel.springbootcapitolechallenge.prices.domain.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.pdaniel.springbootcapitolechallenge.prices.domain.utils.ConstantsUtils.FAILED_QUERY;
import static com.pdaniel.springbootcapitolechallenge.prices.domain.utils.ConstantsUtils.SYSTEM_GENERAL_FAILED;

public class PriceRepositoryException extends RuntimeException {

    private static final Logger log = LogManager.getLogger(PriceRepositoryException.class);

    public PriceRepositoryException(String message) {
        super(message);
    }

    public PriceRepositoryException(String message, Throwable cause) {
        super(message, cause);
        log.debug(FAILED_QUERY);
    }

    public PriceRepositoryException() {
        log.debug(SYSTEM_GENERAL_FAILED);
    }
}