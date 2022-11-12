public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(StaticBlockEx.iVar1);
    }
}
class StaticBlockEx{
    static int iVar1;
    static{ // static block
        iVar1 = 34;
    }
    static{
        iVar1 = 90;
    }
}