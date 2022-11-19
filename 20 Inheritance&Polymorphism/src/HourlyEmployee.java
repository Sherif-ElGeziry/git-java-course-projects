
public class HourlyEmployee extends Employee{
	private double workingHours;
	private double hoursRate;
	
	public HourlyEmployee() {
		
	}
	
	public HourlyEmployee(String n, int a, String add, String nat, double sal,
			String ran, String j, double wor, double h) {
		super(n, a, add, nat, sal, ran, j);
		workingHours = wor;
		hoursRate = h;
	}
	
	@Override
	public double getSalary() {
		//We must now create this function as it is abstract in base class or we get error
		return workingHours * hoursRate; 
	}
	
	public void setWorkingHours(double wor) {
		workingHours = wor;
	}
	
	public void setHoursRate(double h) {
		hoursRate = h;
	}
	
	public double getWorkingHours() {
		return workingHours;
	}
	
	public double getHoursRate() {
		return hoursRate;
	}
}
