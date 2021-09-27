package by.example.models.student;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
    private BigDecimal[] marks;

    public Student() {
    }

    public Student(BigDecimal[] marks) {
        this.marks = marks;
    }

    public BigDecimal[] getMarks() {
        return marks;
    }

    public void setMarks(BigDecimal[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(marks);
    }

    @Override
    public String toString() {
        return "Оценки этого студента: " + Arrays.toString(marks);
    }
}
