package LINKED_LIST_2;
import java.util.Scanner;

public class L1_MidPoint_ofLL {
	
	public static Node<Integer> findMidPoint(Node<Integer> head){
		Node<Integer> slow = head, fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> takeinput(){
		Node<Integer> head=null,tail=null;
		Scanner s = new Scanner(System.in);
		int data= s.nextInt();
		
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeinput();
		Node<Integer> midpoint = findMidPoint(head);
		System.out.print(midpoint.data);
	}

}
