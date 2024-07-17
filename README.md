
# TechTrend POS System Backend

![Java Version](https://img.shields.io/badge/Java-11-blue)
![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-2.5.2-green)
![MariaDB Version](https://img.shields.io/badge/MariaDB-10.5-yellow)

This repository contains the backend implementation for the TechTrend POS (Point of Sale) System. The system is designed to manage inventory, process sales transactions, and generate reports for a retail business specializing in electronic gadgets and accessories.

## Features

- **Inventory Management**: CRUD operations for managing products, categories, and stock levels.

## Technologies Used

- **Java 20**: Programming language.
- **Spring Boot 2.5.2**: Backend framework.
- **MariaDB 10.5**: Database management system.
- **Hibernate**: Object-relational mapping (ORM) tool.
- **Spring Security**: Authentication and authorization.

## Getting Started

To run this application locally, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Umayanga12/POS-System-Backend.git
   cd techtrend-pos-backend
   ```

2. **Set up MariaDB**:
   - Install MariaDB and create a database named `techtrend_pos`.
   - Configure the database connection in `src/main/resources/application.properties`.

3. **Run the application**:
   - Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.).
   - Build and run the project using Maven or directly from your IDE.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvements, please create an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
