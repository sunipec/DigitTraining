package com.digit.MultiThreading;

import java.util.Scanner;

class operations extends Thread{
	
	public void run() {
		
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			add();
		}
	}
	
	void banking() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Banking Operation");
		System.out.println("Enter acc no." );
		int acc=sc.nextInt();
		System.out.println("Enter pin");
		int pin=sc.nextInt();
		
		System.out.println("Banking completed");
	}
	
	void printing() {
		System.out.println("Printing oeration");
		
		for(int i=0;i<5;i++) {
			try {
			System.out.println("HI good morning");
			Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
			
		
		System.out.println("Printing completed");
	}
	
	void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition operation");
		
		System.out.println("enter the num1 ");
		int num1=sc.nextInt();
		
		System.out.println("enter the num2 ");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		System.out.println("the result is: "+res);
		System.out.println("addition completed");
		
	}
}

public class MultiThreadProg {
	
	public static void main(String[] args) {
		System.out.println("main started");
		operations op1=new operations();
		op1.setName("banking");
		
		operations op2=new operations();
		op2.setName("printing");
		operations op3=new operations();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		System.out.println("main terminated");
		
	}

}
