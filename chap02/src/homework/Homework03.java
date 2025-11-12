package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자열을 입력하세요 :");
		
		String total = sc.nextLine();
		
		
		char a=total.charAt(0);
		char b=total.charAt(1);
		char c=total.charAt(2);
		
		System.out.println("첫번째 문자 : "+a);
		System.out.println("첫번째 문자 : "+b);
		System.out.println("첫번째 문자 : "+c);
		

	}

}
