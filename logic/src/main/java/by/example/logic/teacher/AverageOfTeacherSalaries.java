package by.example.logic.teacher;

import by.example.models.teacher.Teacher;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class AverageOfTeacherSalaries {
    public static BigDecimal getAverageSalaries() {
        List<Teacher> teachers = initializeTeachersAndSalaries((int) (Math.random() * 10 + 1));
        BigDecimal sumOfSalaries = sumOfSalaries(teachers);

        return sumOfSalaries.divide(new BigDecimal(teachers.size()), 2, RoundingMode.HALF_UP);
    }

    /**
     * Метод, который устанавливает рандомную зарплату рандомному количеству учителей
     *
     * @param capacityOfList: тип - {@link Integer}
     * @return teachers: тип - {@link List<Teacher>}
     */
    private static List<Teacher> initializeTeachersAndSalaries(int capacityOfList) {
        List<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < capacityOfList; i++) {
            teachers.add(new Teacher(BigDecimal.valueOf(Math.random() * 5000 + 1500)));
        }
        return teachers;
    }

    /**
     *
     * @param teachers: тип - {@link List<Teacher>}
     * @return тип {@link BigDecimal}
     */
    private static BigDecimal sumOfSalaries(List<Teacher> teachers) {
        BigDecimal result = new BigDecimal(0);
        for (Teacher teacher : teachers) {
            result = result.add(teacher.getSalary());
        }

        return result;
    }
}
