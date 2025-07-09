# 📦 Price Fetcher API

A generic tool to fetch product prices from multiple websites based on the country and product query.

---

## ✅ Features

- Accepts POST JSON: `{"country": "...", "query": "..."}`  
- Scrapes multiple sites (site A & B using jsoup)  
- Switches scraper logic based on country (`US`, `IN`)  
- Results sorted by price ascending

---

## 📂 Requirements

- Java 17 or higher installed
- Maven Wrapper included (`./mvnw`)

---

## ⚙️ How to Run

1️⃣ Build the JAR:
```bash
./mvnw clean package
