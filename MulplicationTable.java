package com.pack;

import java.util.Scanner;

public class MulplicationTable {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a,b;
		System.out.println("enter the valu b");
		b=ob.nextInt();
		for(a=1;a<=10;a++)
		{
			int c;
			c=a*b;
			System.out.println(c);
		}
		ob.close();
			}

}
