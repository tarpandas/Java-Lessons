/**
 * Although all three are related terms, there are some major differences in the way they relate two classes.
 * Association is a relationship between two separate classes and the association can be of any type say one to one, one to may etc.
 * It joins two entirely separate entities.
 */


// Manager (is a) type of Employee(Employee is parent of manager) -> Inheritance means transfer parent to child
// Manager (has a ) swipe card to enter company premises -> Association means both are independent objects

class SwipeCard {
    long iCardNo;
    
    SwipeCard(long iCardNo) {
        this.iCardNo = iCardNo;
    }
}

class Manager extends SwipeCard{
    String strString;
    Manager(String strName, long iCardNo) {
        super(iCardNo);
        this.strString = strName;
    }
}

public class Association {
    public static void main(String[] args) {
        SwipeCard swipe = new SwipeCard(180703114);
        Manager manager = new  Manager("Tarpan Das", 180703112);
    }
}
