package com.globallogic.day5;
//cteate an array with input from user and search a number in the array and print the index

import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int [] myarray= new int[size];
		int num=sc.nextInt();
		int counter=0;
		for(int i=0;i<size;i++) {
			myarray[i]= sc.nextInt();
		}
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]==num) {
				System.out.println(i);
				counter=counter+1;

			}
			}
		if(counter==0)
			System.out.println("num is not present");	
	}

}
