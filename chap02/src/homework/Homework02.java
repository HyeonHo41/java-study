package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double total1;
		double total2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		total1 = a*b;
		total2 = (a+b)*2;
		
		System.out.println("가로"+a);
		System.out.println("세로"+b);
		System.out.println("면적"+total1);
		System.out.println("둘레"+total2);
		
		
		

	}

}
