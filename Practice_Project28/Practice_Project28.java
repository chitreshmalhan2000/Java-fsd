package Practice_Project28;
import java.util.*;
public class Practice_Project28 {
	public static void main(String[] args) {
		Queue q=new Queue(4);
		  System.out.println("Enter how many elements to be insert(Enqueue operation) into Queue:");
	        Scanner sc=new Scanner(System.in);
	        int n,value;
	        n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {  
	        	System.out.println("Enter value of " + (i+1)+ " Element:");
	        	value=sc.nextInt();
	        	q.enqueue(value);
	        }
         System.out.print("After Enqueuing  Elements in queue:");
          q.display();
         System.out.println("");
        int a1= q.dequeue();
        System.out.print("After removing(Dequeue operation) first element:");
        q.display();
        System.out.println("");
        a1= q.dequeue();
        System.out.print("After removing(Dequeue operation) second element:");
        q.display();
	}
}
class Queue {
    int front=-1;
    int rear=-1;
    int arr[];
    int n;
  public Queue(int n)
{
     this.n=n;
     this.arr=new int[n];
}
 public boolean isFull()
{
    return rear==n-1;
}
public boolean isEmpty()
{
	  return front==-1&&rear==-1;

}
public void enqueue(int data)
{
	  if(isFull())
		  System.out.println("Queue is full");
	  else if(isEmpty())
	  {
		  rear=front=0;
		  arr[rear]=data;
	  }
	  else
	  {
		  rear++;
		  arr[rear]=data;
	  }
	  
}

public int dequeue() {
	  if(isEmpty()) {
		  System.out.println("Queue is Empty");
		  return -1;
	  }
	  else if(front==rear)
	  {
		  int top=arr[front];
		  front=rear=-1;
		  return top;
	  }
	  else {
		  int top=arr[front];
		  front++;
		  return top;
	  }
	  
}
public int peek()
{
	  if(isEmpty()) {
		  System.out.println("Queue is Empty");
		  return -1;
	  }
	  else {
		  int top=arr[front];
		  return top;
	  }  
}	
public void display()
{
	  for(int i=this.front;i<=this.rear;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }		  
		  
}
}


