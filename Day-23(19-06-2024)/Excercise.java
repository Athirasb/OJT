class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
    }
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cow moos");
    }
}
public class Excercise {
    public static void main(String[] args) {
        Animal [] Animals=new Animal[3];
        Animals[0]=new Dog();
        Animals[1]=new Cat();
        Animals[2]=new Cow();
        for(Animal Animal:Animals){
            Animal.makeSound();
        }
    }
}
