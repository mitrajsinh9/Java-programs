package jDemo1;

import java.util.Scanner;

public class j15calculatorswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op,n1,n2;

		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for add; ");
		System.out.println("press 2 for sub; ");
		System.out.println("press 3 for mul; ");
		System.out.println("press 4 for div; ");
		System.out.print("Enter option =>");
		op=sc.nextInt();
		
		
		
		switch(op)
		{
		case 1:
			System.out.print("Enter no. 1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter no. 2 =>");
			n2=sc.nextInt();
			System.out.println("add => " + (n1+n2));
			
			break;
			
		case 2:
			System.out.print("Enter no. 1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter no. 2 =>");
			n2=sc.nextInt();
			System.out.println("sub => " + (n1-n2));
			
			break;
			
		case 3:
			System.out.print("Enter no. 1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter no. 2 =>");
			n2=sc.nextInt();
			System.out.println("mul => " + (n1*n2));
			
			break;
			
		case 4:
			System.out.print("Enter no. 1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter no. 2 =>");
			n2=sc.nextInt();
			System.out.println(" div => " + (n1/n2));
			
			break;
			
		default:
			System.out.println("WRONG OPTION");
			}
		}

}