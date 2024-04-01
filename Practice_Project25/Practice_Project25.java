package Practice_Project25;
import java.util.*;
public class Practice_Project25 {
	  public static void main(String[] args) {
	        
	        System.out.println("Enter how many elements to be insert into Circular Linked List:");
	        CircularLinkedList circularlinkedlist = new CircularLinkedList();
	        Scanner sc=new Scanner(System.in);
	        int n,value;
	        n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {  
	        	System.out.println("Enter value of " + (i+1)+ " Element:");
	        	value=sc.nextInt();
	        	circularlinkedlist.sortedInsert(value);
	        }
	       

	        System.out.println("Sorted Circular linked list after insertion:");
	        circularlinkedlist.display();
	    }
	  }
	  
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList{
	Node head;
	 void sortedInsert(int newData) {
	        Node newNode = new Node(newData);

	        if (head == null) {
	            newNode.next = newNode;
	            head = newNode;
	        } else if (newNode.data <= head.data) {
	            Node last = getLastNode();
	            newNode.next = head;
	            last.next = newNode;
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != head && current.next.data < newNode.data) {
	                current = current.next;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }
	    }

	    Node getLastNode() {
	        Node temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }
	        return temp;
	    }

	    void display() {
	        if (head == null) return;

	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	    }
	
}
