// EnrollmentManager.java
public class EnrollmentManager implements IEnrollmentManager {
    @Override
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
    }
}
