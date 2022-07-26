package com.globallogivDay8;



interface fruits{
	void smell();
	void color();
	
}
interface animal extends fruits{
	void eat();

}
class apple implements animal{
	@Override
	public void color() {
		System.out.println("print color");
		// TODO Auto-generated method stub
	}@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void smell() {
		// TODO Auto-generated method stub
	}
	
}
class kiwi implements fruits{ 
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	@Override
	public void smell() {
		System.out.println("wild");
		// TODO Auto-generated method stub
		
	}
}

public class Interface {
	public static void main(String[] args) {
		kiwi K= new kiwi();
		K.color();
		K.smell();
		apple a = new apple();
		a.color();
		a.smell();
		fruits f= new apple();
		f.color();
		f.smell();
		fruits f2= new kiwi();
		f2.color();
		f2.smell();
		
	}
}
