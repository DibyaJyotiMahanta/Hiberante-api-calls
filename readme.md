# Java Hibernate Maven Project

This project is built using Java and Hibernate with a Maven framework. It demonstrates Object-Relational Mapping (ORM) and includes both POST and GET APIs.

## Project Structure

In the `src` folder, you will find the following files:

- **Student.java**: This class represents the student entity and maps to the corresponding database table.
- **Main.java**: The main class that runs the application and handles API requests.
- **hibernate.cfg.xml**: This file contains the Hibernate configuration settings, including database connection details.
- **pom.xml**: The Maven configuration file that manages project dependencies.

## Features

- **Object-Relational Mapping**: This project uses Hibernate to map Java objects to database tables, allowing for seamless interaction with the database.
- **POST API**: Allows for creating new student records in the database.
- **GET API**: Retrieves student records from the database.