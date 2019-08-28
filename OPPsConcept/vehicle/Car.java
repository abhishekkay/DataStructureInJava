package vehicle;

public class Car extends Vehicle {
  int numGears;
  boolean isConvertible;
  public Car(int numGears , int maxspeed) {
	  //super(maxspeed);
	  this.numGears = numGears;
	  System.out.println("Car Constructor");
} 
  public Car() {
	// TODO Auto-generated constructor stub
	  System.out.println("Car Constructor");
	  //super();
}
  public boolean isConvertible() {
	return isConvertible;
}
  public void print() {
       super.print();
	   System.out.println("Car numGears :  "+numGears);
	   System.out.println("Car isConvertible :  "+isConvertible);
  }
}
