package jDemo1;

import java.util.Scanner;

public class j7posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. =>");
		n=sc.nextInt();

		if(n>0)
		{
			System.out.print("No is +");
		}
		else if(n<0)
		{
			System.out.print("No is -");
		}
		else {
			System.out.println("Otjer");
		}
	}

}
/*
 * 1) odd even
 * 2) max2
 * 3) max3
 * 4) 3 subjects total , 0-50 c , 50-100 B , 100 A
 * 5) month 1 , jan
 */
