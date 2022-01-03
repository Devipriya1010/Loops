package com.pack;

import java.util.Scanner;

public class Backward {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int r,s=0;
		while(n>0)
		{
			r=n%10;  
			s=s*10+r; 
			n=n/10;  
			
			
		}
		
		System.out.println(s);
		sc.close();
	

	}

}
