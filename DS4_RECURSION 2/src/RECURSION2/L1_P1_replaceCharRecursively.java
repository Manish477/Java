package RECURSION2;

import java.util.Scanner;

public class L1_P1_replaceCharRecursively {
	
//	public static String replaceCharacter(String input,char c1,char c2) {
//	 	public static String replaceCharacter(String input, char c1, char c2) {
// 		if(input.length()==0){
//             return input;
//         }
        
//         if(input.charAt(0)==c1){
//            return c2 + replaceCharacter(input.substring(1),c1,c2);
//         }
//         return input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);

// 	}
    
    	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()==0){
            return input;
        }        
        String ans="";
        if(input.charAt(0)==c1){
           ans=ans+c2;
           String smallans = replaceCharacter(input.substring(1),c1,c2);
            return ans+smallans;
        }
        ans = ans + input.charAt(0);
        String smallans = replaceCharacter(input.substring(1),c1,c2);
        return ans + smallans;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input,c1,c2));
	}

}
