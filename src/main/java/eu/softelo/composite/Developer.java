package eu.softelo.composite;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class Developer implements Employee {
    private String name;
    private BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
    }

    @Override
    public void remove(Employee employee) {
    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");
    }
}
