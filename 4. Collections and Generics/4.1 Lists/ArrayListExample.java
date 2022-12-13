/*
 * Methods of List
 * The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.
 * Some of the commonly used methods of the Collection interface that's also available in the List interface are:
 * add() - adds an element to a list
 * addAll() - adds all elements of one list to another
 * get() - helps to randomly access elements from lists
 * iterator() - returns iterator object that can be used to sequentially access elements of lists
 * set() - changes elements of lists
 * remove() - removes an element from the list
 * removeAll() - removes all the elements from the list
 * clear() - removes all the elements from the list (more efficient than removeAll())
 * size() - returns the length of lists
 * toArray() - converts a list into an array
 * contains() - returns true if a list contains specified element
 * isEmpty() - Checks if the arraylist is empty.
 * indexOf() - Searches a specified element in an arraylist and returns the index of the element.
 */

import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(2);
        obj1.add(67);
        obj1.add(324);

        for(int i: obj1) {
            System.out.print(i+" ");
        }

        System.out.println("\n"+ obj1.size());

        ArrayList<Integer> obj2 = new ArrayList<Integer>();
        obj2.add(6);
        obj2.add(34);
        obj2.add(78);

        // addAll()
        obj1.addAll(obj2);
        for(int i: obj1) {
            System.out.print(i+" ");
        }

        // get()
        for(int i=0;i<obj1.size();i++) {
            System.out.println(obj1.get(i));
        }

        // sort()
        Collections.sort(obj1);
        for(int i=0;i<obj1.size();i++) {
            System.out.print(obj1.get(i)+" ");
        }

        // reverse()
        Collections.reverse(obj1);
        for(int i=0;i<obj1.size();i++) {
            System.out.print("\n"+obj1.get(i)+" ");
        }

        // contains()
        System.out.println("\n"+ obj1.contains(45));

        // removeAll()
        obj1.removeAll(obj2);
        for(int i=0;i<obj1.size();i++) {
            System.out.print(obj1.get(i)+" ");
        }
    }
}