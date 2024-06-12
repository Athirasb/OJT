import java.util.*;
 
public class Iterator_ex2{
public static void main(String[] args) {
   ArrayList<String> color=new ArrayList<String>();
   color.add("Red");
   color.add("Blue");
   color.add("Black");
   color.add("Rose");
   System.out.println(color);
   Iterator<String> hey=color.iterator();
   while(hey.hasNext()) {
    System.out.println(hey.next());
  }
}
}