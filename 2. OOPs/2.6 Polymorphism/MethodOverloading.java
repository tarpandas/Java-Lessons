// Method Overloading / Static Binding / Compile-time binding
public class MethodOverloading {
    static void add(int iNum1, int iNum2) {
        System.out.println("Integer + Integer");
        System.out.println(iNum1 + iNum2);
    }

    static void add(float fNum1, float fNum2) {
        System.out.println("Float + Float");
        System.out.println(fNum1 + fNum2);
    }

    static void add(float fNum1, int iNum2) {
        System.out.println("Float + Integer");
        System.out.println(fNum1 + (float)iNum2);
    }

    static void add(int iNum1, int iNum2, int iNum3) {
        System.out.println("Integer + Integer + Integer");
        System.out.println(iNum1 + iNum2 + iNum3);
    }
    void disp(int iNum1, double dNum2){
        System.out.println("Type Promotion");
        System.out.println((double)iNum1 + dNum2);
    }
    static public void main(String[] args) {
        /**
         * Ways to overload a method
         * 1. Number of parameters.
         * 2. Data type of parameters.
         * 3. Sequence of Data type of parameters.
         */
        add(23,23);
        add(34.02f,23.76f);
        add(23.56f,23);
        add(1,2,3);

        // Type Promotion
        MethodOverloading obj = new MethodOverloading();
        obj.disp(234,23.43f);
    }
}
