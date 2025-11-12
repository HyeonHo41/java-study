package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5);
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이 때문에 false
		System.out.println(v4+" "+(double)v5);
		
		// 자바에서는0.1을 float나 double로 저장하면 정확하게 저장되지 않음
		//해결책
		//1.float로 바꿔서 비교
		System.out.println((float)v4==v5);
		
		// 2.정수로 바꿔서 비교
		System.out.println((int)(v4*10)==(int)(v5*10));
		
		// 정리: float 와 double 비교를 하지를 않는다.
		System.out.println((double)1.2 ==(double)1.1+(double)0.1); 

	}

}
