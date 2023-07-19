package com.digit.MultiThreading;

import java.util.Scanner;

public class threadProg1 {
public static void main(String[] args) throws InterruptedException {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Banking Operation");
	System.out.println("Enter acc no." );
	int acc=sc.nextInt();
	System.out.println("Enter pin");
	int pin=sc.nextInt();
	
	System.out.println("Banking completed");
	
	System.out.println("Printing oeration");
	
	for(int i=0;i<5;i++) {
		System.out.println("HI good morning");
		Thread.sleep(3000);
	}
	
	System.out.println("Printing completed");
	
	System.out.println("Addition operation");
	
	System.out.println("enter the num1 ");
	int num1=sc.nextInt();
	
	System.out.println("enter the num2 ");
	int num2=sc.nextInt();
	
	int res=num1+num2;
	System.out.println(res);
}rrf
}
