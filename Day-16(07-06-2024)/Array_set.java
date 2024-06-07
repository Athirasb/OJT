import java.util.ArrayList;

public class Array_set {
    public static void main(String[] args) {
        ArrayList<String> veg =new ArrayList<String>();
        veg.add("Tomato");
        veg.add("Onion");
        veg.add("Green Chilly");

        System.out.println(veg);
        System.out.println(veg.get(1));
        veg.set(1,"sweet potato");
        System.out.println(veg);
        veg.remove(1);
        System.out.println(veg);
        System.out.println(veg.size());
    }
}
