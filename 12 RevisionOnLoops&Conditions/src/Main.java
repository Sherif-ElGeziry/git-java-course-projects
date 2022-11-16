import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int groupsNumber, passengersNumber, bagWeight;
		double excessPrice = 0;
		char passengerClass;
		
		System.out.println("Enter number of groups: ");
		groupsNumber = input.nextInt();
		
		for(int groupCounter = 1; groupCounter <= groupsNumber; groupCounter++) {
			System.out.println("Enter group " + groupCounter + " number of passengers: ");
			passengersNumber = input.nextInt();
			
			for(int passengerCounter = 1; passengerCounter <= passengersNumber; passengerCounter++) {
				System.out.println("Enter passener number " + passengerCounter + " class");
				passengerClass = input.next().charAt(0);
				
				switch(passengerClass) {
					case 'f':
					case 'F':	System.out.println("Enter bag weight");
								bagWeight = input.nextInt();
								if(bagWeight > 30)
									excessPrice = (bagWeight - 30) * 10;
								break;
					case 'b':
					case 'B':	System.out.println("Enter bag weight");
								bagWeight = input.nextInt();
								if(bagWeight > 25)
									excessPrice = (bagWeight - 25) * 10;
								break;
					case 'e':
					case 'E':	System.out.println("Enter bag weight");
								bagWeight = input.nextInt();
								if(bagWeight > 20)
									excessPrice = (bagWeight - 20) * 10;
								break;
					default: System.out.println("Invalid input");		
				}
				
				System.out.println("The extra bag price is:" + excessPrice);
				excessPrice = 0;
			}
		}
	}
}
