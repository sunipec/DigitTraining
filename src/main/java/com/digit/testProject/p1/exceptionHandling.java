package com.digit.testProject.p1;

import java.util.Scanner;

public class exceptionHandling {
  public static void main(String[] args) {
	  
	  try {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a num1: ");
	  int a=sc.nextInt();
	  
	  System.out.println("Enter a num2: ");
	  int b=sc.nextInt();
	  
	  int res=a/b;
	  
	  
	  
	  System.out.println("Enter the size of array: ");
	  int n=sc.nextInt();
	  int [] arr=new int[n];
	  
	  System.out.println("enter the index of the array: ");
	  int i=sc.nextInt();
	  
	  System.out.println("Enter the number to be added in array index ");
	  int v=sc.nextInt();
	  arr[i]=v;
	  
	  }
	  catch(ArithmeticException e1){
		  System.out.println("ArithmeticException");
		  
	  }
	  catch(ArrayIndexOutOfBoundsException e2){
		  System.out.println("ArrayIndexOutOfBoundsException");
		  
	  }
	  catch(NullPointerException e3) {
		  System.out.println("NullPointerException");
	  }
	  catch(NegativeArraySizeException e4) {
		  System.out.println("NegativeArraySizeException");
	  }
	  catch(Exception e6) {
		  System.out.println("Exception is handled by the generic block");
	  }
	  
 }
}
