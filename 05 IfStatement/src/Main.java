import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's grade: ");
		int grade = input.nextInt();
		
		if(grade >= 60) {//Can omit parantheses only if we have one statemet after
			System.out.println("Congratulations you passed.");	
			System.out.println("Go to next level.");
		}//One way if statement
		
		//Check if the number is even or odd
		/*if(grade % 2 == 0)
			System.out.println("The grade is even number.");
		else
			System.out.println("The grade is odd number.");*/
		
		//Check if positive number check if even or odd (Nested if statement)
		/*if(grade > 0) {
			System.out.println("The grade is positive number.");
			if(grade % 2 == 0)
				System.out.println("The grade is even number.");
			else
				System.out.println("The grade is odd number.");
		}
		else if(grade < 0)
			System.out.println("The grade is negative number.");*/
		
		//If else If statements
		/*System.out.print("Enter the first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter the first number: ");
		int num2 = input.nextInt();
		
		if(num1 == num2)
			System.out.print("The two numbers are equal");
		else if(num1 > num2)
			System.out.print("First number is greater");
		else
			System.out.print("Second number is greater");*/
		
		if(grade >= 90) 
			System.out.println("You got A");
		else if(grade >= 80)
			System.out.println("You got B");
		else if(grade >= 70)
			System.out.println("You got C");
		else if(grade >= 60)
			System.out.println("You got D");
		else
			System.out.println("You got F");
		
		if(grade >= 60 && grade <= 100)
			System.out.println("You passed.");
		else if(grade < 60 || grade > 0)
			System.out.println("You failed");
			
			
	}

}
