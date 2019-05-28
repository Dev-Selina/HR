package hr_application;

public class EmployeeRecord {

    int employeeId;
    String title;
    String forename;
    String surname;
    String address;
    String townCity;
    String county;
    String postcode;
    String contactNumber;
    String email;
    String position;
    String startDate;
    String dateOfBirth;
    String passwords;

    public EmployeeRecord(int employeeId, String title, String forename, String surname, String address, String townCity, String county, String postcode, String contactNumber, String email, String position, String startDate, String dateOfBirth, String passwords) {
        this.employeeId = employeeId;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.townCity = townCity;
        this.county = county;
        this.postcode = postcode;
        this.contactNumber = contactNumber;
        this.email = email;
        this.position = position;
        this.startDate = startDate;
        this.dateOfBirth = dateOfBirth;
        this.passwords = passwords;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTownCity() {
        return townCity;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
}
