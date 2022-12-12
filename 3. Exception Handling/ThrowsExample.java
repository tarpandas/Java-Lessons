import java.io.IOException;
import java.util.Scanner;
// Throws keyword is used for handling checked exceptions. 
public class ThrowsExample {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        sc.close();
        if(iNum2 == 0) {
            throw new IOException("The divisor cannot be zero.");
        }

        int result = iNum1 / iNum2;
        System.out.println(result);
    }
}
