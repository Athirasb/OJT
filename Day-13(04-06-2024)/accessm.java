//Access modifers-public, private, protected
//Non-access modifers-static,final,abstract

class  simple{
    public int x=100;
    private int y=200;
    private static int q=0;

    private static void increment(){
        q++;
    }

    void show(){
        System.out.println("the value of x:" +x);
        System.out.println("the value of y:" +y);
        System.out.println("the value of q:" +q);

        // void data(){
        //     private int q=50;
        // }
    }
}



public class accessm{
    public static void main(String[] args) {
        simple obj = new simple();
        obj.show();
        // System.out.println(y);
    }

}