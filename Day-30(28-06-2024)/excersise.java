public class excersise extends Thread {
    private String threadName;

    excersise(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        excersise t1 = new excersise("Thread 1");
        excersise t2 = new excersise("Thread 2");
        t1.start();
        t2.start();
    }
}


 