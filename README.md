# Workshop - Springboot3 JPA

This project was developed as a workshop during the *"Java COMPLETO 2023 Programação Orientada a Objetos + Projetos"* course by Professor Nelio Alves, available on [Udemy](https://www.udemy.com/course/java-curso-completo/).

It was created as a platform for testing and experimenting with Spring Boot, alongside other tools such as Maven and Restful. This application implements a CRUD 
system that manages products, users, categories, and more, simulating the kind of system a real-world company might employ

# Setting it up

Before doing anything, make sure you have all the requirements installed on your machine.

First, start the XAMPP Control Panel and enable Apache and MySQL.

Next, open the Spring Tool Suite and import the project. Then, navigate to `\src\main\resources`, open the `application-test.properties` file, 
and take a look at driverClassName, url, username, and password. You will need this data for the console setup.

To start the application, run it as a Spring Boot App. If you go to `http://localhost:8080/` in your browser, you might see a Whitelabel Error Page. 
Don't worry! This means the project is running. You can access the console by navigating to `http://localhost:8080/h2-console/login.jsp`. 
There, you can enter the data obtained from the `application-test.properties` file to gain access to the database for experimentation.

If you have Postman installed, you can make web requests such as GET, SET, PUT, and DELETE (CRUD) operations. Here are some examples:

- `GET http://localhost:8080/users` -> returns all the users.
- `GET http://localhost:8080/users/1` -> return the user with ID 1.
- `GET http://localhost:8080/orders/1` -> return the order with ID 1.
- `POST http://localhost:8080/users` with the body `{ "name": "Bob Brown", "email": "bob@gmail.com", "phone": "977557755", "password": "123456" }` -> adds the user Bob Brown.
- `GET http://localhost:8080/products/3` -> return the product with ID 3.
- ...
  
As mentioned above, the CRUD operations are set up, so you are free to perform various actions as long as they don't cause exceptions, 
such as trying to delete a user with associated orders

# Requirements

To run this project, it's necessary to have Java 17 (LTS) installed on your machine. The Java version I used was Java Azul Zulu 17.0.7 (LTS) ([link](https://www.azul.com/downloads/?version=java-17-lts&package=jdk#zulu)), but it should not be necessary to have this exact version for the project to work.

Furthermore, you will need **Spring Tool Suit** ([link](https://spring.io/tools)) to run the project.

For the database, you will need **XAMPP** ([link](https://www.apachefriends.org/download.html)), which provides Apache and MySQL.

To simulate web requests, you can use **Postman** ([link](https://www.postman.com/downloads/)), although this is optional.

##

Created by @AlysonCantalice.
