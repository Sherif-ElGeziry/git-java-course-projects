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
		
		//Another game program added
		nonNegative = true;
		int rand = (int)(Math.random() * 100);
		System.out.println(rand);
		while(nonNegative) {
			System.out.println("Enter your guess: ");
			x = reader.nextInt();
			if(x > rand)
				System.out.println("You chose bigger number try again.");
			else if(x < rand)
				System.out.println("You chose smaller number try again.");
			else {
				nonNegative = false;
				System.out.println("You win!!");
			}
		}
	}

}
