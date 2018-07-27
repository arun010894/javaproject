package com.examples.recursion;

public class Ex3Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("power:"+power(3,3));
	}

	public static int power(int base,int power) {
		if(power==1) {
			return base;
		}else {
			return base * power(base,power-1);
		}
	}
}
