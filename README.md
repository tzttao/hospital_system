# Hospital Management System

A comprehensive hospital management system built with Spring MVC, MyBatis, and MySQL. This system provides functionality for managing patients, staff, inpatient records, outpatient services, medicine inventory, and billing operations.

## Features

### Patient Management
- Patient registration and profile management
- Patient authentication system
- Medical history tracking
- Online appointment scheduling

### Inpatient Services
- Ward management and bed allocation
- Inpatient record tracking
- Medical examinations and test results
- Treatment history management

### Outpatient Services
- Outpatient registration
- Prescription management (Recipe system)
- Billing and cost management
- Medical consultation records

### Staff Management
- Staff profiles and authentication
- Department management
- Administrative user management
- Role-based access control

### Medicine Management
- Medicine inventory tracking
- Medicine purchase management
- Prescription management
- Stock level monitoring

### Billing System
- Patient billing and cost calculation
- Hospital revenue tracking
- Payment processing
- Financial reporting

## Technology Stack

- **Backend Framework**: Spring MVC 5.3.21
- **Database Layer**: MyBatis 3.5.10
- **Database**: MySQL 8.0
- **Connection Pool**: C3P0 0.9.5.5
- **Web Container**: Apache Tomcat
- **Frontend**: JSP with JSTL
- **Build Tool**: Maven 3.6+
- **Testing**: JUnit 4.13.2

## Project Structure

```
hospital_system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── controller/          # MVC Controllers
│   │   │       │   └── inpatient/       # Inpatient controllers
│   │   │       ├── dao/                 # Data Access Layer
│   │   │       │   ├── entity/          # Entity mappers
│   │   │       │   ├── inpatient/       # Inpatient mappers
│   │   │       │   ├── medicine/        # Medicine mappers
│   │   │       │   ├── outpatient/      # Outpatient mappers
│   │   │       │   └── register/        # Registration mappers
│   │   │       ├── model/               # Entity Models
│   │   │       └── service/             # Business Logic Layer
│   │   │           ├── entity/          # Entity services
│   │   │           ├── inpatient/       # Inpatient services
│   │   │           ├── medicine/        # Medicine services
│   │   │           ├── outpatient/      # Outpatient services
│   │   │           └── register/        # Registration services
│   │   ├── resources/
│   │   │   ├── mapper/                  # MyBatis XML mappers
│   │   │   ├── applicationContext.xml   # Spring configuration
│   │   │   ├── spring-mvc.xml          # Spring MVC configuration
│   │   │   ├── mybatis-config.xml      # MyBatis configuration
│   │   │   ├── jdbc.properties         # Database properties
│   │   │   └── log4j.properties        # Logging configuration
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       │   ├── views/               # JSP view templates
│   │       │   └── web.xml              # Web application configuration
│   │       └── index.jsp                # Application entry point
│   └── test/
│       └── java/
│           └── com/
│               └── test/                # Unit tests
├── target/                              # Maven build output
├── pom.xml                             # Maven dependencies
└── README.md                           # This file
```

## Prerequisites

- Java JDK 8 or higher
- Apache Maven 3.6 or higher
- MySQL 8.0 or higher
- Apache Tomcat 9.0 or higher

## Installation & Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd hospital_system
```

### 2. Database Setup
1. Create a MySQL database named `hospital_db`
2. Update database connection properties in `src/main/resources/jdbc.properties`:
```properties
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/hospital_db?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
jdbc.username=your_username
jdbc.password=your_password
```

### 3. Build the Project
```bash
mvn clean compile
```

### 4. Run Tests
```bash
mvn test
```

### 5. Package the Application
```bash
mvn clean package
```

### 6. Deploy to Tomcat
- Copy the generated WAR file from `target/hospital-system.war` to your Tomcat `webapps` directory
- Start Tomcat server
- Access the application at `http://localhost:8080/hospital-system`

## Development

### Using Maven Tomcat Plugin
For development purposes, you can use the embedded Tomcat plugin:
```bash
mvn tomcat7:run
```
The application will be available at `http://localhost:8080/hospital`

### Database Configuration
The application uses C3P0 connection pooling. Database settings can be configured in:
- `src/main/resources/jdbc.properties` - Database connection details
- `src/main/resources/applicationContext.xml` - Spring and MyBatis configuration

### Adding New Features
1. Create entity models in `com.model` package
2. Create corresponding mapper interfaces in `com.dao` package
3. Implement mapper XML files in `src/main/resources/mapper`
4. Create service interfaces and implementations in `com.service` package
5. Create controllers in `com.controller` package
6. Add JSP views in `src/main/webapp/WEB-INF/views`

## API Endpoints

### Patient Management
- `GET /patient/list` - Get all patients
- `POST /patient/add` - Add new patient
- `PUT /patient/update` - Update patient information
- `DELETE /patient/delete/{id}` - Delete patient

### Inpatient Services
- `GET /inpatient/records` - Get inpatient records
- `POST /inpatient/admit` - Admit patient
- `PUT /inpatient/update` - Update inpatient record
- `GET /inpatient/wards` - Get ward information

### Medicine Management
- `GET /medicine/inventory` - Get medicine inventory
- `POST /medicine/purchase` - Record medicine purchase
- `PUT /medicine/update` - Update medicine information

## Testing

The project includes unit tests for core functionality:
- `BillCostTest` - Billing system tests
- `ExamineTest` - Medical examination tests
- `MedicineTest` - Medicine management tests
- `RecipeTest` - Prescription tests
- `RecordTest` - Patient record tests
- `WardTest` - Ward management tests

Run tests with:
```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## Security Considerations

- Patient data is sensitive - ensure proper authentication and authorization
- Use parameterized queries to prevent SQL injection
- Implement proper session management
- Consider encrypting sensitive medical information
- Regular security audits recommended

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support and questions:
- Create an issue in the GitHub repository
- Contact the development team
- Refer to the project documentation

## Version History

- **v1.0.0** - Initial release with core hospital management features
  - Patient management
  - Inpatient and outpatient services
  - Medicine inventory
  - Basic billing system
  - Staff management

---

**Note**: This system handles sensitive medical data. Ensure compliance with relevant healthcare data protection regulations (such as HIPAA) when deploying in production environments.