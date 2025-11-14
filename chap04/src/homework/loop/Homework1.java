package homework.loop;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		int sum = 0;
			for(;;) {
			if (num>=1 && num<=50) {
				for (int i=0; i<=num; i+=2) {
					sum+=i;
				}
				System.out.println("합계 : "+sum);
				break;
			} else{
			System.out.println("1~50 사이의 정수를 입력하세요.");
			System.out.print("정수(1~50) : ");
			 num = sc.nextInt();
			
			}
			
		}
	}

}
