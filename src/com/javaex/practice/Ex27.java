package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	/*
	
	반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14로 상수로 지정)

	 */
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요:");
		
		int r = in.nextInt();
		final float pi = 3.14F;
		
		System.out.print("원의 넓이는 " + pi*r*r);
		
		in.close();
		
	}
	
}
