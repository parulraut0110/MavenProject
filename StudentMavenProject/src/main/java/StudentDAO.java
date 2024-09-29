import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // Insert a student record
    public void insertStudent(Student student) {
        String sql = "INSERT INTO student (Reg_no, Name, SGPA) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, student.getRegNo());
            stmt.setString(2, student.getName());
            stmt.setDouble(3, student.getSgpa());
            stmt.executeUpdate();
            System.out.println("Student record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }

    // Display all student records
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        List<Student> students = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int regNo = rs.getInt("Reg_no");
                String name = rs.getString("Name");
                double sgpa = rs.getDouble("SGPA");
                students.add(new Student(regNo, name, sgpa));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
        return students;
    }

    // Update SGPA for a specific student
    public void updateSGPA(int regNo, double newSgpa) {
        String sql = "UPDATE student SET SGPA = ? WHERE Reg_no = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, newSgpa);
            stmt.setInt(2, regNo);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("SGPA updated successfully for Reg_no: " + regNo);
            } else {
                System.out.println("No student found with Reg_no: " + regNo);
            }
        } catch (SQLException e) {
            System.out.println("Error updating SGPA: " + e.getMessage());
        }
    }
}

