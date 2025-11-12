package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 점수");
		double a = sc.nextDouble();
		System.out.printf("영어 점수");
		double b = sc.nextDouble();
		System.out.printf("수학 점수");
		double c = sc.nextDouble();
		int total;
		int ave;
		
		total = (int)a+(int)b+(int)c;
		ave = total/3;
		
		System.out.println("국어"+a);
		System.out.println("영어"+b);
		System.out.println("수학"+c);
		System.out.println("총점"+total);
		System.out.println("평균"+ave);

	}

}
