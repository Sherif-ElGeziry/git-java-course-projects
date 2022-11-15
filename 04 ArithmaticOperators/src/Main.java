
public class Main {

	public static void main(String[] args) {
		System.out.println(2+3 * 5); //Output 17
		System.out.println((2+3) * 5);// Output 25
		
		System.out.println(5 / 2);// 2 input int result int
		System.out.println(5.0 / 2);// input double and int output double
		
		int i = 9, j = 4;
		System.out.println((float)i / j); //used (float) called casting to change int to float
		i++;
		j++;
		
		System.out.println(i);//10
		System.out.println(j);//5

		System.out.println(i++);//10
		System.out.println(i);//11
		System.out.println(++j);//6
		
		i += 5;System.out.println(i);//16
		
	}

}
