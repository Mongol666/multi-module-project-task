package start;

import static by.example.logic.student.AverageOfStudentMarks.getAverageMarks;
import static by.example.logic.teacher.AverageOfTeacherSalaries.getAverageSalaries;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Средний балл первого студента: " + getAverageMarks());
        System.out.println("Средний балл второго студента: " + getAverageMarks());

        System.out.println("Средняя зарплата первой группы преподавателей: " + getAverageSalaries());
        System.out.println("Средняя зарпалата второй группы преподавателей: " + getAverageSalaries());
    }
}
