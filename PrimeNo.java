package com.pack;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("enteer the number n");
		n=scan.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
			
		}
		
		System.out.println(c);
		if(c==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("non prime number");
		}
		scan.close();
		
			
		
			

	}

}
