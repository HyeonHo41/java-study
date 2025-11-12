package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height;
		double weight;
		double total;
		
		System.out.printf("키");
		height = sc.nextDouble();
		System.out.printf("몸무게");
		weight = sc.nextDouble();
		total = weight/(height*height);
		total = Math.round(total * 100) / 100.0;
		
		System.out.println("몸무게(kg):"+weight+"\n"+"키(m): "+height+"\n"+"BMI지수"+total);
		

	}

}
