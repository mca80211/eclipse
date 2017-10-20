package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class TestNG {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Executing BeforeClass annotation");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Executing BeforeSuite annotation");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Executing BeforeTest annotation");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Executing BeforeMethod annotation");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("Executing AfterClass annotation");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Executing AfterSuite annotation");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Executing AfterTest annotation");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Executing AfterMethod annotation");
	}
	@Test(groups="SMOKE")
	public void test1()
	{
		System.out.println("Executing testcase1");
	}
	@Test(groups="SMOKE")
	public void test2()
	{
		System.out.println("Executing testcase2");
	}
	@Test(groups="SMOKE")
	public void test3()
	{
		System.out.println("Executing testcase3");
	}
	@Test(groups="SMOKE")
	public void test4()
	{
		System.out.println("Executing testcase4");
	}
	@Test(groups="SMOKE")
	public void test5()
	{
		System.out.println("Executing testcase5");
	}
	@Test(groups="SMOKE")
	public void test6()
	{
		System.out.println("Executing testcase6");
	}
	@Test(groups="SMOKE")
	public void test7()
	{
		System.out.println("Executing testcase7");
	}
}
