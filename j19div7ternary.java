package jDemo1;

import java.util.Scanner;

public class j19div7ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter no =>");
		n=sc.nextInt();
	
		String ans=n%7==0 ? "Yes div 7 " : "No div 7";

		System.out.println(ans);
	}

}
