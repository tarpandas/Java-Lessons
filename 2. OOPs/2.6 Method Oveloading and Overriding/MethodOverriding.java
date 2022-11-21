// Method Overriding / Run-time polymorphism / Dynamic binding
// Declaring a method in sub class which is already present in parent class is known as method overriding.

class ParentExampleOverriding {
    void parentMethod(){
        System.out.println("Parent Method!");
    }
}

public class MethodOverriding extends ParentExampleOverriding {
    @Override
    void parentMethod() {
        System.out.println("Child Method!");
    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.parentMethod();
    }
}

// Rules of Method Overriding:
// https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/
