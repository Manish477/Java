package RECURSION2;

public class L4_Return_SubSequences {

public static String[] findSubsequences(String str){
		
		if(str.length() == 0){
			String ans[] = {""};
			return ans;
		}
		
		String smallAns[] = findSubsequences(str.substring(1));
		String ans[] = new String[2 * smallAns.length];
		
		int k = 0;
		for(int i = 0; i < smallAns.length; i++){            //first copy the same elements of smallerAns to ans
			ans[k] = smallAns[i];
			k++;
		}
		
		for(int i = 0; i < smallAns.length; i++){            //to append the next elements by adding the first character
			// ans[i + smallAns.length]
			ans[k] = str.charAt(0) + smallAns[i];
			k++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		String str = "xyz";
		String ans[] = findSubsequences(str);
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}
		
	}


}
