package com.javaex.practice;

public class Ex24 {

	/*
	
	다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다. 
	결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
	*[참고] ℃ : 섭씨 기호   ℉ : 화씨 기호
		화씨🡪섭씨 ℃ = 5/9 * (℉ - 32)           
		섭씨🡪화씨 ℉ = (℃ * 9/5) + 32

	public static void main(String[]agrgs) {
		
		double f=80.0;
		
		System.out.println(5/9*(f-32.0));
		

	 */
	
	public static void main(String[]agrgs) {
		
		double f=80.0;
		
		System.out.println((f-32.0)*5/9); 
		// 순서를 변경하면 됨.
		// System.out.println(5/9*(f-32.0)); 의 연산순서를 생각하면
		// 정수/정수*(실수)이므로 앞에서 부터 연산하면 정수형 5/9의 연산값은 0이므로 결과값이 0임.
		
	}
	
}
