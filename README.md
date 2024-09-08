# User Login and Registration Application

## Overview
This backend application provides user login and registration functionality with email validation and JWT (JSON Web Token) authentication. It is designed to offer secure and scalable user management.

## Features
- **User Registration**: Allows new users to register with email validation.
- **Email Verification**: Sends a verification email to confirm the user's email address.
- **User Login**: Authenticates users and generates JWT tokens for secure access.
- **JWT Authentication**: Uses JWT tokens for session management and user authentication.

## Technologies Used
- **Spring Boot**: Framework for building the backend application.
- **Spring Security**: For authentication and authorization.
- **JWT**: For token-based authentication.
- **JavaMailSender**: For sending verification emails.
- **MySQL**: Database, managed via phpMyAdmin.
- **Docker**: For containerizing MySQL, phpMyAdmin, and MailDev.

## Getting Started

### Prerequisites
- Java 17 (or compatible version)
- Maven or Gradle
- Docker (for containerization)
- MySQL database (configured via phpMyAdmin)

### Configuration

Before running the application, please ensure that the configuration files are correctly set up:

1. **Review `docker-compose.yml`:**
   - Ensure that the service configurations for MySQL, phpMyAdmin, and MailDev are accurate.
   - Verify that the environment variables such as `MYSQL_ROOT_PASSWORD`, `MYSQL_DATABASE`, `MYSQL_USER`, and `MYSQL_PASSWORD` match your desired settings.
   - Confirm that the ports and network settings are correctly mapped according to your needs.

   **File Location**: docker-compose.yml

   **What to Verify**:
   - MySQL credentials and database settings.
   - Ports used by MySQL and phpMyAdmin.
   - MailDev settings for email handling.

2. **Review `application.properties`:**
   - Confirm that the database connection settings (`spring.datasource.url`, `spring.datasource.username`, `spring.datasource.password`) match those specified in your `docker-compose.yml`.
   - Ensure the mail server settings (`spring.mail.host`, `spring.mail.port`) are configured according to your MailDev setup.
   - Adjust any additional properties as needed for your environment.

   **File Location**: src/main/resources/application.properties

   **What to Verify**:
   - Database URL, username, and password.
   - Mail server configuration.
   - Any other application-specific settings.
