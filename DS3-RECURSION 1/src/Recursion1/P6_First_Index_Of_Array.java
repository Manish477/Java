package Recursion1;
import java.util.Scanner;

public class P6_First_Index_Of_Array {

	 public static int firstIndex(int input[],int x,int startIndex){
	        
	        if(startIndex==input.length){
	            return -1;
	        }
	        
	        if(input[startIndex]==x){
	            return startIndex;
	        }
	        
	        return firstIndex(input,x,startIndex + 1);
	}

		public static int firstIndex(int input[], int x) {		
	        return firstIndex(input,x,0);
	        
		}
	
		public static int[] takeInput(){
		    Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int[] input = new int[size];
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int[] input = takeInput();
			int x = s.nextInt();
			System.out.println(firstIndex(input, x));
		}

}
