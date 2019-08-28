package classes_and_objects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(Student.getNumStudents());
		Student s1 = new Student("Abhishek",125);
		Student s2 = new Student("Apoorv",154);	
//		System.out.println(s1);
//		System.out.println(s2);
		//System.out.println(s1.numStudents);
		//System.out.println(s2.numStudents);
//		System.out.println(Student.numStudents);
		System.out.println(Student.getNumStudents());
		s1.print();
		s2.print();

	}

}
