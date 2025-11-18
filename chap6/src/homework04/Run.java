package homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();
		
		
		System.out.print("전달할 메세지 : ");
		lib.a = sc.nextLine();
		
		System.out.print("정수 : ");
		lib.b = sc.nextInt();
		sc.nextLine(); //버퍼지우기
		System.out.print("전달할 메세지(영문자확인) : ");
		lib.c = sc.nextLine();
		System.out.print("문자열(문자확인) : ");
		lib.d = sc.nextLine();
		System.out.print("문자(문자확인) : ");
		lib.dd = sc.next().charAt(0);
		System.out.print("정수(구구단) : ");
		lib.e = sc.nextInt();
		
		
		
		lib.path(lib.a);
		lib.sum();
		lib.numberCheck(lib.b);
		lib.enCheck(lib.c);
		lib.charCheck(lib.d,lib.dd);
		lib.gugu(lib.e);
		
		

	}

}
