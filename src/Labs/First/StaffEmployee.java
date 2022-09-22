package Labs.First;

import java.util.Arrays;

public class StaffEmployee extends Employees {
    private double bonus;

    public StaffEmployee(String name, String post, double salary, double bonus) throws OkladException {
        super(name, post, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcSalary() {
        double salary = 0;
        try {
            if (bonus < 0) {
                throw new PremiyaException();
            }
            salary = getSalary() + bonus;
        } catch (PremiyaException e) {
            System.out.println("Exception in calcSalary for StaffEmployee :" + e);
        } catch (Exception e) {
            System.out.println("Exception in calcSalary for StaffEmployee :" + e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return salary;
    }

    static class PremiyaException extends Exception {
    }

}
