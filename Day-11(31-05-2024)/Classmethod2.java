public class Classmethod2 {
    static void staticmethod(){
        System.out.println("Static method");
    }
    public void publicmethod(){
        System.out.println("Public method");
    }
    public static void main(String[] args) {
        staticmethod();
        Classmethod2 obj = new Classmethod2();
        obj.publicmethod();
       
    }
}
