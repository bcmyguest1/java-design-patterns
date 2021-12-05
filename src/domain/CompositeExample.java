package domain;

import domain.workplace.Employee;
import domain.workplace.Worker;

public class CompositeExample {
    public static void main(String[] args) throws Exception {
        Worker CEO = new Worker("John", 1000000);
        Employee lowlyEmployee = new Worker("James", 1);
        System.out.println(CEO);
        System.out.println(lowlyEmployee);
        CEO.add(lowlyEmployee);
        System.out.println(CEO);

    }
}
