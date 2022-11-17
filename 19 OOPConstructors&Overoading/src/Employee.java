
public class Employee {
	private int empId;
	private String name;
	private String depart;
	private double salary;
	private double bonus;
	private boolean resident;
	
	public Employee() {
		empId = 100;
		name = "No name";
		depart = "Not decided yet!";
		salary = 15000;
		bonus = 5000;
		resident = true;
	}
	
	public Employee(int id, String n) {
		empId = id;
		name = n;
	}
	
	public Employee(int id, String n, boolean r) {
		//empId = id;
		//name = n;
		this(id, n);
		resident = r;
	}
	
	public Employee(int id, String n,String d, double s, double b, boolean r) {
		this(id, n, r);
		depart = d;
		salary = s;
		bonus = b;
	}
	
	public void setSalary(double s) {
		if(s > 0)
			salary = s;
	}
	
	public void setSalary(double s, double b) {
		this.setSalary(s);
		if(b > 0)
			bonus = b;
	}
	
	public void setDepart(String d) {
		depart = d;
	}
	
	public void setId(int id) {
		empId = id;
	}
	
	public void printEmployee() {
		System.out.println("Employee ID is: " + empId);
		System.out.println("Employee name is: " + name);
		System.out.println("Employee department is: " + depart);
		System.out.println("Employee salary is: " + salary);
		System.out.println("Employee bonus is: " + bonus);
		System.out.println("Employee resident is: " + resident + "\n");
	}
}
