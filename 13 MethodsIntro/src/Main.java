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
		
		int x = 50, y = 30, total = 0;
		System.out.println(sum(x, y));
		total = sum(x, y);
		System.out.println(total);
		System.out.println(sum(x, y) * 5 / 3);
	
	}
	
	public static void drawLine(char ch, int length) {
		for(int i = 0; i < length; i++)
			System.out.print(ch);
		System.out.println();
	}
	
	public static int sum(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
		//return x + y (would be a shorter and faster approach
	}
}
