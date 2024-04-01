package Practice_Project24;
import java.util.*;
public class Practice_Project24 {
    public static void main(String[] args) {
        LinkedList linkedlist= new LinkedList();
        linkedlist.head = new Node(1);
        linkedlist.head.next = new Node(2);
        linkedlist.head.next.next = new Node(3);
        linkedlist.head.next.next.next = new Node(2);
        linkedlist.head.next.next.next.next = new Node(3);
        linkedlist.head.next.next.next.next.next = new Node(1);

        System.out.println("Linked list before deletion:");
        linkedlist.printList();

        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the key which is to be deleted");
        		key=sc.nextInt();
        		linkedlist.deleteNode(key);

        System.out.println("\nLinked list after deleting first occurrence of " + key + ":");
        linkedlist.printList();
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
class LinkedList{
	 Node head;
	 void deleteNode(int key) {
	        Node temp = head, prev = null;

	        // If the key is present at the head
	        if (temp != null && temp.data == key) {
	            head = temp.next;
	            return;
	        }

	        // Search for the key to be deleted, keep track of the previous node
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }

	        // If key was not present in the list
	        if (temp == null)
	            return;

	        // Unlink the node from the linked list
	        prev.next = temp.next;
	    }

	    void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }

	 
}


