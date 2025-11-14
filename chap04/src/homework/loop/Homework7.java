package homework.loop;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result ="";
		
		Label:for (;;) {
			if (num>0) {
				for (int i=1; i<=num; i++) {
				if (i%2==0) {
					result+="수";
				} else {
					result+="박";
				}
				}
				System.out.println(result);
				break Label;
				
			} else {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			}
		}

	}

}
