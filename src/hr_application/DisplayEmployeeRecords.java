package hr_application;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayEmployeeRecords {

    EmployeeDatabase heroes = new EmployeeDatabase();

    public static void main(String[] args) {
        DisplayEmployeeRecords der = new DisplayEmployeeRecords();
        der.addEmployeeRecords(); //adding arraylist "db"
        EmployeeRecord currentUser = der.loginCheck(); //I want to give a result hence "EmployeeRecord"/Class "currentUser"/new name of loginCheck()
        der.checkRecords(currentUser); //The above makes the currentUser (ID card) data, that instance of employeeRecord available to be receieved. so check records can receive it.
        //checkRecords needs currentUser because I want to know (card ID) ONLY allow HR to check.
    }

    private void addEmployeeRecords() {

        heroes.addEmployeeRecord(new EmployeeRecord(1, "Mr", "James", "Crook", "36 Apple Lane", "Newport", "Caerphilly", "CR2 0PL", "07345334523", "Supreme@DCuniverse.com", "HR Manager", "06 March 2010", "17/02/97", "monk000"));
        heroes.addEmployeeRecord(new EmployeeRecord(2, "Miss", "Selina", "Chan", "7 Balem Hill", "Bradley Stoke", "Avon", "BS3 5AR", "07345345523", "Captainmarvel@DCuniverse.com", "Software Developer", "12 March 2012", "08/12/90", "monk001"));
        heroes.addEmployeeRecord(new EmployeeRecord(3, "Mrs", "Ingrid Van de", "Berg", "201 Creeper Close", "Ipswich", "Suffolk", "IP12 2LE", "07384246572", "wonderwoman@DCuniverse.com", "Office Junior", "02 December 2016", "21/04/92", "monk002"));
        heroes.addEmployeeRecord(new EmployeeRecord(4, "Ms", "Abby", "Boyd", "10 Pilot Crescent", "Bury St. Edmunds", "Suffolk", "G10 8UI", "07146267842", "Supergirl@DCuniverse.com", "HR", "20 August 2001", "01/06/94", "monk003"));
        heroes.addEmployeeRecord(new EmployeeRecord(5, "Mr", "Connor", "Stubbs", "169 Station Road", "Saltdean", "East Sussex", "LD1 5XD", "07382346500", "wonderwoman@DCuniverse.com", "Front-end Developer", "11 July 2017", "15/10/99", "monk004"));
    }

    private void checkRecords(EmployeeRecord currentUser) {
//        Relocated to login
//        Scanner fromScanner = new Scanner(System.in);
//        System.out.println("If you want to display this record, prove you are HR\nEmployee ID: ");
//        String empID = fromScanner.nextLine();
//        String password = fromScanner.nextLine();
        Scanner fromScanner = new Scanner(System.in);
        ArrayList<EmployeeRecord> employeeRecords = heroes.getEmployeeRecords(currentUser);
        if (employeeRecords != null) {//modify condition for HR
//            for (EmployeeRecord i : heroes.getEmployeeRecords(currentUser)) {
            System.out.println("Welcome HR, please choice from the options below\n1. View Employee Database\n2. Add New Employee\n");
            int choice = fromScanner.nextInt();
            switch (choice) {
                case 1:
                    for (EmployeeRecord i : heroes.getEmployeeRecords(currentUser)) { //separate into it's own method??
                        System.out.println("Employee ID: " + i.employeeId + " Employee Name: " + i.title + " " + i.forename + " " + i.surname);
                        }
                    break;
                case 2:
                    System.out.println("Function to add Employee goes here");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } else {
            System.out.println("\nWelcome Employee\n");
            System.out.println("Employee ID: " + currentUser.employeeId);
            System.out.println("Employee Name: " + currentUser.title + " " + currentUser.forename + " " + currentUser.surname);
            System.out.println("Employee Address:\n" + currentUser.address + "\n" + currentUser.townCity + "\n" + currentUser.county + "\n" + currentUser.postcode);
        }
    }

    private void searchSurname() {
        Scanner fromScanner = new Scanner(System.in);

//        ArrayList<EmployeeRecord> employeeRecords = heroes.getEmployeeRecords(password);
//        System.out.println("Please enter password:");
//        String password = fromScanner.nextLine();
//
//        System.out.println("Please enter the surname you want to search: ");
//        String lastName = fromScanner.nextLine();
//        for(int i = 0; i < employeeRecords.length; i++){
//          use comparator to search?
//        }
    }

    public EmployeeRecord loginCheck() { //this function receives user & password, store
        Scanner fromScanner = new Scanner(System.in);

        System.out.println("Please enter Employee\nID: ");//these two lines employeeID
        String employeeID = fromScanner.nextLine();
        System.out.println("Password: "); //
        String password = fromScanner.nextLine();
        EmployeeRecord employeeLogin = heroes.login(Integer.parseInt(employeeID), password); //requires employeeID to be converted from string to integer
        System.out.println(employeeLogin.surname);
        return employeeLogin;
    }

    private void addNewUser(EmployeeRecord currentUser) {
        Scanner fromScanner = new Scanner(System.in);

        if (currentUser.position.contains("HR")) {
            // return employeeRecords;
            System.out.println("Please enter new Employee ID:");
            String employeeID = fromScanner.nextLine();


            //get all info from scanner for EmployeeRecord check notebook
        }
    }

}
