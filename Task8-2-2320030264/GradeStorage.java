import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GradeStorage {
    private final Map<Integer, Set<Integer>> gradeMap;

    public GradeStorage() {
        gradeMap = new HashMap<>();
    }

    public void addGrade(int studentId, int grade) {
        gradeMap.putIfAbsent(studentId, new HashSet<>());
        gradeMap.get(studentId).add(grade);
    }

    public Set<Integer> getGrades(int studentId) {
        return gradeMap.getOrDefault(studentId, new HashSet<>());
    }

    public static void main(String[] args) {
        GradeStorage storage = new GradeStorage();
        storage.addGrade(101, 85);
        storage.addGrade(101, 90);
        storage.addGrade(102, 78);

        System.out.println(storage.getGrades(101)); // [85, 90]
    }
}