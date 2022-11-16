import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter student grade: ");
		char grade = reader.next().charAt(0);
		String message;
		
		switch(grade)
		{
		case 'A': message = "Excellent";
				break;
		case 'B': message = "Excellent";
				break;
		case 'C': message = "Excellent";
				break;
		case 'D': message = "Excellent";
				break;
		case 'F': message = "Excellent";
				break;
		default: message = "Invalid input!";
		}
		
		System.out.println(message);
		
		//Another program
		int num1, num2;
		
		System.out.println("Enter one of the below choices:");
		System.out.println("1)Add two numbers");
		System.out.println("2)Subtract two numbers");
		System.out.println("3)Get the square of a number");
		
		int choice = reader.nextInt();
				
		switch(choice)
		{
			case 1: 	System.out.println("Enter first number: ");
						num1 = reader.nextInt();
						System.out.println("Enter second number: ");
						num2 = reader.nextInt();
						System.out.println(num1 + num2);
						break;
						
			case 2: 	System.out.println("Enter first number: ");
						num1 = reader.nextInt();
						System.out.println("Enter second number: ");
						num2 = reader.nextInt();
						System.out.println(num1 - num2);
						break;
						
			case 3: 	System.out.println("Enter positivenumber: ");
						num1 = reader.nextInt();
						if(num1 > 0)
						System.out.println(num1 * num1);
						break;
						
			default: 	message = "Invalid input!";
		}
		
		//Another program
		System.out.print("Enter letter: ");
		char ch = reader.next().charAt(0);
		String message2;
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': 	System.out.println("This is Vowel letter.");
				  	break;
		default: 	System.out.println("This is Normal letter.");;//Can be omitted
		}
	}

}
