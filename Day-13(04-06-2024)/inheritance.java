
class shape{
    int length,area;
    
    public void show(){
        System.out.println(area);
    }
}
class square extends shape{
    square(int s){
        length=s;
    }

    public void show(){
        area=length*length;
       System.out.println("the area of sare is:"+area);
    }
   
}

public class inheritance {
    public static void main(String[] args) {
     square s=new square(5);
     s.show();
    }
}