package com.pdaniel.springbootcapitolechallenge.application;

import com.pdaniel.springbootcapitolechallenge.domain.model.Price;
import com.pdaniel.springbootcapitolechallenge.domain.service.PriceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.pdaniel.springbootcapitolechallenge.utils.ConstantsUtils.PATH_SEPARATOR;
import static com.pdaniel.springbootcapitolechallenge.utils.ConstantsUtils.REQUEST_MAPPING_PRICES;

@RestController
@RequestMapping(PATH_SEPARATOR + REQUEST_MAPPING_PRICES )
public class PriceController {

    private static final Logger log = LogManager.getLogger(PriceController.class);

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/{productId}/{brandId}")
    public Price getPrice(
        @PathVariable Long productId,
        @PathVariable Long brandId,
        @RequestParam(name = "applicationDate", required = true) LocalDateTime applicationDate) {
            log.info("Get Price for productID = {} brandID = {} ", productId, brandId);

        //Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
        return priceService.getPrice(applicationDate,productId,brandId);
    }



}
