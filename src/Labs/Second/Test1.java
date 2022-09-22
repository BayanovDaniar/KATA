package Labs.Second;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) throws Employees.OkladException, IOException {
        Firm firm = new Firm(enterString());
        Section section = new Section(enterString(), enterInteger());
        ContractEmployee contractEmployee = new ContractEmployee(enterString(), enterString(), enterInteger());
        StaffEmployee staffEmployee = new StaffEmployee(enterString(), enterString(), enterInteger(), enterInteger());
        System.out.println(firm.getName() + " " + section.getName() + " " + section.getNumEmployees());
        System.out.println(contractEmployee.getName() + " " + contractEmployee.getPost() + " " + contractEmployee.getSalary());
        System.out.println(staffEmployee.getName() + " " + staffEmployee.getPost() + " " + staffEmployee.getSalary());


        Scanner scn = new Scanner(System.in);
        Firm firm1 = new Firm(scn.next());
        Section section1 = new Section(scn.next(), scn.nextInt());
        ContractEmployee contractEmployee1 = new ContractEmployee(scn.next(),scn.next(),scn.nextInt());
        StaffEmployee staffEmployee1 = new StaffEmployee(scn.next(),scn.next(),scn.nextInt(),scn.nextInt());
        System.out.println(firm.getName() + " " + section.getName() + " " + section.getNumEmployees());
        System.out.println(contractEmployee.getName() + " " + contractEmployee.getPost() + " " + contractEmployee.getSalary());
        System.out.println(staffEmployee.getName() + " " + staffEmployee.getPost() + " " + staffEmployee.getSalary());



    }

    static String enterString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    static int enterInteger() throws IOException {

        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

}
