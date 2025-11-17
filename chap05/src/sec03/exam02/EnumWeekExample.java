package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 열거 타입 변수 선언
		
		Week today = null; // 참조 타입이라 null로 초기화 가능
		
		Calendar cal = Calendar.getInstance(); // 캘린더 객체 얻는 코드
		int week = cal.get(Calendar.DAY_OF_WEEK); //오늘의 요일 얻기(일:1 ~ 토:7)
		System.out.println(week);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) {
		case 1: {
			today = Week.SUNDAY;
			break;
		}
		case 2: {
			today = Week.MONDAY;
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			break;
		}
		case 4: {
			today = Week.WEDNSDAY;
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			break;
		}
		case 7: {
			today = Week.SATURDAY;
			break;
		}
			
		}

		System.out.println(today);
		
		// 열거값 비교
		if (today==Week.SUNDAY) {
			System.out.println("일요일 배드민턴");
		} else {
			System.out.println("공부");
		}

	}

}
