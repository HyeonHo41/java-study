package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 산술 연산에서 하나라도 long 타입이라면 long 타입으로 자동 변환
		
		byte x = 20;
		long y = 40;
		long result = x + y; 
		System.out.println(result);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result2 = value1 + value2 + value3;
		System.out.println(result2);
		
	}

}
