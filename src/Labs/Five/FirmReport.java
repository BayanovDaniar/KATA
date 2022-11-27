package Labs.Five;

import java.io.*;

public class FirmReport {
    private Firm firm;

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public FirmReport(Firm firm) {
        this.firm = firm;
    }

    private String createReport(){
        StringBuilder report = new StringBuilder(firm.getName() + "\n\n");
        for(Department department : firm.getDepartmentList()){
            report.append("Отдел: ").append(department.getName());
            for(Employee employee : department.getEmployeeList()){
                report.append(employee.getName()).append(" | ").
                        append(employee.getPost()).append(" | ").append(employee.calcSalary()).append("\n");
            }
            report.append("--------------\n").append("Количество сотрудников :").
                    append(department.getNumbOfEmp()).append("\n\n");
        }
        return report.toString();
    }

    public void createAndSaveReport(String fileName) throws IOException {
        String report = createReport();
        FileOutputStream fileOutput = new FileOutputStream(fileName);
        fileOutput.write(report.getBytes());
        fileOutput.close();
        System.out.println("Success write report!");
    }

    public void createAndSaveReportWithWriter(String fileName) throws IOException {
        String report = createReport();
        try(Writer writer = new FileWriter(fileName)){
            writer.write(report);
        }
        System.out.println("Success write report");
    }

    public String loadReportWithReader(String fileName) throws IOException {
        StringBuilder report = new StringBuilder();
        try(Reader reader = new FileReader(fileName)){
            while(reader.ready()){
                    report.append((char) reader.read());
            }
        }
        return report.toString();
    }


    public String loadReport(String fileName){
        String report = null;
        try(FileInputStream fileInput = new FileInputStream(fileName)) {
            byte []bytesReport = new byte[fileInput.available()];
            fileInput.read(bytesReport);
            report = new String(bytesReport);

        }catch (IOException e){
            System.out.println("Exception was caught in Class" + this.getClass().getName());
        }
        return report;
    }
}
