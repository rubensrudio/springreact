package com.springreact.springreact.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.springreact.springreact.entities.Sale;
import com.springreact.springreact.repositories.SaleRepository;

@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;

    public Page<Sale> findSales(String minDate, String maxDate, org.springframework.data.domain.Pageable pageable) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
        
        return repository.findSales(min, max, pageable);
    }
}
