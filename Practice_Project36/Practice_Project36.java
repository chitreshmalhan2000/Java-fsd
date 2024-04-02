package Practice_Project36;
import java.util.*;
public class Practice_Project36 {
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
		Practice_Project36 O=new Practice_Project36();
		O.QuickSort(arr, 0, s-1);
		System.out.println("Sorted Array: ");
		for(int i=0;i<s;i++)
			System.out.print(arr[i]+" ");
	}
	
	public int partition(int arr[],int lb,int ub)
	{
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		while(start<end)
		{
			start=start+1;
			while(start<=ub&&arr[start]<pivot)
				start++;
			while(end>=lb&&arr[end]>pivot)
				end--;
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	
   public void QuickSort(int arr[],int lb,int ub)
   {
	   int loc;
	   if(lb<ub)
	   {
		   loc =partition(arr,lb,ub);
		   QuickSort(arr,lb,loc-1);
		   QuickSort(arr,loc+1,ub);
	   }
   }
	
	
}
