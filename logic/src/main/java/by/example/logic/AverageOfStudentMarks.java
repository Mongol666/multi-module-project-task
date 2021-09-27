package by.example.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

import by.example.models.student.Student;

public class AverageOfStudentMarks {
    public static BigDecimal getAverageMarks() {
        Student student = new Student(new BigDecimal[(int) (Math.random() * 10 + 1)]);
        initializeMarks(student.getMarks());
        BigDecimal sumOfMarks = sumOfMarks(student.getMarks());

        // переменная, которая определяет размер массива оценок студента
        int size = student.getMarks().length;

        return sumOfMarks.divide(new BigDecimal(size), 2, RoundingMode.HALF_UP);
    }

    /**
     * Метод, отвечающий за инициализацию оценок студента
     *
     * @param marks тип - {@link BigDecimal}
     */
    private static void initializeMarks(BigDecimal[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = BigDecimal.valueOf(Math.random() * 10 + 1);
        }
    }

    /**
     * Метод, отвечающий за суммирование всех оценок студента
     *
     * @param marks тип - массив {@link BigDecimal}
     * @return тип {@link BigDecimal}
     */
    private static BigDecimal sumOfMarks(BigDecimal[] marks) {
        BigDecimal result = new BigDecimal(0);
        for (BigDecimal mark : marks) {
            result = result.add(mark);
        }
        return result;
    }
}
