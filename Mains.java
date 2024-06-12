package practive.anudip;

//Person.java
class Person {
 // Attributes
 String name;
 int age;

 // Constructor
 public Person(String n, int a) {
     name = n;
     age = a;
 }

 // Method to display personal information
 public void displayPersonalInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Employee.java
class Employee extends Person {
 // Additional attributes
 String employeeId;
 String department;

 // Constructor
 public Employee(String n, int a, String empId, String dept) {
     super(n, a); // Call the constructor of the superclass (Person)
     employeeId = empId;
     department = dept;
 }

 // Method to display employee-specific information
 public void displayEmployeeInfo() {
     displayPersonalInfo(); // Display personal information
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Department: " + department);
 }
}

//Manager.java
class Manager extends Employee {
 // Additional attribute
 int teamSize;

 // Constructor
 public Manager(String n, int a, String empId, String dept, int tSize) {
     super(n, a, empId, dept); // Call the constructor of the superclass (Employee)
     teamSize = tSize;
 }

 // Method to display manager-specific information
 public void displayManagerInfo() {
     displayEmployeeInfo(); // Display employee information
     System.out.println("Team Size: " + teamSize);
 }
}

//Main.java
public class Mains {
 public static void main(String[] args) {
     // Create an instance of Manager
     Manager mgr = new Manager("Alice Johnson", 35, "E12345", "Engineering", 10);

     // Demonstrate the usage of all methods
     mgr.displayManagerInfo();
 }
}

