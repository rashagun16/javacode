//Java program to calculate a Factorial of a number
package com.globallogic.demo;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		
		System.out.print("Enter the  number");
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		
		int fact=1;
		
		if((num==0)||(num==1)) {
			System.out.println("1");
		}
		else {
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
			
			
			System.out.println(fact);
		}
  }
}
