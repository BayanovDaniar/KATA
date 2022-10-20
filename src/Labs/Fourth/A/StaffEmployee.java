package Labs.Fourth.A;

public class StaffEmployee extends Employee{
    private int bonus;

    public StaffEmployee(String name, String post, int salary, int bonus) {
        super(name, post, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calcSalary() {
        return getSalary() + bonus;
    }
}
