// Main.java
public class Main {
    public static void main(String[] args) {
      Array_of_person person1 = new Array_of_person("Ean Craig", 11);
      Array_of_person person2 = new Array_of_person("Evan Ross", 12);
      System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
      System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
    }
  }
  