package ASSIGNMENT;
import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class P3_eliminate_duplicates_from_LL {
	
public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        
     LinkedListNode<Integer> current = head;
     if(head == null) {
    	 return null;
     }
     
     while(current.next!=null) {
    	 if(current.data.equals(current.next.data)) {
    		 current.next = current.next.next;
    	 }else {
    		 current = current.next;
    	 }
     }
     return head;	   //if there is only one node in the linkedlist it will just return that first node 
                       //so we should not consider the case of single node in the linked list
	
//	if(head==null){      //no list
//            return head;
//        }
//        if(head.next==null){    //list of one node
//            return head;
//        }
//        
//        LinkedListNode<Integer> t1 = head;
//        LinkedListNode<Integer> t2 = head.next;
//        while(t2!=null){
//            if(t1.data-t2.data==0){
//                t1.next=t2.next;
//                t2=t2.next;
//            }else if(t1.data!=t2.data){
//                //t1.next=t2;
//                t1=t2;
//                t2=t2.next;
//            }
//        }
//       // t1.next = t2;
//        return head;          
    }

	public static void main(String[] args) {
			print(removeDuplicates(input()));
		}

		public static void print(LinkedListNode<Integer> head) {
			LinkedListNode<Integer> temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				temp = temp.next;
			}
		}

		public static LinkedListNode<Integer> input() {
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();

			LinkedListNode<Integer> head = null;
			LinkedListNode<Integer> tail = null;
			while (data != -1) {
				LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
				if (head == null) {
					head = newNode;
					tail = newNode;
				} else {
					tail.next = newNode;
					tail = newNode;
				}
				data = s.nextInt();
			}
			return head;
	   }
}
