package com.examples.recursion;

public class Ex4factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial:"+factorial(5));
	}

	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num * factorial(num-1);
		}
	}
}
