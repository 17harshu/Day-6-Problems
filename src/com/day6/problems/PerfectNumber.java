package com.day6.problems;

import java.util.Scanner;

public class PerfectNumber {
	public static int numCheck(int num) {
		int sum=0;
		int i=0;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		for(num=1; num<=100; num++) {
			sum=numCheck(num);
			if(sum==num) {
				System.out.println(num);
			}
		}
	}
}