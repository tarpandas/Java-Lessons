class A {
    public void methodAll(){
        System.out.println("Parent Method.");
    }
}
class B extends A {
    @Override
    public void methodAll(){
        System.out.println("Child Method.");
    }
    void printMessage(){
        methodAll();
        super.methodAll();
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.printMessage();
    }
}
