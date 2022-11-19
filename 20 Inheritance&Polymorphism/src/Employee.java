
public class Employee extends Person{
	private double salary;
	private String rank;
	private String job;
	
	public Employee(){
		System.out.println("I am the derived class constructor");
	}
	
	public Employee(String n, int a, String add, String nat, double sal, String ran, String j){
		super(n, a, add, nat);
		salary = sal;
		rank = ran;
		job = j;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public void setRank(String ran) {
		rank = ran;
	}
	
	public void setJob(String j) {
		job = j;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getJob() {
		return job;
	}
	
	@Override
	public void printAllDetails() {
		super.printAllDetails();
		System.out.println("Salary = " + salary + "\nRank = " + rank + "\nJob = " + job);
	}
}
