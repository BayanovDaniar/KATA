package Labs.First;

import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Firm firm = new Firm("AIRGroup");
        Section section = new Section("Finance", 12);

//        try{
//            StaffEmployee staffEmployee = new StaffEmployee("Abramov", "Manager", 62000, 14000);
//            System.out.println("Success create new staffEmployee: " + staffEmployee.getName());
//            ContractEmployee contractEmployee = new ContractEmployee("Kolugin", "Mentor", 13400);
//            System.out.println("Success create new ContractEmployee: " + contractEmployee.getName());
//            staffEmployee.setBonus(-12000);
//            System.out.println(staffEmployee.calcSalary());
//        }catch (Employees.OkladException e){
//            System.out.println("Exception : " + e);
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }

//
//        try {
//            StaffEmployee staffEmployee1 = new StaffEmployee("Joker", "Enemy", -12000, 1000);
//            System.out.println("Success create new ContractEmployee: " + staffEmployee1.getName());
//
//        }catch (Employees.OkladException e){
//            System.out.println("Exception : " + e);
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }

        try{
                        StaffEmployee staffEmployee1 = new StaffEmployee("Joker", "Enemy", 12000, -1000);
            System.out.println(staffEmployee1.calcSalary());
        } catch (Employees.OkladException e) {
            e.printStackTrace();
        }


    }
}
