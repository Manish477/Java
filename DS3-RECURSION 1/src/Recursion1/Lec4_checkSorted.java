package Recursion1;

public class Lec4_checkSorted {

	public static boolean checkSorted(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns){
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else{
			return false;
		}
		
	}
	
	   //another method 
        public static boolean checkSorted_2(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		if(input[0] > input[1]){
			return false;
		}
		 
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		boolean smallAns = checkSorted_2(smallInput);
		return smallAns;
//		if(smallAns){
//			return true;
//		}else{
//			return false;
//		}

}
        
        
   //this function checks if the array is sorted from startIndex. 
   //we are not changing the size of the array,we are changing the start index 
        
     public static boolean checkSortedBetter(int input[],int startIndex) {
    	 if(startIndex >= input.length-1) {        //first element is the last element or one size array
    		 return true;
    	 }
    	 if(input[startIndex] > input[startIndex+1]) {
    		 return false;
    	 }
    	 
    	 boolean smallAns = checkSortedBetter(input,startIndex + 1);
    	 return smallAns;
     }



	public static void main(String[] args) {
		int input[] = {1,2,3};
		System.out.println(checkSortedBetter(input,0));   //input and startIndex as arguments		
	}
}
