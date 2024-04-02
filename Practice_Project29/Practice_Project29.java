package Practice_Project29;
import java.util.*;
public class Practice_Project29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int s;
		int key;
		System.out.println("Enter Size of an array: ");
		s=sc.nextInt();
		arr= new int[s];
		System.out.println("Enter values of elements:");
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value of key for Search: ");
		key=sc.nextInt();
		Practice_Project29 O=new Practice_Project29();
		O.LinearSearch(arr, s, key);	
	}
	public void LinearSearch(int a[],int n,int k)
	{
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			{
				System.out.println("Element is present at index "+i);
				return;
			}
			
		}
		System.out.println("Element is not present");
	}


}

