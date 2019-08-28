package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] input) {
    	for(int i = 0 ; i < input.length-1;i++) {
    		//0 to length-2
    		int minIndex = i;
    		int min = input[i];
    		for(int j = i + 1 ; j < input.length;j++) {
    			if(input[j] < min) {
    				min = input[j];
    				//System.out.println("min =>"+min);
    				minIndex = j;
    			}
    		}if(minIndex != i) {
       	    input[minIndex] = input[i];
    		input[i] = min;
    		}
    	}
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,6,9,1,5};
		selectionSort(input);
		for(int i = 0 ; i < input.length;i++) {
			System.out.print(input[i]+" ");
		}

	}

}
