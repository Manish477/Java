package LINKED_LIST_2;

import java.util.Scanner;

public class L2_MergeSortedLL {

	public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head2;
		}
		
		Node<Integer> t1 = head1, t2 = head2, head3 = null, tail3 = null;
		
		if(t1.data <= t2.data) {
			head3 = t1;
			tail3 = t1;
			t1 = t1.next;
		}else {
			head3 = t2;
			tail3 = t2;
			t2 = t2.next;
		}
		
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail3.next = t1;
				tail3 = t1;
				t1 = t1.next;
			}else {
				tail3.next = t2;
				tail3 = t2;
				t2 = t2.next;
			}
		}
		
		if(t1 == null) {
			tail3.next = t2;
		}else {
			tail3.next = t1;
		}
		
		return head3;
		
	}
	
	public static Node<Integer> takeInput()

	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head3 = mergeSortedLL(head1,head2);
		print(head3);


	}

}
