package homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();
		
		
		System.out.print("문자1 : ");
		lib.a = sc.next();
		System.out.print("문자2 : ");
		lib.b = sc.next();
		
		
		System.out.print("숫자1 : ");
		lib.c = sc.nextInt();
		System.out.print("숫자2 : ");
		lib.d = sc.nextInt();
		
		System.out.print("문자1 : ");
		lib.e = sc.next();
		System.out.print("문자2 : ");
		lib.f = sc.next();


		
		
		lib.sum(lib.a,lib.b);
		lib.multiple(lib.c,lib.d);
		lib.check(lib.e,lib.f);

	}

}
