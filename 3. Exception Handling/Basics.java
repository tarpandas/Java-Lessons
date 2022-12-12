import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int iNum1 = sc.nextInt();
            int iNum2 = sc.nextInt();

            int result = iNum1 / iNum2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division By Zero!");
        } catch (Exception e) {
            System.out.println(e);
        }  finally {
            System.out.println("Scanner closed.");
            sc.close();
        }
    }
}
