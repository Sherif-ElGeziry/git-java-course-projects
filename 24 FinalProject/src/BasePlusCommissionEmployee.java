
public class BasePlusCommissionEmployee extends CommissionEmployee {
	double base;

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	@Override
	public double earnings() {
		return base + super.earnings();
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
		return "BasePlusCommissionEmployee [base=" + base + "]";
	}

}
