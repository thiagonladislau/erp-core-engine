# ERP Core Engine 🚀

[![Java](https://img.shields.io/badge/Java-22-orange?style=flat-square&logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue?style=flat-square&logo=apachemaven)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)](LICENSE)

---

## 📌 Project Overview

**ERP Core Engine** is a robust, modern backend service built with **Java 22** and **Spring Boot**, designed to handle core business logic, data integration, and transactional workflows typical of enterprise ERP systems.

This project demonstrates software engineering best practices, cleanly structured API architecture, versioned REST endpoints, and production-ready observability standards tailored for international market evaluation.

---

## 🛠 Tech Stack

- **Language:** Java 22
- **Framework:** Spring Boot 3.x (`spring-boot-starter-web`, `spring-boot-devtools`)
- **Build Tool:** Apache Maven
- **Architecture:** Layered RESTful API Architecture
- **IDE & Tools:** IntelliJ IDEA, Git, GitHub

---

## 🏛 Architecture & Design Principles

- **API Versioning:** Clean separation of API routes using `/api/v1/` for backward compatibility and API contract governance.
- **Observability First:** Standardized health-check endpoints for container orchestrators (Kubernetes) and cloud load balancers.
- **Separation of Concerns:** Strict layer isolation (Controllers, Services, Repositories, DTOs).

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your local machine:
- **Java Development Kit (JDK):** Version 21 or 22
- **Apache Maven:** 3.8+ (or use the provided `./mvnw` wrapper)
- **Git**

### Installation & Local Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/thiagoladislau/erp-core-engine.git](https://github.com/thiagoladislau/erp-core-engine.git)
   cd erp-core-engine

## 📡 API Endpoints & Usage

### Health Check Endpoint

Monitors service availability, environment context, and application status.
- URL: /api/v1/health
- Method: GET
- Response Status: 200 OK

## 🗺 Roadmap (2026 Strategy)
[x] Initial project setup & Spring Boot integration

[x] Versioned Health Check REST endpoint

[ ] Domain models and database mapping (JPA/Hibernate + PostgreSQL)

[ ] Enterprise business logic & Service Layer implementation

[ ] Input validation & Global Exception Handling

[ ] Automated unit and integration testing (JUnit 5 & Mockito)

[ ] Docker containerization & GitHub Actions CI/CD pipeline

[ ] AWS Cloud deployment

## 👤 Author
### Thiago Ladislau

Systems Analyst & Software Engineer

GitHub: github.com/thiagoladislau