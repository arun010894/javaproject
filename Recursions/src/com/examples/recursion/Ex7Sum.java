package com.examples.recursion;

public class Ex7Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum:"+sum(123456));
	}
	
	public static int sum(int num) {
		if(num<=9) {
			return num;
		}else {
			return (num%10) + sum(num/10);
		}
	}
}
