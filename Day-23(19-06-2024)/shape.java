public class shape {
    void draw(){
        System.out.println("Draw a shape");
    }   
}
class Rectangle extends shape{
    @Override
    void draw(){
        System.out.println("Draw a Rectangle");
    }
}
class Circle extends shape{
    @Override 
    void draw(){
        System.out.println("Draw a circle");
    }
    public static void main(String[] args){
        shape shape1=new shape();
        Rectangle Rectangle1=new Rectangle();
        Circle circle1=new Circle();

        shape1.draw();
        Rectangle1.draw();
        
        circle1.draw();

    }
}
