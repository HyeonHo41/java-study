package sec02.exam01;

public class Car {
	// 필드:객체가 가져야 하는 데이터
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	// 클래스 내부에 필드 접근 사용
	
	// => 필드 이름으로 사용
	
	// 생성자
	Car() {
		speed = 30;

	}
	
	// 메소드
	void method() {
		speed = 50;

	}

}
