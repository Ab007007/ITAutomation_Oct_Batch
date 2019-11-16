package testng;

import org.testng.annotations.Test;

public class DependsOnDemo 
{
  @Test
  public void launch()
  {
	  System.out.println("-- Launching Application ---");
  }
  
  @Test(dependsOnMethods = "launch")
  public void login()
  {
	  System.out.println("-- login Application ---");
  }
  
  @Test(dependsOnMethods = "login")
  public void createCustomer()
  {
	  System.out.println("-- create customer ---");
  }
  @Test(dependsOnMethods = "createCustomer")
  public void logout()
  {
	  System.out.println("-- logout Application ---");
  }
}
