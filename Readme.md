# SpringBootPractice

## A Rest API app with MySQL Database

### Installation

To install dependencies, run the following command:

```bash
mvn clean install
```

### Configuration

Ensure your `application.properties` file is configured with the appropriate MySQL database settings:

```properties
# MySQL configuration
spring.datasource.url=jdbc:mysql://localhost:3306/springbootpractice
spring.datasource.username=lamrin
spring.datasource.password=lamrin
```

Replace `springbootpractice` with your database name and update the username and password accordingly.

### Running the Spring Boot Project

To run the Spring Boot project, execute the following command:

```bash
mvn spring-boot:run
```
After running the command, your Spring Boot application will start, and you can access the REST API endpoints as configured in your project.
```
```
### REST API Routes

Here are the endpoints for accessing the REST API:

#### Add Book
- **URL**: `http://localhost:9090/addBook`
- **Method**: POST

This endpoint allows you to add a new book to the database.

#### Get All Books
- **URL**: `http://localhost:9090/getAllBooks`
- **Method**: GET

This endpoint retrieves all books stored in the database.

#### Update Book by ID
- **URL**: `http://localhost:9090/:id`
- **Method**: PUT

Replace `:id` with the ID of the book you want to update. This endpoint allows you to update a specific book by its ID.

#### Delete Book by ID
- **URL**: `http://localhost:9090/:id`
- **Method**: DELETE

Replace `:id` with the ID of the book you want to delete. This endpoint allows you to delete a specific book by its ID.
```