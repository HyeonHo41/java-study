package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자를 입력하세요");
		char total = sc.nextLine().charAt(0);
		
		System.out.println(total+"의 유니코드 :"+(int)total);
		
		
		

	}

}
