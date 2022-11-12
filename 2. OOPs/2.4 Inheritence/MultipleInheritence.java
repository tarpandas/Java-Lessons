/**
 * An interface in Java is a blueprint of a class.
 * It has static constants and abstract methods.
 * The interface in Java is a mechanism to achieve abstraction.
 */
interface A {
    public void talk();
}
interface B {
    public void talk();
}
class C implements A, B {
    public void talk() {
        System.out.println("Let me talk!");
    }
}
public class MultipleInheritence {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.talk();
    }
}
