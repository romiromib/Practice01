package com.javaex.practice;

public class Ex13 {

	/*
	
	다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
	
	 */
	
	public static void main(String[]args) {
		
		System.out.println(13/5); // 2 (정수형)
		System.out.println((double)13/5); // 2.6 (실수형)강제형변환  
		System.out.println(13/(double)5); //2.6 (실수형)강제형변환
		System.out.println((double)13/(double)5); //2.6 (실수형)강제형변환
		System.out.println(13.0/5); //2.6 (실수형)자동형변환
		System.out.println(13/5.0); //2.6 (실수형)자동형변환
		System.out.println((double)(13/5)); //2.0 (실수형)강제형변환
		
	}
	
}
