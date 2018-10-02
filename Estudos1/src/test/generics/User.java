package test.generics;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String password;

	public User(String firstName, String lastName, int age, String password) {
		this.firstName = firstName;
		this.setLasttName(lastName);
		this.age = age;
		this.password = password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String fn) {
		this.firstName = fn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLasttName(String lasttName) {
		this.lastName = lasttName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
