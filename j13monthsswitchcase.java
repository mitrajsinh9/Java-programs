package jDemo1;

import java.util.Scanner;

public class j13monthsswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int month;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter month =>");
		month=sc.nextInt();

		switch(month)
		{
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("Wrong opt");
		}

	}

}
