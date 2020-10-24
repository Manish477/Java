package Recursion1;
import java.util.Scanner;
public class Assign_checkPalindrome_recursive {

	 public static boolean isStringPalindrome(String input,int startIndex,int lastIndex){
	        if(input.length()==0 || input.length()==1){
	            return true;
	        }
	        if(input.charAt(startIndex)!=input.charAt(lastIndex)){
	            return false;
	        }
//	        else if(input.charAt(startIndex)==input.charAt(lastIndex)){
//	            return isStringPalindrome(input,startIndex+1,lastIndex-1);
//	        }
	        return isStringPalindrome(input,startIndex+1,lastIndex-1);
	    }
	    
		public static boolean isStringPalindrome(String input) {
			// Write your code here
	        boolean ans=isStringPalindrome(input,0,input.length()-1);
	        return ans;

		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}

}
