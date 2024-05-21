import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000, LocalDate.of(2015, 5, 20));

        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Hire Date: " + emp.hireDate);
        System.out.println("Years of Service: " + emp.getYearsOfService());
    }
}