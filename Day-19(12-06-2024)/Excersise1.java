class vehicle{
    void car(){
        System.out.println("The type car is audi");

        }
    }
    class brand extends vehicle{
        void brand(){
            System.out.println("The car brand is BMW");
        }
    }

public class Excersise1 {
    public static void main(String[] args) {
        brand Mybrand=new brand();
        Mybrand.car();
        Mybrand.brand();
        
    }
}
