package classes_and_objects;

public class Student {
     public String name;
     // final data members can be initialized as soon as they are declared
     private final int rollNumber;
     /* public Student(String n) {
    	  name = n;
    	  
      }*/
    private static int numStudents;
      public Student(String name ,int rollNumber) {
    	  this.name = name;
    	  this.rollNumber = rollNumber;
    	  numStudents++;
      }
     /* public void setRollnumber(int rn) {
    	  if(rn <= 0) {
    		  return;
    	  }
    	  rollNumber = rn;
      } */
      public static 4int getNumStudents() {
    	  return numStudents;
      }
      public int getRollNumber() {
    	  return rollNumber;  }
      public void print() {
    	 // System.out.println(this);
    	  System.out.println(name+":"+rollNumber);
      }
}
