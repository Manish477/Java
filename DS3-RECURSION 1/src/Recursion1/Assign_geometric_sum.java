package Recursion1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Assign_geometric_sum {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){
            return 1;
        }
        return (1/Math.pow(2,k))+findGeometricSum(k-1);

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}

}
