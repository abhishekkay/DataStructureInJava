package TimeandSpaceComplexity;

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
		for(int n = 10 ; n <= 10000000 ;n = n*10) {
			int input[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				input[i] = input.length - i;
			}
			long startTime = System.currentTimeMillis();
	       selectionSort(input);
	       long endTime = System.currentTimeMillis();
	       System.out.println("Time by Selecction sort for "+ n + "  is "+(endTime - startTime));
			}

	}

}
