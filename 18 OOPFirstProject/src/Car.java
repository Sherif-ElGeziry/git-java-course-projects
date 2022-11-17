
public class Car {
	private String make;
	private int yearModel;
	
	public void setMake(String m) {
		if(m.equals("Toyota") || m.equals("Chevrolet") || m.equals("Mitsubishi"))
		make = m;
		else
			System.out.println("Invalid Maker!");
	}
	
	public void setYearModel(int year) {
		if(year > 2010)
			yearModel = year;
		else
			System.out.println("Invalid model!");
			
	}
	
	public String getMake() {
		return make;
	}
	
	public int getYearModel() {
		return yearModel;
	}
}
