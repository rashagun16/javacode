package com.globallogic.demo;
import java.util.*;
class GetSetClass{
	private String name;
	private int id; // 7 
	
	int getmyid() {
		return id;
	}
	
	void setmyid(int valueofid) {
		id= valueofid;
	}
}
	
public class GetterSetter {
    public static void main(String[] args) {
    	GetSetClass myobj= new GetSetClass();
        myobj.setmyid(7);
        int id=myobj.getmyid();
    
    }
}

	
	
	
	
	
	
	
	
	
	
	