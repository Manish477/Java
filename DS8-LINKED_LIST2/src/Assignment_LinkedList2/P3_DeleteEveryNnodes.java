package Assignment_LinkedList2;
import java.util.Scanner;
public class P3_DeleteEveryNnodes {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(M==0) {
			return null;
		}
		LinkedListNode<Integer> t1 = head,t2;
		int count;
		while(t1 != null) {
			for(count = 1; count < M && t1 != null; count++)
				t1 = t1.next;
			if(t1 == null)
				return head;
			
			t2 = t1.next;
			for(count = 1; count <= N && t2 !=null;count++)
				t2 = t2.next;
			
			t1.next = t2;
			t1 = t2;
		}
		return head;
		
		// int c1=0;
		// int c2=0;
		// LinkedListNode<Integer> t1 = head , t2;
		// while(t1 != null){
		// c1=1;c2=1;
		// while(c1<M){
		// t1=t1.next;
		// c1++;
		// }
		// t2 = t1.next;                   //initialising t2 
		// while(c2 != N ){
		// if(t2 != null){
		// t2 = t2.next;
		// c2++;
		// }else if(t2==null){
		// break;
		// }
		// }
		// if(t2.next != null){
		// t2 = t2.next;
		// t1.next = t2;   //making the new link
		// t1=t2;
		// }
		// }
		// return head;
		// }
		
  }

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			print(skipMdeleteN(input(), s.nextInt(), s.nextInt()));
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
			while (data!=-1) {
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
