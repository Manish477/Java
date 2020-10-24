package Assignment_LinkedList2;
import java.util.Scanner;

import LINKED_LIST_2.Node;
public class P2_Even_After_Odd_LinkedList {

	/*
	class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.setData(data);
			this.next = null;
		}
	}
	* */
		public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {

	        LinkedListNode<Integer> oddH=null;
	        LinkedListNode<Integer> oddT=null;
	        LinkedListNode<Integer> evenH=null;
	        LinkedListNode<Integer> evenT=null;
	        
	        int oddcount = 0;
	        int evencount = 0;
	        
	        if(head==null){
	            return head;
	        }
	        while(head!=null){
	            if(head.data%2!=0){              //odd linked list
	               if(oddH==null){
	                  oddH=head;
	                  oddT=head;   
	                  
	               }else if(oddH!=null){
	                  oddT.next=head;
	                   oddT=head;
	                    oddcount++;
	               }
	            }else{                            //even linked list
	                if(evenH==null){
	                    evenH=head;
	                    evenT=head;
	                     
	                }else{
	                    evenT.next=head;
	                    evenT = head; 
	                    evencount++;
	                }
	            }
	            head = head.next;
	        }
	        //now head is pointing to null i.e. end of linked list
	        
	        if(oddT!=null)            //separating the two linked by making them point to null
	        oddT.next = null;  
	        if(evenT!=null)
	        evenT.next = null;
	        
	        
	        if(oddcount>=1 && evencount>=1){
	            oddT.next=evenH;
	            return oddH;
	        }else if(oddcount>=1 && evencount==0){
	            return oddH;
	        }
	        // else if(oddcount==0 && evencount>=1){
	        //     return evenH;
	        // }
	        return evenH;
	  }

//main code		
		
//		class LinkedListNode<T> {
//			public T data;
//			public LinkedListNode<T> next;
//
//			public LinkedListNode(T data) {
//				this.data=data;
//				this.next = null;
//			}
//		}

	public static void main(String[] args) {
		print(sortEvenOdd(input()));
	}

	public static LinkedListNode<Integer> input() {
		LinkedListNode<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
