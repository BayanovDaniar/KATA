package Labs.Five;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, String post, int salary) {
        super(name, post, salary);
    }

    @Override
    public int calcSalary() {
        return super.calcSalary();
    }
}
