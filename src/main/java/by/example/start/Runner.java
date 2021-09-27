package by.example.start;

import by.example.logic.student.AverageOfStudentMarks;
import by.example.logic.teacher.AverageOfTeacherSalaries;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Средний балл первого студента: " + AverageOfStudentMarks.getAverageMarks());
        System.out.println("Средний балл второго студента: " + AverageOfStudentMarks.getAverageMarks());

        System.out.println("Средняя зарплата первой группы преподавателей: " + AverageOfTeacherSalaries.getAverageSalaries());
        System.out.println("Средняя зарпалата второй группы преподавателей: " + AverageOfTeacherSalaries.getAverageSalaries());
    }
}
