
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setLength(7);
		r1.setWidth(12.5);
		
		/*	Can create objects as you like
		 	Rectangle r2 = new Rectangle();
			r2.setLength(13);
			r2.setWidth(15.6);
		 */
		
		Car c1 = new Car();
		c1.setMake("Toyota");
		c1.setYearModel(2021);
		
		/*
		 	Car c2 = new Car();
			c2.setMake("Toyota");
			c2.setYearModel(2021);
		 */
		
		CellPhone cp = new CellPhone();
		cp.setManufact("Samsung");
		cp.setModel("Note 9");
		cp.setRetailPrice(200);
		
		System.out.println("Rect class output:");
		System.out.println(r1.getLength() + "\t" + r1.getWidth() + "\t" + r1.getArea() + "\n");
		
		System.out.println("Car class output:");
		System.out.println(c1.getMake() + "\t" + c1.getYearModel() + "\n");
		
		System.out.println("Cell phone class output:");
		System.out.println(cp.getManufact() + "\t" + cp.getModel() + "\t" + cp.getRetailPrice());
	}

}
