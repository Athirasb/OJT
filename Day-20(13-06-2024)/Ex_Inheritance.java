class Color{
    void mycolor(){
        System.out.println("My fav colors are Red,Blue,Black");
    }
}
    class Red extends Color{
        void myred(){
            System.out.println("My fav color is red");
        }
    }


    public class Ex_Inheritance{
    public static void main(String[] args) {
        Red color=new Red();
        color.mycolor();
        color.myred();
}
}
