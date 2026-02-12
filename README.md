# 🚀 Introduction to Spring and Spring Boot

![Visitor Badge](https://visitor-badge.laobi.icu/badge?page_id=rahulthakare04.Spring-Boot-Basics)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-red)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![License](https://img.shields.io/badge/License-Custom-blue)

> *"Spring is to Java what rails is to Ruby - a way to make development faster, easier, and more enjoyable."*

---

## 📖 Overview

A comprehensive guide to understanding Spring Framework and Spring Boot fundamentals. This project covers the evolution of Spring from its early days to modern Spring Boot, exploring core concepts like Beans, Dependency Injection, Auto-Configuration, and Maven build lifecycle with practical demonstrations.

---

## 🎯 What You'll Learn

- 📜 History and evolution of Spring Framework (Early 2000s → 2004 → 2017 → 2014+)
- 🫘 Bean lifecycle, creation patterns, and scope management
- 💉 Dependency Injection techniques and best practices
- ⚡ Spring vs Spring Boot comparison
- 🔧 Auto-configuration mechanisms
- 🏗️ Maven project structure and lifecycle
- 🚀 Complete Spring Boot application startup process

---

## ✨ Features

- 🔍 **Deep Dive into Spring History** - Understand the framework's evolution over two decades
- 🫘 **Bean Management** - Master bean creation, lifecycle hooks, and scope configurations
- 💉 **Dependency Injection Mastery** - Learn field, constructor, and setter injection patterns
- 🎯 **Auto-Configuration Magic** - Explore how Spring Boot simplifies configuration
- 🔄 **Application Lifecycle** - Complete breakdown from JVM startup to application ready state
- 🛠️ **Maven Integration** - Practical examples of Maven commands and lifecycle phases
- 📸 **Visual Learning** - 14+ execution screenshots demonstrating key concepts
- 🎨 **Multiple Bean Resolution Strategies** - Using `@Primary`, `@Qualifier`, and `@ConditionalOnProperty`

---

## 🛠️ Technologies

| Technology | Version | Purpose |
|---|---|---|
| ☕ Java | 17+ | Core Language |
| 🍃 Spring Framework | 6.x | IoC Container |
| 🚀 Spring Boot | 3.x | Rapid Application Development |
| 📦 Maven | 3.8+ | Build & Dependency Management |
| 🎯 Spring Context | Latest | Bean Management |
| ⚙️ Spring Boot Starter | Latest | Auto-Configuration |

---

## 🏗️ Spring Boot Application Startup Flow

```
JVM Startup
    ↓
main() method execution
    ↓
SpringApplication.run(MyApp.class, args)
    ↓
@SpringBootApplication Detection
    ├── @SpringBootConfiguration
    ├── @ComponentScan
    └── @EnableAutoConfiguration
    ↓
SpringApplication Object Creation
    ├── ApplicationContext Setup
    ├── Environment Setup
    └── Listeners & Initializers Registration
    ↓
ApplicationContext Creation
    ↓
Environment Preparation
    ├── application.properties
    ├── Command line args
    └── Active profiles
    ↓
Bean Scanning & Registration
    ├── @ComponentScan beans
    └── Auto-configured beans
    ↓
ApplicationContext Refresh
    ├── Bean instantiation
    ├── Dependency injection
    └── Lifecycle callbacks
    ↓
Embedded Web Server Start (Tomcat)
    ↓
CommandLineRunner/ApplicationRunner Execution
    ↓
✅ Application Ready
```

---

## 📸 Project Screenshots

**1. Traditional Bean Creation** — Creating beans manually with new instances
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/8163a9e0-91a0-4e83-a7f7-b0e9d40edc83" />


**2. Configuration-Based Bean Creation** — Using `@Configuration` and `@Bean` annotations
<img width="1778" height="1018" alt="image" src="https://github.com/user-attachments/assets/6a5c0c05-0a66-4043-8d2c-d537e5649aed" />


**3. Component Scanning** — Automatic bean discovery with `@Component`
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/a3206408-75aa-4191-9b4d-bd981ebd9a49" />


**4. @PostConstruct Lifecycle Hook** — Initialization before bean usage
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/da7a9b71-4ce6-4a29-b2e5-8d92901184a5" />


**5. @PreDestroy Lifecycle Hook** — Cleanup during application shutdown
> 🔔 `@PreDestroy` is called when the application stops and wants to destroy the beans
> <img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/c8cb0152-95f4-4e24-b9ad-5ca5f77ba509" />


**6. Prototype Scope** — New instance on every request
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/f669d637-41da-4891-b3ef-0c19163a3839" />


**7. Dependency Injection — @Primary** — Resolve multiple bean candidates
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/bc295d43-d584-4cb0-a4b0-a4dcc8535f6d" />


**8. Dependency Injection — @ConditionalOnProperty** — Conditional bean creation
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/ba3ddee2-c796-4b83-b47b-0cf1234c2df9" />


**9. Field Injection** — Using `@Autowired` on fields
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/a47f54d1-2b45-42f1-a30d-34abeb64fd68" />


**10. Constructor Injection** — Dependency injection via constructor
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/cd84fd2f-494b-47fd-8725-32fd165f6ca5" />


**11. Final Fields with Constructor** — Immutable dependency pattern
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/b66e30fc-30c1-4ae2-a246-6aa6928c2d74" />


**12. Bean Map Interface** — Retrieve all bean instances as Map
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/b5213616-31db-46cc-a0df-eb6310e3bf5e" />


**13. Maven — Compile Command** — Compile source code
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/2ccdd220-e5ec-428a-837e-14ad6bd8eb3f" />


**14. Maven — Clean Command** — Remove build artifacts
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/1232c2b2-0d3e-4a8e-a7aa-9858ee84908c" />


**15. Maven — Package Command** — Build JAR/WAR
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/b7a1c678-b5fa-4e7a-a679-e798d199fd7b" />


**16. Maven — Install Command** — Install to local repository
<img width="1777" height="921" alt="image" src="https://github.com/user-attachments/assets/07c750f9-53ae-4ae7-93f2-a99f0de76088" />


---

## 📥 Installation

### Prerequisites
- Java JDK 17 or higher
- Maven 3.8+
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Clone the Repository
```bash
git clone https://github.com/rahulthakare04/Spring-Boot-Basics.git
cd Spring-Boot-Basics
```

### Build the Project
```bash
mvn clean install
```

### Run the Application
```bash
mvn spring-boot:run
```
Or run directly:
```bash
java -jar target/spring-boot-basics-1.0.0.jar
```

---

## 🎯 Usage

### Example 1: Creating Beans with @Configuration
```java
@Configuration
public class AppConfig {
    
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}
```

### Example 2: Component Scanning
```java
@Component
public class UserService {
    
    @PostConstruct
    public void init() {
        System.out.println("Bean initialized!");
    }
    
    @PreDestroy
    public void cleanup() {
        System.out.println("Bean destroyed!");
    }
}
```

### Example 3: Constructor Injection (Recommended)
```java
@Service
public class OrderService {
    
    private final PaymentService paymentService;
    
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

### Example 4: Conditional Bean Creation
```java
@Configuration
public class DatabaseConfig {
    
    @Bean
    @ConditionalOnProperty(name = "db.type", havingValue = "mysql")
    public DataSource mysqlDataSource() {
        return new MySQLDataSource();
    }
    
    @Bean
    @ConditionalOnProperty(name = "db.type", havingValue = "postgres")
    public DataSource postgresDataSource() {
        return new PostgreSQLDataSource();
    }
}
```

---

## 🔧 Maven Lifecycle Commands

| Command | Description | Usage |
|---|---|---|
| `mvn compile` | Compiles source code | Development phase |
| `mvn clean` | Removes target directory | Clean build |
| `mvn test` | Runs unit tests | Testing phase |
| `mvn package` | Creates JAR/WAR file | Deployment preparation |
| `mvn install` | Installs to local repository | Sharing locally |
| `mvn deploy` | Deploys to remote repository | Production deployment |

---

## 🤝 Contributing

Contributions are always welcome! Here's how you can help:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔃 Open a Pull Request

> Please be respectful and constructive in all interactions.

---

## 📄 License

Copyright (c) 2024 **Rahul Thakare**

This project and its source code are the exclusive property of the author.  
Unauthorized copying, modification, distribution, or commercial use is strictly prohibited.  
Limited use is granted for learning, reviewing, and non-commercial demonstration purposes only.  
No warranties are provided; use at your own risk.

For permissions beyond this notice, contact: **rt1405472@gmail.com**

---

## 🙏 Acknowledgments

- 🍃 **Spring Team** - For creating an amazing framework
- 🌐 **Open Source Community** - For continuous inspiration and support
- 📚 **Spring Documentation** - Comprehensive guides and references
- 🎓 **Java Community** - For best practices and knowledge sharing
- 💻 **Maven Contributors** - For powerful build automation
- 🚀 **Spring Boot Team** - For simplifying Spring development

---

## 📞 Connect & Support

[![GitHub](https://img.shields.io/badge/GitHub-rahulthakare04-black?logo=github)](https://github.com/rahulthakare04)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rahul%20Thakare-blue?logo=linkedin)](https://www.linkedin.com/in/rahul-thakare-3b38a8255)
[![Gmail](https://img.shields.io/badge/Gmail-rt1405472%40gmail.com-red?logo=gmail)](mailto:rt1405472@gmail.com)

---

🌟 **Star this repo if you find it helpful!** ⭐

Built with ❤️ by **Rahul Thakare**

*Happy Coding! 💻✨*

> *"The best way to predict the future is to implement it."*
