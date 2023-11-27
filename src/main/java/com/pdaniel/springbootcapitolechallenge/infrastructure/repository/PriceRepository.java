package com.pdaniel.springbootcapitolechallenge.infrastructure.repository;

import com.pdaniel.springbootcapitolechallenge.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Serializable> {

    @Query(value= "SELECT p FROM Price p " +
            "WHERE ((?1 BETWEEN p.startDate AND p.endDate) AND (p.productId=?2) AND (p.brandId=?3)) " +
            "ORDER BY p.priority DESC")
    List<Price> findPriceByProductIdByBrandIdAndByApplicationDateBetweenStartDateAndEndDate(
            Long productId, Long brandId, Timestamp dateToFound);

}
