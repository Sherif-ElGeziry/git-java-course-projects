
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		//System.out.println("You created a new Rectangle Class");
		length = 10;
		width = 15;
	}
	
	//Constructor overloading
	public Rectangle(double l, double w) {
		//System.out.println("You created a new Rectangle Class");
		setLength(l);
		setWidth(w);
	}
	
	public Rectangle(Rectangle room) {
		length = room.getLength();
		width = room.getWidth();
	}
	
	public void modifyObject(Rectangle r) {
		length = 42;
		width = 35;
	}
	
	public Rectangle add(Rectangle room) {
		Rectangle result = new Rectangle();
		result.length = this.length + room.length;
		result.width = this.width + room.width;
		return result;
	}
	
	public boolean isEqual(Rectangle room) {
		if(this.getLength() == room.getLength() && this.getWidth() == room.getWidth())
			return true;
		else
			return false;
	}
	
	public void setLength(double l) {
		if(l > 0)
		length = l;
	}
	
	public void setWidth(double w) {
		if(w > 0)
		width = w;
	}
	
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
}
