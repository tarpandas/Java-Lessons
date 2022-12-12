import java.util.Scanner;
public class ThrowExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        sc.close();
        if(iNum1 < 2 && iNum2 < 3) {
            throw new ArithmeticException("Numbers too low!");
        }

        System.out.println(iNum1/iNum2);
    }
}
