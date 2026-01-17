import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student ID: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        if (!ValidationUtils.isValidAge(age)) {
                            System.out.println("Invalid Age!");
                            break;
                        }

                        System.out.print("Enter Grade (1-100): ");
                        double grade = sc.nextDouble();
                        sc.nextLine();

                        if (!ValidationUtils.isValidGrade(grade)) {
                            System.out.println("Invalid Grade!");
                            break;
                        }

                        System.out.print("Enter Contact (10 digits): ");
                        String contact = sc.nextLine();

                        if (!ValidationUtils.isValidContact(contact)) {
                            System.out.println("Invalid Contact!");
                            break;
                        }

                        Student student = new Student(id, name, age, grade, contact);
                        manager.addStudent(student);
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        Student s1 = manager.searchById(sc.nextLine());
                        System.out.println(s1 != null ? "Found: " + s1.getName() : "Student not found");
                        break;

                    case 4:
                        System.out.print("Enter Name: ");
                        Student s2 = manager.searchByName(sc.nextLine());
                        System.out.println(s2 != null ? "Found: " + s2.getStudentId() : "Student not found");
                        break;

                    case 5:
                        System.out.print("Enter Student ID to delete: ");
                        boolean deleted = manager.deleteStudent(sc.nextLine());
                        System.out.println(deleted ? "Deleted successfully" : "Student not found");
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}
