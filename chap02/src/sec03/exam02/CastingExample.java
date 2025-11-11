package sec03.exam02;

import java.util.Scanner;


public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65603;		
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 20000000000L;
		intValue = (int)longValue;
		System.out.println(intValue); // 강제 형변환 시 마지막 4byte만 넣음
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//Quiz
		Scanner sc = new Scanner(System.in);
		System.out.print("long 타입 입력:");
		int number =(int)sc.nextLong();
		System.out.println(number);
		

	}

}
