
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Insert students
        Student student1 = new Student(1, "John Doe", 8.5);
        Student student2 = new Student(2, "Jane Smith", 9.1);
        studentDAO.insertStudent(student1);
        studentDAO.insertStudent(student2);

        // Display all students
        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        // Update SGPA for a specific student
        studentDAO.updateSGPA(1, 9.2);

        // Display updated student list
        System.out.println("\nUpdated student list:");
        students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
