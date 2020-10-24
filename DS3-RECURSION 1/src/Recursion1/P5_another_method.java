package Recursion1;
import java.util.Scanner;

public class P5_another_method {
	
	public static boolean checkNumber(int input[],int x,int startIndex) {
		
		if(startIndex==input.length) {        //the array has exceeded the array length
			return false;                     //searched at all the input of the array
		}
		
		if(input[startIndex]==x) {
			return true;
		}
		
		return checkNumber(input,x,startIndex + 1);
	}

	  public static boolean checkNumber(int input[],int x) {
		  return checkNumber(input,x,0);
		  
	  }
	
	     public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			int n = s.nextInt();
			int input[] = new int[n];
			for(int i = 0; i < n; i++) {
				input[i] = s.nextInt();
			}
			int x = s.nextInt();
			System.out.println(checkNumber(input, x));
		 }	

}
