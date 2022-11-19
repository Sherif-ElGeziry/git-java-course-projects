import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sherif");
		list.add("Hussein");
		list.add("Moustafa");

		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));

		list.add(1, "Ali");
		System.out.println(list);
		list.set(2, "Marwan");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
	}

}
