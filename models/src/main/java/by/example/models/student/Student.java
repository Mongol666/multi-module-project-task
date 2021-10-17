package by.example.models.student;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Student {
    private List<BigDecimal> marks;

    public Student(List<BigDecimal> marks) {
        this.marks = marks;
    }

    public List<BigDecimal> getMarks() {
        return marks;
    }

    public void setMarks(List<BigDecimal> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }

    @Override
    public String toString() {
        return "Оценки этого студента: " + marks.toString();
    }
}
