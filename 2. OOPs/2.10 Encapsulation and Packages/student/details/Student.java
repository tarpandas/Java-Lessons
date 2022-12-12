package student.details;
public class Student {
    public static void main(String[] args) {
        StudentBean student1 = new StudentBean();

        student1.setFName("Vishal");
        student1.setLName("Sharma");
        student1.setPhoneNumber("9876543210");

        System.out.println(student1.getFName());
        System.out.println(student1.getLName());
        System.out.println(student1.getPhoneNumber());
    }
}
