import java.util.*;
 
public class Iterator_ex1{
public static void main(String[] args) {
   ArrayList<String> color=new ArrayList<String>();
   color.add("Red");
   color.add("Blue");
   color.add("Black");
   color.add("Rose");
   System.out.println(color);
   Iterator<String> hey=color.iterator();
   System.out.println(hey.next());//next()method returns the next element in the collection and moves the itrator to the next position
   
}
}

