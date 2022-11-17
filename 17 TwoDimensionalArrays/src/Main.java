import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	
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
		
		//New matrix project
		int[][] matrix = new int[5][3];
		fillArray(matrix);
		printArray(matrix);
		int total = sumArray(matrix);
		System.out.println("Sum is: " + total);
	}

	public static void fillArray(int[][] list) {
		System.out.println("Enter array data below");
		for(int row = 0; row < list.length; row++){
			for(int col = 0; col < list[0].length; col++) {
				System.out.println("Enter data of row #" + (row + 1) + " and column #" + (col + 1));
				list[row][col] = input.nextInt();
			}
		}
	}
	
	public static void printArray(int[][] list) {
		System.out.println("Array data will be printed below");
		for(int row = 0; row < list.length; row++){
			for(int col = 0; col < list[0].length; col++) {
				System.out.print(list[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int sumArray(int[][] list) {
		System.out.println("Sum of all elements will be printed below");
		int sum = 0;
		for(int row = 0; row < list.length; row++){
			for(int col = 0; col < list[0].length; col++) {
				sum += list[row][col];
			}
		}
		return sum;
	}
}
