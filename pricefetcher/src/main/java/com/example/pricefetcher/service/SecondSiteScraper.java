package com.example.pricefetcher.service;

import com.example.pricefetcher.model.PriceQuery;
import com.example.pricefetcher.model.ProductResult;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecondSiteScraper {
    public static List<ProductResult> scrape(PriceQuery query) {
        List<ProductResult> results = new ArrayList<>();
        String searchUrl = "https://books.toscrape.com/catalogue/category/books/science_22/index.html";
        try {
            Document doc = Jsoup.connect(searchUrl).get();
            Elements products = doc.select(".product_pod");
            for (Element product : products) {
                String name = product.select("h3 a").attr("title");
                String link = "https://books.toscrape.com/catalogue/" + product.select("h3 a").attr("href");
                String priceStr = product.select(".price_color").text().replace("£", "").trim();
                double price = priceStr.isEmpty() ? 0.0 : Double.parseDouble(priceStr);
                String currency = "GBP";
                ProductResult result = new ProductResult(link, price, currency, name);
                results.add(result);
            }
        } catch (IOException e) {
            // Handle exception or log error
        }
        return results;
    }
} 