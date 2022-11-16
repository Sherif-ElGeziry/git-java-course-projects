import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*System.out.println(Math.sqrt(25));

		double i = 32;
		System.out.println(Math.sqrt(i));*/
		
		System.out.println("Start of the project.");
		drawLine();
		System.out.println("Welcome to the first part in functions.");
		drawLine();

	}
	
	public static void drawLine() {
		for(int i = 0; i < 10; i++)
			System.out.print("*");
		System.out.println();
	}

}
