import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int iVar1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int iVar2 = sc.nextInt();

        if(iVar1 > iVar2) {
            System.out.println(iVar1 + " is greater than "+ iVar2);
        }else if (iVar1 < iVar2) {
            System.out.println(iVar2 + " is greater than "+ iVar1);
        }else if(iVar1 == iVar2) {
            System.out.println("Both the numbers are equal.");
        }else{
            System.out.println("Error!");
        }
        sc.close();
    }
}
