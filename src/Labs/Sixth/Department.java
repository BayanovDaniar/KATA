package Labs.Sixth;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {
    private String name;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
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
