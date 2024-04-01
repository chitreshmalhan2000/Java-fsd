package Practice_Project27;
import java.util.*;
public class Practice_Project27 {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push("Hello");
		s.push("world");
		s.push("java");
		s.push("Programming");
		System.out.print("After Pushing 4 Elements in Stack: ");
		s.display();
		String popped_item1 = s.pop();
		System.out.println("");
		System.out.print("After Ist Pop:");
		s.display();
		String popped_item2 = s.pop();
		System.out.println("");
		System.out.print("After 2nd Pop:");
		s.display();

	}
}
class Stack {
	int n;
	String arr[];
	int top;
	Stack(int n)
	{
		this.n=n;
		this.arr=new String[n];
		this.top=-1;
	}
	public boolean isFull()
	{
		return(n-1==top);
	}
	public boolean isEmpty() {
		return(top==-1);
		}
	
	public String pop() {
		if(isEmpty()) {
			return("Stack is Empty");
		}
		else {
			String value=arr[top];
			top--;
			return value;
		}	
	}
	
	public void display() {
		  if(top>=0)
		  {
			  for(int i=0;i<=top;i++)
				  System.out.print(arr[i]+" ");
		  }
		  else
			  System.out.print("Stack is Empty");
	}
	public String peek()
	{
		if(isEmpty())
			return "Stack is Empty";
		else
			return arr[top];	
	}
	public String peeek()
	{
		if(isEmpty())
			return "Stack is Empty";
		else
			return arr[0];	
	}
	public void push(String data)
	{
		if(isFull())
			System.out.println("Stack is Full");
		else {
			top++;
			arr[top]=data;
		}
	}

}


