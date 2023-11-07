package EX1;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
    String name;
    String CNP;
    LocalDate hiringDate;
    String specialization;
    double salary;

    public Employee(String name, String CNP, LocalDate hiringDate, String specialization, double salary) {
        this.name = name;
        this.CNP = CNP;
        this.hiringDate = hiringDate;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", CNP='" + CNP + '\'' +
                ", hiringDate=" + hiringDate +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(CNP, employee.CNP) && Objects.equals(hiringDate, employee.hiringDate) && Objects.equals(specialization, employee.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, CNP, hiringDate, specialization, salary);
    }

    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}

