
# 🏦 Customer Service - SpringBank API

This microservice is part of the **SpringBank Project**, built to manage customer data and operations in a modular, secure, and scalable banking system.  
It demonstrates how to build modern, production-ready REST APIs using **Spring Boot** following **Clean Architecture** and **DDD (Domain-Driven Design)** principles.

---

## 🚀 What You’ll Learn / Use

- ✅ Build RESTful APIs (GET, POST, PUT, DELETE)
- ✅ Apply Clean Architecture + Layered Structure
- ✅ Use DTO, Entity and MapStruct for clean separation
- ✅ Add validations using `Jakarta Validation` annotations
- ✅ Integrate Swagger/OpenAPI for testing & documentation
- ✅ Connect to PostgreSQL database via Spring Data JPA
- ✅ Implement global exception handling
- ✅ Monitor services using Spring Boot Actuator
- ✅ Prepare for production with Docker + GitHub Actions

---

## 🧠 Project Purpose

This service simulates a **real-world banking customer system** where users can:
- Create new customer records
- Retrieve all or individual customers
- Update existing customer data
- Delete customers
- Use pagination and validation on the API level
- View Swagger-based API documentation

---

## 🧱 Tech Stack

| Layer              | Technology                         |
|--------------------|-------------------------------------|
| Backend Framework  | Spring Boot 3.x                    |
| API Docs           | Swagger / OpenAPI                  |
| Data Access        | Spring Data JPA                    |
| DBMS               | PostgreSQL                         |
| Mapping            | MapStruct                          |
| Validation         | Jakarta Validation (Hibernate)     |
| Monitoring         | Spring Boot Actuator               |
| Security           | Spring Security + JWT *(Coming up)*|
| Testing            | JUnit, Mockito *(Later step)*      |
| DevOps             | Docker, GitHub Actions *(Planned)* |

---

## 🔧 Architecture Overview 


---

## 📊 Architecture Diagram 



```plaintext
               +------------------------+
               |   Customer Controller  |
               +-----------+------------+
                           |
                           ▼
               +------------------------+
               |    Customer Service    |
               +-----------+------------+
                           |
                           ▼
               +------------------------+
               |   Customer Repository  |
               +-----------+------------+
                           |
                           ▼
               +------------------------+
               |   PostgreSQL Database  |
               +------------------------+
Customer-Service (Spring Boot)
│
├── controller     –> Handles REST endpoints
├── service        –> Business logic
├── repository     –> Data access via JPA
├── entity         –> Customer model
├── dto            –> Input/Output data objects
├── mapper         –> MapStruct mappers
├── config         –> Swagger, CORS, validation
├── exception      –> Global exception handling
└── application.yml–> Configuration (DB, Swagger, etc.) 

```
## Swagger UI 

http://localhost:8081/swagger-ui.html