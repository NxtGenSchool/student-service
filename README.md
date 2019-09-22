# School Management System

## Running the application
### Prerequisite
1. Java Development kit version 11, preferably OpenJDK
2. Maven version 3.6.2 or later
### Run
1. Navigate to the project folder
2. Execute `mvn spring-boot:run`
3. Use the provided postman collection to make requests

Note: 
- The application currently uses [`import.sql`](./src/main/resources/import.sql) to load data. There is no external mechanism to load data.  
- The application uses an embedded database h2 which means that the data is not persisted.

### Connecting to database
1. Run the application by following [run instructions above](#run).
2. Go to url `http://localhost:4050/h2-console/`.
3. Make sure that `JDBC URL` is `jdbc:h2:mem:testdb`.
4. Hit connect (there is no change required in username and password).