package Practice_Project32;
import java.util.*;
public class Practice_Project32 {
	 public static void main(String[] args) {
	        int[] arr;
			int s;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Size of an array: ");
			s=sc.nextInt();
			arr= new int[s];
			System.out.println("Enter values of elements:");
			for(int i=0;i<s;i++)
				arr[i]=sc.nextInt();
	        selectionSort(arr);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	 }
	        public static void selectionSort(int[] arr) {
	            int n = arr.length;

	            // One by one move boundary of unsorted subarray
	            for (int i = 0; i < n - 1; i++) {
	                // Find the minimum element in unsorted array
	                int minIndex = i;
	                for (int j = i + 1; j < n; j++) {
	                    if (arr[j] < arr[minIndex]) {
	                        minIndex = j;
	                    }
	                }

	                // Swap the found minimum element with the first element
	                int temp = arr[minIndex];
	                arr[minIndex] = arr[i];
	                arr[i] = temp;
	            }
	        }
	 }
