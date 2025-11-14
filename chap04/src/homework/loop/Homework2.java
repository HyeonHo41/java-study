package homework.loop;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for (;;) {
			if (num<0) {
				System.out.print("양수만 입력해주세요.");
				System.out.print("숫자 : ");
				num = sc.nextInt();
			} else if (num==0) {
				break;
			} else if (num>9) {
				System.out.print("9 이하의 숫자만 입력해주세요.");
				System.out.print("숫자 : ");
				num = sc.nextInt();
			} else {
				for (int i=num; i<=9; i++) {
					System.out.println("=== "+i+"단"+" ===");
					for(int j=1; j<=9; j++) {
						System.out.println(i+"*"+j+" = "+i*j);
					}
				}
				break;
			}
		}

	}

}
