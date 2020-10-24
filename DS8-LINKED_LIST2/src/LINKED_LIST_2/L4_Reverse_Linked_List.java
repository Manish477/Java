package LINKED_LIST_2;
import java.util.Scanner;

public class L4_Reverse_Linked_List {

	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null){  //head == null ==> empty 
			return head;                        //and head.next == null ==> only one node is there
		}
		
		//we have two length of linked list as we have rached here
		
		Node<Integer> finalHead = reverseR(head.next);    //head.next==>from 2nd element to end of list we're calling the list
		
		Node<Integer> temp = finalHead;   //now we have: 4->3->2 we have to add 1 to last of list after 2,so we'll traverse from start
		while(temp.next != null){         //till we reach end by making use of temp variable
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalHead;
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
		Node<Integer> head = takeInput();
		head = reverseR(head);
		print(head);
		
	}

}
