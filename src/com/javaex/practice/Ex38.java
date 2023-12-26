package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	//총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("전체금액을 입력해주세요: ");
		int total = in.nextInt();
		
		
		double cash = Math.floor(total/1000);
		int result = (int)cash*1000;
		
		
		System.out.println("실제지불금액은 " + result + "입니다.");
		
		in.close();
		
		
	}
	
	
}
