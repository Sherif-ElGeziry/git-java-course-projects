import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, z, total;
		double average;
		
		System.out.println("Enter first number: ");
		x = input.nextInt();
		System.out.println("Enter second number: ");
		y = input.nextInt();
		System.out.println("Enter third number: ");
		z = input.nextInt();
		
		total = sum(x, y, z);
		average = avr(x, y, z);
		display(total, average);

	}
	
	public static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public static double avr(int n1, int n2, int n3) {
		return sum(n1,n2,n3) / (double)3;
	}
	
	public static void display(int sum, double avr) {
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The average of the numbers is: " + avr);
	}
}
