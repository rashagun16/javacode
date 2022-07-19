//sum of n natural numbers
package com.Conditionalop;
import java.util.*;
public class Whileloop {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int sumtill= sc.nextInt();
		int i=0;
		int sum=0;
		while(i<=sumtill)
		 {
			sum=i+sum;
			i++;
		}
		System.out.println(sum);
		
	}
}
