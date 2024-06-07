// Base class
class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
}
class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }
    public void manage() {
        System.out.println(getName() + " is managing the team.");
    }
}
class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }
    public void develop() {
        System.out.println(getName() + " is developing software.");
    }
}
public class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Manager mgr1 = new Manager("Bob", 102);
        Developer dev1 = new Developer("Charlie", 103);
        emp1.work();
        mgr1.work();
        mgr1.manage();
        dev1.work();
        dev1.develop();
    }
}
