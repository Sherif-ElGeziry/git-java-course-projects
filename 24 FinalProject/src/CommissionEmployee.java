
public class CommissionEmployee extends Employee implements Displeyable {
	double grossSales;
	double commissionRate;

	public CommissionEmployee() {

	}

	public CommissionEmployee(String name, String address, int ssn, Gender gender, double grossSales,
			double commissionRate) {
		super(name, address, ssn, gender);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	@Override
	public double earnings() {
		return grossSales * commissionRate;
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
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
	}

}
