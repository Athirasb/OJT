class D implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("This is my child thread");
        }
    }
}

public class Runnableinterface1 {
    public static void main(String[] args) {
        D r=new D();
        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("This is my Main thread");
        }
    }
    
}
