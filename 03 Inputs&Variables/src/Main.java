import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Below a program to add two numbers
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		System.out.printf("Sum is %d%n", sum);
		
		//below A program to calculate rectangle area
		int length, width, area;
		
		System.out.print("Enter length: ");
		length = input.nextInt();
		
		System.out.print("Enter width: ");
		width = input.nextInt();
		
		area = length * width;
		System.out.printf("Area is %d%n", area);
		
		//below a program to take user firstname and salary and calculate net salary
		String fname;
		float salary, netSalary;
		
		System.out.print("Enter your first name: ");
		fname = input.next();
		
		System.out.print("Enter your salary: ");
		salary = input.nextFloat();
		
		netSalary = salary -  salary * 0.10f;
		System.out.printf("Hello " + fname + " your net salary is: %f", netSalary);
	}

}
