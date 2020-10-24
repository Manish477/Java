package RECURSION1;
import java.util.Scanner;
public class P2_removeX {
	
	//mycode
	/*public static String removeX(String input){
		// Write your code here
        if(input.length()==0 || input.length()==1){
            if(input.charAt(0)=='x'){
                return "";
            }
            return input;
        }
        
        if(input.charAt(0)=='x'){
            input= ""+removeX(input.substring(1));
            return input;
        }
        
       String temp=input.substring(0,1) + removeX(input.substring(1));
        return temp;
	}*/
	
	//solution
	public static String removeX(String input) {
		if(input.length()==0) {
			return "";
		}
		if(input.charAt(0)=='x') {            //if first char is x
			return removeX(input.substring(1));
		}
		
		return input.charAt(0) + removeX(input.substring(1));  //if first char is not x
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}
	
}
