package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if (num%2==0 || num<3) {
			System.out.println("다시 입력하세요.");
		} else {
			int[] array = new int[num];
			for (int i = 0; i < array.length; i++) {
				if (i>array.length/2) {
					array[i] = array[i-1] - 1;
					
				} else {
					array[i]=i+1;
				} System.out.print(array[i]);
				}
			break;
			}
		}
	}

}
