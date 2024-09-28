# Spring Framework CRUD Application

This repository contains a basic CRUD (Create, Read, Update, Delete) implementation using the Spring Framework. The application demonstrates how to perform fundamental database operations on a simple registration system.

## Project Structure

The project consists of three main components:

1. **Controller**: `RegController.java`
2. **Data Access Object (DAO)**: `RegDAO.java`
3. **Model**: `RegVO.java`

## Features

- Create new registrations
- Read existing registrations
- Update registration information
- Delete registrations

## Key Components

### 1. RegController.java

This controller handles HTTP requests and manages the application's flow. It includes methods for:

- Loading the registration form
- Inserting new records
- Searching for records
- Deleting records
- Editing existing records

### 2. RegDAO.java

The Data Access Object (DAO) manages database operations using Hibernate. It provides methods for:

- Inserting/updating records
- Searching for all records
- Deleting records
- Retrieving a specific record for editing

### 3. RegVO.java

This is the Value Object (VO) class that represents the data model. It includes:

- ID (auto-generated)
- First Name
- Last Name

## Setup and Configuration

1. Ensure you have a compatible version of Spring Framework and Hibernate in your project.
2. Configure your database connection in the application's configuration file.
3. Create a table named `Spring_Reg` in your database with columns: `Id`, `FirstName`, and `LastName`.

## Usage

1. Run the application on a suitable application server.
2. Access the registration form via the `/load.html` endpoint.
3. Use the provided interface to perform CRUD operations.

## Dependencies

- Spring Framework
- Hibernate
- A compatible database (e.g., MySQL, PostgreSQL)
