package Practice_Project21;
import java.util.*;
public class Practice_Project21 {
	 public static void main(String[] args) {
	        ArrayList<Integer> unsortedList = new ArrayList<>();
	        unsortedList.add(9);
	        unsortedList.add(3);
	        unsortedList.add(6);
	        unsortedList.add(1);
	        unsortedList.add(7);
	        unsortedList.add(2);
	        unsortedList.add(8);
	        unsortedList.add(5);
	        unsortedList.add(4);
	        System.out.println("Given Arraylist is:"+unsortedList);

	        int fourthSmallest = findFourthSmallest(unsortedList);
	        System.out.println("Fourth smallest element: " + fourthSmallest);
	    }

	    static int findFourthSmallest(ArrayList<Integer> list) {
	        Collections.sort(list); // Sort the ArrayList
	        return list.get(3); // Fourth smallest element will be at index 3
	    }
	}
