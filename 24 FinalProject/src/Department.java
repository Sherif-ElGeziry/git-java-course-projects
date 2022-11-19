import java.util.ArrayList;

public class Department {
	int depNumber;
	String depName;
	ArrayList<Employee> employeeList;

	public Department() {

	}

	public Department(int depNumber, String depName) {
		super();
		this.depNumber = depNumber;
		this.depName = depName;
		this.employeeList = new ArrayList<Employee>();
	}

	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public int getDepNumber() {
		return depNumber;
	}

	public String getDepName() {
		return depName;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(int index) {
		employeeList.remove(index);
	}

	public int getEmployeeCount() {
		return employeeList.size();
	}

	public void printBasicData() {
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getName() + " " + employeeList.get(i).getGender() + " "
					+ employeeList.get(i).getSsn());
		}
	}

	public void displayAllDetails() {
		for (int i = 0; i < employeeList.size(); i++) {
			// Error employeeList of type Employee have no access to displayAllDetails
			// method
			// employeeList.get(i).displayAllDetails();

			// Solution below needs casting
			if (employeeList.get(i) instanceof SalariedEmployee)
				((SalariedEmployee) employeeList.get(i)).displayAllDetails();
			else if (employeeList.get(i) instanceof HourlyEmployee)
				((HourlyEmployee) employeeList.get(i)).displayAllDetails();
			else if (employeeList.get(i) instanceof CommissionEmployee)
				((CommissionEmployee) employeeList.get(i)).displayAllDetails();
			System.out.println();
		}
	}
}
