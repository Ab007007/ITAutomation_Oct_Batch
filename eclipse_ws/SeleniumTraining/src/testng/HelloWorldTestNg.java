package testng;

import org.testng.annotations.Test;

public class HelloWorldTestNg 
{
  @Test
  public void lauch()
  {
	  System.out.println("-- Launching Application ---");
  }
  
  @Test
  public void login()
  {
	  System.out.println("-- login Application ---");
  }
  
  @Test
  public void createCustomer()
  {
	  System.out.println("-- create customer ---");
  }
  @Test
  public void logout()
  {
	  System.out.println("-- logout Application ---");
  }
}
