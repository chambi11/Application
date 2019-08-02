package jsontest;

public enum PhoneNumberTypeEnum {

	MOBILE("mobile");
	
	public final String value;
	
	private PhoneNumberTypeEnum(String str) {
		this.value = str;
	}
	
}
