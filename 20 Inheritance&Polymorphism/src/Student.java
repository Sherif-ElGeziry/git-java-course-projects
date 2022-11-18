
public class Student extends Person{
	private int studyLvl;
	private String specialization;
	private double gpa;
	
	public Student(){
		System.out.println("I am the derived class constructor");
	}
	
	public Student(String n, int a, String add, String nat, int lvl, String spec, double g){
		super(n, a, add, nat);
		studyLvl = lvl;
		specialization = spec;
		gpa = g;
	}
	
	public void setStudyLvl(int lvl) {
		studyLvl = lvl;
	}
	
	public void setSpecialization(String spec) {
		specialization = spec;
	}
	
	public void setGpa(double g) {
		gpa = g;
	}
	
	public int getStudyLvl() {
		return studyLvl;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public double getGpa() {
		return gpa;
	}
}
