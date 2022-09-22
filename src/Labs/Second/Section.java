package Labs.Second;

public class Section {

    private String name;
    private int numEmployees;

    public Section(String name, int numEmployees) {
        this.name = name;
        this.numEmployees = numEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }
}
