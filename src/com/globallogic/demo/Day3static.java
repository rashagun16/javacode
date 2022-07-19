package com.globallogic.demo;

public class Day3static {

	//Static --when you add the static keyword then variable will store in heap memory
	//variable--when you used the static with variable that means it is common to all

	//static used with method:
	//you can access the method with class name
  //there is not need for object creation

	//static block
	//static class --if you have the nested class
	           //clsss having the another class is called nested class
	 class Employee {

		int id;
		String name;
		static String cityName;

}
	 
	 //abstraction
	//Abstraction --it is concept or idea which needs to implements 

	//interface--it is used to perform the Abstraction in java
	    //it will have the abstract method only --that means we will have the concept only

	   //by default interface is abstract
	   //by default interface method are also abstract
	abstract interface Mobile
	{
		abstract public void calling();
		abstract public void sendSMS();
	}
	//calling and sendsms
	class Apple implements Mobile
	{

		//implement the 
	------------------------
	@Override
		public void sendSMS() {
			// TODO Auto-generated method stub
			System.out.println("send sms Apple");
		}
		
	}
	class Sumsung implements Mobile
	{

		//implement the unimplemented method
		@Override
		public void calling() {
			// TODO Auto-generated method stub
			System.out.println("calling Sumsung");
		}

		@Override
		public void sendSMS() {
			// TODO Auto-generated method stub
			System.out.println("send sms Sumsung");
		}
		
	}
	--------------------------
	public class MyInterface {
	 
		public static void main(String[] args) {
			
			Apple apple=new Apple();
			apple.calling();
			apple.sendSMS();
			
			//we can create object of interface and give the reference of any implemented class
			Mobile note=new Sumsung();
			note.calling();
			note.sendSMS();
			//you must give the implementation of class or method
			
			Mobile b=new  Mobile() {
				
				@Override
				public void sendSMS() {
					// TODO Auto-generated method stub
					
				}
		
	//abstract class : i can have the abstract and non abstract method in the abstract class
	//calling
	//sendsms()
	//brand ()  abstract
	abstract class ChinaMobile {
		public void calling() {
			System.out.println("calling ");
		}

		public void sendsms() {
			System.out.println("send sms");

		}

		abstract void brand();
	}
	//class will be always extends
	class Mircomax extends ChinaMobile {

		@Override
		void brand() {
			// TODO Auto-generated method stub
			System.out.println("
	}

	}

	public class AbstractClass {
	public static void main(String[] args) {
		Mircomax mircomax=new Mircomax();
		mircomax.brand();
		mircomax.calling();
		mircomax.sendsms();
		
	}
	}

	//encapsulation : it says there is a single unit and private propteries which can be access by class method only
	//fully encapsulated class
	public class MyEncapsulation {

		public MyEncapsulation(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}

		private String name;
		private int id;

		public void print() {
			System.out.println("name " + this.name);
			System.out.println("id " + this.id);
		}

	}
