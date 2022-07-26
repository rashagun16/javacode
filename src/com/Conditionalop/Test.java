package com.Conditionalop;

class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
	String A = "Sumant";
    public Derived() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
	String A = "Shagun";
    public DeriDerived() {
    	 System.out.println(super.A);
        System.out.println("DeriDerived");
    }
}

public class Test {
    public static void main(String[] args) {
       DeriDerived b = new DeriDerived();
       System.out.println(b);
    }
}



// constructor is called at the time of object creation
