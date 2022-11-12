public class BreakAndContinue {
    public static void main(String[] args) {
        int iVar = 20;
        for(int i=0; i<iVar; i+=2){
            if(i == 12){
                break; // Writes till 10, loop breaks at 12.
            }
            System.out.print(i+"...");
        }
        System.out.println();
        for(int i=0; i<iVar; i+=2){
            if(i == 12){
                continue; // Skips 12.
            }
            System.out.print(i+"...");
        }
    }
}
