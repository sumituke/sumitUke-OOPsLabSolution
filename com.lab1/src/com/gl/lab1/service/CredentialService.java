package com.gl.lab1.service;

import java.util.Random;

import com.gl.lab1.Employee;

public class CredentialService {

	public char[] generatePassword(Employee employee) {
		
		String pattern= "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*()1234567890abcdefghijklmnopqrstuvwxyz";
		int length = 8;
		Random random = new Random();
		char[] password = new char[length];
		
		for(int i=0;i<length;i++) {
			password[i] = pattern.charAt(random.nextInt(pattern.length()));
		}
		employee.setPassword(password);
		return password;
	}
	
	public String generateEmailAddress(Employee employee) {
		
		String company= ".greatlearning.com";		
		String email = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+company;
		employee.setEmail(email);
		return email;
	}
	
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear "+ employee.getFirstName()+" your generated credenials are as follows: ");		
		System.out.println("email: "+employee.getEmail());
		System.out.println("Password: "+ employee.getPassword().toString());
		
	}
}
