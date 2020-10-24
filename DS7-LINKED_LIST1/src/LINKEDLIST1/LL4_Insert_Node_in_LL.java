package LINKEDLIST1;

import java.util.Scanner;

public class LL4_Insert_Node_in_LL {
	
	public static Node<Integer> insert(Node<Integer> head,int data,int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		int i=0;
		Node<Integer> temp = head;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

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
		head = insert(head,80,0);
		print(head);

	}

}
