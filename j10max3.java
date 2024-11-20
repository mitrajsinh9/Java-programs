package jDemo1;

import java.util.Scanner;

public class j10max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. 1 =>");
		n1=sc.nextInt();
		
		System.out.print("Enter no. 2 =>");
		n2=sc.nextInt();

		System.out.print("Enter no. 3 =>");
		n3=sc.nextInt();
		
		if(n1>n2&&n1>n3)
		{
			System.out.print("(No. 1 is greater)");
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println("(No. 2 is greater)");
		}
		else
		{
			System.out.println("(No. 3 is greater)");
		}
		
	}

}
