package com.day6.problems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
        System.out.println();
        IsPrime();
    }
    public static void IsPrime() {
        boolean IsPrime = true;
        int num;
        System.out.println("Enter the number other than 0 or 1");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num != 0 || num != 1) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime)
                System.out.println("prime number");
            else
                System.out.println("not prime number");
        } else
            System.out.println("Enter valid number");
    }
}
