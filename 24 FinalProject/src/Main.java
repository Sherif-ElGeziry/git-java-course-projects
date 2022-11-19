
public class Main {

	public static void main(String[] args) {
		Department departmentOne = new Department(1, "Information systems");

		SalariedEmployee salariedEmployeeOne = new SalariedEmployee("Amr", 100, "Cairo", Gender.Male, 20000, 7000,
				1000);
		departmentOne.addEmployee(salariedEmployeeOne);

		HourlyEmployee hourlyEmployeeOne = new HourlyEmployee("Mahmoud", 23, "PortSaid", Gender.Male, 150, 100);
		departmentOne.addEmployee(hourlyEmployeeOne);

		CommissionEmployee commissionEmployeeOne = new CommissionEmployee("Rana", 14, "Alexandria", Gender.Female,
				100000, 0.2);
		departmentOne.addEmployee(commissionEmployeeOne);

		System.out.println(departmentOne.getEmployeeCount());

		departmentOne.printBasicData();
		System.out.println();

		departmentOne.displayAllDetails();
	}

}
