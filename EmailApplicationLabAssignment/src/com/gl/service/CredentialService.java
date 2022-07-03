package com.gl.service;

import com.gl.model.Employee;
import java.util.Random;


public class CredentialService {
	public char[] generatePassword()
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*+?<>";
		
		String myData = capitalLetters + smallLetters + numbers + specialCharacters;
		myData.charAt(20);
		
		char[] password = new char[8];
		Random random = new Random();
		for(int i=0;i<8;i++);
		
		{
		password[i] = myData.charAt(random.nextInt(myData.length()));
		}
		
		return password;
		
		
		
	}
	public String generateEmail(String firstName,String lastName,String department)
	{
		String generatedEmail;
		generatedEmail= firstName+lastName+"."+department+"@abc.com";
		return generatedEmail;
	}
	public void displayCredentials(Employee employee, String eMailGen,char[] genpassword)
	{
		System.out.println("Hi"+employee.getFirstName());
		System.out.println("Your email is"+eMailGen);
		String genPsswd = null;
		System.out.println("Your Password is"+genpassword);
	}
}
