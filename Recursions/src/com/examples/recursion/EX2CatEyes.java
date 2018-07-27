package com.examples.recursion;

public class EX2CatEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("no of cat eyes:"+catEyes(5));
	}
	
	public static int catEyes(int cats) {
		if(cats==0) {
			return 0;
		}else {
			return 2 + catEyes(cats - 1);
		}
	}

}
