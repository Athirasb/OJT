class M extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println("NSTI");
            Thread.sleep(500);
            }catch(InterruptedException e)
            {
                System.out.println("Thread M was Interrpted:"+e.getMessage());
            }
            
        }
    }
}
public class threadsuperclass1 {
    public static void main(String[] args) throws InterruptedException {
        M t=new M();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("I Love to Studey");
            Thread.sleep(500);
        }
    
}
}
