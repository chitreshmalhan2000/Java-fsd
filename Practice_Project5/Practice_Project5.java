package Practice_Project5;
import java.util.*;
public class Practice_Project5{
    public static void main(String[] args) {
    	//Iterable -> Collections.
    	//Colections = List + Sets + Queues.
    	//list = ArrayList + LinkedList + Vector.
    	//Sets = SortedSet->(TreeSet) + HashSet->(LinkedHashSet).
    	//Queue = Priority Queue + Dequeue.
 List<Integer> numbers = new ArrayList<>();
      // List<Integer> numbers = new LinkedList<>();
      //List<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        numbers.remove(1); // Removes the element at index 1
        
        System.out.println("\nArrayList after removing an element:");
        for (int num : numbers) {
            System.out.println(num);
        }

        boolean containsElement = numbers.contains(20); // Checking if the ArrayList contains a specific element
        System.out.println("\nArrayList contains 20? " + containsElement);

        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        numbers.clear();// Clearing all elements from the ArrayList

        boolean isEmpty = numbers.isEmpty();
        System.out.println("\nIs ArrayList empty? " + isEmpty);
        System.out.println("");
        
        System.out.println("Example of sets:");
       // Set<Integer> numberSet = new HashSet<>();//no order.
       // Set<Integer> numberSet = new LinkedHashSet<>();//insertion order is maintained.
        Set<Integer> numberSet = new TreeSet<>();//in sorted order.
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        System.out.println("Number Set: " + numberSet);
        int numToCheck = 10;
        if (numberSet.contains(numToCheck)) {
            System.out.println(numToCheck + " exists in the set.");
        } else {
            System.out.println(numToCheck + " does not exist in the set.");
        }
        int numToRemove = 15;
        if (numberSet.remove(numToRemove)) {
            System.out.println(numToRemove + " removed from the set.");
        } else {
            System.out.println(numToRemove + " does not exist in the set.");
        }
        System.out.println("Updated Number Set: " + numberSet);      
        
    }
}
