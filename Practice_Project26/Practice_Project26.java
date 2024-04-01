package Practice_Project26;
import java.util.*;
public class Practice_Project26 {
	 public static void main(String[] args) {
	        DoublyLinkedList doublylinkedlist = new DoublyLinkedList();
	        System.out.println("Enter how many elements to be insert into Doubly Linked List:");
	        Scanner sc=new Scanner(System.in);
	        int n,value;
	        n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {  
	        	System.out.println("Enter value of " + (i+1)+ " Element:");
	        	value=sc.nextInt();
	        	doublylinkedlist.insertEnd(value);
	        }
	        doublylinkedlist.forwardTraversal();
	        doublylinkedlist.backwardTraversal();
	    }
}
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList{
	Node head;
	 void insertEnd(int newData) {
	        Node newNode = new Node(newData);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	        newNode.prev = last;
	    }

	    void forwardTraversal() {
	        System.out.println("Forward traversal:");
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    void backwardTraversal() {
	        System.out.println("Backward traversal:");
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        while (last != null) {
	            System.out.print(last.data + " ");
	            last = last.prev;
	        }
	        System.out.println();
	    }
	 
}

	
