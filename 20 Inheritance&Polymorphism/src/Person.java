
public class Person {
	private String name;
	private int age;
	private String address;
	private String nationality;
	
	public Person() {
		System.out.println("I am the base class constructor");
	}
	
	public Person(String n, int a, String add, String nat) {
		name = n;
		age = a;
		address = add;
		nationality = nat;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setAddress(String add) {
		address = add;
	}
	
	public void setNationality(String nat) {
		nationality = nat;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNationality() {
		return nationality;
	}
}
