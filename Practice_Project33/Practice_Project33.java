package Practice_Project33;
import java.util.*;
public class Practice_Project33 {
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
	        bubbleSort(arr);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	  public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
}
