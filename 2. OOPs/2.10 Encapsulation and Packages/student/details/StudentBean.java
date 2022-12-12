package student.details;
public class StudentBean{
    private String fname;
    private String lname;
    private String phoneNumber;

    // getter and setter
    void setFName(String fname) {
        this.fname = fname;
    }
    void setLName(String lname) {
        this.lname = lname;
    }
    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getFName() {
        return fname;
    }
    String getLName() {
        return lname;
    }
    String getPhoneNumber() {
        return phoneNumber;
    }
}
