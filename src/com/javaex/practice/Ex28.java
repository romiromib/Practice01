package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	/*
	
	원화를 달러화로 계산하는 프로그램을 작성하세요.(환율 1달러 = 1230.95원 상수로 지정) 

	 */
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("환전 할 원화를 입력하세요:");
		
		final double $ = 1230.95;  //float으로 하면 값이 다르게 나옴
		int won = in.nextInt();
		
		System.out.print("받으실 달러는 " + won/$);
		
		in.close();
	}
}
