// Define a superclass named Animal
class Animal {
    // Method in superclass
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Define a subclass named Dog that extends Animal
class Dog extends Animal {
    // Method in subclass
    void bark() {
        System.out.println("The dog barks.");
    }
    
    // Overriding the eat method
    @Override
    void eat() {
        System.out.println("The dog eats bones.");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Dog
        Dog dog = new Dog();
        // Call methods
        dog.eat();  // Overridden method
        dog.bark();
    }
}
