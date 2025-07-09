package com.example.pricefetcher.model;

public class PriceQuery {
    private String country;
    private String query;

    public PriceQuery() {}

    public PriceQuery(String country, String query) {
        this.country = country;
        this.query = query;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
} 