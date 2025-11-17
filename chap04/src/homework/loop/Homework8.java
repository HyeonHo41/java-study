package homework.loop;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String text = sc.next();
		System.out.print("문자 : ");
		char a = sc.next().charAt(0);
		int count=0;
		
		Label:for (;;) {
			for (int i=0; i<text.length(); i++) {
				if(text.charAt(i)==a) {
					count++;
				}
			}
			System.out.println("포함된 개수 : "+count);
			System.out.print("다시 입력하시겠습니까? : ");
			char re = sc.next().charAt(0);
			count=0;
			
			for (;;) {
			if (re=='Y'||re=='y') {
				count=0;
				System.out.print("문자열 : ");
				text = sc.next();
				System.out.print("문자 : ");
				a = sc.next().charAt(0);
				
				for (int i=0; i<text.length(); i++) {
					if(text.charAt(i)==a) {
						count++;
					}
				}
				System.out.println("포함된 개수 : "+count);
				System.out.print("다시 입력하시겠습니까? : ");
				re = sc.next().charAt(0);
				
			} else if (re=='N'||re=='n') {
				break Label;
			} else {
				
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.print("다시 입력하시겠습니까? : ");
				re = sc.next().charAt(0);
			}
			}
			
		}

	}

}
