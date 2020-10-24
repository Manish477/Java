package Recursion1;
import java.util.Scanner;
public class P5_check_Num_inArray {

public static boolean checkNumber(int input[], int x) {
        
        if(input[0]==x){
            return true;
        }
        
        if(input.length==1){
            if(input[0]!=x){
                return false;
            }
        }
        
        int smallInput[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1]=input[i];
        }
        
        boolean smallAns = checkNumber(smallInput,x);   
        return smallAns;
        
	}


   public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n = s.nextInt();
	int input[] = new int[n];
	for(int i = 0; i < n; i++) {
		input[i] = s.nextInt();
	}
	int x = s.nextInt();
	System.out.println(checkNumber(input, x));
  }	

}
