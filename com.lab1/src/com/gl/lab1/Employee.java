package com.gl.lab1;


public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private char[] password;
	
	public Employee(String firstName , String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName ;
		
		department = getDepartment();
		email = getEmail();
		password = getPassword();
		
		
	}
	
	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		
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
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
}
