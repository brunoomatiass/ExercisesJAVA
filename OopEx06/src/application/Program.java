//Go to the end of this code to read details about the challenge


package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the student's name and grades (all three): ");
		student.name = sc.nextLine();
		student.g1 = sc.nextDouble();
		student.g2 = sc.nextDouble();
		student.g3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE =  %.2f%n",  student.fGrade());
		if (student.fGrade() >= 60){
			System.out.println("PASSED");	
		}
		
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + student.missingPoints() + " POINTS");
		}
		
		
		
		
		sc.close();
	}

}



/*
  
CHALLENGE:  
 
Develop a program to read a student's name and the three grades
he obtained in the three quarters of the year (first quarter is
worth 30 and the second and third are worth 35 each). 

At the end, show the student's final grade in the year.

Also show whether the student is approved (PASS) or not (FAILED)
and, if not, how many points are missing for the student to obtain
the minimum to pass (which is 60% of the grade). 

You must create a Student class to solve this problem.

*/