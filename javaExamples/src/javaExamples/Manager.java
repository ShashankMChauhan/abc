package javaExamples;

public class Manager extends Employee {
	
	int teamSize;

	Manager(int id, String name, float sal, int teamSize) {
		super(id, name, sal);
		// TODO Auto-generated constructor stub
		this.teamSize=teamSize;
	}
	
	public void computehra() {
		hra=0.40f*sal;
		System.out.println("HRA of Manager is - "+ hra);
	}
 
	
}
