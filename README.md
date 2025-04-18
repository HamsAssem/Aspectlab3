```markdown
# CeView - Lab 3 (CSE434)

**Faculty of Engineering, Ain Shams University**  
**Aspect- and Service-Oriented Software Systems (CSE434)**  
**Spring 2025 - Lab 3**

CeView is a Spring Boot-based web application designed to allow users to share and browse reviews for restaurants and cafes in Cairo. The application provides CRUD functionality for two primary entities: `User` and `Review`. It uses a PostgreSQL database connected through Docker and is tested using Postman.

## Lab Objectives

- Implement CRUD operations for two entities: `User` and `Review`
- Establish a one-to-many relationship between `User` and `Review`
- Integrate PostgreSQL using Docker Compose
- Test RESTful API endpoints using Postman
- Use AOP concepts for logging, validation, and error handling
- Apply service-oriented principles to separate concerns

## Technologies Used

- Spring Boot
- Java
- PostgreSQL
- Docker & Docker Compose
- Maven
- Postman
- IntelliJ IDEA

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/lab3-cse434-review-app.git
cd lab3-cse434-review-app
```

### Start PostgreSQL with Docker

```bash
docker-compose up -d
```

### Run the Spring Boot Application

In IntelliJ or terminal:

```bash
mvn spring-boot:run
```

The app will be available at:  
`http://localhost:8080`

## API Endpoints

### User Endpoints

| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| POST   | /users             | Create a new user    |
| GET    | /users             | Retrieve all users   |
| GET    | /users/{id}        | Retrieve user by ID  |
| PUT    | /users/{id}        | Update a user        |
| DELETE | /users/{id}        | Delete a user        |

### Review Endpoints

| Method | Endpoint           | Description             |
|--------|--------------------|-------------------------|
| POST   | /reviews           | Create a new review     |
| GET    | /reviews           | Retrieve all reviews    |
| GET    | /reviews/{id}      | Retrieve review by ID   |
| PUT    | /reviews/{id}      | Update a review         |
| DELETE | /reviews/{id}      | Delete a review         |

## Example Request (POST Review)

```json
POST /reviews
{
  "title": "A Well Known Restaurant",
  "rating": 4.5,
  "userId": 1
}
```

## Folder Structure

```
lab3-cse434-review-app/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── lab3/
│                       ├── controller/
│                       │   ├── UserController.java
│                       │   └── ReviewController.java
│                       ├── entity/
│                       │   ├── User.java
│                       │   └── Review.java
│                       ├── repository/
│                       │   ├── UserRepository.java
│                       │   └── ReviewRepository.java
│                       ├── service/
│                       │   ├── UserService.java
│                       │   └── ReviewService.java
│                       └── Lab3Application.java
├── docker-compose.yml
├── pom.xml
└── README.md
```

## Database Configuration

Database settings in `src/main/resources/application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/ceview
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

Replace the credentials accordingly based on your local setup.

## Authors

Developed by Hams Assem from the Faculty of Engineering, Ain Shams University, as part of the CSE434 Spring 2025 coursework.
