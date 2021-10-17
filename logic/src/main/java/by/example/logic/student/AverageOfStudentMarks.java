package by.example.logic.student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import by.example.models.student.Student;

public class AverageOfStudentMarks {
    public static BigDecimal getAverageMarks() {
        Student student = new Student(initializeMarks((int) (Math.random() * 10 + 1)));
        BigDecimal sumOfMarks = sumOfMarks(student.getMarks());

        return sumOfMarks.divide(new BigDecimal(student.getMarks().size()), 2, RoundingMode.HALF_UP);
    }

    /**
     * Метод, отвечающий за инициализацию оценок студента
     *
     * @param capacityOfList: тип - {@link Integer}
     * @return marks: {@link List<BigDecimal>}
     */
    private static List<BigDecimal> initializeMarks(int capacityOfList) {
        List<BigDecimal> marks = new ArrayList<>();
        for (int i = 0; i < capacityOfList; i++) {
            marks.add(BigDecimal.valueOf(Math.random() * 10 + 1));
        }
        return marks;
    }

    /**
     * Метод, отвечающий за суммирование всех оценок студента
     *
     * @param marks тип - List из {@link BigDecimal}
     * @return тип {@link BigDecimal}
     */
    private static BigDecimal sumOfMarks(List<BigDecimal> marks) {
        BigDecimal result = new BigDecimal(0);
        for (BigDecimal mark : marks) {
            result = result.add(mark);
        }
        return result;
    }
}
