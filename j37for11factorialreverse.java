package jDemo1;

import java.util.Scanner;

public class j37for11factorialreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, mul=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. =>");
		n=sc.nextInt();
	
		
		  for (int i = n; i >= 1; i--)
	        {
	            System.out.print(i+" * ");
	            mul *= i;
	        }
		 System.out.print("\n Mul = "+ mul);
	}

}
