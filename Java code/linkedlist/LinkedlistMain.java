package linkedlist;

public class LinkedlistMain {
	public static void main(String[] args) {
		Node head= new Node(10);
		Node.insertNodeAtEnd(head, 20);
		Node.insertNodeAtEnd(head, 30);
		Node.insertNodeAtEnd(head, 40);
		Node.insertNodeAtEnd(head, 50);
		Node.insertNodeAtEnd(head, 60);
		
		Node.printLinkedlist(head);
		
		head= Node.deleteNodeAtPos(head, 3);
		Node.printLinkedlist(head);
		
		head=Node.deleteNodeAtPos(head, 1);
		Node.printLinkedlist(head);
	}
}


