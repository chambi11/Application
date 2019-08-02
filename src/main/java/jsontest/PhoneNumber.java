package jsontest;

public class PhoneNumber {

	PhoneNumberTypeEnum type;
	String number ;

	public PhoneNumber(PhoneNumberTypeEnum type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	public PhoneNumberTypeEnum getType() {
		return type;
	}

	public void setType(PhoneNumberTypeEnum type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
