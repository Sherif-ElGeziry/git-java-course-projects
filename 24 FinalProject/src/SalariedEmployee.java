
public class SalariedEmployee extends Employee implements Displeyable {
	// double salary, bonus, deductions //Not best for readability
	double salary;
	double bonus;
	double deductions;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String name, int ssn, String address, Gender gender, double salary, double bonus,
			double deductions) {
		super(name, ssn, address, gender);
		this.salary = salary;
		this.bonus = bonus;
		this.deductions = deductions;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public double getDeductions() {
		return deductions;
	}

	@Override
	public double earnings() {
		return salary + bonus - deductions;
	}

	@Override
	public void displayAllDetails() {
		System.out.println(super.toString());
		System.out.println(toString());
		displayEarnings();
	}

	@Override
	public void displayEarnings() {
		System.out.println("Earnings=" + earnings());
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + "]";
	}

}
