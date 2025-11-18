class Employee { 
String name, dept; 
double salary; 
Employee(String name, String dept, double salary) { 
this.name = name; 
this.dept = dept; 
this.salary = salary; 
} 
double calculateBonus() { 
return 0.0; 
} 
} 
class Manager extends Employee { 
Manager(String name, String dept, double salary) { 
super(name, dept, salary); 
} 
@Override 
double calculateBonus() { 
return salary * 0.2; // 20% bonus 
} 
} 
class Developer extends Employee { 
Developer(String name, String dept, double salary) { 
super(name, dept, salary); 
} 
@Override 
double calculateBonus() { 
return salary * 0.1; // 10% bonus 
} 
}

public class Payroll { 
public static void main(String[] args) { 
Employee emp1 = new Manager("Alice", "HR", 50000); 
Employee emp2 = new Developer("Bob", "IT", 40000); 
System.out.println("Manager Bonus: " + emp1.calculateBonus()); // 10000 
System.out.println("Developer Bonus: " + emp2.calculateBonus()); // 4000 
} 
}