// ICourse.java
import java.util.List;

public interface ICourse {
    String getCourseName();
    String getCourseId();
    List<IStudent> getEnrolledStudents();
    void addStudent(IStudent student);
}
