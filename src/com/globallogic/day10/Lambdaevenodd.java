package com.globallogic.day10;
// create a lambda to find even odd number
interface EvenOdd{
	public void check(int a);
}
public class Lambdaevenodd {
	public static void main(String[] args) {
		EvenOdd evenodd=(a)->{
			if(a%2==0)
				System.out.println("Even");
			else 
				System.out.println("odd");
		};
		evenodd.check(10);
		evenodd.check(11);
		
	}

}
