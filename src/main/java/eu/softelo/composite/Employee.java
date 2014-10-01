package eu.softelo.composite;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public interface Employee {
    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);

    String getName();

    BigDecimal getSalary();

    void print();
}
