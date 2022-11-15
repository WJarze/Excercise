package collection.hashSet.employee;

import java.util.Objects;

public class EmployeeWithHashCode {
    private String name;
    private String secondName;

    public EmployeeWithHashCode(String name , String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof EmployeeWithHashCode employeeWithHashCode) ) return false;
        return name.equals ( employeeWithHashCode.name ) && secondName.equals ( employeeWithHashCode.secondName );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( name , secondName );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
