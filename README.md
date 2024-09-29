# MavenProject

# Student Maven Project

This project is a simple Java-based Maven project that allows users to:
- Insert student data (Registration No, Name, SGPA) into a MySQL database.
- Display all student records.
- Update the SGPA for a specific student based on their Registration Number.

## Table of Contents
- [Description](#description)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Database Schema](#database-schema)
- [Setup and Installation](#setup-and-installation)
- [Running the Project](#running-the-project)
- [License](#license)

## Description

This Maven project interacts with a MySQL database and performs basic CRUD operations (Create, Read, Update) on the `student` table. It demonstrates the use of JDBC for database connectivity, following the DAO pattern, and provides a simple interface for adding and updating student information.

## Technologies Used

- **Java 20**
- **Maven** (for project management and dependency management)
- **MySQL** (as the database)
- **JDBC** (for connecting to MySQL)

## Project Structure

studentMavenProject/
│
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── example/
│ ├── DBConnection.java
│ ├── Student.java
│ ├── StudentDAO.java
│ └── Main.java
│
├── pom.xml
└── README.md




### Key Files:
- **DBConnection.java**: Establishes a connection to the MySQL database.
- **Student.java**: Represents the student entity with fields `Reg_no`, `Name`, and `SGPA`.
- **StudentDAO.java**: Contains methods for database operations (insert, update, and fetch students).
- **Main.java**: The entry point of the application, showcasing the functionality of `StudentDAO`.

## Database Schema

Before running the project, you need to create the MySQL database and the `student` table. Run the following SQL commands:

```sql
CREATE DATABASE studentMavenProject;

USE studentMavenProject;

CREATE TABLE student (
    Reg_no INT PRIMARY KEY,
    Name VARCHAR(100),
    SGPA DOUBLE
);
```
## SampleOutput 
Database connected!
Student record inserted successfully.
Student record inserted successfully.
Reg_no: 1, Name: John Doe, SGPA: 8.5
Reg_no: 2, Name: Jane Smith, SGPA: 9.1

SGPA updated successfully for Reg_no: 1

Updated student list:
Reg_no: 1, Name: John Doe, SGPA: 9.2
Reg_no: 2, Name: Jane Smith, SGPA: 9.1

## Overview of Included Sections:
- **Description**: Overview of the project.
- **Technologies Used**: Technologies utilized.
- **Project Structure**: Directory layout of the project.
- **Database Schema**: SQL commands for creating the database and table.
- **Setup and Installation**: Steps to set up the project, including prerequisites and configuration.
- **Running the Project**: Instructions on executing the project and example output.
- **License**: Licensing information.
