package com.pdaniel.springbootcapitolechallenge.prices.adapters.out.persistence;


import com.pdaniel.springbootcapitolechallenge.prices.domain.dto.PriceDTO;

public class PriceMapper {

    public static PriceDTO entityToDomain(PriceEntity priceEntity) {
        PriceDTO priceDTO = new PriceDTO();
        priceDTO.setPriceId(priceEntity.getPriceId());
        priceDTO.setBrandId(priceEntity.getBrandId());
        priceDTO.setStartDate(priceEntity.getStartDate());
        priceDTO.setEndDate(priceEntity.getEndDate());
        priceDTO.setPriceList(priceEntity.getPriceList());
        priceDTO.setProductId(priceEntity.getProductId());
        priceDTO.setPriority(priceEntity.getPriority());
        priceDTO.setPriceAmount(priceEntity.getPriceAmount());
        priceDTO.setCurrency(priceEntity.getCurrency());
        return priceDTO;
    }


    public static PriceEntity domainToEntity(PriceDTO priceDTO) {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setPriceId(priceDTO.getPriceId());
        priceEntity.setBrandId(priceDTO.getBrandId());
        priceEntity.setStartDate(priceDTO.getStartDate());
        priceEntity.setEndDate(priceDTO.getEndDate());
        priceEntity.setPriceList(priceDTO.getPriceList());
        priceEntity.setProductId(priceDTO.getProductId());
        priceEntity.setPriority(priceDTO.getPriority());
        priceEntity.setPriceAmount(priceDTO.getPriceAmount());
        priceEntity.setCurrency(priceDTO.getCurrency());
        return priceEntity;
    }

}
