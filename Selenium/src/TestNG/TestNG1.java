package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG1 {
	@Test(groups="Regression")
	public void first() 
	{
		System.out.println("Executing First testcase from TestNG1 Class");
	}
	@Test(groups="Regression")
	public void test1()
	{
		System.out.println("Executing testcase1 from TestNG1 Class");
	}
	@Test(groups="Regression")
	public void test2()
	{
		System.out.println("Executing testcase2 from TestNG1 Class");
	}
	@Test(groups="Regression")
	public void test3()
	{
		System.out.println("Executing testcase3 from TestNG1 Class");
	}
	@Test(groups="BAT")
	public void test4()
	{
		System.out.println("Executing testcase4 from TestNG1 Class");
	}
	@Test(groups="BAT")
	public void test5()
	{
		System.out.println("Executing testcase5 from TestNG1 Class");
	}
	@Test(groups="BAT")
	public void test6()
	{
		System.out.println("Executing testcase6 from TestNG1 Class");
	}
	@Test(groups="BAT")
	public void test7()
	{
		System.out.println("Executing testcase7 from TestNG1 Class");
	}
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Executing BeforeTest from TestNG1 Class ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executing AfterTest from TestNG1 Class ");
  }

}
