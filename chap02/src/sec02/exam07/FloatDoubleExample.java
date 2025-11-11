package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// float(4byte),double(8byte)
		// 부동소수점:가수 * 10의 지수 제곱으로 표현
		// 부동소수점 방식으로 저장 => 같은 크기를 갖는 int , long보다 더 큰 범위를 저장 가능
		
		float var1 = 3.14F; //자바 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석
		double var3 = 3.14;
		
		System.out.println(var1);
		System.out.println(var3);
		
		// 정밀도 테스트
		float var4 = 0.123456789123456789F;
		double var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		// (10의 지수를 나타내는) e 사용하기
		double var6 = 3e6; // 3.0 * 10^6
//		int var =3e6; E 또는 e가 포함되면 실수 리터럴
		float var7 = 3e6F;
		double var8 = 2e-3; //2.0 * 10^-3
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	
	}

}
