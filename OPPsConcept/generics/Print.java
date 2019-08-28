package generics;

public class Print {
    public static<T> void printArray(T a[]) {
    	for(int i = 0 ; i < a.length ; i++) {
    		System.out.print(a[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[10];
		for(int i = 0 ; i < 10 ; i++) {
			a[i] = i+1;
		}
        printArray(a);
	}

}
