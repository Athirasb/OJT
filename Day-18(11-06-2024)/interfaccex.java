interface shape{
    double calarea();
}
class rectangle implements shape{
    private double length;
    private double Width;
    public rectangle(double length,double Width){
        this.length=length;
        this.Width=Width;
    
}
public double calarea(){
    return length*Width;
    }
    public double perimeter(){
        return 2*(length+Width);
    }
}

class square implements shape{
    private double length;

    public square(double length){
        this.length=length;
       

}
public double calarea(){
    return length*length;
}
}



public class interfaccex {
    public static void main(String[] args){
        rectangle rec = new rectangle(10,5);
        System.out.println("Area of rectangle is "+rec.calarea());
        System.out.println("Perimeter of rectangle is "+rec.perimeter());
    
    }
}
