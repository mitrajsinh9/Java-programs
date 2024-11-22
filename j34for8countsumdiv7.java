package jDemo1;

import java.util.Scanner;

public class j34for8countsumdiv7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub and use this same  method

        int n, count=0, sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit for div 7 numbers => ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count = count + 1;       
                sum = sum+ i;      
            }
        }
        System.out.println("Count of numbers divisible by 7 = " + count);
        System.out.println("Sum of numbers divisible by 7 = " + sum);
    }
}