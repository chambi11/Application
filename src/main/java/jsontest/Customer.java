package jsontest;
import java.util.ArrayList;

public class Customer {

	String firstName;
	String lastName;
	int age;
	
	Address address ;
	ArrayList<PhoneNumber>phoneNumbers ;

	public Customer(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	public Customer(String firstName, String lastName, int age, Address address,
			ArrayList<PhoneNumber> phoneNumbers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	

	
}
