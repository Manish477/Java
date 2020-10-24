package RECURSION2;
//remove x from the string using recursion-manisha mam ......this the second method as first one is done in recursion1 assignment 
import java.util.Scanner;
public class L1_RecursionAndStrings {

	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		if(str.charAt(0)!='x') {
			ans=ans+str.charAt(0);
		}
		
		String smallans = removeX(str.substring(1));
		return ans + smallans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(removeX(str));
	}
}
