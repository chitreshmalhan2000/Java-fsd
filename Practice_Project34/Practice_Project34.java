package Practice_Project34;
import java.util.*;
public class Practice_Project34 {
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
	        insertionSort(arr);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	 
	  public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
}
