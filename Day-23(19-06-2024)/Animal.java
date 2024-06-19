public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound");
    }
    
}
class dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("dog barks");
    }
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        myAnimal.makeSound();
    }
}
