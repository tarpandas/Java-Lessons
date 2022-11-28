// All the methods of an interface are public abstract by default.
class C {
    void runRun() {
        System.out.println("Running...");
    }
}
interface A {
    void fun(); // public abstract void fun(); by default
}
interface B {
    void fun();
}
public class Interfaces extends C implements A, B{ // first extend, then implement
    public void fun() {
        System.out.println("This is Fun!");
    }
    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.fun();
        obj.runRun();
    }
}
