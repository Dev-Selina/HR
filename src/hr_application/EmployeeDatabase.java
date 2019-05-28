package hr_application;

import java.util.ArrayList;

public class EmployeeDatabase {

    private ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>();

    public void addEmployeeRecord(EmployeeRecord i) {
        this.employeeRecords.add(i);

    }
    public ArrayList<EmployeeRecord> getEmployeeRecords(EmployeeRecord currentUser){
     if(currentUser.position.contains("HR")){
         return employeeRecords;
     }
     return null;
    }
    public EmployeeRecord login(int employeeID, String password){
        System.out.println("Matching employee details..");
        for (EmployeeRecord employee : employeeRecords) {
            if(employeeID == employee.employeeId){
                if(password.equals(employee.passwords)){
                    System.out.println("Bingo!");
                    return employee;
                }
            }
        }
        return null;
    }
}
