// Dynamic Binding (Run time binding)
// Method Overriding is an example of Dynamic Binding
class ParentDB {
    public void walk() {
        System.out.println("The parent is walking");
    }
}
class DynamicBinding extends ParentDB{
    public void walk() {
        System.out.println("The child is walking");
    }
    public static void main(String[] args) {        
        ParentDB obj = new DynamicBinding();
        obj.walk();
    }
}
