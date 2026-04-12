# Lab 1 - Employee Management System
> SE 1108 Programming and Problem Solving II

---

## 🎯 Objective
This project implements a simple Employee Management System using Java classes and arrays. The goal is to practice object-oriented programming concepts such as **class design, object interaction, constructors, and array-based data management**.

---

## 📌 Requirements (Based on Assignment)

### Employee Class
The `Employee` class includes:
- `int id`
- `String name`
- `String position`
- `double salary`

#### Implemented Methods:
- Constructor: initializes all attributes
- `toString()`: returns formatted employee details
- `main()` method: creates and tests an Employee object

---

### Company Class
The `Company` class includes:
- `String name`
- `Employee[] employees`
- `int currentEmployeeCount`
- `int maxEmployeeCount`

#### Implemented Methods:
- Constructor: initializes company name and employee array
- `addEmployee(Employee employee)`: adds employee if space is available
- `displayEmployees()`: prints all employee details
- `getTotalSalary()`: calculates total salary expense

---

## 🧪 Program Flow
Inside `Company.main()`:
- A `Company` object is created
- At least 3 `Employee` objects are created
- Employees are added to the company
- All employees are displayed
- Total salary expense is calculated and printed

---

## 📂 Project Structure
- `Employee.java` → Employee model class
- `Company.java` → Company management logic

---

## 📘 Note
This implementation follows the exact requirements given in the Lab 1 specification provided by SE 1108.