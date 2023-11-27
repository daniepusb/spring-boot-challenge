package com.pdaniel.springbootcapitolechallenge.application;

import com.pdaniel.springbootcapitolechallenge.domain.dto.PriceDTO;
import com.pdaniel.springbootcapitolechallenge.domain.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static com.pdaniel.springbootcapitolechallenge.utils.ConstantsUtils.PATH_SEPARATOR;
import static com.pdaniel.springbootcapitolechallenge.utils.ConstantsUtils.REQUEST_MAPPING_PRICES;

@RestController
@RequestMapping(PATH_SEPARATOR + REQUEST_MAPPING_PRICES )
public class PriceController {

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public PriceDTO getPrice(
        @RequestParam("applicationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,
        @RequestParam("productId") Long productId,
        @RequestParam("brandId") Long brandId) {

        return priceService.getPrice(productId, brandId, applicationDate);
    }
}
