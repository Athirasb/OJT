class LivingBeing{
    void eat(){
        System.out.println("This is a animal");

    }
}

class Animal extends LivingBeing{
    void barking(){
        System.out.println("The dog is barking");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs makes sound");
    }
}

public class Excersise2 {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Dog mydog=new Dog();
        LivingBeing living =new LivingBeing();
        myanimal.barking();
        mydog.sound();
        living.eat();
        
    }
    
}
