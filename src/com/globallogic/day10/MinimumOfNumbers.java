package com.globallogic.day10;
//minimum of three numbers
interface min{
	public int funmin(int a,int b,int c);
	
}
public class MinimumOfNumbers {
	public static void main(String[] args) {
		min minNum=(a,b,c)->{
			if(a<b) {
				if(c<a)
					return c;
				else
					return a;
			}
			else {
				if(b<c)
					return b;
				else
					return c;
				
			}
			
		};
		System.out.println(minNum.funmin(12,-34,1));
		System.out.println(minNum.funmin(75,10,899));
	}

}
