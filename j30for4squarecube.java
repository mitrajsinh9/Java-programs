package jDemo1;

import java.util.Scanner;

public class j30for4squarecube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no =>");
		n=sc.nextInt();
	
		
		  for (int i = 1; i <= n; i++)
	        {
	            System.out.println( i + " == " + (i*i)+ " == " + (i*i*i));	           
	        }
		
	}

}
