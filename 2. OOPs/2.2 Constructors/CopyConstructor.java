class RandomClass{
    int iVar1, iVar2;
    RandomClass(int a, int b){
        iVar1 = a;
        iVar2 = b;
    }
    RandomClass(RandomClass obj){
        iVar1 = obj.iVar1;
        iVar2 = obj.iVar2;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        RandomClass obj1 = new RandomClass(113,114);
        RandomClass obj2 = new RandomClass(obj1);

        System.out.println(obj2.iVar1+" "+obj2.iVar2);
    }
}
