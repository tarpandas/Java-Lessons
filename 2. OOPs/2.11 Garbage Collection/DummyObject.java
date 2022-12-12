public class DummyObject {
    public static void main(String[] args) {
        DummyObject obj1 = new DummyObject();
        obj1 = null;

        DummyObject obj2 = new DummyObject();
        DummyObject obj3 = new DummyObject();
        obj2 = obj3;

        System.gc();
        
    }
    protected void finalize() throws Throwable{
            System.out.println("Cleaned!");
    }
}
