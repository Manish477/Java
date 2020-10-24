package LINKEDLIST1;

public class LinkedListUse_2 {
	
	public static void print(Node<Integer> head) {   //to pass the list by just passing the head value which is pointing to first node
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		node1.next = node2;
		node2.next = node3;
		
		Node<Integer> head = node1;   //head is just a reference which is pointing to nothing initially and then it is pointing to node1
		
//		while(head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
		
		print(head);
		print(head);

	}

}
