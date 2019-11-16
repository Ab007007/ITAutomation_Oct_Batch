package testng;

import org.testng.annotations.Test;

public class PriorityInTests 
{
  @Test(priority = 0)
  public void lauch()
  {
	  System.out.println("-- Launching Application ---");
  }
  
  @Test(priority = 1)
  public void login()
  {
	  System.out.println("-- login Application ---");
  }
  
  @Test(priority = 2)
  public void createCustomer()
  {
	  System.out.println("-- create customer ---");
  }
  @Test(priority = 3)
  public void logout()
  {
	  System.out.println("-- logout Application ---");
  }
}
