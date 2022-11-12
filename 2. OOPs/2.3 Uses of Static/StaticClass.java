public class StaticClass {
    static int iVar1 = 342;

    class NestedNormalClass{ // Normal Nested Class
        public void display(){
            System.out.println("This is a normal nested class.");
        }
    }
    static class NestedStaticClass{ // Static Nested Class
        public void display(){
            System.out.println(iVar1);
        }
    }
    public static void main(String[] args) {
        StaticClass.NestedStaticClass obj1 = new StaticClass.NestedStaticClass();
        obj1.display();

        StaticClass obj2 = new StaticClass();
        StaticClass.NestedNormalClass obj3 = obj2.new NestedNormalClass();
        obj3.display();
    }
}
