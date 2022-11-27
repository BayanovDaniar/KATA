package Labs.Five;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {
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

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\n' +
                ", employeeList=" + employeeList +
                '}';
    }
}
