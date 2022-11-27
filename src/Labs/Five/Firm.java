package Labs.Five;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Firm implements Serializable {
    private String name;
    private final List<Department> departmentList = new ArrayList<>();

    public Firm(String name) {
        this.name = name;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "name='" + name + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}
