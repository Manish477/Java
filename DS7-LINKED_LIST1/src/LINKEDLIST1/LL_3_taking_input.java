package LINKEDLIST1;
import java.util.Scanner;

public class LL_3_taking_input {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;   //just to link the new node to the list
				tail = newNode;       //upadate the last node as the tail of the list   or tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	}

}
