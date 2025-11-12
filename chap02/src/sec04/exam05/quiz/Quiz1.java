package sec04.exam05.quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+","+b);
		System.out.println("종료");
		
		// 주의!
		// nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼에 남김
		// 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")
		// 들어감 해결법: 중간에 sc.nextLine()을 한 번 호출해서 버퍼를 정리
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); //버퍼지우기
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("너의 나이는 :"+age);
		System.out.println("너의 이름은 :"+name);
		
		sc.close(); // 스캐너 사용이 끝나면 os자원을 반환
		
				

	}

}
