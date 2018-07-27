package com.examples.recursion;

public class EX1RecursionReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		printNumbers(10);
	}
	
	public static void printNumbers(int number) {
		if(number==0) {
			return;
		}else {
			System.out.println(number);
			printNumbers(number-1);
		}
	}

}
