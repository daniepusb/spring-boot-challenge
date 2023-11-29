package com.pdaniel.springbootcapitolechallenge.prices.application.ports.in;

import com.pdaniel.springbootcapitolechallenge.prices.application.ports.out.DataResponse;

public interface LoadPricePort {
    public DataResponse searchPrice(LoadPriceCommand command);
}
