package demo;

import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo() throws Exception	 {

		try {
			System.out.println("Hello World...!");
			int i = 1/0;	
			System.out.println("Completed");



		}
		catch(Exception exp) {
			System.out.println("I am inside catch block");
			System.out.println("Message is: " + exp.getMessage());
			System.out.println("Cause is: " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally block");
		}
	}
}
