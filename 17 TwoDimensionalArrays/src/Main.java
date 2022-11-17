import java.util.Scanner;

public class Main {

	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [][] marks = new int[20][15];
		System.out.println("The number of rows is: " + marks.length);
		System.out.println("The number of columns is: " + marks[0].length);
		
		int [][] marks2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		System.out.println("The number of rows is: " + marks2.length);
		System.out.println("The number of columns is: " + marks2[0].length);
		
		//A prgram to replaca all columns of raw number two with the value of 7
		for(int i = 0; i < marks2[2].length; i++) {
			marks[2][i] = 7;
		}
		
		for(int i = 0; i < marks2[2].length; i++) {
			System.out.println(marks[2][i]);
		}
	}

}
