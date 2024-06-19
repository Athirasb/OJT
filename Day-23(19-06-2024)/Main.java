class Shape {
    void Draw() {
        System.out.println("Drwaing a shape");
    }
}
class Circle extends Shape {
    @Override
    void Draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void Draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
       
        Shape[] shapes=new Shape[2];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        for(Shape shape:shapes){
            shape.Draw();
        }



    }
}
