package jDemo1;

import java.util.Scanner;

public class j16squcubeswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for square; ");
		System.out.println("Press 2 for cube; ");
		System.out.print("Enter option =>");
		op=sc.nextInt();
	
		switch(op)
		{
		case 1:
			
			System.out.print("Enter no =>");
			n=sc.nextInt();
			System.out.println("square => " + (n*n));
			
			break;
			
		case 2:
			
			System.out.print("Enter no =>");
			n=sc.nextInt();
			System.out.println("cube => " + (n*n*n));
			
			break;
		default:
			System.out.println("Wrong option");
		}
		
	}

}
