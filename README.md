# Smart Store

Smart Store is an online shop specializing in electronic devices such as mobile phones, laptops, earphones, tablets, TVs
This project is built using Java with the Spring framework, Hibernate for database access, Thymeleaf for front-end templating, Lombok for reducing boilerplate code, and JPA for data management.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Browse and search for a wide range of electronic devices.
- Add products to your cart and proceed to checkout.
- User authentication and registration.
- Admin panel for managing products, orders, and users.
- Integration with a secure payment gateway.

## Technologies

- Java
- Spring Framework
- Hibernate
- Thymeleaf
- Lombok
- JPA
- MySQL
- HTML/CSS
- JavaScript
- Bootstrap

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/AvishkarWadbudhe/Smart_Store.git

2.Configure your database settings in application.properties:
  ```shell
spring.datasource.url=jdbc:mysql://localhost:3306/smartstore
spring.datasource.username=your-username
spring.datasource.password=your-password
```
3.Build and run the application:
```shell
./mvnw clean install
./mvnw spring-boot:run
```

4.Open a web browser and go to http://localhost:8080 to access the Smart Store application.

#Usage
1.Visit the homepage to browse and search for products.
2.Create an account or log in to access additional features such as adding products to your cart and placing orders.
3.If you are an admin, log in to the admin panel to manage products, orders, and users.

