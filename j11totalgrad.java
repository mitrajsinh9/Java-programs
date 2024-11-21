package jDemo1;

import java.util.Scanner;

public class j11totalgrad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,total;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter sub. 1 marks =>");
		n1=sc.nextInt();
		
		System.out.print("Enter sub. 2 marks =>");
		n2=sc.nextInt();

		System.out.print("Enter sub. 3 marks =>");
		n3=sc.nextInt();
		
		
		total=n1+n2+n3;
		{
			System.out.println("(Total =>)");
		}
		if(total>0 && total<50)
		{
			System.out.print("(Grad C)");
		}
		else if(total>50&&total<100)
		{
			System.out.println("(Grad B)");
		}
		else
		{
			System.out.println("(Grad A)");
		}
		
	}

}
