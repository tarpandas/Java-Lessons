/**
 * There are four types of access specifiers in java:
 * public: Accessible to all. Other objects can also access this member variable or function.
 * private: Not accessible by other objects. Private members can be accessed only by the methods in the same class.
 *  Object accessible only in class in which they are declared.
 * protected: The scope of a protected variable is within the class which declares it
 *  and in the class which inherits from the class (Scope is class and subclass).
 * Default: Scope is Package Level. We do not need to explicitly mention default
 *  as when we do not mention any access specifier it is considered as default.
 */

package testpackage.accessspecifier;
import testpackage.protectedpackage.ProtectedClass;
public class AccessSpecifier extends ProtectedClass{
    static int iDefaultNum = 34;
    public static void main(String[] args) {
        PublicClass obj1 = new PublicClass();
        System.out.println(obj1.iPublicNum);

        System.out.println(iDefaultNum);

        AccessSpecifier obj2 = new AccessSpecifier();
        System.out.println(obj2.iProtectedNum);

        PrivateClass obj3 = new PrivateClass();
        obj3.setter(3);
        System.out.println(obj3.getter());
        
    }
}


class PrivateClass {
    private int iPrivateNum = 234;

    void setter(int a){
        this.iPrivateNum = a;
    }

    int getter(){
        return iPrivateNum;
    }
}

/*
------------+-------+---------+--------------+--------------+--------
            | Class | Package | Subclass     | Subclass     |Outside|
            |       |         |(same package)|(diff package)|Class  |
————————————+———————+—————————+——————————----+—————————----—+————————
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
————————————+———————+—————————+—————————----—+—————————----—+————————
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
————————————+———————+—————————+————————----——+————————----——+————————
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
————————————+———————+—————————+————————----——+————————----——+————————
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+--------------+--------
 */