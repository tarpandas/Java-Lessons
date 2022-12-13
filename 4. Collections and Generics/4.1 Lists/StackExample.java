import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<Integer>();
        // push()
        obj.push(32);
        obj.push(34);
        obj.push(23);
        obj.push(89);

        for(int i: obj) {
            System.out.print(i+" ");
        }
        System.out.println();

        // pop()
        obj.pop();
        for(int i: obj) {
            System.out.print(i+" ");
        }

        // peek()
        System.out.println("\n"+obj.peek());

        // search()
        System.out.println(obj.search(3)); // Return -1 when element not found

        // empty()
        System.out.println(obj.empty());
    }
}
