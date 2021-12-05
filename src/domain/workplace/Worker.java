package domain.workplace;

import java.util.ArrayList;
import java.util.List;

public class Worker implements Employee{
    final String name;
    int salary;
    List<Employee> subordinates = new ArrayList<>();

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public List<Employee> getSubordinates() {
        return new ArrayList<>();
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        return String.format("Bossman: %s - salary: $%d - subordinates: %s", name, salary, subordinates);
    }
}
