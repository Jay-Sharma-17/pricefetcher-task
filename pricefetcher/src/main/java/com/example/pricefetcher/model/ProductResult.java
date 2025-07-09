package com.example.pricefetcher.model;

public class ProductResult {
    private String link;
    private double price;
    private String currency;
    private String productName;

    public ProductResult() {}

    public ProductResult(String link, double price, String currency, String productName) {
        this.link = link;
        this.price = price;
        this.currency = currency;
        this.productName = productName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
} 