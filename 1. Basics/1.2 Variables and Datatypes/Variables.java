public class Variables { // Class name is in Pascal case
    public static void main (String [] args) { // Camel casing e.g. thisIsAFunction()
        int iInteger = 34; // 4 bytes
        float fFloat = 45.5f; // 4 bytes - 6-7 decimal places
        double dDouble = 45.5; // 8 bytes - 15 decimal places
        String strString = "Hello";
        char cChar = 'x'; // 2 byte
        boolean bBool = true; // false

        byte iByte = 34; // 1 byte
        short iShort = 32444; // 2 bytes
        long iLong = 34242452; // 8 bytes

        VariableExample obj1 = new VariableExample();
        obj1.iInstanceVariable = 23;
        System.out.println(obj1.iInstanceVariable);
        System.out.println(VariableExample.iStaticVariable); // Not correct way of associating with static variables

        VariableExample obj2 = new VariableExample();
        System.out.println(obj2.iInstanceVariable);

        VariableExample.iStaticVariable = 100; // Declared later, however printed before for obj1
        System.out.println(obj1.iStaticVariable);
        System.out.println(obj2.iStaticVariable); // Not correct way of associating with static variables
    }
}
class VariableExample {
    static int iStaticVariable;
    int iInstanceVariable = 30;
}
