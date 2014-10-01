package eu.softelo.mvc;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class Student {
    private String rollNo;
    private String name;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
