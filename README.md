# Mock Payment Gateway with Loyalty Points System

## Project Description
A **Mock Payment Gateway** that processes payments, awards loyalty points, and manages transaction history. Built using **Java Spring Boot**, **MySQL**, and deployed on **Heroku/AWS**.

## Tech Stack
- **Java Spring Boot** (Spring Web, Spring Data JPA)
- **MySQL / H2 Database** (For transactions & points storage)
- **Heroku / AWS** (Cloud Deployment)
- **Postman** (For API Testing)

## System Architecture
1. **Payment Service:** Processes user transactions.
2. **Loyalty Points Service:** Rewards users based on spending.
3. **Database:** Stores user transactions and loyalty points.
4. **Cloud Deployment:** Hosted on Heroku/AWS.

## Installation & Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourrepo/payment-gateway.git
   cd payment-gateway
   ```
2. Configure database settings in `application.properties`.
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
- **Process Payment:** `POST /pay?userId=123&amount=100`
  - **Response:** `{ "message": "Payment processed! Points earned: 10" }`
- **Check Points:** `GET /points/{userId}`
  - **Response:** `{ "points": 50 }`
- **Transaction History:** `GET /transactions/{userId}`
  - **Response:** `[ { "amount": 100, "timestamp": "2025-02-05" } ]`

## Features
✅ Secure Payment Processing
✅ Loyalty Points System
✅ REST API with Cloud Deployment
✅ Transaction History Management

## Deployment on Heroku
1. Push code to GitHub.
2. Connect repo to Heroku.
3. Deploy using:
   ```bash
   git push heroku main
   ```

## Future Enhancements
- Integrate real-time fraud detection
- Implement multi-currency support
- Enhance security with OAuth 2.0 authentication

