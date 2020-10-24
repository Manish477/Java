package RECURSION2;
import java.util.Scanner;
public class L1_P2_removeDuplicates {
	static Scanner s = new Scanner(System.in);
		
	    public static String removeConsecutiveDuplicates(String s) {
	    	if(s.length()<=1) {
	    		return s;
	    	}
	    	if(s.charAt(0)==s.charAt(1)) {
	    		return removeConsecutiveDuplicates(s.substring(1));
	    	}
//	    	else {
//	    		String small = removeConsecutiveDuplicates(s.substring(1));
//	    		return s.charAt(0)+small;
//	    	}  //or(you can do this)
	    	return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));    		
	    }

		public static void main(String[] args) {
	    	String input = s.next();
	    	System.out.println(removeConsecutiveDuplicates(input));
	    }

}
