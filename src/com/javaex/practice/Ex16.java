package com.javaex.practice;

public class Ex16 {

	/*
	
	아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요

	 */
	
	public static void main (String[]args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a); // a= int ++x *2 => a=4
		System.out.println("b=" + b); // b= int y++ *2 => b=2
		System.out.println("x=" + x); // x= 2
		System.out.println("y=" + y); // y= 2
		
		System.out.println(b); // 2
		
	}
	
}
