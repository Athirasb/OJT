class Fruits{
    void myfruits(){
        System.out.println("I love fruits");
    }}
    class vegitables extends Fruits{
        void myveg(){
            System.out.println("I love vegitables too");
        }
    }
public class Ex2_Inheritance {
    public static void main(String[] args) {
        vegitables veg = new vegitables();
        veg.myfruits();
        veg.myveg();
    }
}

