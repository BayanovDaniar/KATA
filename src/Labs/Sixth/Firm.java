package Labs.Sixth;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Firm implements Serializable {
    private String name;
    private List<Department> departmentList = new ArrayList<>();

    public Firm(String name) {
        this.name = name;
    }

    public Firm() {}

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
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
