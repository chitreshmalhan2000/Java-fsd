package Practice_Project31;
import java.util.*;
public class Practice_Project31 {
	 public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        System.out.println("Given Array is: ");
	        for(int n:arr)
	        	System.out.print(n+" ");
	        System.out.println("");
	        int target;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter value of key to Search: ");
	        target=sc.nextInt();
	        int index = exponentialSearch(arr, target);
	        if (index != -1)
	            System.out.println("Element found at index: " + index);
	        else
	            System.out.println("Element not found");
	    }
	 
	 public static int exponentialSearch(int[] arr, int target) {
	        if (arr[0] == target)
	            return 0;

	        int i = 1;
	        while (i < arr.length && arr[i] <= target)
	            i *= 2;

	        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
	    }

	    private static int binarySearch(int[] arr, int target, int left, int right) {
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target)
	                return mid;
	            else if (arr[mid] < target)
	                left = mid + 1;
	            else
	                right = mid - 1;
	        }

	        return -1;
	    }	 
}
