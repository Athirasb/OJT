public class Students {
    private String name;
    private String studentId;
    private int grade;
    public Students(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        setGrade(grade);  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be within the range 0 to 100");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Students student = new Students("John Doe", "12345", 85);
        System.out.println("Name: " + student.getName());          // Output: John Doe
        System.out.println("Student ID: " + student.getStudentId()); // Output: 12345
        System.out.println("Grade: " + student.getGrade());        // Output: 85

        student.setGrade(95);
        System.out.println("Updated Grade: " + student.getGrade()); // Output: 95

        try {
            student.setGrade(105);  // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Grade must be within the range 0 to 100
        }
    }
}