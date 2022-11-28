class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}
class Student {
    String name;
    String id;
    Address add;
    Student(String name, String id, Address add) {
        this.name = name;
        this.id = id;
        this.add = add;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Address objAddress = new Address("Chennai");
        Student objStudent = new Student("Vishal", "123180703115", objAddress);

        System.out.println(objStudent.name);
        System.out.println(objStudent.id);
        System.out.println(objStudent.add.city);
    }
}
