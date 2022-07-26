package com.globallogivDay8;
import java.util.*;
import java.util.Collections;
public class ArrayList{
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		//add elements
		arr.add(25);
		arr.add(20);
		arr.add(5);
		arr.add(10);
		arr.add(15);
		System.out.println(arr);
		//get elements
		int a=arr.get(1);
		System.out.println(a);
		//sort element
		Collections.sort(arr);
		System.out.println(arr);
		//print the size
		int s= arr.size();
		System.out.println(s);
		System.out.println(arr);
		//delete element
		arr.remove(3);
		System.out.println(arr);
		//set element
		arr.set(3,35);
		System.out.println(arr);
	}
}



