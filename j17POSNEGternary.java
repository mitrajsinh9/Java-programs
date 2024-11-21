package jDemo1;

import java.util.Scanner;

public class j17POSNEGternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter no =>");
		n=sc.nextInt();
	
		String ans=n>0 ? "No is + " : "No is -";

		System.out.println(ans);
	}

}