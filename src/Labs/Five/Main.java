package Labs.Five;

import Labs.Five.ContractEmployee;
import Labs.Five.StaffEmployee;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Firm firm = new Firm("ECorp");
        Department department = new Department("Finance");
        Department department1 = new Department("HR");
        firm.addDepartment(department);
        firm.addDepartment(department1);
        Employee employee = new ContractEmployee("Daniar", "Director", 12000);
        Employee employee1 = new ContractEmployee("Mikhail", "TechDirector", 8000);
        Employee employee2 = new StaffEmployee("Howard", "Accountant", 3000, 1000);
        department.addEmployee(employee);
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        Employee employee3 = new StaffEmployee("Vladimir", "Accountant", 5000, 900);
        Employee employee4 = new StaffEmployee("Egor", "Trader", 4000, 1000);
        Employee employee5 = new ContractEmployee("Nikola", "Manager", 6000);
        department1.addEmployee(employee3);
        department1.addEmployee(employee4);
        department1.addEmployee(employee5);
        Employee employee6 = new ContractEmployee("John", "Assistant", 3000);
        department1.addEmployee(employee6);

        saveFirm("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Five\\ReportFirm.bin",firm);
        Firm firm1 = getFirm("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Five\\ReportFirm.bin");
        System.out.println(firm1);

    }

    public static Firm getFirm(String fileName) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            return (Firm) objectInputStream.readObject();
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveFirm(String fileName, Firm saveFirm){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOutputStream.writeObject(saveFirm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
