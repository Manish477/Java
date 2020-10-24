package RECURSION2;
import java.util.Scanner;
public class L3_QuickSort {
	
	public static void quickSort(int[] input,int sI, int eI){
        if(sI>=eI){
            return;
        }
        int pivotPos = partition(input,sI,eI);
        quickSort(input,sI,pivotPos-1);
        quickSort(input,pivotPos+1,eI);
    }
    
    public static int partition(int[] input,int sI, int eI){
        int pivot = input[sI];
        int count_OfSmallerelements=0;
        for(int i=sI; i<eI; i++){
            if(input[i] < pivot){
                count_OfSmallerelements = count_OfSmallerelements + 1;
            }
        }
        int pivotPos = sI + count_OfSmallerelements;
        int t=pivot;
        pivot=input[pivotPos];
        input[pivotPos]=t;
        
        int i=sI;
        int j=eI;
        
        while(i < pivotPos && j > pivotPos){
            if(input[i] < pivot){
               i++;
            }else if(input[j] > pivot){
               j--;
            }else{
               int temp= input[i];
               input[i] = input[j];
               input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotPos;
        
    }
	
	public static void quickSort(int[] input) {
		quickSort(input,0,input.length-1);
	}
	
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
