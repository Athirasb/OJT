class Car {
    // Instance variables
    String color;
    String model;
    
    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    
    // Method to display car details
    void displayDetails() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car("Red", "Toyota");
        
        // Call method on the object
        myCar.displayDetails();
    }
}
