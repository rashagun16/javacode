package com.Conditionalop;
class Automobile {
	  int a = 10;
	 protected void drive() {
    	System.out.println("Driving vehicle");
    }
}

class Car extends Automobile {
     @Override
      public void drive() {
    	 System.out.println(a);    }
}

public class ElectricCar extends Car {
    public final void drive() {
    super.drive();
    final int c=34;
  
    System.out.println("Driving electric car");
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        car.drive();
    }
}



/*
 * private - only insider the class it is declared
 * default -  only in same package
 * protected - same package and in different package by inheritance
 * public - accessible everywhere
 *
 * */

//awaaz nahi aari hai te    rijoin karlo