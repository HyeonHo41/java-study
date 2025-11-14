package sec02.exam01;

public class ArrayCreateByvalueLiseExample2 {

	public static void main(String[] args) {
		// 값 목록을 이용해서 배열 생성
		// 1. 배열 변수 선언과 동시에 값 대입
		
//		int[] scores = new int[]{83,90,87};
		int[] scores = {83,90,87};
		
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		System.out.println("scores[2]: "+scores[2]);
		

		int sum=0;
		double avg=0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
	
		} avg=(double)sum/scores.length;
		
		System.out.println(sum);
		System.out.printf("%.2f",avg);
		
		String[] ba = {"사과","오렌지","포도","딸기"};
		
		
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i]);
		}
		
	}
	

}
