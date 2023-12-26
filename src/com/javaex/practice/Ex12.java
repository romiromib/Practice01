package com.javaex.practice;

public class Ex12 {

	/*
	
	다음코드의 잘못된 부분을 찾아서 수정해 보세요.
	(코드를 작성해서 오류가 없도록 변경해 보세요.)
	public static void main(String[]args){
	
		int x,y = 0;				//x와 y를 모두 0으로 초기화
		char grade = "A";		//문자 A를 grade에 대입
		int salary = 2,000,000;	//salary에 2,000,000을 대입
		byte n = 1000;			//n에 1000을 대입
	
	}

	 */
	
	public static void main(String[]args){
		
		int x= 0 , y = 0;	//x와 y를 모두 0으로 초기화
			
		char grade = 'A';		//쌍따옴표를 작은따옴표로 변경
		int salary = 2000000;	//콤마 삭제 
		int n = 1000;			//byte->int로 변경
	
		System.out.println(n);
		
		
	}
	
	
}
