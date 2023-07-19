package com.digit.testProject.p1;

import java.util.Scanner;

class abc{
	
	void fun1() throws Exception {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a num1: ");
		  int a=sc.nextInt();
		  
		  System.out.println("Enter a num2: ");
		  int b=sc.nextInt();
		  
		  int res=a/b;
		  
		  System.out.println(res);
		  
	}
	
	void fun2() throws Exception{
		fun1();
	}
	void fun3() {
		
		try {
		fun2();
		}
		catch(Exception e){
			System.out.println("exception handled ");
		}
	}
	
}
public class duckingException  {
   public static void main(String[] args) {
	   abc a=new abc();
	   a.fun3();
}
}
