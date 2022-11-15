package collection.hashSet.employee;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee ( "Adam" , "Kowalski" );
        Employee employee2 = new Employee ( "Jan" , "Zalewski" );
        Employee employee3 = new Employee ( "Ewa" , "Klich" );
        Employee employee4 = new Employee ( "Judyta" , "Papa" );
        Employee employee5 = new Employee ( "Judyta" , "Papa" );
        Employee employee6 = new Employee ( "Judyta" , "Papa" );

        HashSet<Employee> employees = new HashSet<Employee> ( );
        employees.add ( employee1 );
        employees.add ( employee2 );
        employees.add ( employee3 );
        employees.add ( employee4 );
        employees.add ( employee5 );
        employees.add ( employee6 );
        for (Employee employee : employees) {
            System.out.println ( employee );
        }

        EmployeeWithHashCode employeeWithHashCode1 = new EmployeeWithHashCode ( "Adam" , "Kowalski" );
        EmployeeWithHashCode employeeWithHashCode2 = new EmployeeWithHashCode ( "Jan" , "Zalewski" );
        EmployeeWithHashCode employeeWithHashCode3 = new EmployeeWithHashCode ( "Ewa" , "Klich" );
        EmployeeWithHashCode employeeWithHashCode4 = new EmployeeWithHashCode ( "Judyta" , "Papa" );
        EmployeeWithHashCode employeeWithHashCode5 = new EmployeeWithHashCode ( "Judyta" , "Papa" );
        EmployeeWithHashCode employeeWithHashCode6 = new EmployeeWithHashCode ( "Judyta" , "Papa" );
        System.out.println ( );
        HashSet<EmployeeWithHashCode> employeesWithHashCode = new HashSet<EmployeeWithHashCode> ( );
        employeesWithHashCode.add ( employeeWithHashCode1 );
        employeesWithHashCode.add ( employeeWithHashCode2 );
        employeesWithHashCode.add ( employeeWithHashCode3 );
        employeesWithHashCode.add ( employeeWithHashCode4 );
        employeesWithHashCode.add ( employeeWithHashCode5 );
        employeesWithHashCode.add ( employeeWithHashCode6 );
        for (EmployeeWithHashCode employee : employeesWithHashCode) {
            System.out.println ( employee );
        }

    }
}
