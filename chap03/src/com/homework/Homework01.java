package com.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String result = sc.next();
		
		String ang=result.equals("간다")?"온다":"간다";
		
		System.out.println("앵무새: "+ang);

	}

}
