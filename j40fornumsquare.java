package jDemo1;

import java.util.Scanner;

public class j40fornumsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op,n;
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Press 1 for square; ");
		System.out.println("Press 2 for cube; ");
		System.out.println("Press 3 for exit; ");
		
		System.out.print("Enter option =>");
		op=sc.nextInt();
	
		if (op==1)
		{
			
			System.out.print("Enter no =>");
			n=sc.nextInt();
			System.out.println("square => " + (n*n));
		}
		else if (op== 2)
		{
			
			System.out.print("Enter no =>");
			n=sc.nextInt();
			System.out.println("cube => " + (n*n*n));
		}	
		else if (op== 3)
		{
			System.out.println("Bye....");
		}	
		
		else
		{
			System.out.println("Wrong option");
		}
		
		}while(op!=3);
	}

}
