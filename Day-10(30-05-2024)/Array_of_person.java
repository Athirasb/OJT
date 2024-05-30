//4.	Create a Person class with attributes name and age. Write a program that creates an array of Person objects, initializes them with user input, and then prints out the details of each Person.
public class Array_of_person {
    private String name;
    private int age;
    public Array_of_person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
