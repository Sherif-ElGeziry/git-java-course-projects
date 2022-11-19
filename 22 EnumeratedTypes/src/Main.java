import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Enum testing
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
		System.out.println();

		// Exception handling
		Scanner s = new Scanner(System.in);
		try {
			// int x = 10, y = 0;
			System.out.println("Enter x");
			int x = s.nextInt();

			System.out.println("Enter y");
			int y = s.nextInt();

			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("Error, Division by zero is not allowed");
		} catch (InputMismatchException e) {
			System.out.println("Error, Enter int numbers only");
		} catch (Exception e) {
			// TODO: handle any unexpected exceptions
			System.out.println(e.getMessage());
		}

		System.out.println("The program continues");
	}

}
