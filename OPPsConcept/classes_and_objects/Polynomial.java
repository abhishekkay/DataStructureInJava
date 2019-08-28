package classes_and_objects;

public class Polynomial {
    DynamicArray coefficients;
    public Polynomial() {
    	coefficients = new DynamicArray();
    }
    public void setCoefficient(int deg , int coeff) {
    	//coefficients.add(coeff);
    	coefficients.set(deg, coeff);
    }
    public int degree() {
    	int d = 0 ;
    	for(int i = 0 ; i < coefficients.size() ; i++) {
    		if(coefficients.get(i) != 0) {
    			d = i;
    		}
    	}
    	return d;
    }
    public void print() {
    	for(int i = 0 ; i < coefficients.size() ; i++) {
    		System.out.print(coefficients.get(i)+""+"x^"+i+"+");  		
    	}
    	System.out.println();
    }
    public void add(Polynomial p) {
    	
    }
    public void subtract(Polynomial p) {
    	
    }
    public void multiply(Polynomial p) {
    	
    }
   /* public int evaluate(int x) {
    	
    }*/
    public static Polynomial add(Polynomial p1 , Polynomial p2) {
    	Polynomial p = new Polynomial();
    	return p;
    }
}
