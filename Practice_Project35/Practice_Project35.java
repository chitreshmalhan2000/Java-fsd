package Practice_Project35;
import java.util.*;
public class Practice_Project35 {
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
		Practice_Project35 O=new Practice_Project35();
		O.Mergesort(arr, 0, s-1);
		System.out.println("Sorted Array: ");
		for(int i=0;i<s;i++)
			System.out.print(arr[i]+" ");
	}
	
	void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void Mergesort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            Mergesort(arr, l, m);
            Mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
