package com.javaex.practice;

public class Ex21 {

	/*
	
	아래의 출력결과를 예상하여 작성하세요. Ex20문제와 어느 부분이 다른지 비교해 보세요.
	(코드를 작성해서 예상과 맞는지 확인해 보세요.) 

	 */
	
	public static void main (String[]agrgs) {
		
		int i = 10;
		int n = ++i %2; // 연산자가 앞으로 바뀜. ++가 가장 먼저 실행되어야 함.
		
		System.out.println(i); // 11
		System.out.println(n); // 1
		
	}
	
}
