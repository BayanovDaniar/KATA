package Labs.Sixth;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String name;
    private String post;
    private int salary;

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public Employee() {
    }

    public int calcSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
