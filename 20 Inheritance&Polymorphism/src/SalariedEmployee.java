
public class SalariedEmployee extends Employee{
	private double bonus;
	private double deductions;
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String n, int a, String add, String nat, double sal,
			String ran, String j, double b, double d) {
		super(n, a, add, nat, sal, ran, j);
		bonus = b;
		deductions = d;
	}
	
	@Override
	public double getSalary() {
		//salary can only be used if it if defined as protected in base class
		//Also we must now create this function as it is abstract in base class
		return salary + bonus - deductions; 
		
		//used super if salary is private and can't be accessed
		//return super.getSalary() + bonus - deductions; 
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
	
	public void setDeductions(double d) {
		deductions = d;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double getDeductions() {
		return deductions;
	}
	
	public void specialFun() {
		
	}
}
