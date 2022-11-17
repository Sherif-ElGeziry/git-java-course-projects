
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.printEmployee();
		
		Employee e2 = new Employee(69, "Sherif", "Computer", 15000, 5000, true);
		e2.printEmployee();
		e2.setSalary(17000, 7000);
		e2.setDepart("Sports");
		e2.setId(66);
		e2.printEmployee();
	}

}
