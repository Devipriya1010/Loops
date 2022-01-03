package com.pack;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number n:");//reverse process
		int n=sc.nextInt();//for ex n=453
		int r,s=0;         //first check the condition n>0 
		int k=n;           //it's true means process execute
		while(n>0)         //r=453%10------>3;r=3
		{                  
			r=n%10;  
			s=s*10+r; //s=0---->s=0*10+3=3//s=3
			n=n/10;  //453/10=45//n=45
			         //n=45
			        //the process is continuing until process is false
			}
		
		if(k==s)
			System.out.println("palindrome");
		else
			System.out.println("non  palindrome");
		sc.close();
		

	}

}
