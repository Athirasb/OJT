import java.util.ArrayList;
import java.util.List;
public class Student {
    private String studentId, name;
    private int age;
    private List<Double> grades;
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }
    public void addGrade(double grade) { grades.add(grade); }
    public void displayStudentInfo() {
        System.out.printf("ID: %s, Name: %s, Age: %d, Grades: %s%n", studentId, name, age, grades);
    }
    public static void main(String[] args) {
        Student s1 = new Student("001", "Athira", 20);
        Student s2 = new Student("002", "Soorya", 21);
        s1.addGrade(85.5); s1.addGrade(90.0);
        s2.addGrade(78.0); s2.addGrade(82.5);
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
