package com.day6.problems;

import java.util.Scanner;

public class ReverseNumber {
	  public static void main(String args[]) {
	        System.out.println();
	        findreverse();
	    }
	    public static void findreverse() {
	        int num,temp,reverse=0,remainder;
	        System.out.println("Enter the number");
	        Scanner sc=new Scanner(System.in);
	        num=sc.nextInt();
	        temp=num;
	        while(temp!=0) {
	            remainder=temp%10;
	            reverse=reverse*10+remainder;
	            temp=temp/10;
	        }
	        System.out.println("reverse of number is "+reverse);
	    }
}
