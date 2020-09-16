package stub;

import java.util.List;

public class GradeService {
    private final GradeSystem gradeSystem;
    GradeSystemMock gradeSystemMock=new GradeSystemMock();

    public GradeService(GradeSystem gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    public double calculateAverageGrades(long studentId) {
        List<Double> doubles = gradeSystem.gradesFor(studentId);
       // List<Double> doubles = gradeSystemMock.gradesFor(1);
        double averageGrade = doubles.stream()
                .mapToDouble((grade) -> grade)
                .average()
                .orElse(0);

        return averageGrade;
    }
}
