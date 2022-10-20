package Labs.Fourth.A;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String name;
    private final List<Department> departmentList = new ArrayList<>();

    public Firm(String name) {
        this.name = name;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
        System.out.println("Success adding");
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
}
