package com.cjc.switchcase;
import java.util.*;

public class Arithmatic 
{
	Scanner sc= new Scanner(System.in);
	 
	
	public void add()
	{
		System.out.println("enter first value");
		int a=sc.nextInt();
		
		System.out.println("enter second value");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("the subtraction is"+c);
		
	}
	
	public void sub()
	{
		System.out.println("Enter first value");
		int x=sc.nextInt();
		
		System.out.println("Enter second value");
		int y=sc.nextInt();
		int z=x-y;
		System.out.println("The sub is"+z);
		
	}
	
   public void mult()
   {
	   System.out.println("Enter first value");
	   int a=sc.nextInt();
	   
	   System.out.println("Enter second value");
	   int b=sc.nextInt();
	   int c=a*b;
	   System.out.println("The mult is "+c);
   }
   public void div()
   {
	   System.out.println("Enter first value");
	   int c=sc.nextInt();
	   
	   System.out.println("Enter second value");
	   int d=sc.nextInt();
	   
	   int e=c/d;
	   System.out.println("Div is "+e);
	   
	   
		
	}

}
