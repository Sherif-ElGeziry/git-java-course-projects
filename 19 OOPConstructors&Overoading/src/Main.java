
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
		
		Employee e3 = new Employee(42, "Sherif");
		e3.printEmployee();
		Employee e4 = new Employee(52, "Sherif", true);
		e4.printEmployee();
		
		//System.out.println(e2.getNoOfObjects());
		//System.out.println(e4.getNoOfObjects());
		System.out.println(Employee.getNoOfObjects());
		
		//Calc program
		System.out.println(Calc.add(20, 30));
		System.out.println(Calc.subtract(20, 30));
		System.out.println(Calc.multiply(20, 30));
	}

}
