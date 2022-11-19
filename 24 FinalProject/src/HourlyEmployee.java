
public class HourlyEmployee extends Employee implements Displeyable {
	double hourRate;
	int numOfHours;

	public HourlyEmployee() {

	}

	public HourlyEmployee(String name, int ssn, String address, Gender gender, double hourRate, int numOfHours) {
		super(name, ssn, address, gender);
		this.hourRate = hourRate;
		this.numOfHours = numOfHours;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}

	public double getHourRate() {
		return hourRate;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	@Override
	public double earnings() {
		return hourRate * numOfHours;
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
		return "HourlyEmployee [hourRate=" + hourRate + ", numOfHours=" + numOfHours + "]";
	}

}
