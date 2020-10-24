package LINKED_LIST_2;

import java.util.Scanner;

public class L9_Delete_Recursively {
	
	public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i){      
        if(head==null){
            return head;
        }
        
        if(i==0){
            return head.next;
        }
        
        head.next = deleteIthNodeRec(head.next,i-1);
        return head;
		
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
		Scanner s = new Scanner(System.in);
	    Node<Integer> head = takeInput();
		int pos = s.nextInt();
		head = deleteIthNodeRec(head, pos);
		print(head);

	}

}
