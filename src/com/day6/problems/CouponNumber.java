package com.day6.problems;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String args[]) {
        System.out.println();
        coupNo();
    }
	public static void coupNo() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i;
        
        for(i=1; i<=num;i++) {
        	Random coupon=new Random();
        	coupon.nextInt(50);
        	System.out.println(coupon.nextInt(50));
        }
	}
}
