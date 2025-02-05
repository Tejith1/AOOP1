// Course.java
import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<IStudent> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public void addStudent(IStudent student) {
        enrolledStudents.add(student);
    }
}
