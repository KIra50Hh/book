package Teacher;

public class Main {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();

        Student student1 = new Student("Alice", 18, "alice@example.com", "123456");
        Student student2 = new Student("Bob", 19, "bob@example.com", "789012");

        mathTeacher.teach(student1);
        mathTeacher.teach(student2);
    }
}