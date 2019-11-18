package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GlobalDataDemo2 {

	@Parameters("url")
	@Test
	public void test1(String url)
	{
		System.out.println("Dummy test---2 with url --->" + url);
	}
}
