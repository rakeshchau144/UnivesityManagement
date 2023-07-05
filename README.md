# University Event Management

This project is a University Event Management system built using Spring Boot. It provides RESTful APIs to manage students and events.

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database
- Validation

Open the project in your preferred Java IDE.

Build the project using Maven or your IDE's build tool.

Configure the database connection in the application.properties file. By default, the project uses the H2 in-memory database.

Run the application.

Access the application's REST APIs through the following base URL: http://localhost:8080

Functionality
The University Event Management system provides the following endpoints:

Students
POST /students: Add a new student.
PUT /students/{studentId}/department?department={department}: Update the department of a student.
DELETE /students/{studentId}: Delete a student.
GET /students: Get all students.
GET /students/{studentId}: Get a student by ID.
Events
POST /events: Add a new event.
PUT /events/{eventId}: Update an event.
DELETE /events/{eventId}: Delete an event.
GET /events?date={date}: Get all events by date.
Models
The project uses the following models:

Student
studentId (Long): Student ID.
firstName (String): First name of the student (should start with a capital letter).
lastName (String): Last
