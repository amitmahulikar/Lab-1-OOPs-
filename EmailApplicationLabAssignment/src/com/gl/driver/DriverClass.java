package com.gl.driver;
import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;


public class DriverClass {
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("1. Technical Department");
		System.out.println("2. Admin Department");
		System.out.println("3. HR Department");
		System.out.println("3. Legal Department");
		
		
		Employee employee1 = new Employee("ABC", "XYZ");
		
		
		
		CredentialService cService = new CredentialService();
		
		int choice;
		System.out.println("Please select your option 1-4");
		
		choice = scan1.nextInt();
		String generatedEmail;
		char[] generatedPswd;
		
		if(choice ==1)
		{
			
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(), employee1.getLastName().toLowerCase(), "Technical");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPswd);
			
		}
		else if(choice ==2)
		{
					generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(), employee1.getLastName().toLowerCase(), "HR");
					generatedPswd = cService.generatePassword();
					cService.displayCredentials(employee1, generatedEmail, generatedPswd);
		}
		else if(choice ==3)
		{
			generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(), employee1.getLastName().toLowerCase(), "Legal");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEmail, generatedPswd);
}
		
	    else if(choice ==4) 
	{
		generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(), employee1.getLastName().toLowerCase(), "Admin");
		generatedPswd = cService.generatePassword();
		cService.displayCredentials(employee1, generatedEmail, generatedPswd);
	}

} 
	}
