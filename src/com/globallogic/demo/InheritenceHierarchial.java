
	// Herarichal
package com.globallogic.demo;

	class Parent{
	     public void Scold() {
	        System.out.println("Scolding");
	    }
	}


	class Child1 extends Parent{
	     public void Game() {
	    	 super.Scold();
	        System.out.println("Gaming");
	    }
	}

	class Child2 extends Parent{
	     public void study() {
	    	super.Scold();
	        System.out.println("not studying");
	    }
	}

	public class InheritenceHierarchial {
		public static void main(String[] args) {
			
		       Child1 c1 = new Child1();
		       Child2 c2 =  new Child2();
		       c1.Game();
		       c2.study();
		}
	}
