
public class Main {

	public static void main(String[] args) {
		Department departmentOne = new Department(1, "Information systems");

		SalariedEmployee salariedEmployeeOne = new SalariedEmployee("Amr", "Cairo", 100, Gender.Male, 20000, 7000,
				1000);
		departmentOne.addEmployee(salariedEmployeeOne);

		HourlyEmployee hourlyEmployeeOne = new HourlyEmployee("Mahmoud", "PortSaid", 23, Gender.Male, 150, 100);
		departmentOne.addEmployee(hourlyEmployeeOne);

		CommissionEmployee commissionEmployeeOne = new CommissionEmployee("Rana", "Alexandria", 14, Gender.Female,
				100000, 0.2);
		departmentOne.addEmployee(commissionEmployeeOne);

		System.out.println(departmentOne.getEmployeeCount());
		System.out.println();

		departmentOne.printBasicData();
		System.out.println();

		departmentOne.displayAllDetails();
	}

}
