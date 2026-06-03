# Task-Management-API
A secure, stateless Task Management REST API built with Spring Boot, Spring Data JPA, and MySQL, featuring robust user authentication and authorization powered by Spring Security and JWT.

## 🛠️ Tech Stack
* **Language:** Java 17+
* **Framework:** Spring Boot 3.x (Spring Security, Spring Data JPA)
* **Database:** MySQL
* **Security:** JSON Web Tokens (JWT)
* **Build Tool:** Maven
* **Utilities:** Lombok

## 🛣️ Core API Endpoints

### Authentication
* `POST /user/register` - Register a new account (Public)
* `POST /api/auth/login` - Authenticate credentials and receive a JWT token (Public)

### Task Management (Protected - Requires JWT Bearer Token)
* `GET /api/tasks` - Retrieve all tasks belonging to the logged-in user
* `POST /api/tasks` - Create a new task assigned automatically to the logged-in user
* `DELETE /api/tasks/{id}` - Delete a specific task owned by the user
