class myflowers{
     void work(){
        System.out.println(" we are beautyful flowers");
    }
}
class Rose extends myflowers{
    void rose(){
        System.err.println("Hey I am Rose.My Smell is Nice...");
    }
}
class Jasmine extends myflowers{
    void jas(){
        System.err.println("Hey Guyz i am Jasmine .. My Smell is Also Nice... and I am white in colour..");
    }
}


public class Flowers {
    public static void main(String[] args) {
        myflowers f = new myflowers();
        f.work();
        Rose R =new Rose();
        R.rose();
        Jasmine J=new Jasmine();
        J.jas();
    }
    
}
