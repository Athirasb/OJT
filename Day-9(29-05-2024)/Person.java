// Define a class named Person
class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Person
        Person person = new Person("Alice", 30);
        // Call the display method
        person.display();
    }
}
