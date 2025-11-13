package com.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("수학 : ");
		int b = sc.nextInt();
		System.out.print("영어 : ");
		int c = sc.nextInt();
		int ave= (a+b+c)/3;
		
		System.out.println("합계: "+(a+b+c)+"점");
		System.out.println("평균: "+ave+"점");
		String result = (a>=60)?
				(b>=60?
						(c>=60)?
								(ave>=90?
										"휴대폰 성공":
											"휴대폰을 바꿀 수 없습니다.")
								:"휴대폰을 바꿀 수 없습니다."
						:"휴대폰을 바꿀 수 없습니다.")
				:"휴대폰을 바꿀 수 없습니다.";
		System.out.println(result);
	}

}
