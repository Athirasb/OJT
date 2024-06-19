public class Animal2 {
    void makesound(){
        System.out.println("Animal makes sound");
    }
    
}
class cat extends Animal2{
    @Override
    void makesound(){
        System.out.println("meow meow");
    }
}
class dog extends Animal2{
    @Override
    void makesound(){
        System.out.println("dog barks");
    }
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        cat mycat=new cat();
        dog mydog=new dog();

        myAnimal.makesound();
        mycat.makesound();
        mydog.makesound();
    }
}
