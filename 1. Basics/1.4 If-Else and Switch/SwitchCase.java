import java.util.Scanner;
public class SwitchCase {
    private static int iVar1, iVar2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cContinue = 'y';
        while(cContinue == 'y' || cContinue == 'Y'){
            System.out.println("Enter your choice: ");
            System.out.println("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Quit");
            int iChoice = sc.nextInt();
            switch(iChoice) {
            case 1: input(sc);
                    System.out.println("Sum = "+ (iVar1 + iVar2));
                    break;
            case 2: input(sc);
                    System.out.println("Difference = "+ (iVar1 - iVar2));
                    break;
            case 3: input(sc);
                    System.out.println("Product = "+ (iVar1 * iVar2));
                    break;
            case 4: input(sc);
                    System.out.println("Quotient = "+ (iVar1 / iVar2));
                    System.out.println("Remainder = "+ (iVar1 % iVar2));
                    break;
            case 5: System.out.println("Thank you!");
                    System.exit(0); // Used to quit the program
                    break;
            default:
                    System.out.println("Error!");
                    System.exit(0);
            }
            System.out.println("Do you want to continue?");
            System.out.println("Press y or Y to continue");
            System.out.println("Press n or N to quit");
            cContinue = sc.next().charAt(0);
            if(cContinue == 'n' || cContinue == 'N') {
                System.out.println("Thank you!");
                System.exit(0); // Used to quit the program
            }
        }
        
    }
    private static void input(Scanner sc) {
        System.out.print("Enter no. 1: ");
        iVar1 = sc.nextInt();
        System.out.print("Enter no. 2: ");
        iVar2 = sc.nextInt();
    }
}
