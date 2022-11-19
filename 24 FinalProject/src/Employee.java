enum Gender {
	Male, Female
};

public abstract class Employee {
	String name;
	String address;
	int ssn;
	Gender gender;

	public Employee() {

	}

	public Employee(String name, int ssn, String address, Gender gender) {
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSsn() {
		return ssn;
	}

	public Gender getGender() {
		return gender;
	}

	public abstract double earnings();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", ssn=" + ssn + ", gender=" + gender + "]";
	}

}
