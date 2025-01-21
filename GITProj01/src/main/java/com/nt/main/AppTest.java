package com.nt.main;

import com.nt.service.ArithematicOperations;

public class AppTest {
	public static void main(String[] args) {
		ArithematicOperations ar=new ArithematicOperations();
		System.out.println("Sum: "+ar.sum(100,200));
		System.out.println("sub: "+ar.sub(400,200));
	}

}
