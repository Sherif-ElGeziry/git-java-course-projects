
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
}
