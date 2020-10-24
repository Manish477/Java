package RECURSION1;
import java.util.Scanner;
public class P3_PairStar {

	// Return the updated string
		public static String addStars(String s) {
	        if(s.length()<=1){
	            return s;
	        }
	        if(s.charAt(0)==s.charAt(1)){
	            s=s.charAt(0)+"*"+ addStars(s.substring(1));
	            return s;
	        }
	        return s.substring(0,1)+addStars(s.substring(1));            //adding string(input.substring(0,1) to another string as we cannot add char to string 

		}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(addStars(input));

	}

}
