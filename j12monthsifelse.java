package jDemo1;

import java.util.Scanner;

public class j12monthsifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter month =>");
		n=sc.nextInt();

		if(n==1)
		{
			System.out.print("january");
		}
		else if(n==2)
		{
			System.out.print("february");
		}
		else if(n==3)
		{
			System.out.print("march");
		}
		else if(n==4)
		{
			System.out.print("april");
		}
		else if(n==5)
		{
			System.out.print("may");
		}
		else if(n==6)
		{
			System.out.print("june");
		}
		else if(n==7)
		{
			System.out.print("july");
		}
		else if(n==8)
		{
			System.out.print("august");
		}
		else if(n==9)
		{
			System.out.print("september");
		}
		else if(n==10)
		{
			System.out.print("october");
		}else if(n==11)
		{
			System.out.print("november");
		}else if(n==12)
		{
			System.out.print("december");
		}
		else {
			System.out.println("Other");
		}
	}

}
