package jDemo1;

import java.util.Scanner;

public class j6nextorprev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. =>");
		n=sc.nextInt();
		
		System.out.println("next no. => " + (n+1));
		
		System.out.println("prev no. => " + (n-1));
	}

}
