(README brought to you by our LLM overlords...)
# Runelite Friends: Stalk your homies in real time!

## 📌 Overview
This is a small web server built with **Spring Boot 3** that exposes a **REST API** documented using **Swagger (SpringDoc OpenAPI)**.
The frontend is developed using **Svelte** and serves a single-page application (SPA).

## 🛠️ Tech Stack
- **Backend:** Spring Boot 3, Spring Web, SpringDoc OpenAPI, H2
- **Frontend:** Svelte (using Vite)
- **Build Tools:** Maven/Gradle
- **Database:** H2 (in-memory)

## 🚀 Getting Started

### 1️⃣ Building
```sh
./gradlew build
./gradlew bootRun
```

The server should start at:
➡️ http://localhost:8080

🔹 API Documentation
The Swagger UI is available at:
➡️ http://localhost:8080/swagger-ui.html
➡️ OpenAPI JSON: http://localhost:8080/v3/api-docs
