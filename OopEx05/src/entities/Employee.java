//Go to the end to see details about the challenge


package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ " + 
	           String.format("%.2f", netSalary());
	}
	
	public void newSalary(double increase) {
		grossSalary += (grossSalary * increase) /100.0;
		
	}
	
	
}






/*
 
CHALLENGE

Develop a program to read an employee's data (name, gross salary and tax).

Then show the employee data (name and net salary). 

Then increase the employee's salary based on a given percentage (only gross salary is
affected by the percentage), and show employee data again. 

Use a class to set attributes and methods to the employee.

*/