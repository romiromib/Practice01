package com.javaex.practice;

public class Ex17 {

	/*
	
	다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
	(코드를 작성해서 오류가 없도록 변경해 보세요.)

	public static void main (String[]srgs) {
		
		int x, y
		
		x = 10
		y = 20
		
		sum = x + y
		
		System.out.println("합은'+ sum);

	 */
	
	public static void main (String[]srgs) {
		
		int x, y; // 세미콜론 없음
		
		x = 10; // 세미콜론 없음
		y = 20; // 세미콜론 없음
		
		int sum = x + y ; // 자료형이 없음, 세미콜론 없음
		
		System.out.println("합은"+ sum); // "합은' 뒤에 쌍따옴표가 아님
		
	}
	
}
