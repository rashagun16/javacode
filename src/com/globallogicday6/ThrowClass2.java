package com.globallogicday6;

public class ThrowClass2 {
	public static void main(String[] args) {
		fun1();
	}
	public static void fun1(){
		int i=5;
		int j=3;
		int c=i/j;
		System.out.println(c);
		try{
			fun2();
		} catch(Exception e){
			System.out.println(e.getMessage() + " occured");
		}
	}
	public static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}

}
