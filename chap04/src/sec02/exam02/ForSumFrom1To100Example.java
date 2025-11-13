package sec02.exam02;

import java.util.Scanner;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum+=i;
			
			
		}
		System.out.println(sum);
		
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한반복");
			count++;
			if(count ==6) {
				break;
			}
		}
		
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum2 =0;
		
		if (num%2==0) {
			for (int i=2; i<=num; i=i+2) {
				sum2+=i;
			} 
		} else{
			for (int i=1; i<=num; i=i+2) {
				sum2+=i;
		}
		
		System.out.println(sum2);
	}
	}

}
