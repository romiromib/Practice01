package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {
	
	/*
	
	사용자에게 연필의 개수와 인원수를 입력받아 모든인원에게 같은수의 연필을 나눠주려고 한다
	1인당 연필의 받을수 있는 연필의 개수와 나머지를 구하시오
	 */
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("전체 연필갯수를 입력해 주세요: ");
		int totalPc = in.nextInt();
		
		System.out.print("전체 인원수를 입력해 주세요: ");
		int totalPs = in.nextInt();
		
		int Pc = totalPc/totalPs;
		int R =  totalPc%totalPs;
		
		System.out.println("1인당 연필의 갯수는 " + Pc + " 입니다.");
		System.out.println("연필의 나머지 갯수는 " + R + " 입니다.");
		
		in.close();
		
		
	}
	
}
