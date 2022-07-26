package com.globallogivDay8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
//Create a List with student class and perform the follwing operation
//1. Add the employee to list
//2. Delete the employee from list
//3. Search the employee name
//4. Update the meployee value using name or name
//5. Sort the data of employee
//6. Provide the sum of slary of employee
//7 search for highest paid salary
//8 search for minimum paid salary
//create a manu base program for above probelm
public class List {
	public static void main(String[] args) {
		ArrayList<String> arr1= new ArrayList<String>();
		ArrayList<Integer> Arr2= new ArrayList<Integer>();
		//adding employees
		arr1.add("Shagun");
		arr1.add("Sakshi");
		arr1.add("Varun");
		arr1.add("Aniket");
		arr1.add("Muskan");
		arr1.add("Irresponsible");
		System.out.println(arr1);
		//deleting employees
		arr1.remove(5);
		System.out.println(arr1);
		//search the employee name
		boolean b= arr1.contains("Muskan");
		System.out.println(b);
		//update name of employee
		arr1.set(3, "Nishant");
		Arr2.add(40000);
		Arr2.add(45000);
		Arr2.add(41000);
		Arr2.add(44000);
		Arr2.add(43000);
		Arr2.add(42000);
		//sort the salaries
		Collections.sort(Arr2);
		System.out.println(Arr2);
		//sum of salaries in list
		int sum=0;
		for(int i=0; i<Arr2.size();i++) {
			sum= sum+ Arr2(i);
			System.out.println(sum);
		}
	}

}
