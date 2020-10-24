package Recursion1;
import java.util.Scanner;
public class P3_I_Print_Numbers {

	public static void print(int n){
		if(n == 1){
			System.out.print(n+" ");
            return;  //it simply returns
		}
        print(n - 1);
        System.out.print(n+" ");
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}
}
