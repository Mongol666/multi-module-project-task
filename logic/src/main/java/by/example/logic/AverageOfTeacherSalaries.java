package by.example.logic;

import by.example.models.teacher.Teacher;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageOfTeacherSalaries {
    public static BigDecimal getAverageSalaries() {
        Teacher[] teachers = new Teacher[(int) (Math.random() * 10 + 1)];
        initializeSalaries(teachers);
        BigDecimal sumOfSalaries = sumOfSalaries(teachers);

        // переменная, которая определяет размер массива преподавателей
        int size = teachers.length;

        return sumOfSalaries.divide(new BigDecimal(size), 2, RoundingMode.HALF_UP);
    }

    /**
     * Метод, который устанавливает рандомную зарплату рандомному количеству учителей
     *
     * @param teachers тип - массив {@link Teacher}
     */
    private static void initializeSalaries(Teacher[] teachers) {
        for (Teacher teacher : teachers) {
            teacher.setSalary(BigDecimal.valueOf(Math.random() * 5000 + 1500));
        }
    }

    /**
     *
     * @param teachers тип - массив {@link Teacher}
     * @return тип {@link BigDecimal}
     */
    private static BigDecimal sumOfSalaries(Teacher[] teachers) {
        BigDecimal result = new BigDecimal(0);
        for (Teacher teacher : teachers) {
            result = result.add(teacher.getSalary());
        }

        return result;
    }
}
