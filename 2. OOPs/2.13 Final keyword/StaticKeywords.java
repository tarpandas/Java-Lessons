public final class StaticKeywords extends DummyClass{ // a final class cannot be extended
    final double SPEED_OF_LIGHT;
    static final double PI;
    static { // Instatializing a static constant via static block only
        PI = 3.141592;
    }
    StaticKeywords() { // Instatializing a non-static constant via constructor only
        SPEED_OF_LIGHT = 299792458;
    }
    public static void main(String[] args) {
        DummyClass obj = new DummyClass();
        obj.display();
    }
}
class DummyClass {
    final void display(){ // A final method cannot be overriden
        System.out.println("This is a final method.");
    }
}
