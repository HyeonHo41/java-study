package com.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		char num = sc.next().charAt(7);
		
		String result = (num=='1'||num=='3')? "남성":
			((num=='2'||num=='4')?"여성":"잘못된 값");
		
		System.out.println("입력하신 주민번호는 "+result+"입니다.");
	
	}

}
