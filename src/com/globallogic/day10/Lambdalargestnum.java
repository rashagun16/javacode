package com.globallogic.day10;

//create lambda to check largest number
interface largestNum{
	public int checklarge(int a,int b, int c);
}

public class Lambdalargestnum {
	public static void main(String[] args) {
		largestNum lNum=(a,b,c)->{
			if(a>b) {
				if(a>c)
					return a;
				else 
					return c;
					
			}
			else {
				if(b>c) {
					return b;
				}
				else
					return c;
			}
			
		};
		System.out.println(lNum.checklarge(12,34,1));
		System.out.println(lNum.checklarge(45,10,89));
	}

}
