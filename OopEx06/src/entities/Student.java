package entities;

public class Student {
	
	public String name;
	public double g1, g2, g3;
	
	public double fGrade() {
		return g1 + g2 + g3;		
	}
	
	public double missingPoints() {
		
		if (fGrade() < 60) {
			return 60 - fGrade();
		} 
		
		else {
			return 0.0;
		}
		
	}
	
}
