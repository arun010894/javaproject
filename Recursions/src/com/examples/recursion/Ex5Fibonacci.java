package com.examples.recursion;

public class Ex5Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibonacci:"+fibonacci(6));
	}

	public static int fibonacci(int position) {
		if(position==0) {
			return 0;
		}else if(position==1){
			return 1;
		}else {
			return fibonacci(position-1)+fibonacci(position-2);
		}
	}
}
