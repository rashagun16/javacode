package com.globallogivDay8;
import java.util.*;
//sorting of objects

class emplo1{
	int age;
	int salary;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public emplo1(int age, int salary, String name) {
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "emplo1 [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
class emplo2{
	
	
	
}
public class Comaparator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<emplo1> h= new HashSet<emplo1>();
		int i=1;
		while(i==1) {
		System.out.println("Press 1 to add data, 2 to del, 3 to search, 4 to sort");
			int j=sc.nextInt();
			switch(j) {
			case 1:{
				System.out.println("Enter age, salary,name");
				int age= sc.nextInt();
				int salary= sc.nextInt();
				String name= sc.next();
				h.add(new emplo1(age,salary,name));
				System.out.println("Do you want to continue");
				i=sc.nextInt();
				break;
			}
			case 2:{
				System.out.println("Type user name to be deleted");
				String nametodel= sc.next();//taking name to be deleted
//		for(emplo1 datadel : h) {
				Iterator <emplo1> it= h.iterator();//initiating iterator to delete the data otherwise it would delete the name
				//hasnext , .next, remove 
				while(it.hasNext()){//passing next index into while loop
					emplo1 emp= it.next();//creating name to next index
					
					if(emp.getName().equals(nametodel))//checking if name of emp is equal to name to delete
						it.remove();//removing name
				}
				System.out.println(h.toString());//getting data printed in set after deletion
				System.out.println("Do you want to continue");
				i=sc.nextInt();//saving user input for next move
				break;
			}
			case 3:{
				System.out.println("name to search");
				String nametosearch= sc.next();
				for(emplo1 datasearch : h) {// for every datasearch variable in h
					if(datasearch.getName().equals(nametosearch))//checking if datasearch name equals name to be searched 
						System.out.println(datasearch.toString());
				}
				break;
				
			}
			case 4:{
				//sorting
				Set <emplo1> ts= new TreeSet<emplo1>(h);
				System.out.println(ts.toString());
				
			}
				
				
			}
		}
		
		
	}
	

}
