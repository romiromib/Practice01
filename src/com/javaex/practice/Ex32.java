package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	//사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("가로: ");
		double width = in.nextDouble();
		
		System.out.print("세로: ");
		double length = in.nextDouble();
		
		double area = (width*length)/2;
		
		System.out.println("삼각형의 넓이는 " + area +" 입니다.");
		
		in.close();
		
	}
	
	
}
