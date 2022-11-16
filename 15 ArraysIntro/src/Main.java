import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = input.nextInt();
		double[] salaries = new double[size];
		//double[] sales = {12.34, 24.213, 12.43, 8.432};
		
		for(int i = 0; i < salaries.length; i++) {
			System.out.println("Enter the salary of employee number " + (i + 1));
			salaries[i] = input.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < salaries.length; i++) {
			sum += salaries[i];
		}
		
		System.out.println("The sum of the array is: " + sum);
		System.out.println("The averge of the array is: " + (sum / size));
	}

}
