package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	/*
	
	사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
	 *[참고] ℃ : 섭씨 기호   ℉ : 화씨 기호
		화씨🡪섭씨 ℃ = 5/9 * (℉ - 32)           
		섭씨🡪화씨 ℉ = (℃ * 9/5) + 32

	 */
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f = in.nextDouble();
		
		double c= (f-32)*5/9;
		
		System.out.print("화씨 " + f + "의 섭씨온도는 " + c +" 입니다.");
		
		in.close();
		
	}
	
}
