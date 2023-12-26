package com.javaex.practice;

public class Ex11 {

	/*
	
	아래의 코드에서 오류가 발생하는 부분을 예상하고 수정하세요
	public static void main(String[]args){
	
		int iVar = 10;				
		long IVar = 1000000000000L;	
		char cVar = 'ab';			=>한글자만 가능함
		double dVar = 10;			
		float fVar = 12.4;			=>실수뒤에 F입력해야 함
		String str = 'ab';			=>쌍따옴표를 사용해야 함
	
	}

	 */

	public static void main(String[]args){
		
		int iVar = 10;				
		long IVar = 1000000000000L;	
		char cVar = 'a';			//=>한글자만 가능함
		double dVar = 10;			
		float fVar = 12.4F;			//=>실수뒤에 F입력해야 함
		String str = "ab";			//=>쌍따옴표를 사용해야 함
	
	}
	
	
}
