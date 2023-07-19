package com.digit.testProject.p1;

import java.util.Scanner;

public class reThrowingException {
	
	void fun1()  {
		try {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a num1: ");
		  int a=sc.nextInt();
		  
		  System.out.println("Enter a num2: ");
		  int b=sc.nextInt();
		  
		  int res=a/b;
		  
		  System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			throw e;
		}
		finally {
			System.out.println("Outside fun1");
		}
	}
	
  public static void main(String[] args) {
	  reThrowingException rt=new reThrowingException();
	  try {
		  rt.fun1();
	  }
	  
	  finally {
		  System.out.println("Outside main func");
	  }
	
}
}
