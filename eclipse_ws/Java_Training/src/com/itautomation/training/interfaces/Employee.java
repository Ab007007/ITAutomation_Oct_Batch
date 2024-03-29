package com.itautomation.training.interfaces;

public class Employee extends Person implements LivingElements
{
	String employeeID;
	String employeePhone;
	
	@Override
	public void isLiving() {
		System.out.println("Yes Employee is a living element on Earth , and his max age is " + MAX_AGE);
		
	}
	
	@Override
	public void printInfo() {
		System.out.println("Employee Name " + this.name);
		System.out.println("Employee Address " + this.address);
		System.out.println("Employee ID " + this.employeeID);
		System.out.println("Employee Phone " + this.employeePhone);
		}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n\n ****From To String *******\nEmployee Name " + this.name + "\nEmployee Address " + this.address + "\nEmployee ID " + this.employeeID + "\nEmployee Phone " + this.employeePhone;
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Aravinda";
		e1.address = "India";
		e1.employeeID = "21299999sd";
		e1.employeePhone = "12121212";
		
		e1.isLiving();
		e1.printInfo();
		System.out.println(e1);
	}


}
