
public class CellPhone {
	private String manufact;
	private String model;
	private double retailPrice;
	
	public void setManufact(String m) {
		if(m.equals("Samsung") || m.equals("Motorolla") || m.equals("Nokia"))
			manufact = m;
		else
			System.out.println("Invalid manufact!");
	}
	
	public void setModel(String m) {
			model = m;
	}
	
	public void setRetailPrice(double r) {
		if(r > 0)
			retailPrice = r;
		else
			System.out.println("Invalid price!");
	}
	
	public String getManufact() {
		return manufact;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getRetailPrice() {
		return retailPrice;
	}
}
