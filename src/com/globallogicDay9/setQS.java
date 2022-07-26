//Create A set with all the implanatation with user defined class employee and perform the insert delete and searching and sorting
package com.globallogicDay9;
import java.util.Set;
import java.util.Collections;
import java.util.TreeSet;
import java.util.*;

//class Employee{
//	public Employee(String name, int salary,int id) {
//		this.name= name;
//		this.salary= salary;
//		this.id=id;
//
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name){
//		this.name= name;
//		
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary){
//		this.salary= salary;
//	}
//	public int getid() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id= id;
//	}
//	public void  SetEmployee(String name, int salary, int id) {
//		this.name= name;
//		this.id= id;
//		this.salary=salary;
//	}
//	private String name;
//	private int salary;
//	private int id;
//	
//	
//}
//
//
////{e1,e2,e3.e3}
//
//public class setQS {
//	public static void main(String[] args) {
//		HashSet<Employee> set= new HashSet<Employee>();
//		Employee e1 =new Employee("Monica", 5000, 1254);
//		Employee e2 =new Employee("Chandler", 4000,1154);
//		Employee e3 =new Employee("Ross", 3000, 1054);
//		Employee e4 =new Employee("Rachel",1000,1354);	
//		Employee e5 =new Employee("Joe",0,1654);
//		
//		set.add(e1);
//		set.add(e2);
//		set.add(e3);
//		set.add(e4);
//		set.add(e5);
//		
//		
//		for(Employee temp : set) {
//		
//			System.out.println("Name: " + temp.getName());
//			System.out.println("ID: "+temp.getid());
//			System.out.println("Salary: "+temp.getSalary());
//			System.out.println("\n");
//		}
//		//deletion operation
//		set.remove(e2);
//		for(Employee temp : set) {
//			
//			System.out.println("Name: " + temp.getName());
//			System.out.println("ID: "+temp.getid());
//			System.out.println("Salary: "+temp.getSalary());
//			System.out.println("\n");
//		}
//		//sorting
//		TreeSet<Employee> treeSet = new TreeSet<Employee>(set);
//		for(Employee temp : set) {
//			
//			System.out.println("Name: " + temp.getName());
//			System.out.println("ID: "+temp.getid());
//			System.out.println("Salary: "+temp.getSalary());
//			System.out.println("\n");
//		}
//	}
//	
//}
//class Employee implements Comparable<Employee>{
//	    String name;
//		int salary;
//		int id;
//}
//	
//	
//	public Employee(int id, String name,String email_id)
	{
		this.id = id;
		this.name = name;
		this.email_id = email_id;
}

