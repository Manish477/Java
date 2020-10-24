package RECURSION1;
import java.util.Scanner;
public class replace_pi_recursive {
	
	public static String replace(String input) {
		
		 if(input.length()==0 || input.length()==1){
	            return input;
	        }
	        if(input.charAt(0)=='p'){
	            if(input.charAt(1)=='i'){
	                input = "3.14" + replace(input.substring(2));
	                return input;
	            }
	        }
	        String temp = input.substring(0,1) + replace(input.substring(1));     //adding string(input.substring(0,1) to another string as we cannot add char to string 
	        return temp;
	}
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(replace(input));
	}

}
