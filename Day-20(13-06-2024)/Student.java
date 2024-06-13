public class Student {
  private String name;
  private String studentID;
  private int grade;

  // Constructor
  public Student(String name, String studentID, int grade) {
      this.name = name;
      this.studentID = studentID;
      setGrade(grade);
  }

  // Getter and Setter for name
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }

  // Getter and Setter for studentID
  public String getStudentID() {
      return studentID;
  }
  public void setStudentID(String studentID) {
      this.studentID = studentID;
  }

  // Getter and Setter for grade
  public int getGrade() {
      return grade;
  }
  public void setGrade(int grade) {
      if (grade >= 0 && grade <= 100) {
          this.grade = grade;
      } else {
          System.out.println("Grade must be within the range 0-100.");
      }
  }

  // Main method
  public static void main(String[] args) {
      // Creating a student object
      Student student = new Student("Mahima", "10201", 85);

      // Printing details of the student
      System.out.println("Name: " + student.getName());
      System.out.println("Student ID: " + student.getStudentID());
      System.out.println("Grade: " + student.getGrade());

      // Modifying grade using setter
      student.setGrade(95);
      System.out.println("Updated Grade: " + student.getGrade());

      // Trying to set an invalid grade
      student.setGrade(110);
      System.out.println("Grade after invalid update: " + student.getGrade()); // Should still be the previous valid grade
  }
}
