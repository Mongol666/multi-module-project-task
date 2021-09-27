package by.example.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Teacher {
    private BigDecimal salary;

    public Teacher() {
    }

    public Teacher(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return salary.equals(teacher.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    public String toString() {
        return "Преподаватель с зарплатой: " + salary;
    }
}
