public class Changevalue {
    int x=99;
    public static void main(String[] args) {
        Changevalue obj1=new Changevalue();
        Changevalue obj2=new Changevalue();
        obj2.x=997;
        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}
