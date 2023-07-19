package com.digit.MultiThreading;

import java.util.Scanner;

class banking extends Thread {

	public void run() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Banking Operation");
		System.out.println("Enter acc no.");
		int acc = sc.nextInt();
		System.out.println("Enter pin");
		int pin = sc.nextInt();

		System.out.println("Banking completed");
	}
}

class printing extends Thread {

	public void run() {
		System.out.println("Printing oeration");

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("HI good morning");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Printing completed");
	}
}

class add extends Thread {

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition operation");

		System.out.println("enter the num1 ");
		int num1 = sc.nextInt();

		System.out.println("enter the num2 ");
		int num2 = sc.nextInt();

		int res = num1 + num2;
		System.out.println("the result is: " + res);
		System.out.println("addition completed");
	}
}

public class multiThreadwithDifferentCalling {
	public static void main(String[] args) {
		System.out.println("main started");
		banking b1=new banking();
		b1.start();
		
		printing b2=new printing();
		b2.start();
		
		add b3=new add();
		b3.start();
	}

}
