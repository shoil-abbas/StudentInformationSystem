import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.printf("%-10s %-15s %-5s %-7s %-12s%n",
                "ID", "Name", "Age", "Grade", "Contact");
        System.out.println("--------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-10s %-15s %-5d %-7.1f %-12s%n",
                    s.getStudentId(), s.getName(),
                    s.getAge(), s.getGrade(), s.getContact());
        }
    }

    // Search by ID
    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    // Search by name
    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // Delete student
    public boolean deleteStudent(String id) {
        Student s = searchById(id);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }
}
