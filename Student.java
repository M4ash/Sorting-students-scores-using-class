/**
 * @author Billah Syed Mashkur 
 * Matric no : 1723387 
 * Lab #5 OBJECTS & CLASSES
* Section # 01
 */

public class Student {
	//data fields
	String name;
	double score;
	//default constructor
	public Student() {
		
	}
	//create methods
	public void setName(String n) {
		name = n;
	}
	
	public void setScore(double s) {
		score = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getScore() {
		return score;
	}
	
}
