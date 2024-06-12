class Animal{
    void eat(){
        System.out.println("The animals eats food");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();

    }
    
}
