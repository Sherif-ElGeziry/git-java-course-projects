
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.getLength() + "\t" + r1.getWidth() + "\t" + r1.getArea() + "\n");
		r1.setLength(7);
		r1.setWidth(12.5);
		
		Rectangle r2 = new Rectangle(20, 30.2); 
		System.out.println(r2.getLength() + "\t" + r2.getWidth() + "\t" + r2.getArea() + "\n");
		
		Car c1 = new Car();
		c1.setMake("Toyota");
		c1.setYearModel(2021);
		
		/*	Can create objects as you like
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
		
		//Testing passing of arguments
		double roomLength = 50;
		r1.setLength(roomLength);
		r1.setLength(30);
		System.out.println("\n" + roomLength);
		
		r1.modifyObject(r2);
		r2.modifyObject(r1);
		System.out.println("\n" + r1.getLength() + "\t" + r1.getWidth() + "\t" + r1.getArea());
		System.out.println(r2.getLength() + "\t" + r2.getWidth() + "\t" + r2.getArea() + "\n");
		
		System.out.println(r1.add(r2).getLength() + "\t" + r1.add(r2).getWidth() + "\t" + r1.add(r2).getArea());
	}

}
