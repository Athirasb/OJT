class Mul{
    public int cal(int a,int b){
       return a*b;
       
    }
    public int cal(int a,int b,int c){
        return a*b*c;
         
     }
}
public class MethodOverloading {

    public static void main(String[] args) {
        Mul m = new Mul();
       
        System.out.println(m.cal(2,3));
        System.out.println(m.cal(2, 3, 5));


    }  
}