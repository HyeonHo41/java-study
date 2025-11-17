package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		int ssc= sc.nextInt();
		int[] num = new int[ssc];
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int value = sc.nextInt();
			num[i]=value;
			sum+=num[i];
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}

}
