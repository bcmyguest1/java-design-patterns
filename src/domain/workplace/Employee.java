package domain.workplace;

import java.util.List;

public interface Employee extends Person {
    List<Employee> getSubordinates();
    int getSalary();
}
