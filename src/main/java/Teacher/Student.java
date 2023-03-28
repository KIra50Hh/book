package Teacher;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String email, String studentId) {
        super(name, age, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}