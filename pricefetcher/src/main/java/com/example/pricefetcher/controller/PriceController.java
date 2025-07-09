package com.example.pricefetcher.controller;

import com.example.pricefetcher.model.PriceQuery;
import com.example.pricefetcher.model.ProductResult;
import com.example.pricefetcher.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PriceController {

    private final ScraperService scraperService;

    @Autowired
    public PriceController(ScraperService scraperService) {
        this.scraperService = scraperService;
    }

    @PostMapping("/fetch-prices")
    public List<ProductResult> fetchPrices(@RequestBody PriceQuery priceQuery) {
        return scraperService.fetchPrices(priceQuery);
    }
} 