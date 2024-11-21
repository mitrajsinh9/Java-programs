package jDemo1;

import java.util.Scanner;

public class j21drivemore18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter your age =>");
		age=sc.nextInt();

		String ans=age>18 ? "You can drive" : "You can't drive";

		System.out.println(ans);
	}

}
