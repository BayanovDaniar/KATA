package Labs.Sixth;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Firm firm = new Firm("ECorp");
        Department department = new Department("Finance");
        Department department1 = new Department("HR");
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        departmentList.add(department1);
        firm.setDepartmentList(departmentList);
        Employee employee = new ContractEmployee("Daniar", "Director", 12000);
        Employee employee1 = new ContractEmployee("Mikhail", "TechDirector", 8000);
        Employee employee2 = new StaffEmployee("Howard", "Accountant", 3000, 1000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        department.setEmployeeList(employeeList);
        Employee employee3 = new StaffEmployee("Vladimir", "Accountant", 5000, 900);
        Employee employee4 = new StaffEmployee("Egor", "Trader", 4000, 1000);
        Employee employee5 = new ContractEmployee("Nikola", "Manager", 6000);
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(employee3);
        employeeList1.add(employee4);
        employeeList1.add(employee5);
        department1.setEmployeeList(employeeList1);
        Employee employee6 = new ContractEmployee("John", "Assistant", 3000);


        saveFirm("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Sixth\\ReportFirm.xml",firm);
        Firm firm1 = getFirm("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Sixth\\ReportFirm.xml");
        System.out.println(firm1);
        System.out.println(firm1.getDepartmentList());

    }

    public static Firm getFirm(String fileName) {
        try(XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(fileName))){
            return (Firm) xmlDecoder.readObject();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void saveFirm(String fileName, Firm saveFirm){
        try(XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(fileName))){
            xmlEncoder.writeObject(saveFirm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
