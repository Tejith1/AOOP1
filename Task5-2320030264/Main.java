// Main.java
public class Main {
    public static void main(String[] args) {
        IStudent student1 = new Student("Alice", "S001");
        IStudent student2 = new Student("Bob", "S002");

        ICourse course1 = new Course("C001", "Mathematics");
        ICourse course2 = new Course("C002", "Physics");

        IEnrollmentManager enrollmentManager = new EnrollmentManager();

        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student2, course2);
        enrollmentManager.enrollStudentInCourse(student1, course2);

        // Display enrolled students in Mathematics
        System.out.println("Enrolled students in " + course1.getCourseName() + ":");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Display enrolled students in Physics
        System.out.println("Enrolled students in " + course2.getCourseName() + ":");
        for (IStudent student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
