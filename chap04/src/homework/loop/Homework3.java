package homework.loop;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = sc.nextLine();
		
		for (;;) {
			if (text.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(text);
				System.out.print("입력 : ");
				text = sc.nextLine();
			}
		}

	}

}
