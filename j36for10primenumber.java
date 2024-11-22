package jDemo1;

import java.util.Scanner;

public class j36for10primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,c=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. =>");
		n=sc.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			  c=1;
			  break;	
			}	
		}
		
		if(c==0)
		{
		System.out.println("Prime number");
		}
		else
		{
		System.out.println("Not prime number");
		}
				
	}

}
