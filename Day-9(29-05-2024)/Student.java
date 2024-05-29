// Define a class named Student
class Student {
    // Private instance variables
    private String name;
    private int rollNumber;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Student
        Student student = new Student();
        // Set values using setters
        student.setName("Bob");
        student.setRollNumber(101);
        // Get values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
