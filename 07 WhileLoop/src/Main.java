import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		int count = 1, sum = 0;
		
		while(count <= 6) {
			System.out.println("Enter grade of student: " + count);
			int num = grade.nextInt();
			sum += num;
			count++;
		}
		
		System.out.println("The average grade is: " + sum / 6);
	}

}
