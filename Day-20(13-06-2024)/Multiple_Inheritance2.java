class Vehicle{
    void type(){
        System.err.println("my vehicle is a car");
    }
}
class Car extends Vehicle{
    void mycar(){
        System.out.println("my car is a sedan");
    }}
    class brand extends Car{
        void brand(){
            System.out.println("my car brand is toyota");
        }
    }


public class Multiple_Inheritance2 {
    public static void main(String[] args) {
        Car favcar=new Car();
        brand favbrand=new brand();
        favcar.type();
        favcar.mycar();
        favbrand.brand();
        
        
    }
}
