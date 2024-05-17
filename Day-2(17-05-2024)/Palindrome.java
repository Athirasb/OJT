public class Palindrome {
    public static void main(String[] args){
        String value = "amma";
        String rev = new StringBuilder(value).reverse().toString();
        if (value.equals(rev)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
