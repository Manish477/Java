package ASSIGNMENT;
import java.util.Scanner;
public class P1_Find_a_node_in_linkedList {

	public static int indexOfNIter(Node<Integer> head, int n) {
		
		if(head==null) {
			return -1;
		}
		int i=0;
		while(head!=null) {            //it will be pointing to last node
			if(head.data.equals(n)) {
				return i;
			}
			head=head.next;
			i++;
		}
		return -1;
		
		
		//my method
//        int i=0;
//        if(head==null){
//            return -1;
//        }
//        Node<Integer> temp = head;
//        while( temp.next!=null && temp.data!=n){
//            temp=temp.next;
//            i++;
//        }
//        if( temp.next==null && temp.data==n){
//            return i++;
//        }
//        if(temp.next==null){
//            return -1;
//        }
//        return i;
	}
	
	
	
	public static Node<Integer> takeInput() {    //taking input
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);   //newnode is just a reference which is pointing to the node created(new Node<Integer>(data)) by passing the value
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(indexOfNIter(head, n));
	}

}
