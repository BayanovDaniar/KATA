package Labs.Fourth.A;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Employee> employeeList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Success adding");
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbOfEmp() {
        return employeeList.size();
    }

}
