public class TypeCasting {
    public static void main(String[] args) {
        int iVar1 = 34;
        byte bVar1 = (byte)iVar1; // Explicit Typecasting
        long lVar1 = iVar1; // Implicit Typecasting
        System.out.println(bVar1);
        System.out.println(lVar1);
    }
}
