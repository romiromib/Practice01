package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	
	//동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
	
	public static void main(String[]args) {
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int coin500 = in.nextInt();
		
		System.out.print("100원 개수: ");
		int coin100 = in.nextInt();
		
		System.out.print("50원 개수: ");
		int coin50 = in.nextInt();
		
		System.out.print("10원 개수: ");
		int coin10 = in.nextInt();
		
		int total = coin500*500 + coin100*100 + coin50*50 +coin10*10;
		
		System.out.print("동전의 총합은 " + total + "원 입니다.");
		
		in.close();
		
		
	}
	
}
