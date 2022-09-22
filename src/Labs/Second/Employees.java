package Labs.Second;

public abstract class Employees {
    private String name;
    private String post;
    private int salary;

    public abstract double calcSalary() ;

    public Employees(String name, String post, int salary) throws OkladException {
        try {
            if (salary < 0) {
                throw new OkladException();
            }
        }catch (OkladException e){
            System.out.println("It is impossible" +
                    "to create an employee – a negative salary is indicated:" + salary);
            throw  e;
        }
        this.name = name;
        this.post = post;
        this.salary = salary;
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

    static class OkladException extends Exception{
    }
}
