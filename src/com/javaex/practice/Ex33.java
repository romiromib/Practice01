package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	//사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r = in.nextInt();
		
		double V = 3.14*4/3*r*r*r;

		System.out.print("구의 부피는: "+ V +"입니다.");
		
		
		in.close();
		
		
	}
	
}
