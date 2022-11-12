class ParentClass{
    int iVar1, iVar2;
    ParentClass(int a, int b){
        iVar1 = a;
        iVar2 = b;
    }
}
class ChildClass extends ParentClass{
    int iVar3;
    ChildClass(int a, int b, int c){
        super(a,b);
        iVar3 = c;
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass(1,2,3);
        System.out.println(obj1.iVar1+" "+ obj1.iVar2+" "+obj1.iVar3);
    }
}
