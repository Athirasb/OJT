class z extends Thread
{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class Y extends Thread
{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class thread2{
    public static void main(String[] args) {
        z t=new z();
        Y n=new Y();
        t.start();
        n.start();
        
        }
    }

