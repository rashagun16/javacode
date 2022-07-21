package com.globallogicday6;

public class Trycatchegs {
	static void main(String[]args) {
		try {

			int i=5;
			int j=0;
			int c=i/j;
			System.out.println("c");
		} catch(ArithmeticException ex) {
		System.out.println(ex.getMessage() +" occured plz check any arithmetic error");
		} catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex.getMessage()+ " Occured check index under limits of zero to size of array");
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage() + " occured check the code arguments");
		}
		System.out.println("it passed the error part");
	}
}
