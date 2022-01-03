package com.pack;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int n,fact=1,i;
		System.out.println("find the fatorial of no=");
	    n=ad.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	fact=fact*i;//fact=1
	    	//fact=1x1=1
	    	//fact=1x2=2
	    	//fact=2x3=6
	    	//fact=6x4=24
	    	//fact=24x5=120
	    }
	    System.out.println(fact);
	    ad.close();
	}

}
