
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Sherif", 28, "Alex", "Egypt", 5, "SE", 3.67);
		System.out.println(s1.getName());
		System.out.println(s1.getGpa());
		
		Student s2 = new Student();
		
		SalariedEmployee se1 = new SalariedEmployee("Sherif", 28, "Alex", "Egypt", 
				15000, "Manager", "Engineer", 5000, 1000);
		System.out.println("\n" + se1.getSalary() + "\n");
		
		//This line cant work anymore as I defined the class as abstract
		//Employee e1 = new Employee("Sherif", 28, "Alex", "Egypt", 15000, "Manager", "Engineer");
		
		//can only assign subclass to e1 now
		Employee e1 = new SalariedEmployee("Sherif", 28, "Alex", "Egypt", 
				15000, "Manager", "Engineer", 5000, 1000);
		e1.printAllDetails();
		System.out.println();
		
		Employee e2 = new SalariedEmployee("Sherif", 28, "Alex", "Egypt", 
				15000, "Manager", "Engineer", 5000, 1000);
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
//		e2.specialFun();//Undefined as specialFunction defined in sub class only not in base class
	}

}
