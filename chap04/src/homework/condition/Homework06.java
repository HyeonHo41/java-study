package homework.condition;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		String result;
		
		int ave=(num1+num2+num3+num4+num5)/5;
		
		if(num1>=40&&num2>=40&&num3>=40&&num4>=40&&num5>=40) {
			if (ave>=60) {
				result =" 합격을 축하합니다.";
				System.out.println("스포트웨어설계 점수:"+num1);
				System.out.println("소프트웨어개발  점수:"+num2);
				System.out.println("데이터베이스구축 점수:"+num3);
				System.out.println("프로그래밍언어활용 점수:"+num4);
				System.out.println("정보시스템구축관리 점수"+num5);
				System.out.println(result);
			} else {
				result = "평균 점수 60점 미만으로 불합격입니다.";
				System.out.println(result);
			}
		} else {
			if (num1<40) {
				System.out.println("스포트웨어설계 과목 과락으로 불합격입니다.");
			} else if(num2<40){
				System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
			} else if(num3<40){
				System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
			} else if(num4<40){
				System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
			} else if(num5<40){
				System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
			}
		}


	}

}
