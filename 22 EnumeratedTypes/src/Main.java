
public class Main {

	public static void main(String[] args) {
		Course c1 = Course.Maths;
		Course c2 = Course.Maths;
		Course c3 = Course.Database;

		System.out.println(c1.toString());
		System.out.println(c1.ordinal());
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c3));
		System.out.println(c3.compareTo(c2));
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
