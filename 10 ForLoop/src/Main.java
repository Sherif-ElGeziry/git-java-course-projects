import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		int sum = 0, num = 0;
		System.out.println("Enter 6 grades or -1 to exit");
		
		/*for(int count = 1; count <= 6 && num != -1; count++) {
			System.out.println("Enter grade of student: " + count);
			num = grade.nextInt();
			sum += num;
		
		if(count > 6)
			System.out.println("The average grade is: " + sum / 6);
		}*/
		
		//test programs
		for(int i = 0; i <= 10; i++)
			System.out.print(i + "\t");
		System.out.println();

		for(int i = 10; i >= 0; i--)
			System.out.print(i + "\t");
		System.out.println();
		

		for(int i = 2; i <= 20; i += 2)
			System.out.print(i + "\t");
		System.out.println();
		
		//Enter 10 numbers and calc sum of even and sum of odd
		/*int number, sumEven = 0, sumOdd = 0;
		for(int i=1; i<=10; i++) {
			System.out.println("Enter number: " + i);
			number = grade.nextInt();
			
			if(number % 2 == 0)
				sumEven += number;
			else
				sumOdd += number;
		}
		

		System.out.println("Even total is: " + sumEven);
		System.out.println("Odd total is: " + sumOdd);*/
		
		//Nested loop
		for(int j=0; j <5; j++) {
			System.out.println("Enter number to get its factorial");
			int fac = grade.nextInt(), fact = 1, total;
			
			for(int i=1; i <= fac; i++) {
				fact *= i; 
			}
			
			System.out.println("Result of factorial"+ fac + " is: " + fact);
		}
	}
	
}