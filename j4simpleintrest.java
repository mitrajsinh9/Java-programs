package jDemo1;

import java.util.Scanner;

public class j4simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,r,t;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Principal amount =>");
		p=sc.nextInt();
		
		System.out.print("Enter Rate =>");
		r=sc.nextInt();

		System.out.print("Enter Time =>");
		t=sc.nextInt();
		
		System.out.println("Simple intrest => " + (p*r*t/100));
	}

}