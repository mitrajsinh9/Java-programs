package jDemo1;

import java.util.Scanner;

public class j26oddeveninloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter no. =>");
		n=sc.nextInt();
		
		for (int i = 1; i <= n; i++)
        {
        
            if(i%2==0)
    		{
    			System.out.println(i + " is even");
    		}
    		else {
    			System.out.println(i +" is odd");
    		}
        }
	}

}
