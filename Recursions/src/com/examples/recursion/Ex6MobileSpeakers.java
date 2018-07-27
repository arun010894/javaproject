package com.examples.recursion;

public class Ex6MobileSpeakers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("no of speakers:"+mobilespeakers(4));
	}
	
	public static int mobilespeakers(int mobiles) {
		if(mobiles==0) {
			return 0;
		}else {
			if(mobiles%2==0) {
				return 2+mobilespeakers(mobiles-1);
			}else {
				return 1+mobilespeakers(mobiles-1);
			}
		}
	}

}
