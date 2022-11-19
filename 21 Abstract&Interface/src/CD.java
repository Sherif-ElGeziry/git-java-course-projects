
public class CD implements RetailItem, Displayable {
	double price;
	String title;
	String artist;

	public CD() {

	}

	public CD(double price, String title, String artist) {
		this.price = price;
		this.title = title;
		this.artist = artist;
	}

	public double getItemPrice() {
		return price;
	}

	public void display() {
		System.out.println(
				"Store name = " + storeName + "\nTitle = " + title + "\nPrice = " + price + "\nArtist = " + artist);
	}

	public void setTitle(String title) {
		this.title = title;
		// storeName = "ABC";//Error can't change storeName as it's final variable
	}

}
