package com.itautomation.training.accessmodifiers;

public class Employee extends Person
{
	String employeeID;
	String employeeEmail;
	String officeAddress;
	/*
	 * 
	 * System.out.println("Employee Name " + this.name + "\n Employee Res-Address "+ this.residentialAddress 
				+ "\n Employee Personal Phone number " + this.phoneNumber + "\n Employee ID" + this.employeeID
				+ "\n Empmloyee Email " + this.employeeEmail + "\nOffice address " + this.officeAddress);

	 */
	public void printEmployeeInformation()
	{
		personalInformationOFPerson();
		System.out.println("Employee ID" + this.employeeID
				+ "\n Empmloyee Email " + this.employeeEmail + "\nOffice address " + this.officeAddress);
	}
	
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "employee1";
		e1.phoneNumber = 1234;
		e1.residentialAddress = "Bangalore";
		e1.employeeEmail = "employee123@ibm.com";
		e1.employeeID = "empibm1212";
		e1.officeAddress = "Pune";
		e1.printEmployeeInformation();
	}
	
}
