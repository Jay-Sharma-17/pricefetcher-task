package com.example.pricefetcher.service;

import com.example.pricefetcher.model.PriceQuery;
import com.example.pricefetcher.model.ProductResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ScraperServiceImpl implements ScraperService {
    @Override
    public List<ProductResult> fetchPrices(PriceQuery query) {
        List<ProductResult> results = new ArrayList<>();
        String country = query.getCountry();
        if ("US".equalsIgnoreCase(country)) {
            results.addAll(scrapeSiteA(query));
        } else if ("IN".equalsIgnoreCase(country)) {
            results.addAll(scrapeSiteB(query));
        } else {
            results.addAll(scrapeSiteA(query));
            results.addAll(scrapeSiteB(query));
        }
        results.sort(Comparator.comparingDouble(ProductResult::getPrice));
        return results;
    }

    // Placeholder scraper for Site A
    private List<ProductResult> scrapeSiteA(PriceQuery query) {
        return ExampleSiteScraper.scrape(query);  // ✅ Calls your real scraper now!
    }

    // Placeholder scraper for Site B
    private List<ProductResult> scrapeSiteB(PriceQuery query) {
        return SecondSiteScraper.scrape(query);
    }
} 