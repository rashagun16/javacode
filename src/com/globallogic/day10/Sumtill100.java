package com.globallogic.day10;
//sum of num from 1 to 100
// lambda rule- take care of method,
interface Sumof1to100{
	public int sum(int n);
	
}
public class Sumtill100 {
	public static void main(String[] args) {
		Sumof1to100 suM=(n)->{
			int s=0;
			for(int i=0;i<=n;i++) {
				s=s+i;
				
			}
			return s;
		};
		System.out.println(suM.sum(100));
		
		
	}

}
