enum score{
    LOW,HIGH,MEDIUM;
}
public class enum_switch {
    public static void main(String[] args) {
        score myscore=score.HIGH;
        switch(myscore){
            case LOW:
            System.out.println("You score is too low");
            break;
            case HIGH:
            System.out.println("Your score is high congratz");
            break;
            case MEDIUM:
            System.out.println("good.try again");
        }
    }
}
