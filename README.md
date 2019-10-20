# School Management System

## Running the application
### Prerequisite
1. Java Development kit version 11, preferably OpenJDK
2. Maven version 3.6.2 or later
### Run
1. Navigate to the project folder
2. Execute `mvn spring-boot:run`
3. Use the provided [`postman collection`](./postman/School%20Management%20System.postman_collection.json) to make requests

Note: 
- The application currently uses [`import.sql`](./src/main/resources/import.sql) to load data. There is no external mechanism to load data.  
- The application uses an embedded database h2 which means that the data is not persisted.

## Spring Profiles

### Test  
#### Connecting to H2 database
1. Run the application by following [run instructions above](#run).
2. Go to url `http://localhost:4050/h2-console/`.
3. Make sure that `JDBC URL` is `jdbc:h2:mem:testdb`.
4. Hit connect (there is no change required in username and password).

### Development
#### Connecting to PostgresSQL for macOS
1. Install PostgresSQL version 11.5 or later. Preferably through homebrew.  
2. Set PGDATA environment variable to the preferred location of data directory.  
If installed throught homebrew, this location will be `/usr/local/var/postgres/data`
3. Run the command `initdb`. This will create the database cluster.
4. Run the command `pg_ctl start -l $PGDATA/serverlog`.  
This will start the postgres server process and write server logs to serverlog file.
5. Run the command `psql`.  
If you get an error that "database "$USER" does not exist" then run `createdb` followed by `psql`.
6. Create a new database role by executing the following script  
`CREATE ROLE admin LOGIN ENCRYPTED PASSWORD 'admin' NOSUPERUSER NOINHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;`
7. Create a new database by executing the following script  
`CREATE DATABASE nxtgen-school WITH OWNER = admin;`  
Now we have a postgres instance with database named "nxtgen-school" that is accessible by user with login id admin and password admin.  