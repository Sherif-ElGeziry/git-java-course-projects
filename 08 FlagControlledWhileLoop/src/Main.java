import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double x, sum = 0;
		boolean nonNegative = true;
		System.out.println("Enter only positive number to sum");
		
		while(nonNegative) {
			System.out.println("Enter Number: ");
			x = reader.nextInt();
			if(x > 0)
				sum += x;
			else
				nonNegative = false;
		}
		
		System.out.println("The sum is: " + sum);
	}

}
