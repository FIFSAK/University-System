package problem2;

public class Person {
	public String name;
	public String address;
	
	public Person() {}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return name + " " + address;
	}
	
}
