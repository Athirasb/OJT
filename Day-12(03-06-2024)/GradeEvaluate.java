import java.util.Scanner;

public class GradeEvaluate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your score:");
        int score=s.nextInt();
        if(score>40 && score<50){
            System.out.println("A");
        }
        else if(score>30 && score<=40){
            System.out.println("B");
        }
        else if(score>20 && score<=30){
            System.out.println("c");
        }else{
            System.out.println("D");
        }
    }
}
