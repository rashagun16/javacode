package com.globallogic.day10;
//check nature of number 
interface checkneg{
	public void NegOrPos(int a);
}
public class NegativeNumCheck {
	public static void main(String[] args) {
		
		checkneg num=(a)->{
			if(a<0)
				System.out.println("It is a negative number.");
			else
				System.out.println("It is a positive number.");
			
		};
		num.NegOrPos(-59);
		num.NegOrPos(7865);
		num.NegOrPos(-13);
		num.NegOrPos(67);
		num.NegOrPos(-63);
		num.NegOrPos(-1);
		num.NegOrPos(-564);
		num.NegOrPos(+564);
		
	}

}
