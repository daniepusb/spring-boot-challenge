package com.pdaniel.springbootcapitolechallenge.prices.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringPriceRepository extends JpaRepository<PriceEntity, Long> {
    PriceEntity findPricesByProductIdAndBrandId(Long productId, Long brandId);
}
