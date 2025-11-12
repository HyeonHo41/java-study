package homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int total;
		
		System.out.printf("한 자리 숫자를 입력하세요");
		char a = sc.nextLine().charAt(0);
		num= a-'0';
		total = num*num;
		
		
		System.out.println("입력한 숫자의 제곱은 "+total+"입니다.");
		
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		
		double var4=var1*var1*Double.parseDouble(var2 + "." +var3);
		System.out.println(var4);

	}

}
