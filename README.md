# Employee Management
This repo is a learning playground for Java OOP — ideal for students or new developers to understand real-world object-oriented programming.
This project demonstrates core **Object-Oriented Programming (OOP)** concepts in Java, including:

- ✅ Inheritance  
- ✅ Method Overriding  
- ✅ Polymorphism  
- ✅ Class Structure and Refactoring  
- ✅ Practical Use of `extends` and `super`  

This is a Java-based Employee Management System designed to handle the essential operations of employee records, such as:

- Adding new employees
- Viewing employee details
- Updating employee information
- Deleting employee records

🚀 Project Structure

| File              | Description                                                  |
|-------------------|--------------------------------------------------------------|
| `Main.java`       | Base class with fields and salary calculation logic          |
| `Employee.java`   | Subclass of Main (may include overrides or extensions)       |
| `PermEmployee.java` | Inherits from `Employee`, adds `doFun()` behavior          |

🔄 Polymorphism in Action

This project shows how **runtime polymorphism** works:

![Polymorphism](https://github.com/Rutayuga/Employee-Management/blob/9db8e57bca2eb2f1ef86f161698ca9cc9e307e03/src/polymorphism-diagram.png?raw=true)

```java
Employee emp = new PermEmployee();
emp.calculateSalary(); // Calls the overridden method from PermEmployee (if overridden)

💻 Technologies Used

- Java
- IntelliJ IDEA
- Gradle
- Git & GitHub

 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/Rutayuga/Employee-Management.git
   cd Employee-Management

