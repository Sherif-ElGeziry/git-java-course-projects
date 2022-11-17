
public class Rectangle {
	private double length;
	private double width;
	
	public void setLength(double l) {
		if(length > 0)
		length = l;
	}
	
	public void setWidth(double w) {
		if(width > 0)
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
