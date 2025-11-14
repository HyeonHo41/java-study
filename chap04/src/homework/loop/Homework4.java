package homework.loop;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임을 실행합니다!");
		System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
		String text = sc.nextLine();
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			text = sc.nextLine();
		} while(text.equals("yes"));
		System.out.println("게임을 종료합니다.");
			
		

	}

}
