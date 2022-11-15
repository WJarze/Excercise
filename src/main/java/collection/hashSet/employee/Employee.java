package collection.hashSet.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String secondName;

    public Employee(String name , String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
