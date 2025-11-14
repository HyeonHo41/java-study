package sec02.exam02;

public class AraayCreateByValueLiseExample2 {

	public static void main(String[] args) {
		int[] scores;
//		scores = {83,90,87};
		
		scores = new int[] {83,90,87};
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println(sum);
		System.out.println(add(new int[] {83,90,87}));
		
		// 메소드의 매개 변수에 배열 객체를 전달하는 경우
		
		
		
	}
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		return sum;
	}

}
