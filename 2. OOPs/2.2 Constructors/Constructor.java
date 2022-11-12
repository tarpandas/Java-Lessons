public class Constructor {
    public static void main(String[] args) {
        Class1 obj1 = new Class1(); // Default Constructor
        obj1.iVar1 = 90;
        System.out.println(obj1.iVar1);

        Class2 obj2 = new Class2(); // No argument Constructor
        System.out.println(obj2.iVar2);

        Class2 obj3 = new Class2(112,115); // Parametrized Constructor
        System.out.println(obj3.iVar2+" "+obj3.iVar3+" "+obj3.iVar4);

    }
}

class Class1 {
    int iVar1;
}

class Class2 {
    int iVar2, iVar3, iVar4;
    Class2(){
        iVar2 = 45;
    }
    Class2(int a, int b){
        iVar3 = a;
        iVar4 = b;
    }
}