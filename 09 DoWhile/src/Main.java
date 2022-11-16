import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		int count = 1, sum = 0, num = 0;
		System.out.println("Enter 6 grades or -1 to exit");
		
		do{
			System.out.println("Enter grade of student: " + count);
			num = grade.nextInt();
			sum += num;
			count++;
		} while (count <= 6 && num != -1);
		
		if(count > 6)
			System.out.println("The average grade is: " + sum / 6);
		
		//Another program
		int num1 = 20, num2 = 10, choice;
		do {
			System.out.println("Enter one of the below choices:");
			System.out.println("1)Add two numbers");
			System.out.println("2)Subtract two numbers");
			System.out.println("3)Divide two numbers");
			System.out.println("0)Exit");
			
			choice = grade.nextInt();
					
			switch(choice)
			{
				case 1: 	System.out.println(num1 + num2);
							break;
							
				case 2: 	System.out.println(num1 - num2);
							break;
							
				case 3: 	System.out.println(num1 / num2);
							break;
							
				case 0: 	System.out.println("Good Bye");
							break;
							
				default: 	System.out.println("Invalid Input");
			}
		}while(choice != 0);
	}

}