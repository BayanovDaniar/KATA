package Labs.First;

import java.util.Arrays;

public class ContractEmployee extends Employees {

    public ContractEmployee(String name, String post, double salary) throws OkladException {
        super(name, post, salary);
    }

    @Override
    public double calcSalary() {
        double salary = 0;
        try {
            salary = getSalary() ;
        }catch (Exception e){
            System.out.println("Exception in calcSalary for ContractEmployee :" + e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return salary ;
    }
}
