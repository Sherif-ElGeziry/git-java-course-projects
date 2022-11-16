import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*System.out.println(Math.sqrt(25));

		double i = 32;
		System.out.println(Math.sqrt(i));*/
		
		System.out.println("Start of the project.");
		drawLine('*', 15);
		System.out.println("Welcome to the first part in functions.");
		drawLine('#', 30);

	}
	
	public static void drawLine(char ch, int length) {
		for(int i = 0; i < length; i++)
			System.out.print(ch);
		System.out.println();
	}

}
