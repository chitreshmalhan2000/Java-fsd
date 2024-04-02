package Practice_Project30;
import java.util.*;
public class Practice_Project30 {
	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
	        System.out.println("Given Array is: ");
	        for(int n:arr)
	        	System.out.print(n+" ");
	        System.out.println("");
	        int target;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter value of key to Search: ");
	        target=sc.nextInt();
	        int index = binarySearch(arr, target);
	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
		 public static int binarySearch(int[] arr, int target) {
		        int left = 0;
		        int right = arr.length - 1;
		        
		        while (left <= right) {
		            int mid = left + (right - left) / 2;
		            
		            if (arr[mid] == target) {
		                return mid;
		            } else if (arr[mid] < target) {
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		            }
		        }
		        
		        return -1;
		    }	    
	    
	}
