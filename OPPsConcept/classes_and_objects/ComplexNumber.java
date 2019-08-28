package classes_and_objects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	public ComplexNumber(int real , int imaginary) {
	    this.real = real;
	    this.imaginary = imaginary;
	}
	public int getImaginary() {
		return imaginary;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int r) {
		this.real = r;
	}
	public void setImaginary(int im) {
		this.imaginary = im;
   	}
	public void print() {
		if(this.imaginary >=0) {
		System.out.println(real+"+"+"i"+imaginary);
		}else {	
			System.out.println(real+"-"+"i"+(imaginary*-1));
		}
		
	}
    public void add(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
    public void multiply(ComplexNumber c2) {
    	int newReal =  (this.real * c2.real) - (this.imaginary * c2.imaginary);
    	int newImaginary = (this.real * c2.imaginary)+(this.imaginary*c2.real);
    	this.real = newReal;
    	this.imaginary = newImaginary;
    }
    public static ComplexNumber add(ComplexNumber c1 , ComplexNumber c2) {
    	int newReal = c1.real + c2.real;
    	int newImaginary = c1.imaginary + c2.imaginary;
    	ComplexNumber c = new ComplexNumber(newReal, newImaginary);
    	return c;
    }
    public ComplexNumber conjugate() {
    	   this.imaginary = -1 * this.imaginary;
           ComplexNumber c = new ComplexNumber(this.real , this.imaginary);
           return c;
    }
    public static ComplexNumber multiply(ComplexNumber c1 , ComplexNumber c2) {
    	int newReal = (c1.real* c2.real) - (c1.imaginary * c2.imaginary);
    	int newImaginary = (c1.real * c2.imaginary)+(c2.imaginary*c2.real);
    	ComplexNumber c = new ComplexNumber(newReal, newImaginary);
    	return c;
    }
    
}
