package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GlobalDataDemo {

	@Parameters({"url"})
	@Test
	public void test(String url)
	{
		System.out.println("Dummy test with url " + url);
	}
}
