package RECURSION2;
import java.util.Scanner;
public class L5_return_keyPad {

	public static char[] numberOptions(int n) {
		switch(n) {	
		case 2:
			char options2[] = {'a','b','c'};
		    return options2;
		case 3:
			char options3[] = {'d','e','f'};
			return options3;
		case 4:
			char options4[] = {'g','h','i'};
			return options4;
		default:
			char options[] = {'\0'};
			return options;
		}
	}
	
	public static String[] returnKeypad(int n) {
		if(n==0) {
			String ans[] = {""};
			return ans;
		}	
		int lastDigit = n%10;
		int smallerNumber = n/10;
		String smallAns[] = returnKeypad(smallerNumber);
		char options[] = numberOptions(lastDigit);
		String ans[] = new String[smallAns.length * options.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<options.length;j++) {
				ans[k] = smallAns[i] + options[j];
				k++;
			}
		}		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = returnKeypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
