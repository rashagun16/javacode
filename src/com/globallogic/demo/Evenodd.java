package com.globallogic.demo;
import java.util.*;
public class Evenodd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
