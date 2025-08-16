📦 Inventory Management & Broker Service (Spring Boot)
📖 Overview

This project is a microservice-ready Inventory Management & Broker System built with Spring Boot.
It acts as a middleman company that:

Handles suppliers (who provide products in bulk).

Handles customers/buyers (who purchase products).

Uses brokers (who manage deals between suppliers and customers).

The system records transactions (purchases & sales), manages products, suppliers, users, and provides search & reporting features.

✅ Features Implemented So Far
1. Entities / Models

User – Represents buyers/customers (and possibly brokers).

Supplier – Represents suppliers providing products.

Product – Represents items with SKU, description, category.

Transaction – Represents a deal (buying/selling), linked with:

Product

Supplier

User (buyer/customer)

Broker (optional, if extended later)

2. Transaction Filtering

Implemented in TransactionFilter.java using Spring Data JPA Specifications:

🔎 Search across multiple fields:
Transaction details, User info, Supplier info, Product info, Category name.

📅 Filter by Month & Year:
Supports reporting by transaction date.

3. DTOs

TransactionRequest DTO → Handles transaction creation request with validation.

4. Security (Work in Progress)

Using Spring Security with role-based access (e.g., ADMIN, BROKER, USER).

Example: Only ADMIN can add new products.

5. Current Architecture

Right now, you’ve structured it monolithically, but preparing for microservices:

ProductController, TransactionController, etc.

Business logic inside Services.

DTOs for request/response handling.

Specifications for flexible searching.
