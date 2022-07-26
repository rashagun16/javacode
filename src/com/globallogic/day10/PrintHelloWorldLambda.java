package com.globallogic.day10;
//print hello world

interface HelloWorld{
	public void boloHello();
}
public class PrintHelloWorldLambda {
	public static void main(String[] args) {
		HelloWorld hw=()->{
			System.out.println("Hello World");
			
		};
		hw.boloHello();
	}

}
