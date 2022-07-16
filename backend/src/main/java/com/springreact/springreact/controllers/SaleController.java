package com.springreact.springreact.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.springreact.entities.Sale;

import com.springreact.springreact.services.SaleServices;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleServices service;

    @GetMapping
    public Page<Sale> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate, 
                                @RequestParam(value = "maxDate", defaultValue = "")  String maxDate, 
                                org.springframework.data.domain.Pageable pageable){
        return service.findSales(minDate, maxDate, pageable);
    }
}
