// Student.java
import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String name;
    private String id;
    private List<ICourse> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void enrollInCourse(ICourse course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }
}
