package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class TestNGIgnoreDemo {

	@Test(enabled=false)
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
	}

}
