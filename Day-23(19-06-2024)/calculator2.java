public class calculator2 {
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double x,double y,double z){
        return x+y+z;
    }
public static void main(String[] args){
    calculator2 cal = new calculator2();
    System.out.println(cal.add(6,8,56));
    System.out.println(cal.add(12.5,22.5,31.5));
}
}