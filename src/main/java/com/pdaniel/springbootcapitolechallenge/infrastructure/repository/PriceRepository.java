package com.pdaniel.springbootcapitolechallenge.infrastructure.repository;

import com.pdaniel.springbootcapitolechallenge.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
