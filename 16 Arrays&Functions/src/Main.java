import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int size = input.nextInt();
		int[] ids = new int[size];
		
		fillArray(ids);
		printArray(ids);
		
		System.out.println("Enter target for ID search: ");
		int target = input.nextInt();
		
		int returnedVal = searchArray(ids, target);
		if(returnedVal >= 0)
			System.out.println("Target found");
		else
			System.out.println("Target not found");
		
	}

	public static void fillArray(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println("Enter ID number: " + (i + 1));
			list[i] = input.nextInt();
		}
	}
	
	public static void printArray(int[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	public static int searchArray(int[] list, int id) {
		int i = 0;
		for(; i < list.length; i++) {
			if(list[i] == id) {
				return i;
			}
		}
		return -1;
	}
}
