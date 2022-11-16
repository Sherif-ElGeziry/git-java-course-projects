import java.util.Scanner;

public class Main {

	static int globalVar = 100;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int x, y, z, total;
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

		System.out.println(globalVar);
		int globalVar = 500;
		System.out.println(globalVar);*/
		//System.out.println(DisplayOutput. globalVar);
		
		//Overloading example
		int n1 = 20, n2 = 12, n5 = 30;
		char n3 = 'A', n4 = 'a';
		
		System.out.println(larger(n1, n2));
		System.out.println(larger(n3, n4));
		System.out.println(larger(n1, n2, n5));
	}
	
	public static int sum(int n1, int n2, int n3) {
		System.out.println(globalVar);
		return n1 + n2 + n3;
		
	}
	
	public static double avr(int n1, int n2, int n3) {
		System.out.println(globalVar);
		return sum(n1,n2,n3) / (double)3;
	}
	
	public static void display(int sum, double avr) {
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The average of the numbers is: " + avr);
	}
	
	public static int larger(int x, int y) {
		if(x > y)
			return x;
		else
			return y;
	}
	
	public static int larger(int x, int y, int z) {
		if(x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
	
	public static char larger(char x, char y) {
		if(x>y)
			return x;
		else
			return y;
	}
}
