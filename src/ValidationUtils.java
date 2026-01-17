public class ValidationUtils {

    public static boolean isValidAge(int age) {
        return age > 0 && age <= 100;
    }

    public static boolean isValidGrade(double grade) {
        return grade >= 1.0 && grade <= 100.0;
    }

    public static boolean isValidContact(String contact) {
        return contact.matches("\\d{10}");
    }
}
