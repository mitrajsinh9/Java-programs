package jDemo1;

import java.util.Scanner;

public class j20max2ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1,n2;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter no. 1 =>");
		n1=sc.nextInt();
		System.out.print("Enter no. 2 =>");
		n2=sc.nextInt();
	
		String ans=n1>n2 ? "No. 1 is greater" : "No. 2 is greater";

		System.out.println(ans);
	}

}
