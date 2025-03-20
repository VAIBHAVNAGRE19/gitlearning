package com.cjc.switchcase;

import java.util.Scanner;

public class Test1 
{
	public static void main(String[] args)
	{
		Arithmatic a=new Arithmatic();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your choice between 1 to 4");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			a.add();
			break;
			
		case 2:
			a.sub();
			break;
			
		case 3:
			a.mult();
			break;
			
		case 4:
			a.div();
			break;
			
		default:
			System.out.println("Invalid choice");
			
		}
	}

}
