package jDemo1;

import java.util.Scanner;

public class j33for7div7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter limit for div 7 numbers =>");
		n=sc.nextInt();
		
		for (int i = 1; i <= n; i++)
        {
        if(i%7==0)
        	
        {
        	System.out.println(i);
        }
			
       }
	}

}
