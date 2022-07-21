package com.globallogicday6;

public class ThrowClass {
	public static void main(String[]args) {
		fun1();
	}
	public static void fun1() {
		int i=6;
		int j=4;
		int c=i/j;
		System.out.println(c);
		boolean isDanger= true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}
}
