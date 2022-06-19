package com.gl.lab1.driver;

import java.util.Scanner;

import com.gl.lab1.Employee;
import com.gl.lab1.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName,lastName,department = null;
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		firstName =  sc.next();
		
		System.out.println("Please enter your last name");
		lastName =  sc.next();
		
		System.out.println("Please select your department:\n1. Technical\n2. Admin\n3. Legal\n4. Hr");
		int dept=sc.nextInt();
		switch (dept) {
		case 1:
			department = "tech";
			break;
			
		case 2:
			department = "admin";
			break;
		
		case 3:
			department = "legal";
			break;
		
		case 4:
			department = "hr";
			break;
			 
		}
		
		Employee emp = new Employee (firstName,lastName,department);
		CredentialService empcred= new CredentialService();
		empcred.generateEmailAddress(emp);
		empcred.generatePassword(emp);
		empcred.showCredentials(emp);
	}

}
