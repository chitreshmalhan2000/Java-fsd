package Practice_Project20;
import java.util.*;
public class Practice_Project20 {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int steps = 5; 
	        System.out.println("Given Array is:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println("");
	        rightRotate(array, steps);
            System.out.println("Array after Right Rotation by 5 times:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    static void rightRotate(int[] arr, int steps) {
	        int n = arr.length;
	        steps = steps % n; // To handle cases where steps > n
	        reverseArray(arr, 0, n - 1);
	        reverseArray(arr, 0, steps - 1);
	        reverseArray(arr, steps, n - 1);
	    }

	    static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}
