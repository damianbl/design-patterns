package eu.softelo.composite;

import java.math.BigDecimal;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("John", new BigDecimal("10000"));
        Employee employee2 = new Developer("David", new BigDecimal("15000"));
        Employee employee3 = new Developer("Michael", new BigDecimal("20000"));

        Employee manager1 = new Manager("Daniel", new BigDecimal("25000"));

        Employee generalManager = new Manager("Mark", new BigDecimal("50000"));

        manager1.add(employee1);
        manager1.add(employee2);

        generalManager.add(manager1);
        generalManager.add(employee3);

        generalManager.print();
    }
}
