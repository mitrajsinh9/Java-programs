package jDemo1;

import java.util.Scanner;

public class j14days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter day =>");
		day=sc.nextInt();

		switch(day)
		{
		case 1:
			System.out.println("sun");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
		default:
			System.out.println("Wrong option");
		}
	}

}
