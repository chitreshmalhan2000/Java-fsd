package Practice_Project22;
import java.util.*;
public class Practice_Project22 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Given Array is: ");
        for(int a:array)
        	System.out.print(a+" ");
        int n = array.length;
        int L; // Example lower bound
        int R ;// Example upper bound
        System.out.println("");
        System.out.println("Enter the value of L: ");
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        System.out.println("Enter the value of R: ");
        R=sc.nextInt();
        int sum = findSumInRange(array, L, R, n);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
    }

    static int findSumInRange(int[] arr, int L, int R, int n) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            if (i >= 0 && i < n) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
