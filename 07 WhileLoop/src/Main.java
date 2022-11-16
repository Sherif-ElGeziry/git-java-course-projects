import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		int count = 1, sum = 0, num = 0;
		System.out.println("Enter 6 grades or -1 to exit");
		
		while(count <= 6 && num != -1) {
			System.out.println("Enter grade of student: " + count);
			num = grade.nextInt();
			sum += num;
			count++;
		}
		if(count > 6)
			System.out.println("The average grade is: " + sum / 6);
	}

}
