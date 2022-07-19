package com.globallogicday6;

public class Trycatchegs {
	static void main() {
		int i=5;
		int j=0;
		int c=i/j;
		System.out.println("check");
	} catch(ArithmeticException ex) {
		System.out.println(ex.getMessage() +" occured plz check any arithmetic error");
	} catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex.getMessage()+ " Occured check index under limits");
	}

}
