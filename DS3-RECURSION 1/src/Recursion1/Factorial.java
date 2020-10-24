package Recursion1;
import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);            //smaller problem = factorial(n-1)
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=factorial(n);
		System.out.println(ans);

	}

}
