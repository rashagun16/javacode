package com.globallogicday6;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int i=6;
			int j=0;
			int c=i/j;
			System.out.println(c);
	}
		catch(ArithmeticException exc) {
			System.out.println(exc.getMessage()+ " occured Please check your code");
		}
		}
		

}
