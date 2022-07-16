package com.springreact.springreact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreact.springreact.entities.Sale;
import com.springreact.springreact.repositories.SaleRepository;

@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;
    
    public List<Sale> findSales() {
        return repository.findAll();
    }
}
