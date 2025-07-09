package com.example.pricefetcher.service;

import com.example.pricefetcher.model.PriceQuery;
import com.example.pricefetcher.model.ProductResult;
import java.util.List;

public interface ScraperService {
    List<ProductResult> fetchPrices(PriceQuery priceQuery);
} 