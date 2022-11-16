import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0, x;
		
		for(int i = 1; i <= 7; i++) {//i++ here makes counter continue even if else condition applied
			System.out.println("Enter number" + i);
			x = reader.nextInt();
			
			if(x > 0)
				sum += x;
			else
				//if I use break instead of continue I exit for loop entirely
				continue;
			
			//i++;
			//If i++ here instead and we go in else condition then counter doesn't increment this loop
		}
		
		System.out.println("The sum is:" + sum);
	}

}
