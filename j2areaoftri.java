package jDemo1;

import java.util.Scanner;

public class j2areaoftri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b,h;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter base =>");
		b=sc.nextDouble();
		
		System.out.print("Enter height =>");
		h=sc.nextDouble();
		
		System.out.println("area of tri =>" + (0.5*b*h));

	}

}
