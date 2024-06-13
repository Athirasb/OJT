class LivingBeing{
    void being(){
        System.out.println("Living beings are making sound");
    }
}
class Animal extends LivingBeing{
    void living(){
        System.out.println("My fav animal is Dog");
    }
}
class Dog extends Animal{
    void Dog(){
        System.err.println("Dogs are look cute");
    }
}
public class Multiple_Inheritance1 {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        Dog mydog=new Dog();
        myanimal.being();
        myanimal.living();
        mydog.Dog();
        
    }
}
