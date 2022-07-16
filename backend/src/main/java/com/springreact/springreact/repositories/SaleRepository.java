package com.springreact.springreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreact.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
