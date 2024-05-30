public class Program5 {
    public static void main(String[] args) {
        int i,j=1;
        for(i=1;i<=10;i++)
        {
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }
        while(j<=10){
            System.out.println(i);
            if(j%5==0){
               break;
            }
          j++;
        }
        System.out.println("OVER");
    }
}
