import java.util.HashMap;

public class hashmap_clone {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    HashMap copy = (HashMap)capitalCities.clone();
    copy.remove("England");//remove used to remove an element in this list
    
    System.out.println(capitalCities);
    System.out.println(copy);//copying that output
  }
}
