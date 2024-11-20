package jDemo1;

import java.util.Scanner;

public class j8oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. =>");
		n=sc.nextInt();

		if(n%2==0)
		{
			System.out.print("(no. is odd)");
		}
		else {
			System.out.println("(no. is even)");
		}
	}

}