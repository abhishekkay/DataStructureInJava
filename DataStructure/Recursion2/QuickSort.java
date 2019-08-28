package Recursion2;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int input[] , int SI , int EI) {
    	if(SI >= EI) {
    		return;
    	}
    int pivotpos = partition(input, SI, EI);
   // System.out.println();
     quickSort(input, SI, pivotpos-1);
     quickSort(input, pivotpos+1, EI);
    }
    public static int partition(int input[] , int SI , int EI) {
    	int count = 0;
    	//System.out.println(SI + " "+EI);
    	for(int i = SI+1  ; i <= EI ; i++) {
    		if(input[SI] >= input[i]) {
    			count++;
    		}
    	}
    	int pivotpos = SI + count;
    //	System.out.println(pivotpos);
    	int temp = input[pivotpos];
    	input[pivotpos] = input[SI];
    	input[SI] = temp;
    	int i = SI , j = EI;
    	while(i < pivotpos && j > pivotpos) {
    	    if(input[i] <= input[pivotpos]) {
    	    	i++;
    	    }
    	    else if(input[j] > input[pivotpos]) {
    	    	j--;
    	    }
    	    else {
    	    	temp = input[i];
    	    	input[i] = input[j];
    	    	input[j] = temp;
    	    }
    	}
//    	for(i = SI ; i <= EI ; i++) {
//			System.out.print(input[i]+" ");
//		}

    	return pivotpos;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			input[i] = sc.nextInt();
		}
		quickSort(input, 0, input.length-1);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(input[i]+" ");
		}
        //System.out.println(partition(input, 0, input.length-1));
	}

}
