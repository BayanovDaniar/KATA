package Labs.Sixth;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, String post, int salary) {
        super(name, post, salary);
    }

    public ContractEmployee() {
    }

    @Override
    public int calcSalary() {
        return super.calcSalary();
    }
}
