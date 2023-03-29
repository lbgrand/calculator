# Simple Restful Calculator

This is a simple calculator in form of web application + APIs written in Java and Spring Boot Framework

## Installation

You will need to install [Java 11](https://www.oracle.com/de/java/technologies/javase/jdk11-archive-downloads.html) or higher and fresh [Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac) in order to run this application.

After installation is ready, go the app folder in terminal and do
```bash
mvn clean install
```

## Running

To run the application either use common IDE like IntelliJ or VS Code, open the project and just run it as Spring Boot app.

Or just open a terminal and do

```bash
mvn spring-boot:run
```

## Usage

The application will start on port 8080.
You can access web app's frontend from the browser under http://localhost:8080.

Otherwise you can also use app's REST APIs which described in **CalculationController** class of the project. For example in terminal do:

```bash
curl localhost:8080/api/sum/4.0/324.6
```
