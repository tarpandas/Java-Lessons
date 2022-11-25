// Static binding (compile time binding)
/*
 * Binding of private, static and final methods always happen
 * at compile time since these methods cannot be overridden.
 */
class Parent {
    static public void walk() {
        System.out.println("The parent is walking");
    }
}
class StaticBinding extends Parent{
    static public void walk() {
        System.out.println("The child is walking");
    }
    public static void main(String[] args) {        
        Parent obj = new StaticBinding();
        obj.walk();
    }
}
