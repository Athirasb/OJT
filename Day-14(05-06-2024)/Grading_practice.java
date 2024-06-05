/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade*/

public class Grading_practice {
   public static void main(String[] args) {
       double mark=48;
       if(mark<25){
        System.out.println("Your grade is F");
       }
       else if(mark>=25 && mark<=45){
        System.out.println("your grade is E");
       }
       else if(mark>=45 && mark<=50){
        System.out.println("your grade is D");
       }
       else if(mark>=50 && mark<=60){
        System.out.println("Your grade is C");
       }
       else if(mark>=60 && mark<=70){
        System.out.println("Your grade is B");
       }
       else if(mark>=70 && mark<=80){
        System.out.println("Your grade is A");
       }
   }
}
