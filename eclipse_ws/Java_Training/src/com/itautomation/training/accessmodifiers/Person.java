package com.itautomation.training.accessmodifiers;

public class Person 
{
	String name;
	String residentialAddress;
	int phoneNumber;

	public final void personalInformationOFPerson()
	{
		System.out.println("Person Name " + this.name + "\n Address "+ residentialAddress + "\n Phone number " + phoneNumber);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person Name " + this.name + "\n Address "+ residentialAddress + "\n Phone number " + phoneNumber;
	}

}
