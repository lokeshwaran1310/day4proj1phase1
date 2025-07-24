# User Registration System

## Description
This project is a simple Java-based user registration system that uses custom exception handling to validate user age. Users under the age of 18 are rejected with a clear error message.

## Components

- **User.java**: Represents a user with `username` and `age` fields.
- **UserService.java**: Handles the registration logic and age validation.
- **invalidAgeExceptions.java**: Custom exception class thrown when a user is underaged.
- **Main.java**: Entry point of the application where sample users are created and registration is attempted.
- **pom.xml**: Maven configuration file.
- **.gitignore**: Specifies files and folders to be ignored by Git.

## Purpose
The project demonstrates:
- How to organize a Java application using packages.
- The use of custom exceptions to enforce business rules.
- Basic object-oriented design and exception handling in Java.

## High-Level Design

1. **User Creation**: Users are instantiated with name and age.
2. **Validation**: The `UserService` checks each user's age.
3. **Exception Handling**: If a user is underaged, `invalidAgeExceptions` is thrown and caught in the main method.
4. **Output**: Messages are displayed indicating success or failure of registration.

## Author

- **Name**: Lokeshwaran M  
- **Email**: lokeshwaran.m@epssw.com  
- **Date**: July 24, 2025
