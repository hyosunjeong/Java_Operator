package com.biz.op;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && : AND ( x ), 둘 다 참일때 참
		boolean boolA = (30 == 40) && (40 == 50);
		
		// || : OR ( + ), 둘 중 1개만 참이어도 참
		boolean boolB = (30 <= 40) || (40 >= 50);
		
		// page79 참고(교재)
		boolean boolC = (30 < 40) || (40 >= 50) && (50 > 60);
		System.out.println(boolC);
		
		

	}

}
