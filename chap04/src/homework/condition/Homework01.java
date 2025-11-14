package homework.condition;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
		int age = sc.nextInt();
		
		if (age>=3&&age<=12) {
			int price = 10000;
			System.out.println("당신의 놀이동산 요금은 "+price+"원입니다.");
		} else if (age >=13&& age<=18) {
			int price = 20000;
			System.out.println("당신의 놀이동산 요금은 "+price+"원입니다.");
		} else if (age >=19&& age<=64) {
			int price = 30000;
			System.out.println("당신의 놀이동산 요금은 "+price+"원입니다.");
		} else {
			String price = "무료";
			System.out.println("당신의 놀이동산 요금은 "+price+"입니다.");
		}
	}

}
