package com.examples.recursion;

public class Ex8Count5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("count5:"+count5(153455));
	}
	
	public static int count5(int num) {
		if(num<=9) {
			if(num==5) {
				return 1;
			}else {
				return 0;
			}	
		}else {
			if(num%10==5) {
				return 1 + count5(num/10);
			}else {
				return 0 + count5(num/10);
			}
		}
	}
}
