public class Classmethods {
    
    static void myStaticMethod() {
      System.out.println("Static methods");
    }
  
  
    public void myPublicMethod() {
      System.out.println("Public method");
    }

    public static void main(String[] args) {
      myStaticMethod(); 
  
      Classmethods myObj = new Classmethods(); 
      myObj.myPublicMethod(); 
    }
  }