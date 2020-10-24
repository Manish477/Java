package RECURSION1;
import java.util.Scanner;
public class ccc {
	
	public static int function(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)!=ans.charAt(j)) {
					ans=ans+s.charAt(0);
				}
			}
		}
		return ans.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(function(str));
	}

}
