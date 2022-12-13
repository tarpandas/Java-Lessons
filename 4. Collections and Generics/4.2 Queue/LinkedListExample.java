import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        // add() and offer()
        obj.add(12); // throws exception if element cannot be inserted
        obj.add(23);
        obj.offer(24);  // returns null if element cannot be inserted
        obj.offer(78);

        for(int i=0;i<obj.size();i++) {
            System.out.println(obj.get(i));
        }

        // element() and peek()
        System.out.println(obj.peek()); // if ll is empty, returns null
        System.out.println(obj.element()); // if ll is empty, throws exception

        // remove() and poll()
        System.out.println(obj.poll()); // returns null when ll is empty
        System.out.println(obj.remove()); // throws exception when ll is empty
    }
}
