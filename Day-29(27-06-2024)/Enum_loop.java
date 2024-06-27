enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class Enum_loop { 
    public static void main(String[] args) { 
      for (Level myVar : Level.values()) {
        System.out.println(myVar);
      }
    } }
  