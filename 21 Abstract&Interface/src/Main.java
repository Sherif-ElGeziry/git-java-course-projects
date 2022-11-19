
public class Main {

	public static void main(String[] args) {
		// RetailItem r1 = new RetailItem(); // Error can't be applied

		CD r2 = new CD();
		r2.getItemPrice();
		r2.setTitle("Title");

		RetailItem r3 = new CD();
		r3.getItemPrice();// can access getItem as it is mentioned in RetailItem
		// r3.setTitle("Title");//Error as r3 variable interface is RetailItem can't
		// access methods of class CD

		Displayable d = new CD();
		d.display();

	}

}
