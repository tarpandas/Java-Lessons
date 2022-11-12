class A {
    void methodA() {
        System.out.println("This is class A.");
    }
}
class B extends A{
    void methodB() {
        System.out.println("This is class B.");
    }
}
class C extends B{
    void methodC() {
        System.out.println("This is class C.");
    }
}
public class MultiLevelInheritence {
    public static void main(String[] args) {
        C obj1 = new C();

        obj1.methodA();
        obj1.methodB();
        obj1.methodC();

        // instanceof operator - used to check whether an object is an instance of some class.

        B o1 = new B();
        A o2 = new A();

        System.out.println();

        System.out.println(obj1 instanceof A);
        System.out.println(obj1 instanceof B);
        System.out.println(obj1 instanceof C);
        System.out.println();

        System.out.println(o1 instanceof A);
        System.out.println(o1 instanceof B);
        System.out.println(o1 instanceof C);
        System.out.println();
        
        System.out.println(o2 instanceof A);
        System.out.println(o2 instanceof B);
        System.out.println(o2 instanceof C);
    }
}
